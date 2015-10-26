package br.com.unipe.cc.gui;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Manipulador1 {
	public static Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream("properties/dados.propeties");
		props.load(file);
		return props;
	}

	public static void main(String args[]) throws IOException {
		String login;
		System.out
				.println("************Teste de leitura do arquivo de propriedades************");
		Properties prop = getProp();
		Properties conexao = getProp();
		String url = conexao.getProperty("conexao.url");
		String database = conexao.getProperty("conexão.database");
		String usuario = conexao.getProperty("conexao.usuario");
		String senha = conexao.getProperty("conexao.senha");
		String porta = conexao.getProperty("conexão.porta");
		System.out.println("url = " + url);
		System.out.println("database = " + database);
		System.out.println("usuario = " + usuario);
		System.out.println("senha = " + senha);
		System.out.println("porta = " + porta);
	}
}
