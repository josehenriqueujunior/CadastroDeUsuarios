package br.com.morpheus.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.stereotype.Repository;

import br.com.morpheus.model.UsuarioModel;

@Repository
public class UsuarioDao {

	File arq = new File(getClass().getClassLoader().getResource("nomes.txt").getFile());

	public List<String> ler() {

		List<String> usuarios = new ArrayList();
		try {
			FileReader fileReader = new FileReader(arq);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String linha = "";

			while ((linha = bufferedReader.readLine()) != null) {
				usuarios.add(linha);
			}
			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return usuarios;

	}

	public void escrever(UsuarioModel usuario) throws IOException {
		FileWriter fileWriter = new FileWriter(arq, true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println(usuario.getNome());
		printWriter.flush();
		printWriter.close();
	}
}