package com.soaint.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.soaint.domain.Auth;
import com.soaint.service.ChatBotService;
import com.soaint.service.AuthService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/v1/bot")
@Api(tags = "CHATBOT")

public class ChatBotController {

    private static final Logger logger = LoggerFactory.getLogger(ChatBotController.class);

    @Autowired
    private ChatBotService chatBotService;

    @Autowired
    private AuthService authService;

    @PostMapping(value = "/login", produces = { MediaType.TEXT_PLAIN_VALUE, MediaType.ALL_VALUE }, consumes= MediaType.ALL_VALUE)
    @ApiOperation(value = "TOKEN", notes = "Peticion del Token")
    public String login() {
        String token = authService.login();
        return token;
    }

    @GetMapping(value = "/botQuestion")
    @ApiOperation(value = "Conversacion con el Chat", notes = "Aqui se recibe el mensaje por el usuario obteniendo su respuesta a traves de los AIML")
    public String bot(
            @ApiParam(value = "Escribe el mensaje que se le enviara al Chat" , required = true)@RequestParam String question){
        String x = chatBotService.chatbotService(question);
        return x;
    }

}
