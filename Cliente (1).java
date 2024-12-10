package concerto;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("unused")
public class Cliente {
    // Atributos de cliente e carro
    private String id_Cliente;
    private String Nome_Cli;
    private String telefone;
    private String modelo;
    private int ano;
    private String placa;
    

    // Getters e Setters
	public String getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(String id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	
	public String getNome_Cli() {
        return Nome_Cli;
    }

    public void setNome_Cli(String nome_Cli) {
        this.Nome_Cli = nome_Cli;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

   

    // Construtor
    public Cliente(String id_Cliente, String nome_Cli, String telefone, 
                   String modelo, int ano, String placa) {
        this.setId_Cliente(id_Cliente);
        this.Nome_Cli = nome_Cli;
        this.setTelefone(telefone);
        this.modelo = modelo;
        this.setAno(ano);
        this.placa = placa;
    }
        

    // Para exibir os detalhes do cliente
    @Override
    public String toString() {
        return "Cliente: " + Nome_Cli + " | Carro: " + modelo + " | Placa: " + placa ;
    }

	public void setStatusConcerto(String string) {
		// TODO Auto-generated method stub
		
	}


	}




