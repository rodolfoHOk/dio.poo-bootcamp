package me.dio.rudyhiok;

import java.time.LocalDate;

import me.dio.rudyhiok.domain.Curso;
import me.dio.rudyhiok.domain.Mentoria;

public class Main {
	public static void main(String[] args) {
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
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		System.out.println(mentoria1);
		
	}
}
