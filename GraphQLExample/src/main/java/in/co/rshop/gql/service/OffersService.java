package in.co.rshop.gql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.rshop.gql.entity.Offers;
import in.co.rshop.gql.repository.OffersRepository;

@Service
public class OffersService {
    @Autowired
    private OffersRepository offersRepository;

    public List<Offers> getAllOffers() {
        return offersRepository.findAll();
    }

    public Offers getOfferById(Long id) {
        return offersRepository.findById(id).orElse(null);
    }

    public Offers createOffer(Offers offer) {
        return offersRepository.save(offer);
    }

    public Offers updateOffer(Long id, Offers offer) {
        offer.setId(id);
        return offersRepository.save(offer);
    }

    public void deleteOffer(Long id) {
        offersRepository.deleteById(id);
    }
}
