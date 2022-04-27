import interfaces.impl.CalculadoraBonusBom;
import interfaces.impl.CalculadoraDistanciaDoTrabalho;
import model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario=new Funcionario("Fulano",3600.00);
        funcionario.calculadoraSalario(new CalculadoraDistanciaDoTrabalho());
        funcionario.calculadoraSalario(new CalculadoraBonusBom());

        System.out.println(funcionario);
    }
}
