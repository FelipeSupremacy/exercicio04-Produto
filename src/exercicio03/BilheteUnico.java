package exercicio03;

import java.util.Random;

public class BilheteUnico {
    int numeroBilhete;
    String usuario;
    double saldo;
    String tipoTarifa;
    final static double tarifaBase = 5.40;

    public BilheteUnico(String usuario, String tipoTarifa) {
        Random random = new Random();
        this.usuario = usuario;
        this.tipoTarifa = tipoTarifa;
        this.saldo = 0;
        this.numeroBilhete = random.nextInt(1000, 9999);
    }

    public void carregar(double valor) {
      if (valor <0) {
          return;
      }
      saldo += valor;
    }

    public void passarNaCatraca() {
        double valor = tarifaBase;
        if (tipoTarifa.equalsIgnoreCase("estudante") ||
                tipoTarifa.equalsIgnoreCase("professor")) {
            valor = valor / 2;
        }

        // verifica se tem saldo disponível
        if (saldo >= valor) {
            return;
        }
        saldo = saldo - valor;
        }
    }

    public void mostrarDados() {
        System.out.println("Número do Bilhete: " + numeroBilhete);
        System.out.println("Usuário: " + usuario);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de tarifa: " + tipoTarifa);
    }
}
