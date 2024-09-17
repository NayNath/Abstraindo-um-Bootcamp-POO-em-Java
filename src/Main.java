import java.time.LocalDate;

import Dominio.Bootcamp;
import Dominio.Curso;
import Dominio.Mentorias;
import Dominio.Devs;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setDescricao("JAVA");
        curso1.setCargaHoraria(8);
        curso1.setTitulo("curso1");
        System.out.println(curso1);
        System.out.println();

        Curso curso2 = new Curso();
        curso2.setDescricao("SQL");
        curso2.setCargaHoraria(8);
        curso2.setTitulo("curso2");
        System.out.println(curso2);

        System.out.println();
        Mentorias mentorias = new Mentorias();
        mentorias.setDescricao("desafio java");
        mentorias.setData(LocalDate.now());
        mentorias.setTitulo("aprender java");
        System.out.println(mentorias);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java");
        bootcamp.setDescricao("curso de java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentorias);

        System.out.println();
        Devs devAna = new Devs();
        devAna.setNome("Ana");
        devAna.increverBootcamp(bootcamp);
        System.out.println("ANA -> conteudos inscritos"+ devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        System.out.println("ANA -> conteudos inscritos"+ devAna.getConteudosInscritos());
        System.out.println("ANA -> conteudos concluidos"+ devAna.getConteudosConcluidos());
        System.out.println("XP : " + devAna.calcularTotalXp());


       System.out.println();
        Devs devsJose = new Devs();
        devsJose.setNome("Jose");
        devsJose.increverBootcamp(bootcamp);
        System.out.println("JOSE -> conteudos inscritos"+ devsJose.getConteudosInscritos());
        System.out.println("JOSE -> conteudos concluidos"+ devsJose.getConteudosConcluidos());
    }
}
