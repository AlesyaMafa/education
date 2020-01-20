package com.mafa.alesya;

import java.util.List;

/**
 *
 * <p/>
 * Copyright (C) 2020 copyright.com
 * <p/>
 * Date: Jan 20, 2020
 *
 * @author Vitali_Ivanou
 */
public class GameResource {
    private List<Human> humans;
    private List<Poses> poses;
    
    
    public GameResource(List<Human> humans, List<Poses> poses){
        this.humans = humans;
        this.poses = poses;
    }
    /**
     * @return the humans
     */
    public List<Human> getHumans() {
        return humans;
    }
    
    /**
     * @param humans the humans to set
     */
    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }
    
    /**
     * @return the poses
     */
    public List<Poses> getPoses() {
        return poses;
    }
    
    /**
     * @param poses the poses to set
     */
    public void setPoses(List<Poses> poses) {
        this.poses = poses;
    }
    

}
