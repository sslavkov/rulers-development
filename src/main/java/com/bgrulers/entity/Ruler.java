package com.bgrulers.entity;

import javax.persistence.Entity;

/**
 * Created by sslavkov on 5/30/2016.
 */

@Entity
public class Ruler extends JpaEntity {
	
	private String name;
	private Title title;

//    @OneToOne
    private Reign reign;
	
    public String getName() {
        return name;
    }
	
    public void setName(String name) {
        this.name = name;
    }
	
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Reign getReign() {
        return reign;
    }

    public void setReign(Reign reign) {
        this.reign = reign;
    }
}
