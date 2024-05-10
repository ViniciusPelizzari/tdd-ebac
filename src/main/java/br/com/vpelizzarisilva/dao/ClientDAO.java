package br.com.vpelizzarisilva.dao;

import br.com.vpelizzarisilva.domain.Client;

public class ClientDAO implements IClientDAO {
    @Override
    public boolean create(Client client) {
        return true;
    }

    @Override
    public void delete(Long cpf) {

    }

    @Override
    public void alter(Long cpf) {

    }

    @Override
    public void findAll(Client client) {

    }

    @Override
    public Client findByCpf(Long cpf) {
        Client client = new Client();
        client.setCpf(cpf);
        return client;
    }
}
