package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	
private By btnAbrirConta = By.xpath("//a[@rel='abrir-nova-conta_desktop'][normalize-space()='Abrir nova conta']"); 
private By btnParaVoce = By.id("bt1");
private By nomeCompleto = By.id("nome");
private By telefone = By.id("telefone");
private By email = By.id("email");
private By cpf = By.id("cpf");
private By btnEnviar = By.id("btnEnviar");
private By faltaPouco = By.cssSelector("#pu-modalSucesso > div > div:nth-child(2) > p > span:nth-child(1)");
public By getBtnAbrirConta() {
	return btnAbrirConta;
}
public By getBtnParaVoce() {
	return btnParaVoce;
}
public By getNomeCompleto() {
	return nomeCompleto;
}
public By getTelefone() {
	return telefone;
}
public By getEmail() {
	return email;
}
public By getCpf() {
	return cpf;
}
public By getBtnEnviar() {
	return btnEnviar;
}
public By getFaltaPouco() {
	return faltaPouco;
}

}


