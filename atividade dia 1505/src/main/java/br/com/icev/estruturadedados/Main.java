package br.com.icev.estruturadedados;


public class Main {

    public static void main (String [] args){


        Gestaohospital hospital = new Gestaohospital();

        Paciente paciente1 = new Paciente("nome1", "1238982138", Prioridade.NORMAL);
        Paciente paciente2 = new Paciente("nome2", "1238982138", Prioridade.LEVE);
        Paciente paciente3 = new Paciente("nome3", "1238982138", Prioridade.MODERADO);
        Paciente paciente4 = new Paciente("nome4", "1238982138", Prioridade.SEVERO);


        hospital.addPaciente(paciente1);
        hospital.addPaciente(paciente2);
        hospital.addPaciente(paciente3);
        hospital.addPaciente(paciente4);

        hospital.atenderPaciente();
        hospital.atenderPaciente();
        hospital.atenderPaciente();
        hospital.atenderPaciente();
    }
}