package com.github.aelmod.athena;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {
    @GetMapping()
    public String index(@RequestParam Map<String, String> params) {
        return params.entrySet().stream()
                .map(entry-> entry.getKey() + ": " + entry.getValue())
                .reduce("", (oldValue, entry) ->  oldValue + "<br>" + entry + "");
    }
}
