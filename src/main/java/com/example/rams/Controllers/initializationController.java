package com.example.rams.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

@Controller
public class initializationController {

    @GetMapping(value={"/", "/index"})
    public ModelAndView displayMainPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        String fileName = "classpath:static/json/wisconsin.geojson";
        File file = null;
        try {
            file = ResourceUtils.getFile(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //File is found
        System.out.println("File Found : " + file.exists());

        //Read File Content
        String content = null;
        try {
            content = new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        modelAndView.addObject("starterjson", content);

        return modelAndView;
    }
}


