// criar um programa para usar as classes carro e pessoa que foram desenvolvidas
// SEMPRE COMPILAR, ANTES DE EXECUTAR

import java.util.Date; 

class Programa {
    // método principal do programa 
    // obrigatório em qualquer programa java
public static void main(String[] args) {
// bloco de código
// criando um objeto da classe Pessoa 
// Classe do tipo Pessoa --> recebe a variável P1 ---> criar newPessoa para armazenar as informações 
    Pessoa p1 = new Pessoa(); 
    p1.nome = "João"; 
    p1.cpf = 1234567889;
    p1.saldoBancario = 1000; 
    p1.dataNascimento = new Date();
    p1.endereco = "Rua dos bobos, nº 0";

    // chamar os métodos da classe
    p1.andar(); 
    p1.falar();
    p1.dormir();
    p1.comer();


    // instanciar os objetos da classe Carro 

    Carro car = new Carro (); 
    car.nomeCarro = "Siena"; 
    car.corCarro = "vermelho"; 
    car.modelo = "Sedan"; 
    car.marca = "Fiat"; 
    car.anoCarro = 2017; 

    // chamar os métodos da classe 
    car.ligar(); 
    car.acelerar();
    car.frear(); 
    car.trocarMarcha();
    car.desligar();  



}

}
 // fim da classe programa