package br.com.vpelizzarisilva.dao;

import br.com.vpelizzarisilva.domain.Client;

public interface IClientDAO {
    boolean create(Client client);

    void delete(Long cpf);

    void alter(Long cpf);

    void findAll(Client client);

    Client findByCpf(Long cpf);
}
