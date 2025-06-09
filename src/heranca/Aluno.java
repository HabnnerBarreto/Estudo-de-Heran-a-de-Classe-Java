/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;
import java.util.Scanner;

public class Aluno extends Pessoa {
    Scanner e = new Scanner(System.in);
    private String ra;
    private Double nota;
    
    public void entrarRa(){
        
        System.out.println("Digite o RA: ");
        ra = e.nextLine();
        
    }
    public void entrarNota(){
        
        System.out.println("Digite a nota");
        nota = e.nextDouble();
        
    }
    public void exibirAluno(){
        
        System.out.println("RA: "+ra);
        System.out.println("Nota: "+nota);
    }
}
