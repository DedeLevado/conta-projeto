import java.util.Scanner; // Importa a classe Scanner

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Bem-vindo ao nosso sistema de cadastramento!");
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine(); 
        System.out.println("Olá, " + nome + "!"); 

        System.out.print("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt(); 
        System.out.println("Conta número " + numeroConta + " criada com sucesso!"); 

        scanner.close(); 
    }
}
