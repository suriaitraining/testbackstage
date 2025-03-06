package com.example.workflow;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class FileController {

    @GetMapping("/catalog-info")
    public String getFile() throws IOException {
        Resource file = new ClassPathResource("static/catalog-info.yaml");

        return new String(Files.readAllBytes(Paths.get(file.getURI())));

    }
}