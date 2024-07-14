package src.encapsulamento;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("878787");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("464646");
        z400.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();
    }
}
