/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;
import java.util.Scanner;

/**
 *
 * @author Habner
 */
public class Funcionario extends Pessoa {
    Scanner e = new Scanner(System.in);
    private String cargo;
    private double salario;
    
    public void entrarCargo(){
        
        System.out.println("Digite o Cargo: ");
        cargo = e.nextLine();
    }
    public void entrarSalario(){
        
        System.out.println("Digite o Salário: ");
        salario = e.nextDouble();
    }
    public void exibirFunc(){
        
        System.out.println("Cargo: "+cargo);
        System.out.println("Salário: "+salario);
    }
    
}
