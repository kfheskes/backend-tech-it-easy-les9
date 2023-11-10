package nl.novi.techiteasy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TelevisionsController {

    private ArrayList<String> tvList= new ArrayList<>();


    @GetMapping("/televisionList")
    public String sayHello(@RequestParam(required = false) String name){
        if (name == null || name.isEmpty()){
            return "Hello stranger. Available TVs: " + tvList;
        }
        else {
            return "Hello " + name + ". Available TVs: " + tvList;
        }
    }

    @PostMapping("/saveTvList")
    public void saveTvList(@RequestParam String tvs){
        this.tvList.add(tvs);
    }

}
