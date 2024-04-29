package org.pedro;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public String toString(){
        return "Curso{" +
                "titulo: " + getTitulo() + "," +
                "descricao: " + getDescricao() + "," +
                "data: " + getData() + "}";
    }
}
