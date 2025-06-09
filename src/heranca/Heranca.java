/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author Habner
 */
public class Heranca {

    
    public static void main(String[] args) {
        
        Pessoa pes = new Pessoa();
        pes.exibirMenu();
        pes.escolheOPc();
        
        Aluno a = new Aluno();
        Professor p = new Professor();
        alunoPos ap = new alunoPos();
        Funcionario f = new Funcionario();
        
        
        
        if(pes.opc == 1){
        a.entrarNome();
        a.entrarCpf();
        a.entrarRa();
        a.entrarNota();
        a.exibirPessoa();
        a.exibirAluno();
        
        }
        if(pes.opc == 2){
        p.entrarNome();
        p.entrarCpf();
        p.entrarTitulacao();
        p.entrarDisciplina();
        f.entrarCargo();
        f.entrarSalario();
        p.exibirPessoa();
        p.exibirProfessor();
        f.exibirFunc();
        }
        
        if(pes.opc == 3){
        ap.entrarNome();
        ap.entrarCpf();
        ap.entrarRa();
        ap.entrarNota();
        ap.entrarTema();
        ap.exibirPessoa();
        ap.exibirAluno();
        ap.exibirTema();
        }
        
        if(pes.opc == 4){
        f.entrarNome();
        f.entrarCpf();
        f.entrarCargo();
        f.entrarSalario();
        f.exibirPessoa();
        f.exibirFunc();
        }
    }
    
}
