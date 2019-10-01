package com.developia.application.pharmacy.object;

import org.joda.time.DateTimeZone;

import javax.persistence.*;
import java.io.Serializable;
import java.util.TimeZone;

/**
 * Created by shnovruzov on 10/02/2019.
 */
@MappedSuperclass
public class BaseObject implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "course_mng_seq")
    @SequenceGenerator(name = "course_mng_seq", sequenceName = "COURSE_MNG_SEQ", allocationSize = 1)
    public long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BaseObject(){
        super();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+4"));
        System.setProperty("user.timezone", "GMT+4");
        DateTimeZone.setDefault(DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+4")));
    }

}
