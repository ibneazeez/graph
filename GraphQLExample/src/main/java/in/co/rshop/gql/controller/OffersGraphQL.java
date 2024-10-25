package in.co.rshop.gql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import in.co.rshop.gql.entity.Offers;
import in.co.rshop.gql.service.OffersService;

@Controller
public class OffersGraphQL {

    @Autowired
    private OffersService offersService;

    @QueryMapping
    public List<Offers> getAllOffers() {
        return offersService.getAllOffers();
    }

    @QueryMapping
    public Offers getOfferById(@Argument Long id) {
        return offersService.getOfferById(id);
    }

    @MutationMapping
    public Offers createOffer(@Argument Offers offer) {
        return offersService.createOffer(offer);
    }

    @MutationMapping
    public Offers updateOffer(@Argument Long id, @Argument Offers offer) {
        return offersService.updateOffer(id, offer);
    }

    @MutationMapping
    public Boolean deleteOffer(@Argument Long id) {
        offersService.deleteOffer(id);
        return true;
    }
}
