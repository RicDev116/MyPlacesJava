package com.makeeasy.myplaces;

public interface PlacesRepository {
    Place element(int id);
    void add(Place place);
    int neww();
    void delete(int id);
    int size();
    void update(int id, Place place);
}
