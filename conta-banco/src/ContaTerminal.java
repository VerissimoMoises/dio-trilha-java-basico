import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{
        /*  TODO: Conhecer e importar a classe Scanner
            Exibir as mensagens para o nosso usuário 
            Obeter pela classe scanner os valores digitados no terminal
            Exibir a mensagem da conta criada
        */

        //Declarando a variavel Scanner para poder receber os dados dos clientes pelo terminal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibindo as mensagens para inserção dos dados e em seguida declarando as cariaveis onde serão armazenados
        System.out.println("Por favor, informe o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Agora, informe o número da agencia: ");
        String agencia = scanner.next();

        System.out.println("Informe o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Qual o valor do saldo?");
        Double saldo = scanner.nextDouble();

        // Exibindo a mensagem de conta criada com os dados fornecidos pelos clientes
        System.out.println("Olá " + nomeCliente + ", obrigado(a) por criar uma conta em nosso banco, sua gência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + "já está disponível para saque.");
    }
    
}