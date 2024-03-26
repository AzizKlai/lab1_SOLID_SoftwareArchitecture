package com.directi.training.ocp.exercie_refactored.classes;



public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(IResource resource) {
        if (resource != null) {
            int resourceId = resource.allocate();
            return resourceId;
        } else {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            return INVALID_RESOURCE_ID;
        }
    }

    public void free(IResource resource, int resourceId) {
        if (resource != null) {
            resource.free(resourceId);
        } else {
            System.out.println("ERROR: Attempted to free invalid resource");
        }
    }
}

