/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;
import java.util.Scanner;

public class Pessoa {
    Scanner e  = new Scanner(System.in);
    private String nome;
    private String cpf;
    int opc;
    public void entrarNome(){
        
        System.out.println("Digite o nome: ");
        nome = e.nextLine();
    }
    
    public void entrarCpf(){
        
        System.out.println("Digite o CPF: ");
        cpf = e.nextLine();
    }

    public void exibirPessoa(){
        
        System.out.println("\nNome: "+nome);
        System.out.println("CPF: "+cpf);
        
    }
    public void exibirMenu(){
         System.out.println("*******Menu *******")   ;
         System.out.println(" 1- Aluno");
         System.out.println(" 2- Professor");
         System.out.println(" 3- Aluno Pós");
         System.out.println(" 4- Funcionário");
         System.out.println("*******************")   ;
        }
    
    public void escolheOPc(){
        System.out.println("Digite a opção selecionada");
        opc = e.nextInt();
    }
}
