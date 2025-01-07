package fr.isen.learning.interfaces.services;

import fr.isen.learning.interfaces.models.formationModel;

public interface formationService {
    formationModel getFormation();

    formationModel getFormationById(final String formationId);

    formationModel createFormation(final formationModel formation);

    formationModel updateFormation(final formationModel formation);

    void deleteFormation(final String formationId);

}
