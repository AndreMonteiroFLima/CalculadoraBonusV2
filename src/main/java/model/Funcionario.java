package model;

import interfaces.ICalculadoraBonus;
import org.jetbrains.annotations.NotNull;

public class Funcionario {

    private String nome;
    private double salarioBase;
    private double salario;
    private Bonus bonus;
    private double distanciaDoTrablaho;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Funcionario(String nome, double salarioBase, double distanciaDoTrablaho) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.distanciaDoTrablaho = distanciaDoTrablaho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws IllegalArgumentException{
        if(salario<=0){
            throw new IllegalArgumentException("Salario não pode ser menor ou igual a zero");
        }
        this.salario = salario;
    }

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    public double getDistanciaDoTrablaho() {
        return distanciaDoTrablaho;
    }

    public void setDistanciaDoTrablaho(double distanciaDoTrablaho) {
        this.distanciaDoTrablaho = distanciaDoTrablaho;
    }

    public void calculadoraSalario(@NotNull ICalculadoraBonus calculadoraBonus){
        calculadoraBonus.calculaBonus(this);
        this.salario=this.salarioBase*bonus.getValor();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", salario=" + salario +
                ", bonus=" + bonus +
                ", distanciaDoTrablaho=" + distanciaDoTrablaho +
                '}';
    }
}
