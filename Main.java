import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("------- Bootcamp Java Developer (15 Horas) -------\n");

        var curso1 = new Curso("Curso Java Basico", 5 );
        System.out.println(curso1.toString());

        var curso2 = new Curso("Curso Java Mediano", 5 );
        System.out.println(curso2.toString());

        var curso3 = new Curso("Curso Java avançado", 5 );
        System.out.println(curso2.toString());

        var mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");

        var bootcampJava = new Bootcamp("Bootcamp Java Developer", "Descrição bootcampJava");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(curso3);
        System.out.println(mentoria.toString() + " (Duração: 30 dias) ");

        System.out.println("\n");

        System.out.println("------- Status do 1° Dev inscrito no Bootcamp -------\n");

        var dev1 = new Dev("Gabriel Feitosa");
        System.out.println("Aluno: " + dev1.getNome() + ", XP inicial: " + dev1.calcularTotalXp() );
        dev1.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("-");
        dev1.progredir();
        System.out.println("Após concluir 1 curso: ");
        System.out.println("Conteúdos CONCLUÍDOS de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos RESTANTES de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Quantidade de XP atual de " + dev1.getNome() + ": "+ dev1.calcularTotalXp());
        System.out.println("\n \n");

        System.out.println("------- Status do 2° Dev inscrito no Bootcamp -------\n");

        var dev2 = new Dev("Joao Pedro");
        System.out.println("Aluno: " + dev2.getNome() + ", XP inicial: " + dev2.calcularTotalXp() );
        dev2.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos inscritos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("-");
        dev2.progredir();
        dev2.progredir();
        System.out.println("Após concluir 2 cursos: ");
        System.out.println("Conteúdos CONCLUÍDOS de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("Conteúdos RESTANTES de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Quantidade de XP atual de " + dev2.getNome() + ": "+ dev2.calcularTotalXp());
        System.out.println("\n \n");

        System.out.println("------- Status do 3° Dev inscrito no Bootcamp -------\n");

        var dev3 = new Dev("Pablo Silva");
        System.out.println("Aluno: " + dev3.getNome() + ", XP inicial: " + dev3.calcularTotalXp() );
        dev3.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos inscritos de " + dev3.getNome() + ": " + dev3.getConteudosInscritos());
        System.out.println("-");
        dev3.progredir();
        dev3.progredir();
        dev3.progredir();
        System.out.println("Após concluir 3 cursos: ");
        System.out.println("Conteúdos CONCLUÍDOS de " + dev3.getNome() + ": " + dev3.getConteudosConcluidos());
        System.out.println("Conteúdos RESTANTES de " + dev3.getNome() + ": " + dev3.getConteudosInscritos());
        System.out.println("Quantidade de XP atual de " + dev3.getNome() + ": "+ dev3.calcularTotalXp());



    }
}
