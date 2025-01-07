package fr.isen.LearningNAvailability.interfaces.services;

import fr.isen.LearningNAvailability.interfaces.models.formationModel;

public interface formationService {
    formationModel getFormation();

    formationModel getFormationById(final String formationId);

    formationModel createFormation(final formationModel formation);

    formationModel updateFormation(final formationModel formation);

    void deleteFormation(final String formationId);

}
