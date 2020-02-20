package br.com.contmatic.model.empresa;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.contmatic.model.endereco.EnderecoTest;
import br.com.contmatic.model.produto.ProdutoTest;

@RunWith(Suite.class)
@SuiteClasses({EmpresaTest.class,FuncionarioTest.class, ProdutoTest.class, EnderecoTest.class, ClienteTest.class})
public class RunnerTest {
}