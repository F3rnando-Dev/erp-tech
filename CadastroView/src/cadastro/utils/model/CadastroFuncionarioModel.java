/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro.utils.model;

/**
 *
 * @author ferna
 */
public class CadastroFuncionarioModel {
    
    private String matriculaDoFuncionario;
    private String nomeDoFuncionario;
    private String cargoDoFuncionario;
    
    public CadastroFuncionarioModel(){
        
    }
    
    public CadastroFuncionarioModel(String matricula, String nome, String cargo){
        this.matriculaDoFuncionario = matricula;
        this.nomeDoFuncionario = nome;
        this.cargoDoFuncionario = cargo;
    }    

    public String getMatriculaDoFuncionario() {
        return matriculaDoFuncionario;
    }

    public void setMatriculaDoFuncionario(String matriculaDoFuncionario) {
        this.matriculaDoFuncionario = matriculaDoFuncionario;
    }

    public String getNomeDoFuncionario() {
        return nomeDoFuncionario;
    }

    public void setNomeDoFuncionario(String nomeDoFuncionario) {
        this.nomeDoFuncionario = nomeDoFuncionario;
    }

    public String getCargoDoFuncionario() {
        return cargoDoFuncionario;
    }

    public void setCargoDoFuncionario(String cargoDoFuncionario) {
        this.cargoDoFuncionario = cargoDoFuncionario;
    }

    @Override
    public String toString() {
        return "CadastroFuncionarioModel{" + "matriculaDoFuncionario=" + matriculaDoFuncionario + ", nomeDoFuncionario=" + nomeDoFuncionario + ", cargoDoFuncionario=" + cargoDoFuncionario + '}';
    }
}
