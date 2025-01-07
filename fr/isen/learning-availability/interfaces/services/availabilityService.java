package fr.isen.learning-availability.interfaces.services;

import fr.isen.learning-availability.interfaces.models.availabilityModel;

public interface availabilityService {
    availabilityModel getAvailability();

    availabilityModel getAvailabilityById();

    availabilityModel createAvailability(final availabilityModel availability);

    availabilityModel updateAvailability(final availabilityModel availability, final String idAvailability);

    void deleteAvailability(final String idAvailability);

}
