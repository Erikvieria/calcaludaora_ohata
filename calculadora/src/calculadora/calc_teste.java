package calculadora;

public class calc_teste {
	public static void main(String [] args){
        
		// teste de soma 
        calculadora Somar = new calculadora();
        
        // teste da soma com um zero e um inteiro 
        int result_soma = Somar.somar(15,0);
        System.out.println("O resultado da soma e:  " + result_soma);
        
        
        // teste de soma com dois numeros inteiros 
        result_soma = Somar.somar(0,0 );
        System.out.println("O resultado da soma e:  " + result_soma);
        
        
        // teste de soma com um numero negativo e um inteiro 
        result_soma = Somar.somar(-1,3);
        System.out.println("O resultado da soma e:  " + result_soma);
        
        
        // teste de soma com dois numeros negativos 
        result_soma = Somar.somar(-1,-3);
        System.out.println("O resultado da soma e:  " + result_soma);
        
        
        // teste de som com um zero e um numero negativo 
        result_soma = Somar.somar(-1,0);
        System.out.println("O resultado da soma e:  " + result_soma);
        
        // teste de soma com parenteses 
        result_soma = Somar.somar(2, (2 +2));
         System.out.println("O resultado da soma e:  " + result_soma);
        
        
        
        // teste da subtração
        calculadora Subtracao = new calculadora();
        
        // teste da subtração com um zero e um inteiro 
        int result_subtracao = Subtracao.subtracao(0, 16);
        System.out.println("O resultado da subtracao e:  "  + result_subtracao);
        
        
       // teste de subtração com dois numeros inteiros 
         result_subtracao = Subtracao.subtracao(7, 16);
         System.out.println("O resultado da subtracao e:  "  + result_subtracao);
         
         //teste de subtração com um numero negativo e um inteiro 
          result_subtracao = Subtracao.subtracao(-1, 16);
          System.out.println("O resultado da subtracao e:  "  + result_subtracao);
        
         
        // teste de subtração com dois numeros negativos 
          result_subtracao = Subtracao.subtracao(-1, -16);
          System.out.println("O resultado da subtracao e:  "  + result_subtracao);
          
          
        //  teste de subtração com um zero e um numero negativo 
          result_subtracao = Subtracao.subtracao(-0, -12);
          System.out.println("O resultado da subtracao e:  "  + result_subtracao);
         
          
        // teste de subtração com parenteses 
          result_subtracao = Subtracao.subtracao(3, (5-12));
          System.out.println("O resultado da subtracao e:  "  + result_subtracao);
         
         
        
          // teste de multiplicacao
          calculadora Multiplicacao = new calculadora();
          
        
        // teste da multiplicacao com um zero e um inteiro 
        int result_multiplicacao = Multiplicacao.multiplicacao(0, 16);
        System.out.println("O resultado da multiplicacao  e:  "  + result_multiplicacao);
        
        
        
         // teste de multiplicacao com dois numeros inteiros 
         result_multiplicacao = Multiplicacao.multiplicacao(7, 0);
         System.out.println("O resultado da multiplicacao e:  "  + result_multiplicacao );
         
         
         //teste de mutiplicacao com um numero negativo e um inteiro 
          result_multiplicacao = Multiplicacao.multiplicacao(-1, 16);
          System.out.println("O resultado da multiplicacao e:  "  + result_multiplicacao);
          
          
          // teste de multiplicacao com dois numeros negativos 
          result_multiplicacao = Multiplicacao.multiplicacao(-1, -16);
          System.out.println("O resultado da multiplicacao e:  "  + result_multiplicacao);
          
          
          
          //  teste de multiplicacao com um zero e um numero negativo 
          result_multiplicacao = Multiplicacao.multiplicacao(0, -6);
          System.out.println("O resultado da multiplicacao e:  "  + result_multiplicacao);
          
          // teste de multiplicacao com parenteses 
          result_multiplicacao = Multiplicacao.multiplicacao(3, (5*12));
          System.out.println("O resultado da multiplicacao e:  "  + result_multiplicacao);
          
       // teste de divisao
          calculadora Divisao = new calculadora();
         
          
       // teste da divisão com um zero e um inteiro 
          int result_divisao = Divisao.divisao(0, 16);
          System.out.println("O resultado da divisao  e:  "  + result_divisao);
          
          try{
              result_divisao = Divisao.divisao(7, 0);
           System.out.println("O resultado da divisão e:  "  + result_divisao );
          
          }
          catch (Exception ex ){
              System.out.println("Erro não ocorre divisao por 0 ");
              
           // teste de divisao com dois numeros inteiros 
              result_divisao = Divisao.divisao(7, 0);
              System.out.println("O resultado da divisao e:  "  + result_divisao );
              
              
             
          
          
         
          
           
}
	}
	}
