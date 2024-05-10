package br.com.vpelizzarisilva.service;

import br.com.vpelizzarisilva.dao.ClientDAO;
import br.com.vpelizzarisilva.dao.IClientDAO;
import br.com.vpelizzarisilva.domain.Client;

public class ClientServiceMock implements IClientService {
    private IClientDAO clienteDAO;

    public ClientServiceMock(IClientDAO clienteDAO){
        this.clienteDAO = new ClientDAO();
    }

    @Override
    public void create(Client client) {
        this.clienteDAO.create(client);
    }

    @Override
    public void delete(Long cpf) {

    }

    @Override
    public void alter(Long cpf) {
    }

    @Override
    public void findAll(Client client) {
        this.clienteDAO.findAll(client);
    }

    @Override
    public Client findByCpf(Long cpf) {
        return this.clienteDAO.findByCpf(cpf);
    }
}
