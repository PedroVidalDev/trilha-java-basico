package org.pedro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descricao Curso JS");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descricao Curso Java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Santander");
        bootcamp.setDescricao("Descricao Bootcamp Linguagem Java!!!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamilla = new Dev();
        devCamilla.setNome("Camilla");
        devCamilla.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camilla: " + devCamilla.getConteudosInscritos());
        devCamilla.progredir();
        System.out.println("Conteudos inscritos Camilla: " + devCamilla.getConteudosConcluidos());
        System.out.println("XP Camilla: " + devCamilla.calcularTotalXp());

        System.out.println("\n====================================\n");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Conteudos inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos concluidos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("XP Pedro: " + devPedro.calcularTotalXp());

    }
}