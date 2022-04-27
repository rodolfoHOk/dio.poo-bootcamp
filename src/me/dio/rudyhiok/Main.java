package me.dio.rudyhiok;

import java.time.LocalDate;

import me.dio.rudyhiok.domain.Bootcamp;
import me.dio.rudyhiok.domain.Conteudo;
import me.dio.rudyhiok.domain.Curso;
import me.dio.rudyhiok.domain.Dev;
import me.dio.rudyhiok.domain.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		// Parte 1 - Abstração e Encapsulamento
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrevendo o curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Javascript");
		curso2.setDescricao("Descrevendo o curso javascript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrevendo a mentoria java");
		mentoria1.setData(LocalDate.now().plusDays(15));
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);
		
		// Parte 2 - Herança e Polimorfismo
		
		Conteudo conteudo1 = new Curso();
		conteudo1.setTitulo("Conteudo Java");
		conteudo1.setDescricao("Descrevendo conteudo java");
		
		Conteudo conteudo2 = new Mentoria();
		conteudo2.setTitulo("Conteudo Javascript");
		conteudo2.setDescricao("Descrevendo conteudo javascript");
		
//		System.out.println(conteudo1);
//		System.out.println(conteudo2);
		
		// Parte 5 - Interligando classes de Domínio
		
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Bootcamp Java Developer");
		bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");

		System.out.println("-> Inscrição de " + devCamila.getNome());
		devCamila.inscreverBootcamp(bootcamp1);
		System.out.println("Conteúdos incritos de " + devCamila.getNome() + ": " + devCamila.getConteudosIncritos());
		System.out.println("Conteúdos concluidos de " + devCamila.getNome() + ": " + devCamila.getConteudosConcluidos());
		
		System.out.println("-> Primeira progressão de " + devCamila.getNome());
		devCamila.progredir();
		System.out.println("Conteúdos incritos de " + devCamila.getNome() + ": " + devCamila.getConteudosIncritos());
		System.out.println("Conteúdos concluidos de " + devCamila.getNome() + ": " + devCamila.getConteudosConcluidos());
		System.out.println("XP de " + devCamila.getNome() + ": " + devCamila.calcularTotalXp());

		System.out.println("-> Segunda progressão de " + devCamila.getNome());
		devCamila.progredir();
		System.out.println("Conteúdos incritos de " + devCamila.getNome() + ": " + devCamila.getConteudosIncritos());
		System.out.println("Conteúdos concluidos de " + devCamila.getNome() + ": " + devCamila.getConteudosConcluidos());
		System.out.println("XP de " + devCamila.getNome() + ": " + devCamila.calcularTotalXp());
		
		System.out.println("----------");
		
		Dev devRodolfo = new Dev();
		devRodolfo.setNome("Rodolfo");

		System.out.println("-> Inscrição de " + devRodolfo.getNome());
		devRodolfo.inscreverBootcamp(bootcamp1);
		System.out.println("Conteúdos incritos de " + devRodolfo.getNome() + ": " + devRodolfo.getConteudosIncritos());
		System.out.println("Conteúdos concluidos de " + devRodolfo.getNome() + ": " + devRodolfo.getConteudosConcluidos());
		
		System.out.println("-> Primeira progressão de " + devRodolfo.getNome());
		devRodolfo.progredir();
		System.out.println("Conteúdos incritos de " + devRodolfo.getNome() + ": " + devRodolfo.getConteudosIncritos());
		System.out.println("Conteúdos concluidos de " + devRodolfo.getNome() + ": " + devRodolfo.getConteudosConcluidos());
		System.out.println("XP de " + devRodolfo.getNome() + ": " + devRodolfo.calcularTotalXp());
		
		System.out.println("-> Segunda progressão de " + devRodolfo.getNome());
		devRodolfo.progredir();
		System.out.println("Conteúdos incritos de " + devRodolfo.getNome() + ": " + devRodolfo.getConteudosIncritos());
		System.out.println("Conteúdos concluidos de " + devRodolfo.getNome() + ": " + devRodolfo.getConteudosConcluidos());
		System.out.println("XP de " + devRodolfo.getNome() + ": " + devRodolfo.calcularTotalXp());
		
		System.out.println("-> Terceira progressão de " + devRodolfo.getNome());
		devRodolfo.progredir();
		System.out.println("Conteúdos incritos de " + devRodolfo.getNome() + ": " + devRodolfo.getConteudosIncritos());
		System.out.println("Conteúdos concluidos de " + devRodolfo.getNome() + ": " + devRodolfo.getConteudosConcluidos());
		System.out.println("XP de " + devRodolfo.getNome() + ": " + devRodolfo.calcularTotalXp());
		
		System.out.println("-> Quarta progressão de " + devRodolfo.getNome());
		devRodolfo.progredir();
	}
}
