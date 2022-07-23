package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Basico da linguagem Java ");
        curso1.setDescricao("curso sobre a linguagem Java");
        curso1.setCargaHoraria(60);
        System.out.println(curso1);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Logica de Programaçao ");
        curso2.setDescricao("curso sobre  logica de programaçao");
        curso2.setCargaHoraria(50);
        System.out.println(curso2);

        Mentoria mentoria  = new Mentoria();
        mentoria.setTitulo("mentoria do curso Java");
        mentoria.setDescricao("como utilizar Maven no Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

    }
}
