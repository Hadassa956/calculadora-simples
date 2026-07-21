public class Calculadora {
    //aqui defini as variaveis com valor padrão de double = 0.0
    //caso fosse variavel com número é só colocar double numero1 = 2
   Double numero1;
   Double numero2;

    public Calculadora (Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
   }
}


//tipos de referencia wrappers : envelopadoras; são classes
// do tipo primitivo por exemplo... tem o tipo double, que contem
// a classe Double... o valor padrão é null
/*
* quando está nessa classe Double e vc tenta somar variaveis vazias
* ou seja, com o padrão = null
* dá o erro NullPointerException
* para trabalhar com referências (Classe Doublepor exemplo)
* TEmos que inicializar os atributos:
*
*
* */