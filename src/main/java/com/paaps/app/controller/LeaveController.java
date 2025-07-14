package com.paaps.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secured/leave")
public class LeaveController {

    @GetMapping
    public ResponseEntity<?> getLeaves() {
        return ResponseEntity.ok("All leaves");
    }

}
