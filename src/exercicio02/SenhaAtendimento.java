package exercicio02;

public class SenhaAtendimento {
    String nomePaciente;
    long numeroSenha;
    static int controle = 100;


    public SenhaAtendimento(String nomePaciente) {
        this.nomePaciente = nomePaciente;
        this.numeroSenha = controle++;
    }

    public String getDados() {
        return "Paciente: " + nomePaciente + " | Senha: " + numeroSenha;

    }
}