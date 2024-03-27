public class Peixe extends Animal {
    private String caracteristica;


    public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void dadosPeixe() {
        super.dadosAnimal();
        System.out.println("Característica: " + caracteristica);
    }


}