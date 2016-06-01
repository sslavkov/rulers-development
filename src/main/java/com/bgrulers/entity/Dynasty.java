package com.bgrulers.entity;

import javax.persistence.Entity;

/**
 * Created by sslavkov on 5/30/2016.
 */

@Entity
public class Dynasty extends JpaEntity {
	
	private String name;
	private String description;

    public String getName() {
        return name;
    }
	
    public void setName(String name) {
        this.name = name;
    }
	
}
