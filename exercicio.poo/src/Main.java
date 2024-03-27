public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(
                "Leão",
                2.5f,
                4,
                "Marrom",
                "Savana",
                60);

        Mamifero ursodocanada= new Mamifero(
                "Urso-do-canadá",
                1.8f,
                4,
                "Vermelha",
                "terra",
                0.5f,
                "Mel");

        Mamifero camelo=new Mamifero(
                "Camelo",
                1.5f,
                4,
                "amarelo",
                "terra",
                2,
                "plantas");

        Peixe tubarao = new Peixe(
                "Tubarão",
                3.0f,
                0,
                "Cinzento",
                "Mar",
                1.5f,
                "Barbatanas e cauda");

        System.out.println("dados do animal:");
        animal.dadosAnimal();

        System.out.println("\nDados do peixe:");
        tubarao.dadosPeixe();

        System.out.println("\nDados do mamifero:");
        ursodocanada.dadosMamifero();
    }
}