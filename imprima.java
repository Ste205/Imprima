import java.util.Scanner;

public class ManipulacaoString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();
        
        int numCaracteres = entrada.length();
        System.out.println("Número de caracteres: " + numCaracteres);
        
        String stringMaiuscula = entrada.toUpperCase();
        System.out.println("String em maiúsculo: " + stringMaiuscula);
        
        int contVogais = contarVogais(entrada.toLowerCase());
        System.out.println("Número de vogais: " + contVogais);
        
        boolean comecaComUni = entrada.toLowerCase().startsWith("uni");
        System.out.println("Começa com 'UNI': " + (comecaComUni ? "Sim" : "Não"));
        
        boolean terminaComRio = entrada.toLowerCase().endsWith("rio");
        System.out.println("Termina com 'RIO': " + (terminaComRio ? "Sim" : "Não"));
    }

    public static int contarVogais(String s) {
        int cont = 0;
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                cont++;
            }
        }
        return cont;
    }
}

