package fr.isen.LearningNAvailability.interfaces.models.services;

import fr.isen.LearningNAvailability.interfaces.models.FormationModel;

public interface formationService {
    FormationModel getFormation();

    FormationModel getFormationById(final int id);

    FormationModel createFormation(final FormationModel formation);

    FormationModel updateFormation(final FormationModel formation);

    void deleteFormation(final int id);

}
