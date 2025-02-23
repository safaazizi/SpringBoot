package com.example.demo.Services;

import com.example.demo.entity.Client;
import com.example.demo.Repositories.ClientRepository;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ClientService implements IClientService{
    ClientRepository clientRepository;
    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

//    @Override
//    public Client addClient(Client client) {
//        // If you need to create a new client with specific fields, modify the parameter or build a new object
//        Client newClient = Client.builder()
//                .identifiant("2") // Directly use "2" instead of String.valueOf(2)
//                .build();
//
//        return clientRepository.save(newClient);
//    }

    @Override
    public Client updateClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client retrieveClient(Long idClient) {
        //find by id returns optional type
        return clientRepository.findById(idClient).get();
    }

    @Override
    public void removeClient(Long idClient) {
        clientRepository.deleteById(idClient);

    }


}
