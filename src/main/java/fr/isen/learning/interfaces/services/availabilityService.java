package fr.isen.learning.interfaces.services;
import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.mysqlclient.MySQLPool;
import io.vertx.mutiny.sqlclient.Row;
import io.vertx.mutiny.sqlclient.RowSet;
import io.vertx.mutiny.sqlclient.Tuple;


import fr.isen.learning.interfaces.models.availabilityModel;

public interface availabilityService {

    availabilityModel getAvailability();

    availabilityModel getAvailabilityById();

    availabilityModel createAvailability(final availabilityModel availability);

    availabilityModel updateAvailability(final availabilityModel availability, final String idAvailability);

    void deleteAvailability(final String idAvailability);

}
