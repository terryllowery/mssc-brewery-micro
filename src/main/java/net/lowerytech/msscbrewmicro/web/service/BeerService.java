package net.lowerytech.msscbrewmicro.web.service;

import net.lowerytech.msscbrewmicro.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {


    BeerDTO getBeerById(UUID beerId);
}
