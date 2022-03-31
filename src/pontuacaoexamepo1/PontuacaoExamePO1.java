/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontuacaoexamepo1;
import java.util.Random; //para gerar numeros aleatórios
/**
 *
 * @author BelissimaV
 * Projecto: Referente ao exame de Programação Orientada a Objectos PO1
 * Escola: Canadá
 */
public class PontuacaoExamePO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        1 - Gerar 3 numeros aleatórios
        2 - Mostrar os numeros
        3 - Criar variavel pointage inteiro
        4 - Somar numeros aleatoris
        5 - Condições de acrescimo
        6 - Mostrar resultado final
        */
        
        Random r = new Random();
        int de1 = r.nextInt((6-1)+1)+1;
        int de2 = r.nextInt((6-1)+1)+1;
        int de3 = r.nextInt((6-1)+1)+1;
        
        System.out.println("   Dé 1: " + de1);
        System.out.println("\n Dé 2: " + de2);
        System.out.println("\n Dé 3: " + de3);
        //imprime sequência de 10 números inteiros aleatórios
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt());
        }
    }
    
}
