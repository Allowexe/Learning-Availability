package fr.isen.learning.interfaces.services;
import fr.isen.learning.interfaces.models.locationModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.agroal.api.AgroalDataSource;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.ws.rs.GET;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class formationService {
     AgroalDataSource dataSource = CDI.current().select(AgroalDataSource.class).get();


     //public List<formationModel> getFormation();

    //formationModel getFormationById(final String formationId);

    //formationModel createFormation(final formationModel formation);

    //formationModel updateFormation(final formationModel formation);

    //void deleteFormation(final String formationId);

}
