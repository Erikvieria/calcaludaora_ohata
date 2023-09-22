package calculadora;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class JavaJunitTest {
@Test
public void SomarUmNumeroInteiroComZero() {
	calculadora Somar = new calculadora();
	int result_soma = Somar.somar(15,0);	
	Assert.assertEquals(15, result_soma);
}

@Test
public void SomaComDoisNumerosPositivos(){
	calculadora Somar = new calculadora();
	 int result_soma = Somar.somar(3,2 );
	 Assert.assertEquals(5, result_soma);
	
	
}

@Test
public void SomaComUmNumeroNegativoeInteiro() {
	calculadora Somar = new calculadora();
	 int result_soma = Somar.somar(-1,3);
	 Assert.assertEquals(2, result_soma);
}

@Test
public void SomaComDoiNumerosNegativos() {
	calculadora Somar = new calculadora();
	 int result_soma = Somar.somar(-1,-3);
	 Assert.assertEquals(-4, result_soma);
}


@Test
public void SomaComUmNumeroNegativoEZero() {
	calculadora Somar = new calculadora();
	 int result_soma = Somar.somar(-1,0);
	 Assert.assertEquals(-1, result_soma);
}

@Test
public void SomaComDoisNumerosInterosComParenteses() {
	calculadora Somar = new calculadora();
	 int result_soma = Somar.somar(2, (2 +2));
	 Assert.assertEquals(6, result_soma);
}
	 

@Test
public void SUbtracaoComUmNumeroInteiroEZero() {
	calculadora Subtracao = new calculadora();	 
	int result_subtracao = Subtracao.subtracao(0, 16);
	 Assert.assertEquals(-16, result_subtracao);
}

@Test
public void SUbtracaoComDoisNumerosInteiros() {
	calculadora Subtracao = new calculadora();	 
	int result_subtracao = Subtracao.subtracao(7, 16);	 
	Assert.assertEquals(-9, result_subtracao);
}

@Test
public void SUbtracaoComNumeroInteiroENegativo() {
	calculadora Subtracao = new calculadora();	 
	int result_subtracao = Subtracao.subtracao(-1, 16);
	Assert.assertEquals(-17, result_subtracao);
}

@Test
public void SUbtracaoComDoisNumerosNegativos() {
	calculadora Subtracao = new calculadora();	 
	int result_subtracao = Subtracao.subtracao(-3, -12);
	Assert.assertEquals(9, result_subtracao);
}

@Test
public void SUbtracaoComParenteses() {
	calculadora Subtracao = new calculadora();	 
	int result_subtracao = Subtracao.subtracao(3,(5-12));
	Assert.assertEquals(10, result_subtracao);
}

@Test
public void MultplicacaoComUmZeroEInteiro() {
	calculadora Multiplicacao = new calculadora();
	 int result_multiplicacao = Multiplicacao.multiplicacao(0, 16);
	Assert.assertEquals(0, result_multiplicacao);
}


@Test
public void MultplicacaoComDoisInteiros() {
	calculadora Multiplicacao = new calculadora();
	 int result_multiplicacao = Multiplicacao.multiplicacao(7, 0);
	Assert.assertEquals(0, result_multiplicacao);
}

@Test
public void MultplicacaoComUmNumeroNegativoEInteiro() {
	calculadora Multiplicacao = new calculadora();
	 int result_multiplicacao = Multiplicacao.multiplicacao(-1, 16);
	Assert.assertEquals(-16, result_multiplicacao);
}

@Test
public void MultplicacaoComDoisNumerosNegativos() {
	calculadora Multiplicacao = new calculadora();
	 int  result_multiplicacao = Multiplicacao.multiplicacao(-1, -16);
	Assert.assertEquals(16, result_multiplicacao);
}

@Test
public void MultplicacaoComUmNumeroZeroEUmNumeroNegativo() {
	calculadora Multiplicacao = new calculadora();
	 int  result_multiplicacao = Multiplicacao.multiplicacao(0, -6);
	Assert.assertEquals(0, result_multiplicacao);
}

@Test
public void MultplicacaoComParenteses() {
	calculadora Multiplicacao = new calculadora();
	 int  result_multiplicacao = Multiplicacao.multiplicacao(3, (5*12));
	Assert.assertEquals(180, result_multiplicacao);
}


@Test
public void DivisaoDeUmNumeroInteiroPorZer0() {
	calculadora Divisao = new calculadora();
	  int result_divisao = Divisao.divisao(0, 16);
	Assert.assertEquals(0, result_divisao);
}


@Test
public void DivisaoDeDoisNumerosInteiros() {
	calculadora Divisao = new calculadora();
	  int result_divisao = Divisao.divisao(7, 7);
	Assert.assertEquals(1, result_divisao);
}


@Test
public void DivisaoDeDoisNumerosNegativos() {
	calculadora Divisao = new calculadora();
	  int result_divisao = Divisao.divisao(-7, -7);
	Assert.assertEquals(1, result_divisao);
}


@Test
public void DivisaoDeUmNumeroZeroEUmNegativo() {
	calculadora Divisao = new calculadora();
	  int result_divisao = Divisao.divisao(0, -7);
	Assert.assertEquals(0, result_divisao);
}


@Test
public void DivisaoComParenteses() {
	calculadora Divisao = new calculadora();
	  int result_divisao = Divisao.divisao(0, (7/7));
	Assert.assertEquals(0, result_divisao);
}






	
	
	
	
	
	
	
}
