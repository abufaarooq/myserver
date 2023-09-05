package com.myserver.myserver.service;

import com.myserver.myserver.model.Server;
import com.myserver.myserver.repository.ServerRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ServerServiceImplementation implements ServerService {
    private static ServerRepository serverRepository;

    @Override
    public Server createServer(Server server) {
        Server newServer = new Server();
        System.out.println("Server number, " + newServer.getServerId() + " has been created!");
        return serverRepository.save(newServer);
    }

    @Override
    public Collection<Server> getAllServers() {
        System.out.println("Searching...");
        return serverRepository.findAll();
    }

    @Override
    public Server getServer(Long id) {
        System.out.println("Searching...");
        return serverRepository.findById(id).get();
    }

    @Override
    public Server updateServer(Server server) {
        System.out.println("Updating server...");
        return serverRepository.save(server);
    }

    @Override
    public String deleteServer(Long id) {
        serverRepository.deleteById(id);
        return "Deleted server number, " + id;
    }

    @Override
    public Server pingServer(String ip) {
        return null;
    }
}
