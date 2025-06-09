/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

import java.util.Scanner;

public class alunoPos extends Aluno{
    
    Scanner e = new Scanner(System.in);
    private String tema;
    
    public void entrarTema(){
        
        System.out.println("Digite o Tema da Pós: ");
        tema = e.nextLine();
    }
    public void exibirTema(){
        System.out.println("Tema: "+tema);
    }
}
