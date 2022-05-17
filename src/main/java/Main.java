import interfaces.impl.*;
import preseter.BonusPresenter;
import service.AnalizaBonusService;
import model.Funcionario;
import view.BonusView;

public class Main {
    public static void main(String[] args) {
      /*  Funcionario funcionario=new Funcionario("Fulano",3600.00);
       *//* funcionario.calculadoraSalario(new CalculadoraDistanciaDoTrabalho());
        funcionario.calculadoraSalario(new CalculadoraBonusBom());
        *//*

        Funcionario funcionario2=new Funcionario("Ciclano",3600.00,15,0,3,2,2010);

        AnalizaBonusService rh=new AnalizaBonusService();

        funcionario2.calculadoraSalario(rh);

        System.out.println(funcionario2);*/

        BonusView bonusView=new BonusView();
        BonusPresenter bonusPresenter=new BonusPresenter(bonusView);
        bonusPresenter.mostraTela();
    }
}
