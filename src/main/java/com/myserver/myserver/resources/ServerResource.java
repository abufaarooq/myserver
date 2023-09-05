package com.myserver.myserver.resources;

import com.myserver.myserver.model.Server;
import com.myserver.myserver.repository.ServerRepository;
import com.myserver.myserver.service.ServerServiceImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ServerResource {
    private final ServerRepository serverRepository;

    public ServerResource(ServerRepository serverRepository) {
        this.serverRepository = serverRepository;
    }

    @GetMapping("/")
    public ResponseEntity <Server> getAllServers()
    {
        List<Server> allServers = serverRepository.findAll();
        return new ResponseEntity(allServers, HttpStatus.OK);
    }

}
