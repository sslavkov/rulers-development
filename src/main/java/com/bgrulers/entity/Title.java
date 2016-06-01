package com.bgrulers.entity;

import javax.persistence.Entity;

/**
 * Created by sslavkov on 5/30/2016.
 */

@Entity
public class Title extends JpaEntity {
	
	private String name;
	private String description;
	
    public String getName() {
        return name;
    }
	
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
