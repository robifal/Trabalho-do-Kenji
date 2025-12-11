package main;

import Permissionario.Permissionario;
import Veiculo.Veiculo;
import Multa.Multa;

public class Main {
    public static void main(String[] args) {    

        // Criar permissionário
        Permissionario perm = new Permissionario("Empresa de Taxi Ltda", "12.345.678/0001-90", "ABC1234");
        // perm.adicionarSubmodalidade("Táxi");
        perm.setQuantidadeMultasPendentes(2);
        
        // Permissionário cria veículo
        Veiculo veiculo = perm.criarVeiculo("ABC-1234", "Toyota Corolla", "Ativo", 2);
        
        // Veículo cria multa
        Multa multa1 = veiculo.criarMulta(
            "Excesso de velocidade",
            "Gravíssima",
            "Radar eletrônico",
            7,
            "2024-12-31",
            293.47,
            "2024-12-08",
            1
        );
        
        Multa multa2 = veiculo.criarMulta(
            "Estacionamento irregular",
            "Média",
            "Zona proibida",
            4,
            "2024-12-25",
            130.16,
            "2024-12-08",
            1
        );
        
        // Exibir informações
        System.out.println(perm);
        System.out.println(veiculo);
        System.out.println(multa1);
        System.out.println(multa2);
    }


}