package Exercício_2;

public abstract class Retangulo {
    protected String texto;

    public Retangulo(String texto) {
        this.texto = texto;
    }

    public abstract void desenhar();
}
