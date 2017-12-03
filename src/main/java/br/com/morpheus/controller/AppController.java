package br.com.morpheus.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.morpheus.dao.UsuarioDao;
import br.com.morpheus.model.ResultadoModel;
import br.com.morpheus.model.UsuarioModel;

@Controller
public class AppController {

	@Autowired
	ResultadoModel resultadoModel;
	@Autowired
	UsuarioDao dao;

	@RequestMapping("/")
	public String inicio() {
		return "index";
	}

	@RequestMapping("/listar")
	public @ResponseBody ModelAndView listar() {
		return new ModelAndView("listar");
	}

	@RequestMapping("listaUsuarios")
	public @ResponseBody List<String> listarUsuarios() {
		return dao.ler();
	}

	@RequestMapping("/cadastrar")
	public ModelAndView cadastrar() {
		return new ModelAndView("cadastrar");
	}

	@RequestMapping("/salvaDados")
	public @ResponseBody ResultadoModel salvarDados(@RequestBody UsuarioModel usuarioModel) throws IOException {
		resultadoModel.setMensagem("Usuario Cadastrado com Sucesso");
		dao.escrever(usuarioModel);
		return resultadoModel;
	}
}
