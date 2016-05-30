package com.bgrulers.web.json;

import com.bgrulers.model.Ruler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by sslavkov on 5/30/2016.
 */
@RestController
@RequestMapping("/api/rulers")
public class RulerRestController {

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Ruler> list() {
        ArrayList<Ruler> rulers = new ArrayList<Ruler>();

        Ruler ruler = new Ruler();
        ruler.setName("Asparukh");
        ruler.setTitle("Khan");

        Ruler rul = new Ruler();
        rul.setName("Krum");
        rul.setTitle("Khan");

        rulers.addAll(Arrays.asList(ruler, rul));


        return rulers;
    }
}
