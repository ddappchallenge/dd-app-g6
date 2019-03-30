package com.logistic.shtp.controller;

import com.logistic.shtp.service.ShtpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShtpController {

    @Autowired
    private ShtpService shtpService;

    @PostMapping("/graph")
    public ResponseEntity initGraph() {
        return null;
    }

    @GetMapping("/graph/shortestPath")
    public ResponseEntity getOneShortestPath(@RequestParam String src, @RequestParam String dest) {
        shtpService.findFirstShortestPath(src, dest);

        return null;
    }

    @GetMapping("/graph/allShortestPath")
    public ResponseEntity getAllShortestPath(@RequestParam String src, @RequestParam String dest) {
        return null;
    }
}