package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.openapitools.client.api.DefaultApi;
import org.openapitools.client.model.GameDto;
import org.openapitools.client.model.GameInputDto;
import org.springframework.stereotype.Component;

@Component
public class StartupBean {
    @PostConstruct
    public void init() {
        DefaultApi defaultApi = new DefaultApi();
        //GameDto result = defaultApi.gamePost(...

        GameInputDto gameInput = new GameInputDto();
        gameInput.setGroupName("Minotaurus Senior");
    }
}