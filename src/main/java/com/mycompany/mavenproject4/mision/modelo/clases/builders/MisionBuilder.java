package com.mycompany.mavenproject4.mision.modelo.clases.builders;

import com.mycompany.mavenproject4.mision.modelo.clases.Mision;

public interface MisionBuilder {
    MisionBuilder misionId(int misionId);
    MisionBuilder descripcionMision(String descripcionMision);
    MisionBuilder rangoMision(String rangoMision);
    MisionBuilder recompensaMision(String recompensaMision);
    Mision build();
}
