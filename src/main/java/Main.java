import interfaces.impl.*;
import model.AnalizaBonusFuncionario;
import model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario=new Funcionario("Fulano",3600.00);
       /* funcionario.calculadoraSalario(new CalculadoraDistanciaDoTrabalho());
        funcionario.calculadoraSalario(new CalculadoraBonusBom());
        */

        Funcionario funcionario2=new Funcionario("Ciclano",3600.00,15,0,3,2,2010);

        AnalizaBonusFuncionario rh=new AnalizaBonusFuncionario();
        rh.addFormaCalculoBonus(new CalculadoraBonusAssiduidade());
        rh.addFormaCalculoBonus(new CalculadoraBonusdeNatal());
        rh.addFormaCalculoBonus(new CalculadoraBonusNumeroDeMembrosNaFamilia());
        rh.addFormaCalculoBonus(new CalculadoraBonusNumeroDeFilhosNaFamilia());
        rh.addFormaCalculoBonus(new CalculadoraBonusPorTempoNaEmpresa());
        rh.addFormaCalculoBonus(new CalculadoraDistanciaDoTrabalho());

        funcionario2.calculadoraSalario(rh);

        System.out.println(funcionario2);
    }
}
