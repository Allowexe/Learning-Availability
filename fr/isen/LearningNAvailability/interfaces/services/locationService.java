package fr.isen.LearningNAvailability.interfaces.services;

import fr.isen.LearningNAvailability.interfaces.models.locationModel;

public interface locationService {
    locationModel getLocation();

    locationModel getLocationById(final String locationId);

    locationModel createLocation(final locationModel location);

    locationModel updateLocation(final String locationid);

    void deleteLocation(final String locationId);

}
