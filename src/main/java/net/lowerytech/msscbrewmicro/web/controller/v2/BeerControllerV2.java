package net.lowerytech.msscbrewmicro.web.controller.v2;

import net.lowerytech.msscbrewmicro.web.model.v2.BeerDtoV2;
import net.lowerytech.msscbrewmicro.web.service.v2.BeerServiceV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v2/beer")
public class BeerControllerV2 {

    private BeerServiceV2 beerService;

    public BeerControllerV2(BeerServiceV2 beerService){
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(BeerDtoV2 beerDTO){
        BeerDtoV2 savedDto = beerService.saveNewBeer(beerDTO);
        HttpHeaders headers = new HttpHeaders();
        // TODO: add hostname to url
        headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable UUID beerId, BeerDtoV2 beerDTO){
        beerService.updateBeer(beerId, beerDTO);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId){
        beerService.deleteById(beerId);

    }
}
