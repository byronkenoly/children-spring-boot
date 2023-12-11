package com.practise.childregistration;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/children")
@AllArgsConstructor
public class MainController {

    private ChildService childService;

    //Build Add Child REST API
    @PostMapping
    public ResponseEntity<ChildDto> addChild(@RequestBody ChildDto childDto){

        ChildDto savedChild = childService.addChild(childDto);

        return new ResponseEntity<>(savedChild, HttpStatus.CREATED);
    }
}
