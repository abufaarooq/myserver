package com.myserver.myserver.repository;

import com.myserver.myserver.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository <Server, Long> {
    Server findByIp(String ip);
}
