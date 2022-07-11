package view;

import java.util.Date;

import br.com.cursoja.entidade.Curso;
import br.com.cursoja.entidade.Professor;
import br.com.cursoja.entidade.Turma;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso c = new Curso();
		c.setId(1);
		c.setNome("Informática Básica");
		
		Curso c2 = new Curso(2, "Excel Básico");
		
		System.out.println("Curso 1 => " + c.getId() + " - " + c.getNome() );
		System.out.println("Curso 2 => " + c2.getId() + " - " + c2.getNome() );
		
		
		
		
		Professor p = new Professor();
		p.setNome("Luis");
		Professor p2 = new Professor(1, "Pedro", "34456", 40);
		
		System.out.println("Prof 1 => " + p.getNome() );
		System.out.println("Prof 2 => " + p2.getNome() +" - "+ p2.getCelular() );
		
		
		
		Turma t = new Turma();
		t.setId(1);
		t.setDataInicio(new Date());
		t.setDataFim(new Date());
		t.setValor(100);
		t.setCurso(c2);
		t.setProfessor(p2);
		
		
		System.out.println("Turma => " + t.getCurso().getNome()+ " - " + t.getDataInicio() + " - " + t.getDataFim() + " - " 
				+ t.getValor() +" - "+ t.getProfessor().getNome());
		
	}

}
