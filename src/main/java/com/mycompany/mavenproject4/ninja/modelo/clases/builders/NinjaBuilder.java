package com.mycompany.mavenproject4.ninja.modelo.clases.builders;

import com.mycompany.mavenproject4.ninja.modelo.clases.Ninja;
public interface NinjaBuilder {
    NinjaBuilder ninjaId(int ninjaId);

    NinjaBuilder nombreNinja(String nombreNinja);

    NinjaBuilder rangoNinja(String rangoNinja);

    NinjaBuilder aldeaNinja(int aldeaNinja);

    Ninja build();
}
