package com.mafa.alesya;

public class ResourceService implements IResourceService {
    
    private IPeopleRepository peopleRepository = new PeopleRepositoryTxt();
    private IPoseRepository poseRepository = new PoseRepositoryTxt();

    public GameResource loadResources() {
        return new GameResource(peopleRepository.loadPeople(), poseRepository.loadPoses());
    }

}
