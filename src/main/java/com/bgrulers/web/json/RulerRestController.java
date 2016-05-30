package com.bgrulers.web.json;

import com.bgrulers.model.Ruler;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Ruler retrieve(@PathVariable Long id) {
        // retrieve one from DB
        return new Ruler();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Ruler create(@RequestBody Ruler ruler) {
        // create
        return new Ruler();
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.PUT)
    public Ruler update(@PathVariable Long id, @RequestBody Ruler ruler) {
        // update
        return new Ruler();
    }

    @RequestMapping(value = "{id}/delete", method = RequestMethod.DELETE)
    public Ruler delete(@PathVariable Long id) {
        // find from repository and delete
        return new Ruler();
    }
}
