package br.com.vpelizzarisilva;

import br.com.vpelizzarisilva.dao.ClientDAOMock;
import br.com.vpelizzarisilva.dao.IClientDAO;
import br.com.vpelizzarisilva.domain.Client;
import br.com.vpelizzarisilva.service.ClientService;
import br.com.vpelizzarisilva.service.IClientService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientServiceTest {

    private IClientService clientService;

    private Client client;

    public ClientServiceTest(){
        IClientDAO clienteDAO = new ClientDAOMock();
        clientService = new ClientService(clienteDAO);
    }

    @Before //antes de qualquer teste, será inicializado este
    public void init(){
        client = new Client();
        client.setName("Vinícius Pelizzari");
        client.setCpf(11122233344L);
        client.setProfission("Developer");
        client.setYearsOld(20);

        create();
    }

    @Test
    public void create(){
        clientService.create(client);
    }

    @Test
    public void delete(){
        clientService.delete(client.getCpf());
    }

    @Test
    public void alter(){
        System.out.println("before alter: " + client.getName());
        client.setName("Vinícius");
        clientService.alter(client.getCpf());

        Assert.assertEquals("Vinícius", client.getName());

        System.out.println("after alter: " + client.getName());
    }

    @Test
    public void findAll(){
        clientService.findAll(client);
    }

    @Test
    public void findClients(){
        Client registredClient = clientService.findByCpf(client.getCpf());

        Assert.assertNotNull(registredClient);
        System.out.println("findClients: " + registredClient.getCpf());
    }

}