public class Main {
    public static void main(String[] args) {

        Gerente g = new Gerente("João", 3000.00, "8322");
        Desenvolvedor dev = new Desenvolvedor("Pedro", 20000.00);

        Funcionario[] funcionarios = {g, dev};

        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome());
            System.out.printf("Salario: R$%.2f%n", f.getSalario());
            System.out.printf("Bônus: R$%.2f%n", f.calcularBonus());
            System.out.println("------------------------------------");
        }

        System.out.println("Autenticou? " + g.autenticar("8322"));
        System.out.println("Autenticou? " + g.autenticar("0123"));
    }
}