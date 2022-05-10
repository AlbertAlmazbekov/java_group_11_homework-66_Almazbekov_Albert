package com.example.homework66.contoller;

import com.example.homework66.service.GadgetService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@RequestMapping("/api/gadgets")
public class GadgetController {
    private final GadgetService gadgetService;
}
