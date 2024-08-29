
/*
Descrição

Implemente um sistema que verifique se um cliente de uma empresa de telecomunicações contratou um combo completo de serviços.
Um combo completo inclui os três serviços principais oferecidos pela empresa: telefonia móvel, banda larga e TV por assinatura.
O sistema deve ler uma lista de serviços contratados pelo cliente e determinar se todos os serviços necessários estão incluídos.
Caso todos os três serviços estejam presentes, o sistema deve retornar "Combo Completo".
Se faltar qualquer um dos serviços, o sistema deve retornar "Combo Incompleto". 
 */
import java.util.Scanner;

public class ComboServico {

    public static String verificarComboCompleto(String[] servicosContratados) {

        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        for (String servico : servicosContratados) {
            servico = servico.trim(); 

            if (servico.equalsIgnoreCase("movel")) {
                movelContratado = true;
            } else if (servico.equalsIgnoreCase("banda larga")) {
                bandaLargaContratada = true;
            } else if (servico.equalsIgnoreCase("tv")) {
                tvContratada = true;
            }
        }


        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] servicosContratados = input.split(",");

        String resultado = verificarComboCompleto(servicosContratados);

        System.out.println(resultado);

        scanner.close();
    }
}
