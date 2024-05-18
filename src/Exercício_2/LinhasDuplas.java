package Exercício_2;

public class LinhasDuplas extends Retangulo {
    public LinhasDuplas(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        // Implementação para desenhar um retângulo com linhas duplas
        System.out.println("Retângulo com linhas duplas:");
        System.out.println("=============");
        System.out.println("==         ==");
        System.out.println("==  " + texto + "  ==");
        System.out.println("==         ==");
        System.out.println("=============");
    }
}