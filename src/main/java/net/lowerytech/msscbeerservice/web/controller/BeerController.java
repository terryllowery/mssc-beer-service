package net.lowerytech.msscbeerservice.web.controller;

import net.lowerytech.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID id ){
        // TODO: implement real logic
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {
        // TODO: implement real logic
        return new ResponseEntity(HttpStatus. CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable UUID id, @RequestBody BeerDto beerDto) {
        // TODO: implement real logic
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

}
