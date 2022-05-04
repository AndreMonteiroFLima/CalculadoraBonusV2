package model;

import interfaces.ICalculadoraBonus;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;

public class Funcionario {

    private String nome;
    private double salarioBase;
    private double salario;
    private Collection<Bonus> bonus;
    private double distanciaDoTrablaho;
    private int numeroDeFaltas;
    private int numeroDeMembrosNaFamilia;
    private int numeroDeFilhos;
    private int anoDeIngresso;


    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.bonus = new ArrayList<>();
        this.salarioBase = salarioBase;
    }

    public Funcionario(String nome, double salarioBase, double distanciaDoTrablaho,
                       int numeroDeFaltas, int numeroDeMembrosNaFamilia, int numeroDeFilhos, int anoDeIngresso) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonus = new ArrayList<>();
        this.distanciaDoTrablaho = distanciaDoTrablaho;
        this.numeroDeFaltas = numeroDeFaltas;
        this.numeroDeMembrosNaFamilia = numeroDeMembrosNaFamilia;
        this.numeroDeFilhos = numeroDeFilhos;
        this.anoDeIngresso = anoDeIngresso;
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

    public double getDistanciaDoTrablaho() {
        return distanciaDoTrablaho;
    }

    public void setDistanciaDoTrablaho(double distanciaDoTrablaho) {
        this.distanciaDoTrablaho = distanciaDoTrablaho;
    }

    public void calculadoraSalario(@NotNull AnalizaBonusFuncionario analizaBonusFuncionario) {
        analizaBonusFuncionario.verificaSePossuiBonus(this);
        double valorBonus=0;
        for (Bonus bonus : bonus) {
            valorBonus+=bonus.getValor();
            if(valorBonus>=2){
                valorBonus-=1;
            }
        }
        this.salario=this.salarioBase*valorBonus;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getNumeroDeFaltas() {
        return numeroDeFaltas;
    }

    public void setNumeroDeFaltas(int numeroDeFaltas) {
        this.numeroDeFaltas = numeroDeFaltas;
    }

    public int getNumeroDeMembrosNaFamilia() {
        return numeroDeMembrosNaFamilia;
    }

    public void setNumeroDeMembrosNaFamilia(int numeroDeMembrosNaFamilia) {
        this.numeroDeMembrosNaFamilia = numeroDeMembrosNaFamilia;
    }

    public int getNumeroDeFilhos() {
        return numeroDeFilhos;
    }

    public void setNumeroDeFilhos(int numeroDeFilhos) {
        this.numeroDeFilhos = numeroDeFilhos;
    }

    public int getAnoDeIngresso() {
        return anoDeIngresso;
    }

    public void setAnoDeIngresso(int anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }

    public Collection<Bonus> getBonus() {
        return bonus;
    }

    public void setBonus(Collection<Bonus> bonus) {
        this.bonus = bonus;
    }

    public void addBonus(Bonus bonus){
        this.bonus.add(bonus);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", salario=" + salario +
                ", bonus=" + bonus.toString() +
                ", distanciaDoTrablaho=" + distanciaDoTrablaho +
                '}';
    }
}
