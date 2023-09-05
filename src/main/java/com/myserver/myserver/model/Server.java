package com.myserver.myserver.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serverId;
    @Column(unique = true)
    @NotEmpty(message = "Please provide an IP address.")
    private String ip;
    private String serverName;
    private String storage;
    private String status;
    private String image;

    public Server() {

    }

    public Server(Long serverId, String ip, String serverName, String storage, String status, String image) {
        this.serverId = serverId;
        this.ip = ip;
        this.serverName = serverName;
        this.storage = storage;
        this.status = status;
        this.image = image;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
