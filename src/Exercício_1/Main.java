package Exercício_1;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Funcionário 1", 15.0f, 160);
        Lider l1 = new Lider("Funcionário 2", 20.0f, 160);
        Gerente g1 = new Gerente("Funcionário 3", 35.0f, 160);

        System.out.println("Salário de " + f1.getNome() + ": R$" + f1.calcularSalario());
        System.out.println("Salário de " + l1.getNome() + ": R$" + l1.calcularSalario());
        System.out.println("Salário de " + g1.getNome() + ": R$" + g1.calcularSalario());
    }
}