package com.mycompany.mavenproject4.ninja.controlador;

import com.mycompany.mavenproject4.ninja.modelo.DAO.NinjaDAO;
import com.mycompany.mavenproject4.ninja.modelo.clases.Ninja;

import java.util.List;

public class NinjaController {
    private static NinjaDAO ninjaDAO = new NinjaDAO();

    public static List<Ninja> Todoslosninjas(){
        return ninjaDAO.Todoslosninjas();
    }
}
