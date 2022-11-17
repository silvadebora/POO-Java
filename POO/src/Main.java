import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("mentoria curso Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDebora = new Dev();
        devDebora.setNome("Débora");
        devDebora.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Débora " + devDebora.getConteudosInscritos());
        devDebora.progredir();
        devDebora.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Débora " + devDebora.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Débora " + devDebora.getConteudosConcluidos());
        System.out.println("XP : " + devDebora.calcularTotalXp());

        System.out.println("----------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("João");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila " + devCamila.getConteudosConcluidos());
        System.out.println("XP : " + devCamila.calcularTotalXp());



    }
}
