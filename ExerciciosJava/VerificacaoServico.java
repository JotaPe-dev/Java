/*
 * Descrição
Uma concessionária de telecomunicações oferece quatro tipos de serviços: telefonia móvel,
telefonia fixa, banda larga e TV por assinatura. Para facilitar o atendimento ao cliente,
é necessário implementar um programa que verifique se um cliente específico contratou um determinado serviço.
 Por exemplo, quando um cliente liga para a central de atendimento e menciona um serviço,
 o atendente deve ser capaz de rapidamente verificar se esse serviço está contratado pelo cliente.
 */

import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String servico = scanner.nextLine().trim();
        String entradaCliente = scanner.nextLine().trim();
        
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].trim().equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            }
        }
        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
        
        scanner.close();
    }
}
