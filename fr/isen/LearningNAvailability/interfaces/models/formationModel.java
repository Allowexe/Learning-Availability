package fr.isen.LearningNAvailability.interfaces.models;

import java.util.Date;
import fr.isen.LearningNAvailability.interfaces.models.enums.FORMATIONSTATE;

public class formationModel {
    private String formationId;

    private String name;

    private int durationinHours;

    private Date startDate;

    private Date endDate;

    private String locationId;

    private FORMATIONSTATE state;

}
