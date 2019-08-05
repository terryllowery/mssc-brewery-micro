package net.lowerytech.msscbrewmicro.web.service;

import net.lowerytech.msscbrewmicro.web.model.BeerDTO;

import java.util.UUID;

@Deprecated
public interface BeerService {


    BeerDTO getBeerById(UUID beerId);

    BeerDTO saveNewBeer(BeerDTO beerDTO);

    void updateBeer(UUID beerId, BeerDTO beerDTO);

    void deleteById(UUID beerId);
}
