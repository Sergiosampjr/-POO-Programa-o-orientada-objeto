package classes;

public class ContaBancaria {
    String titular;
    int numeroConta;
    double saldoConta;

    void depositarValor(double valor){
        saldoConta += valor;
    }

    void sacarValor(double valor){
        if(valor <= saldoConta){
            saldoConta -= valor;
        }else if(valor > saldoConta){
            saldoConta = 0;
        }
    }

    void transferirSaldo(ContaBancaria conta2, double valorSacado){
        if(saldoConta >= valorSacado){
            sacarValor(valorSacado);
            conta2.depositarValor(valorSacado);
        }
    }
}
