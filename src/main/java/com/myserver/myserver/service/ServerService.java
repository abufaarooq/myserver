package com.myserver.myserver.service;

import com.myserver.myserver.model.Server;

import java.util.Collection;

public interface ServerService {
    Server createServer(Server server);
    Collection <Server> getAllServers();
    Server getServer(Long id);
    Server updateServer(Server server);
    String deleteServer(Long id); // We want this to return a message that the server has been deleted.
    Server pingServer (String ip);
}
