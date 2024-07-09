package one.digitalinnovation.cadastroClienteFarmacia.repository;

import one.digitalinnovation.cadastroClienteFarmacia.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
