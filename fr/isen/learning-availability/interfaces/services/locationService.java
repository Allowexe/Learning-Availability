package fr.isen.learning-availability.interfaces.services;

import fr.isen.learning-availability.interfaces.models.locationModel;

public interface locationService {
    locationModel getLocation();

    locationModel getLocationById(final String locationId);

    locationModel createLocation(final locationModel location);

    locationModel updateLocation(final String locationid);

    void deleteLocation(final String locationId);

}
