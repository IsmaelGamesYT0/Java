package LearnJava.DealershipSystem;

public class Car {
    String modelo;
    String cor;
    int ano;

    public void ExibirFichaTecnica(){
        System.out.println("Leia as informações abaixo do carro selecionado");
        System.out.println("Modelo: " + modelo  + "| Ano: " + ano + "| Cor: " + cor);
    }
}