public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        Carro utilitario = new Carro("Utilitário", TipoCombustivel.DIESEL, 5, 70);
        Carro suv = new Carro("SUV", TipoCombustivel.FLEX, 8, 55);


        System.out.println("Tipos de veiculos:");
        System.out.println(basico);
        System.out.println(esportivo);
        System.out.println(utilitario);
        System.out.println(suv);


        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro esportivo com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 30);
        System.out.println(esportivo);
        System.out.println("\nViajando com o carro esportivo");
        esportivo.viaja(20);
        System.out.println(esportivo);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro utilitário com diesel");
        utilitario.abastece(TipoCombustivel.DIESEL, 69);
        System.out.println(utilitario);
        System.out.println("\nViajando com o carro utilitário");
        utilitario.viaja(100);
        System.out.println(utilitario);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro suv com flex");
        suv.abastece(TipoCombustivel.FLEX, 55);
        System.out.println(suv);
        System.out.println("\nViajando com o carro SUV");
        suv.viaja(34);
        System.out.println(suv);
    }
}
