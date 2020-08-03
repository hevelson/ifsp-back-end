package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Client;
import util.DatabaseConnection;

public class ClientDao {
    
    private Connection con;

    public ClientDao() {
        this.con = new DatabaseConnection().getConnection();
    }

    public void create(Client client) throws SQLException {

        String query;
        query = "INSERT INTO client (name, address, phone, cep) VALUES (?, ?, ?, ?);";

        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, client.getName());
        st.setString(2, client.getAddress());
        st.setString(3, client.getPhone());
        st.setString(4, client.getCEP());

        st.execute();
        st.close();
        con.close();
    }

    public List<Client> list() throws SQLException, Exception {
        
        List<Client> list = new ArrayList();
        String query = "SELECT * FROM client";
        
        PreparedStatement st = con.prepareStatement(query);
        
        ResultSet rs = st.executeQuery();
        
        while(rs.next()) {            
            Client client = new Client();

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