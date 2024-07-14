package src.encapsulamento;

public class Carro extends Veiculo {
    public void ligar(){
        conferirCambio();
        conferirCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void conferirCombustivel(){
        System.out.println("conferindo combustível");
    }
    private void conferirCambio(){
        System.out.println("conferindo cambio em P");
    }
}
