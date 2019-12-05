package com.prolimp.ws;


import com.prolimp.model.Produto;
import com.prolimp.repository.ProdutoRepository;
import com.prolimp.statics.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/produto", produces  = {MediaType.APPLICATION_JSON_VALUE})
public class ProdutoWS {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public ResponseEntity<Iterable<Produto>> listaProdutos(){
        return ResponseEntity.ok(produtoRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
        if(produto.getCodigoBarra() != null) {
            return ResponseEntity.ok(produtoRepository.save(produto));
        }
        return new ResponseEntity(Message.IS_VAZIO, HttpStatus.BAD_REQUEST);
    }



}
