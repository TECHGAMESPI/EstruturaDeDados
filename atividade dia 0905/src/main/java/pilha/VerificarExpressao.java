package pilha;

import java.util.Stack;

public class VerificarExpressao {
    public static boolean verificarExpressao(String expressao) {
        Stack<Character> pilha = new Stack<Character>();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpty() || !verificarPar(pilha.peek(), caractere)) {
                    return false;
                }
                pilha.pop();
            }
        }

        return pilha.isEmpty();
    }

    private static boolean verificarPar(char abertura, char fechamento) {
        return (abertura == '(' && fechamento == ')') ||
               (abertura == '[' && fechamento == ']') ||
               (abertura == '{' && fechamento == '}');
    }

    public static void main(String[] args) {
        String expressao1 = "x+y*(3+z)";
        String expressao2 = "x+y*(3+";

        boolean resultado1 = verificarExpressao(expressao1);
        boolean resultado2 = verificarExpressao(expressao2);

        System.out.println(expressao1 + " está correta? " + resultado1);
        System.out.println(expressao2 + " está correta? " + resultado2);
    }
}
