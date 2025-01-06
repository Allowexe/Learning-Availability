package fr.isen.LearningNAvailability.interfaces.models;

import java.util.Date;
import fr.isen.LearningNAvailability.interfaces.models.enums.AVAILABILITYTYPE;
import fr.isen.LearningNAvailability.interfaces.models.enums.FORMATIONSTATE;

public class FormationModel {
    private int id;

    private String title;

    private String description;

    private Date date;

    private int duration;

    private FORMATIONSTATE state;

    private AVAILABILITYTYPE TYPE;

    private RoomModel room;

    private UserModel teacher;

}
