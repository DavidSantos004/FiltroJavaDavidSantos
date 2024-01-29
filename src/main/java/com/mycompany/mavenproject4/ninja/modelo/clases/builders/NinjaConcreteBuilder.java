package com.mycompany.mavenproject4.ninja.modelo.clases.builders;

import com.mycompany.mavenproject4.ninja.modelo.clases.Ninja;

public class NinjaConcreteBuilder implements NinjaBuilder{

    private Ninja ninja = new Ninja();
    @Override
    public NinjaBuilder ninjaId(int ninjaId) {
        ninja.setId(ninjaId);
        return this;
    }

    @Override
    public NinjaBuilder nombreNinja(String nombreNinja) {
        ninja.setNombre(nombreNinja);
        return this;
    }

    @Override
    public NinjaBuilder rangoNinja(String rangoNinja) {
        ninja.setRango(rangoNinja);
        return this;
    }

    @Override
    public NinjaBuilder aldeaNinja(int aldeaNinja) {
        ninja.setAldea(aldeaNinja);
        return this;
    }

    @Override
    public Ninja build() {
        return ninja;
    }
}
