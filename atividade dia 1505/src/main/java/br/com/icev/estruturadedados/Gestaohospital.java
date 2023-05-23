package br.com.icev.estruturadedados;

public class Gestaohospital {
	private Fila fila = new Fila();
	private Fila normal = new Fila();
	private Fila leve = new Fila();
	private Fila moderado = new Fila();
	private Fila severo = new Fila();
	private boolean continuar1 = true;
	private boolean continuar2 = false;
	private boolean continuar3 = false;
	private boolean continuar4 = false;
	
	public void addPaciente(Paciente paciente) {
		if(paciente.getPrioriodade()==Prioridade.NORMAL) {
			normal.push(paciente);
		}
		else if(paciente.getPrioriodade()==Prioridade.LEVE) {
			leve.push(paciente);
		}
		else if(paciente.getPrioriodade()==Prioridade.MODERADO) {
			moderado.push(paciente);
		}
		else if(paciente.getPrioriodade()==Prioridade.SEVERO) {
			severo.push(paciente);
		}
	}
	
			
	public void atenderPaciente() {
		if(continuar1) {
			normal.pop();
			continuar1 = false;
			continuar2 = true;
		}
		else if(continuar2) {
			leve.pop();
			continuar2 = false;
			continuar3 = true;
		}
		else if(continuar3) {
			moderado.pop();
			continuar3 = false;
			continuar4 = true;
		}
		else if(continuar4) {
			moderado.pop();
			continuar4 = false;
			continuar1 = true;
		}
	}
	
}
