package org.pedro;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conteudo {
    protected static final double XP_PADRAO = 100;

    private String titulo;
    private String descricao;

    public double calcularXp(){
        return XP_PADRAO + 20;
    }
}
