package com.example.myapp;

import java.util.ArrayList;

public class PlanetaController {
    PlanetaDAO planetaDAO;
    public PlanetaController(){
        planetaDAO = new PlanetaDAO();
    }

    public ArrayList<Planeta> listaPlaneta(){
        ArrayList<Planeta> list;
        return planetaDAO.listaPlanetas;


    }


}
