package lmt.lamaintenduapi.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;
import java.util.List;

@Configuration
public class RestConfiguration implements RepositoryRestConfigurer {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(
                entityManager.getMetamodel().getEntities().stream()
                        .map(Type::getJavaType)
                        .toArray(Class[]::new));
    }

    @Override
    public void configureConversionService(ConfigurableConversionService configurableConversionService) {

    }

    @Override
    public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingRepositoryEventListener) {

    }

    @Override
    public void configureExceptionHandlerExceptionResolver(ExceptionHandlerExceptionResolver exceptionHandlerExceptionResolver) {

    }

    @Override
    public void configureHttpMessageConverters(List<HttpMessageConverter<?>> list) {

    }

    @Override
    public void configureJacksonObjectMapper(ObjectMapper objectMapper) {

    }
}