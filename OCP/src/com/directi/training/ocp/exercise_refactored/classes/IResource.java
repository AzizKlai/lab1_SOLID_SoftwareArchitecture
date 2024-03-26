package com.directi.training.ocp.exercie_refactored.classes;

public interface IResource {
    int allocate();
    void free(int resourceId);
}
