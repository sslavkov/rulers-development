package com.bgrulers.entity.projection;

import com.bgrulers.entity.Ruler;
import com.bgrulers.entity.Title;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "list", types = Ruler.class)
public interface RulerListProjection {

    Long getId();
    String getName();
    Title getTitle();
    Date getReignStart();
    Date getReignEnd();

}
