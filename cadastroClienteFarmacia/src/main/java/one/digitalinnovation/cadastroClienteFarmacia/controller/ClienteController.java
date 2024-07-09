package one.digitalinnovation.cadastroClienteFarmacia.controller;

import one.digitalinnovation.cadastroClienteFarmacia.model.Cliente;
import one.digitalinnovation.cadastroClienteFarmacia.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public Iterable<Cliente> buscarTodos() {
        return clienteService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return clienteService.buscarPorId(id);
    }

    @PostMapping
    public void inserir(@RequestBody Cliente cliente) {
        clienteService.inserir(cliente);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        clienteService.atualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        clienteService.deletar(id);
    }
}

