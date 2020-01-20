package com.mafa.alesya;

/**
 *
 * <p/>
 * Copyright (C) 2020 copyright.com
 * <p/>
 * Date: Jan 20, 2020
 *
 * @author Vitali_Ivanou
 */
public class ResourceService implements IResourceService {
    
    private IPeopleRepository peopleRepository = new PeopleRepositoryTxt();
    private IPoseRepository poseRepository = new PoseRepozitoryTxt();

    /* (non-Javadoc)
     * @see com.mafa.alesya.IResourceService#loadResources()
     */
    public GameResource loadResources() {
        return new GameResource(peopleRepository.loadPeople(), poseRepository.loadPoses());
    }

}
