package com.bgrulers.entity;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by sslavkov on 5/30/2016.
 */

@Entity
public class Reign extends JpaEntity {

    @Temporal(TemporalType.TIMESTAMP)
    private Date started;

    @Temporal(TemporalType.TIMESTAMP)
    private Date ended;

//    @OneToOne
    private Ruler ruler;

    public Date getStarted() {
        return started;
    }

    public void setStarted(Date started) {
        this.started = started;
    }

    public Date getEnded() {
        return ended;
    }

    public void setEnded(Date ended) {
        this.ended = ended;
    }

    public Ruler getRuler() {
        return ruler;
    }

    public void setRuler(Ruler ruler) {
        this.ruler = ruler;
    }

}