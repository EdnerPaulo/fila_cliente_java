package concerto;

import java.util.LinkedList;
import java.util.Queue;

public class FilaClientes {
    // Fila que armazena os clientes (carros)
    private Queue<Cliente> filaClientes = new LinkedList<>();

    // Método para adicionar um cliente à fila
    public void adicionarCliente(Cliente cliente) {
        filaClientes.add(cliente);
        System.out.println("Carro de " + cliente.getNome_Cli() + " com a placa " + cliente.getPlaca() + " adicionado à fila.");
    }

    // Método para retirar um carro da fila (atendimento do carro)
    public void retirarCarro() {
        if (!filaClientes.isEmpty()) {
            Cliente carroRetirado = filaClientes.poll();  // remove o primeiro cliente (primeiro na fila)
            System.out.println("O carro com a placa " + carroRetirado.getPlaca() + " foi retirado da fila.");
          
        } else {
            System.out.println("A fila está vazia. Nenhum carro para retirar.");
        }
    }

    // Método para exibir todos os carros na fila
    public void exibirFila() {
        if (filaClientes.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Carros na fila:");
            for (Cliente cliente : filaClientes) {
                System.out.println(cliente);
            }
        }
    }

    // Método de busca linear: procura um carro pela placa
    public Cliente buscarCarroPorPlaca(String placa) {
        for (Cliente cliente : filaClientes) {
            if (cliente.getPlaca().equals(placa)) {
                System.out.println("Carro encontrado: " + cliente);
                return cliente;  // Retorna o cliente que tem a placa procurada
            }
        }
        System.out.println("Carro com a placa " + placa + " não encontrado na fila.");
        return null;  // Se não encontrar
    }
}
