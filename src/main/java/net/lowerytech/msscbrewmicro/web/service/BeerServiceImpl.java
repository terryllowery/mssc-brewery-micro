package net.lowerytech.msscbrewmicro.web.service;

import net.lowerytech.msscbrewmicro.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder()
                .beerName("Galaxy Cat")
                .style("Pale Ale")
                .build();
    }
}
