package ru.makovets.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.makovets.model.ResponseStatus;
import ru.makovets.service.ResponseHelper;

@RestController
@RequestMapping("/probe")
public class ProbeController {

    private final ResponseHelper helper;

    public ProbeController(ResponseHelper helper) {
        this.helper = helper;
    }

    @GetMapping(value = "/live", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseStatus> probeLive() {
        return helper.responseStatusOk();
    }

    @GetMapping(value = "/ready", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseStatus> probeReady() {
        return helper.responseStatusOk();
    }
}
