/* ATENÇÃO --> Ao criar um novo arquivo em java, é necessário que seja como está escrito a classe. Se estiver escrito 
com a inicial maiuscula a classe deve iniciar com letra maiuscula. */ 

// Atributos são características de uma classe
// colocar ponto e virgula no final 
// String inicia com letra maiuscula poís é uma classe 
// int --> inicia com letra minuscula --> tipo primitivo
// para compilar java --> abrir terminal --> digitar --> javac Pessoa.java
// TEXTOS EM JAVA SEMPRE COLOCAR ASPAS DUPLAS.
// Aspas simples SOMENTE PARA 1 CARACTERE 


// importar para usar data 
import java.util.Date; 

class Pessoa { 
// características (atributos)
    String nome; 
    int cpf; 
    float saldoBancario; 
    Date dataNascimento;
    String endereco; 


    // métodos de uma classe (comportamento)
    void andar() {
        System.out.println("Andando..."); // colocar ponto e vírgula no final 
    }
    void falar() {
        System.out.println("Falando..."); 
    }

    void dormir() {
        System.out.println("Dormindo..."); 
    }
    void comer() {
        System.out.println("Comendo..."); 
    }

} // fim da classe Pessoa



