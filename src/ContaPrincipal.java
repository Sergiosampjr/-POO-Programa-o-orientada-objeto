public class ContaPrincipal{
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.titular = "Rodrigo";
        c1.numeroConta = 620259;
        c1.saldoConta = 5000.00;

        
        c1.sacarValor(400);
        
        ContaBancaria c2 = new ContaBancaria();
        c2.titular = "Karine";
        c2.numeroConta = 929090;
        c2.saldoConta = 8500.55;

        //Depositando em c2
        c2.depositarValor(600);
        System.out.println(c1.saldoConta);
        System.out.println(c2.saldoConta);

        //Transferindo entre contas
        c1.transferirSaldo(c2, 400);
        System.out.println(c1.saldoConta);
        System.out.println(c2.saldoConta);
    }
}



