package concerto;



public class Main {
    public static void main(String[] args) {
        // Criando a fila de clientes
        FilaClientes fila = new FilaClientes();

        // Cadastrando alguns carros e adicionando-os à fila
        Cliente cliente1 = new Cliente("123", "João Silva", "987654321", "Fusca", 1980, "Volkswagen");
        Cliente cliente2 = new Cliente("124", "Maria Oliveira", "912345678", "Gol", 2015, "Volkswagen");
        Cliente cliente3 = new Cliente("125", "Carlos Pereira", "998877665", "Civic", 2018, "Honda");
        Cliente cliente4 = new Cliente("126", "Fernanda Souza", "998877556", "Corolla", 2020, "Toyota");
        Cliente cliente5 = new Cliente("127", "Pedro Almeida", "981234567", "Fiesta", 2014, "Ford");
        Cliente cliente6 = new Cliente("128", "Ana Costa", "977543210", "Palio", 2012, "Fiat");

        // Adicionando carros à fila
        fila.adicionarCliente(cliente1);
        fila.adicionarCliente(cliente2);
        fila.adicionarCliente(cliente3);
        fila.adicionarCliente(cliente4);
        fila.adicionarCliente(cliente5);
        fila.adicionarCliente(cliente6);

        // Exibindo carros na fila
        fila.exibirFila();

        // Buscando um carro pela placa
        System.out.println("\nBuscando carro com a placa 'XYZ-5678'...");
        fila.buscarCarroPorPlaca("XYZ-5678");

        // Buscando um carro com uma placa que não existe
        System.out.println("\nBuscando carro com a placa 'ZZZ-9999'...");
        fila.buscarCarroPorPlaca("ZZZ-9999");

        // Retirando um carro da fila
        System.out.println("\nProcessando a retirada dos veículos da fila...");
        fila.retirarCarro();  // Retira o primeiro carro da fila

        // Exibindo a fila após a retirada
        fila.exibirFila();
    }
}