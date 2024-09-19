package Automovel;

public class Automovel {

    private String cor;
    private String marca;
    private String modelo;
    private int ano;

    Automovel() {
        cor = "Preto";
        marca = "Fiat";
        modelo = "Uno";
        ano = 2020;
    }

    Automovel(String cor, String marca, String modelo, int ano) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static void main(String[] args) {
        Automovel a1 = new Automovel();
        Automovel a2 = new Automovel("Vermelho", "Honda", "Civic", 2022);

        System.out.println("O automóvel a1 tem as seguintes características:");
        System.out.println("Cor: " + a1.getCor());
        System.out.println("Marca: " + a1.getMarca());
        System.out.println("Modelo: " + a1.getModelo());
        System.out.println("Ano: " + a1.getAno());

        System.out.println("\nO automóvel a2 tem as seguintes características:");
        System.out.println("Cor: " + a2.getCor());
        System.out.println("Marca: " + a2.getMarca());
        System.out.println("Modelo: " + a2.getModelo());
        System.out.println("Ano: " + a2.getAno());

        a1.setCor("Azul");
        a1.setAno(2021);

        System.out.println("\nApós modificações, o automóvel a1 tem as seguintes características:");
        System.out.println("Cor: " + a1.getCor());
        System.out.println("Ano: " + a1.getAno());
    }
}
