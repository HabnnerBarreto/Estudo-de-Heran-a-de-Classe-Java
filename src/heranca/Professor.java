/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;
import java.util.Scanner;

public class Professor extends Pessoa{
    Scanner e = new Scanner(System.in);
    private String titulacao;
    private String disciplina;
    
    public void entrarTitulacao(){
        
        System.out.println("Digite a Titulação do Professor: ");
        titulacao = e.nextLine();
    }
    public void entrarDisciplina(){
        System.out.println("Digite a Disciplina: ");
        disciplina = e.nextLine();
    }
    public void exibirProfessor(){
        
        System.out.println("Titulação: "+titulacao);
        System.out.println("Disciplina: "+disciplina);
    }
}
