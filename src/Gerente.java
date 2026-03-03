 public class Gerente extends Funcionario implements Autenticavel{
    private String senha;

    public Gerente(String nome, double salario, String senha) {
        super(nome, salario);
        this.senha = senha;
    }

     @Override
     public boolean autenticar(String senha) {
         return senha != null && senha.equals(this.senha);
     }

     @Override
     public double calcularBonus() {
         return getSalario() * 0.20;
     }
 }
