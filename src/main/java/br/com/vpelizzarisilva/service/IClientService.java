package br.com.vpelizzarisilva.service;

import br.com.vpelizzarisilva.domain.Client;

public interface IClientService {

    void create(Client client);
    void delete(Long cpf);
    void alter(Long cpf);
    void findAll(Client client);
    Client findByCpf(Long cpf);
}
