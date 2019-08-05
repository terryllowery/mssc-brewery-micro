package net.lowerytech.msscbrewmicro.web.service.v2;

import lombok.extern.slf4j.Slf4j;
import net.lowerytech.msscbrewmicro.web.model.v2.BeerDtoV2;
import net.lowerytech.msscbrewmicro.web.model.v2.BeerStyle;
import net.lowerytech.msscbrewmicro.web.service.BeerService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImplV2 implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .style(BeerStyle.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDTO) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .style(beerDTO.getStyle())
                .beerName(beerDTO.getBeerName())
                .upc(beerDTO.getUpc())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDTO) {

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting: " + beerId);
    }
}
