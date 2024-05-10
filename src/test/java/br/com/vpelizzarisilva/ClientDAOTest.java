package br.com.vpelizzarisilva;

import br.com.vpelizzarisilva.dao.ClientDAOMock;
import br.com.vpelizzarisilva.dao.IClientDAO;
import br.com.vpelizzarisilva.domain.Client;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientDAOTest {

    private IClientDAO clienteDAO;

    private Client client;

    public ClientDAOTest(){
        clienteDAO = new ClientDAOMock();
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
        boolean response = clienteDAO.create(client);
        Assert.assertTrue(response);
    }

    @Test
    public void delete(){
        clienteDAO.delete(client.getCpf());
    }

    @Test
    public void alter(){
        System.out.println("before alter: " + client.getName());
        client.setName("Vinícius");
        clienteDAO.alter(client.getCpf());

        Assert.assertEquals("Vinícius", client.getName());

        System.out.println("after alter: " + client.getName());
    }

    @Test
    public void findAll(){
        clienteDAO.findAll(client);
    }

    @Test
    public void findClients(){
        Client registredClient = clienteDAO.findByCpf(client.getCpf());

        Assert.assertNotNull(registredClient);
        System.out.println("findClients: " + registredClient.getCpf());
    }
}
