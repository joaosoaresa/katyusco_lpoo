/*
1) Volte ao nosso sistema de Funcionario e crie uma classe Empresa dentro do mesmo arquivo .java. A
Empresa tem um nome, cnpj e uma referência a uma array de Funcionario, além de outros atributos que
você julgar necessário.
 */
package Questao1;

/**
 *
 * @author jarde
 */
public class Data {
    int dia;
    int mes;
    int ano;
    
    String formatada(){
        String data = "";
        data += this.dia;
        data += '/';
        data += this.mes;
        data += '/';
        data += this.ano;
        
        return data;
    }
}