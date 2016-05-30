package com.bgrulers.entity;

import javax.persistence.Entity;

/**
 * Created by sslavkov on 5/30/2016.
 */

@Entity
public class Ruler extends JpaEntity {
	
	private String name;
	private String title;
	
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
}
