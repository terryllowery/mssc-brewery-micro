package net.lowerytech.msscbrewmicro.web.service;

import lombok.extern.slf4j.Slf4j;
import net.lowerytech.msscbrewmicro.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@Deprecated
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .style("Pale Ale")
                .build();
    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beerDTO) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .style(beerDTO.getStyle())
                .beerName(beerDTO.getBeerName())
                .upc(beerDTO.getUpc())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting: " + beerId);
    }
}
