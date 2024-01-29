package com.mycompany.mavenproject4.mision.modelo.clases.builders;

import com.mycompany.mavenproject4.mision.modelo.clases.Mision;

public class MisionConcreteBuilder implements MisionBuilder{

    private Mision mision = new Mision();

    @Override
    public MisionBuilder misionId(int misionId) {
        mision.setID(misionId);
        return this;
    }

    @Override
    public MisionBuilder descripcionMision(String descripcionMision) {
        mision.setDescripcion(descripcionMision);
        return this;
    }

    @Override
    public MisionBuilder rangoMision(String rangoMision) {
        mision.setRango(rangoMision);
        return this;
    }

    @Override
    public MisionBuilder recompensaMision(String recompensaMision) {
        mision.setRecompensa(recompensaMision);
        return this;
    }

    @Override
    public Mision build() {
        return mision;
    }
}
