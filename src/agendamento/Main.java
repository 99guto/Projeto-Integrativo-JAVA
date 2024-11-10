package agendamento;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Criança 1", "responsavel1@example.com");
        Usuario usuario2 = new Usuario("Criança 2", "responsavel2@example.com");

        Atividade atividade1 = new Atividade("Presença na Aula", gerarHorarioManha());
        Atividade atividade2 = new Atividade("Presença na Aula", gerarHorarioManha());

        Agenda agenda = new Agenda();
        agenda.agendar(usuario1, atividade1);
        agenda.agendar(usuario2, atividade2);

        agenda.registrarPresenca(usuario1, atividade1);
        agenda.registrarPresenca(usuario2, atividade2);

        agenda.mostrarAgendamentos();
        agenda.mostrarPresencas();
    }

    public static String gerarHorarioManha() {
        Random random = new Random();
        int hora = 8 + random.nextInt(4); 
        int minuto = random.nextInt(60); 
        return String.format("%02d:%02d", hora, minuto);
    }
}
