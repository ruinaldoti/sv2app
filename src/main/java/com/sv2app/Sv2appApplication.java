package com.sv2app;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sv2app.domain.Categoria;
import com.sv2app.domain.Cidade;
import com.sv2app.domain.Estado;
import com.sv2app.domain.Produto;
import com.sv2app.repositories.CategoriaRepository;
import com.sv2app.repositories.CidadeRepository;
import com.sv2app.repositories.EstadoRepository;
import com.sv2app.repositories.ProdutoRepository;

@SpringBootApplication
public class Sv2appApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Sv2appApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Categoria cat1 = new Categoria(null, "Janela2");
		Categoria cat2 = new Categoria(null, "Porta3");
		
		Produto p1 = new Produto(null, "JanelaTabicao", 450.00);
		Produto p2 = new Produto(null, "PortaTabicao", 895.00);
		Produto p3 = new Produto(null, "JanelaVidro", 300.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p1));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		*/
		
		Estado est1 = new Estado(null, "Mina Gerais");
		Estado est2 = new Estado(null, "Ceara");
		
		Cidade cida1 = new Cidade(null, "Fortaleza", est2);
		Cidade cida2 = new Cidade(null, "Sobral", est2);
		Cidade cida3 = new Cidade(null, "Ocara", est2);
		Cidade cida4 = new Cidade(null, "Uberlandia", est1);
		
		est1.getCidades().addAll(Arrays.asList(cida4));	
		est2.getCidades().addAll(Arrays.asList(cida1, cida2, cida3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(cida1, cida2, cida3, cida4));
		
		
	}

}
