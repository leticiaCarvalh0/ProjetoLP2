/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 11151024600
 */
public class Funcionario extends Pessoa{
    private String cargo;
    private int horasTrabalhadas;
    private double salario;
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public Funcionario(String nome, String cpf, String telefone, String email, int horasTrabalhadas, String cargo, double salario) {
        super(nome, cpf, telefone, email);
        this.horasTrabalhadas=0;
        this.cargo=cargo;
        this.salario=salario;
    }
    
    public void definirCargo(String cargo){
        this.cargo=cargo;
    }
    
    public void definirSalario(double salario) {
        this.salario = salario;
    }
    
    public void registrarHorasTrabalhadas(int horas){
        this.horasTrabalhadas+=horas;
    }
    
    public static void listarFuncionarioPorCargo(List<Funcionario> funcionarios, String cargo){
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getCargo().equalsIgnoreCase(cargo)){
                System.out.println("Nome: "+funcionario.getNome()+" Cargo: "+funcionario.getCargo()+"Salario: "+funcionario.getSalario());
            }
        }
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Cargo: "+cargo);
        System.out.println("Salario: "+salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    
}
