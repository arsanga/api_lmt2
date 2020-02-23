package lmt.lamaintenduapi.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Evenement extends BaseEntity implements Serializable {
    String date;
    int participantMax;
}
