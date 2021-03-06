package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Pessoa;
import util.DatabaseConnection;

public class ClientDao {
    
    private final Connection con;

    public ClientDao() {
        this.con = new DatabaseConnection().getConnection();
    }

    public void create(Pessoa client) throws SQLException {

        String query;
        query = "INSERT INTO client (name, address, phone, cep) VALUES (?, ?, ?, ?);";

        final PreparedStatement st = con.prepareStatement(query);
        st.setString(1, client.getName());
        st.setString(2, client.getAddress());
        st.setString(3, client.getPhone());
        st.setString(4, client.getCEP());

        st.execute();
        st.close();
        con.close();
    }

    public List<Pessoa> list() throws SQLException, Exception {

        final List<Pessoa> list = new ArrayList();
        final String query = "SELECT * FROM client";

        final PreparedStatement st = con.prepareStatement(query);

        final ResultSet rs = st.executeQuery();

        while (rs.next()) {
            final Pessoa client = new Pessoa();

            client.setIdClient( rs.getInt("id") );
            client.setName( rs.getString("name") );
            client.setAddress( rs.getString("address") );
            client.setPhone( rs.getString("phone") );
            client.setCEP( rs.getString("cep") );

            list.add(client);            
        }

        return list;
    }
}