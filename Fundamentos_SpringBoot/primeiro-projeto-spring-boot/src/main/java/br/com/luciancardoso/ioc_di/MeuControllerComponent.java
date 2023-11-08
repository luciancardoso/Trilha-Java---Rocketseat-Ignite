package br.com.luciancardoso.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class MeuControllerComponent {

    @Autowired // que eu tiver abaixo do autowired significa que tudo sera gerenciando pelo spring boot
    MeuComponent meuComponent;
    
    @GetMapping("/")
    public String chamandoComponent(){

        var resultado = meuComponent.chamarMeuComponent();
        return resultado;
    }
}
