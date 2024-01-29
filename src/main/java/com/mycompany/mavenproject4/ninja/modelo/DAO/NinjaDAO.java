package com.mycompany.mavenproject4.ninja.modelo.DAO;

import com.mycompany.mavenproject4.ninja.modelo.clases.Ninja;
import com.mycompany.mavenproject4.ninja.modelo.clases.builders.NinjaBuilder;
import com.mycompany.mavenproject4.ninja.modelo.clases.builders.NinjaConcreteBuilder;
import com.mycompany.mavenproject4.persistencia.DBconeccion;
import com.mycompany.mavenproject4.persistencia.Operaciones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NinjaDAO implements InterfazNinjaDao<Ninja> {

    @Override
    public List<Ninja> Todoslosninjas() {
        List<Ninja> ninjaList = new ArrayList<>();
        Operaciones.setConnection(DBconeccion.MySQLConnection());
        String stm = "SELECT  n.Nombre, n.Rango, n.Aldea, h.Nombre, h.Descripcion FROM Ninja n\n" +
                "INNER JOIN habilidad h ON n.ID = h.IDNinja;";

        try (PreparedStatement ps = Operaciones.getConnection().prepareStatement(stm)) {
            ResultSet rs = Operaciones.query_db(ps);

            while (rs.next()) {
                NinjaBuilder ninjaBuilder = new NinjaConcreteBuilder();

                Ninja sqlNinja = ninjaBuilder.ninjaId(rs.getInt("ID"))
                        .nombreNinja(rs.getString("Nombre"))
                        .rangoNinja(rs.getString("Rango"))
                        .aldeaNinja(rs.getInt("Aldea"))
                        .build();

                ninjaList.add(sqlNinja);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ninjaList;
    }


}
