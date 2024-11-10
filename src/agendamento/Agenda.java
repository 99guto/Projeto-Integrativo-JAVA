package agendamento;
import java.util.ArrayList;

public class Agenda {
    ArrayList<String> agendamentos = new ArrayList<>();
    ArrayList<String> presencas = new ArrayList<>();

    public void agendar(Usuario usuario, Atividade atividade) {
        String agendamento = usuario.nome + " - " + atividade.nome + " às " + atividade.horario;
        agendamentos.add(agendamento);
        System.out.println("Agendamento feito: " + agendamento);
    }

    public void registrarPresenca(Usuario usuario, Atividade atividade) {
        String presenca = usuario.nome + " - Presença confirmada em " + atividade.nome + " às " + atividade.horario;
        presencas.add(presenca);
        System.out.println(presenca);
    }

    public void mostrarAgendamentos() {
        System.out.println("Agendamentos:");
        for (String agendamento : agendamentos) {
            System.out.println(agendamento);
        }
    }

    public void mostrarPresencas() {
        System.out.println("Presenças:");
        for (String presenca : presencas) {
            System.out.println(presenca);
        }
    }
}
