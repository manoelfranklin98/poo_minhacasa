public class main {

    private String cor;
    private int numeroQuartos;
    private double area;


    public main(String cor, int numeroQuartos, double area) {
        this.cor = cor;
        this.numeroQuartos = numeroQuartos;
        this.area = area;
    }


    public void exibirInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Número de quartos: " + numeroQuartos);
        System.out.println("Área: " + area + " metros quadrados");
    }

    public static void main(String[] args) {

        main minhaCasa = new main("Azul", 3, 150.5);


        minhaCasa.exibirInformacoes();
    }
}



