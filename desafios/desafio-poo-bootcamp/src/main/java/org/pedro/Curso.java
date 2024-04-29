package org.pedro;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString(){
        return "Curso{" +
                "titulo: " + getTitulo() + "," +
                "descricao: " + getDescricao() + "," +
                "cargaHoraria: " + getCargaHoraria() + "}";
    }
}
