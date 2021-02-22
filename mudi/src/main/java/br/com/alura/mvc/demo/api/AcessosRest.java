package br.com.alura.mvc.demo.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.mvc.demo.interceptor.InterceptadorAcessos;
import br.com.alura.mvc.demo.interceptor.InterceptadorAcessos.Acesso;

@RequestMapping("acessos")
@RestController
public class AcessosRest {

	@GetMapping
	public List<Acesso> getAcessos(){
		return InterceptadorAcessos.acessos;
	}
}
