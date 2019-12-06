package lmt.lamaintenduapi.controller;

import lmt.lamaintenduapi.Repository.UserRepository;
import lmt.lamaintenduapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RepositoryRestController
@RequestMapping(value="/users")
public class UserController implements ResourceAssembler<User, Resource<User>> {


    @Autowired
    UserRepository userRepository;

    @Autowired
    private EntityLinks entityLinks;

    // private static final String PATH = "/error";

    @GetMapping(path = "/search")
    public ResponseEntity<Resource<User>> FindUserByEmail(@RequestParam(value = "email") String email){

        Resource<User> userResource;

        User user = userRepository.findByEmail(email);

        if(user == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else{
            userResource = toResource(user);
            return new ResponseEntity<>(userResource, HttpStatus.OK);
        }
    }

    @Override
    public Resource<User> toResource(User User) {
        Link self = entityLinks.linkFor(User.class).slash(User.getId()).withSelfRel();
        Link rel = entityLinks.linkFor(User.class).slash(User.getId()).withRel("User");
        return new Resource<>(User, self, rel);
    }

//    @RequestMapping(value=PATH, method=RequestMethod.GET)
//    public String defaulErrorMessage(){
//        return "ressource non disponible";
//    }
//
//    public String getErrorPath() {
//        return PATH;
//    }

}
