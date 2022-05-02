package interfaces;

import model.Funcionario;
import org.jetbrains.annotations.NotNull;

public interface ICalculadoraBonus {
    public void calculaBonus(@NotNull Funcionario funcionario);
}
