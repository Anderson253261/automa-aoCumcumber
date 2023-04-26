package Steps; 

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
  Metodos m = new Metodos ();
  Elementos e = new Elementos ();
	  
  
  
  	  
  @Given("^que o usuario acesse a url \"([^\"]*)\"$")
  public void que_o_usuario_acesse_a_url(String url) throws Throwable {
  m.executarNavegador(url, "chrome"); 
  }

  @Given("^selecione o botao abrir nova conta$")
  public void selecione_o_botao_abrir_nova_conta() throws Throwable {
  m.click(e.getBtnAbrirConta(),"selecionando botao abrir conta");  
  m.pausa(3000,"pausa para carregar o botao abrir conta");
  m.click(e.getBtnAbrirConta(),"selecionando botao abrir conta");
  }

  @Given("^selecionar o botao abrir conta para voce$")
  public void selecionar_o_botao_abrir_conta_para_voce() throws Throwable {
  m.click(e.getBtnParaVoce(),"abrir conta para voce");
  
  }

  @When("^o usuario preencher o formulario$")
  public void o_usuario_preencher_o_formulario() throws Throwable {
  m.preencher(e.getNomeCompleto(), "anderson", "preenchendo o campo nome");      
  m.preencher(e.getTelefone(),"47965796610", "preenchendo o campo telefone"); 
  m.preencher(e.getEmail(), "anderson@gemail.com" , "preenchendo o campo email"); 
  m.preencher(e.getCpf(), "18040916003" , "preenchendop o camp cpf"); 
  
  }
  @When("^selecionar o botao quero ser cliente$")
  public void selecionar_o_botao_quero_ser_cliente() throws Throwable {
  m.click(e.getBtnEnviar(), "selecionando o botao quero ser cliente");    
  
  }
  
  @Then("^valido o texto falta pouco$")
  public void valido_o_texto_falta_pouco() throws Throwable {
	  
  }
  
  }
	  
  
	    
	
  