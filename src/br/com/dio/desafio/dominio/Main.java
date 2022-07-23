package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso ();
        curso1.setTitulo ("Curso Basico da linguagem Java ");
        curso1.setDescricao ("curso sobre a linguagem Java");
        curso1.setCargaHoraria (60);
        //    System.out.println(curso1);


        Curso curso2 = new Curso ();
        curso2.setTitulo ("Curso Logica de Programaçao ");
        curso2.setDescricao ("curso sobre  logica de programaçao");
        curso2.setCargaHoraria (50);
        //  System.out.println(curso2);

        Mentoria mentoria = new Mentoria ();
        mentoria.setTitulo ("mentoria do curso Java");
        mentoria.setDescricao ("como utilizar Maven no Java");
        mentoria.setData (LocalDate.now ());
        //   System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp ();
        bootcamp.setNome ("Bootcamp Java Developer");
        bootcamp.setDescricao ("descricao bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos ().add (mentoria);

        Dev dev1 = new Dev ();
        dev1.setNome ("Suely");
        dev1.inscreverBootcamp (bootcamp);
        //*** Conteudos Inscritos****
        System.out.println ("Conteudos inscritos "
                + dev1.getNome ()
                + ":"
                + dev1.getConteudosInscritos ());


        Dev dev2 = new Dev ();
        dev2.setNome ("Mario");
        dev2.inscreverBootcamp (bootcamp);
        System.out.println ("Conteudos inscritos "
                + dev2.getNome ()
                + ":"
                + dev2.getConteudosInscritos ());

        dev1.progredir ();
        System.out.println ("Conteudos concluidos "
                + dev1.getNome ()
                + ":"
                + dev1.getConteudosConcluidos ());
        System.out.println ("Conteudos inscritos "
                + dev1.getNome ()
                + ":"
                + dev1.getConteudosInscritos ());
        dev1.progredir ();
        System.out.println("XP "
                + dev1.getNome ()
                + "-:" +
                + dev1.calcularTotalXp());

        dev2.progredir ();
        dev2.progredir ();
        dev2.progredir ();

        System.out.println(("Conteudos concluidos ")
                + dev2.getNome ()
                + ":"
                + dev2.getConteudosConcluidos ());

        System.out.println ("Conteudos inscritos "
                + dev2.getNome ()
                + ":"
                + dev2.getConteudosInscritos ());

        System.out.println("XP "
                + dev2.getNome ()
                + "-:" +
                + dev2.calcularTotalXp());
}
}

