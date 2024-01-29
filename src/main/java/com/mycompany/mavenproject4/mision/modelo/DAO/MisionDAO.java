package com.mycompany.mavenproject4.mision.modelo.DAO;

import com.mycompany.mavenproject4.mision.modelo.clases.Mision;
import com.mycompany.mavenproject4.mision.modelo.clases.builders.MisionBuilder;
import com.mycompany.mavenproject4.mision.modelo.clases.builders.MisionConcreteBuilder;
import com.mycompany.mavenproject4.persistencia.DBconeccion;
import com.mycompany.mavenproject4.persistencia.Operaciones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MisionDAO implements InterfazNinjaDao {
    @Override
    public void misionesdisponibles() {
        Operaciones.setConnection(DBconeccion.MySQLConnection());
        String query = "SELECT COUNT(*) AS total_tickets_sold, " +
                "SUM(tt.price) AS total_revenue " +
                "FROM tbl_tickets t " +
                "JOIN tbl_ticketType tt ON t.ticketTypeId = tt.ticketTypeId;";

        try (PreparedStatement ps = Operaciones.getConnection().prepareStatement(query)) {
            ResultSet rs = Operaciones.query_db(ps);

            while (rs.next()) {
                MisionBuilder misionBuilder = new MisionConcreteBuilder();

                Mision sqlMision = misionBuilder.misionId(rs.getInt("ID"))
                        .descripcionMision(rs.getString("Descripcion"))
                        .rangoMision(rs.getString("Rango"))
                        .recompensaMision(rs.getString("Recompensa"))
                        .build();


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
