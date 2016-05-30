package com.bgrulers.entity;

/**
 * Created by sslavkov on 5/30/2016.
 */

public class Ruler extends JpaEntity {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String name;
    String title;
}
