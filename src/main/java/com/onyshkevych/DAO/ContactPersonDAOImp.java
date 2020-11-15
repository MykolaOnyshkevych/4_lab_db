package com.onyshkevych.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import com.onyshkevych.persistant.ConnectionManager;
import com.onyshkevych.transformer.Transformer;
import com.onyshkevych.model.objects.ContactPerson;
public class ContactPersonDAOImp extends GeneralDAOImp<ContactPerson, Integer> {
    private static final String findByName = "SELECT * FROM contact_person WHERE first_name_person = ? AND last_name_person = ?";
    public ContactPersonDAOImp() {
        super(ContactPerson.class);
    }

   @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<ContactPerson> findByName(String firstNamePerson, String lastNamePerson) throws SQLException {
        List<ContactPerson> people = new LinkedList<>();
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(findByName)) {
            statement.setString(1, String.valueOf(firstNamePerson));
            statement.setString(2, String.valueOf(lastNamePerson));
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    people.add((ContactPerson) new Transformer(ContactPerson.class).transformToEntity(resultSet));
                }
            }
        }
        return people;
    }
}
