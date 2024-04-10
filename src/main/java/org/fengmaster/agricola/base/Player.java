package org.fengmaster.agricola.base;

import lombok.Data;
import lombok.Getter;

import java.util.LinkedHashMap;
import java.util.Map;

public class Player {

    private boolean isAi=true;

    private String name;

    public String getName() {
        return name;
    }

    public Player(boolean isAi, String name) {
        this.isAi = isAi;
        this.name = name;
    }

    public Map<ResourceType, Integer> getResourceMap() {
        return resourceMap;
    }

    private Map<ResourceType,Integer> resourceMap=new LinkedHashMap<>();
    {
        resourceMap.put(ResourceType.WOOD,0);
        resourceMap.put(ResourceType.CLAY,0);
        resourceMap.put(ResourceType.STONE,0);
        resourceMap.put(ResourceType.SHEEP,0);
        resourceMap.put(ResourceType.WILD_BOAR,0);
        resourceMap.put(ResourceType.CATTLE,0);
        resourceMap.put(ResourceType.REED,0);
        resourceMap.put(ResourceType.GRAIN,0);
        resourceMap.put(ResourceType.FIELD,0);
        resourceMap.put(ResourceType.VEGETABLES,0);
        resourceMap.put(ResourceType.PERSON,2);
        resourceMap.put(ResourceType.WOOD_ROOM,2);

    }

    public int getResource(ResourceType resourceType){
       return resourceMap.get(resourceType);
    }

    public void addResource(ResourceType resourceType,int num){
        resourceMap.put(resourceType,resourceMap.getOrDefault(resourceType,0)+num);
    }


    public void subResource(ResourceType resourceType,int num){
        resourceMap.put(resourceType,resourceMap.getOrDefault(resourceType,0)-num);
    }




}
