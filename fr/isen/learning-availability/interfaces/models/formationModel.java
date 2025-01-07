package fr.isen.learning-availability.interfaces.models;

import java.util.Date;
import fr.isen.learning-availability.interfaces.models.enums.FORMATIONSTATE;

public class formationModel {
    private String formationId;

    private String name;

    private int durationinHours;

    private Date startDate;

    private Date endDate;

    private String locationId;

    private FORMATIONSTATE state;

}
