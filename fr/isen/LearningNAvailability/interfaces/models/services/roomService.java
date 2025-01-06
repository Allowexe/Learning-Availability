package fr.isen.LearningNAvailability.interfaces.models.services;

import fr.isen.LearningNAvailability.interfaces.models.RoomModel;

public interface roomService {
    RoomModel updateRoom(final RoomModel room);

    RoomModel getRoom();

    RoomModel createRoom(final RoomModel room);

    RoomModel getRoomById(final int id);

    void deleteRoom(final int id);

}
