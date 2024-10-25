package in.co.rshop.gql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.rshop.gql.entity.Offers;

public interface OffersRepository extends JpaRepository<Offers, Long> {
}
