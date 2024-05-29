package br.com.cursoudemy.productapi.modules.product.repository;

import br.com.cursoudemy.productapi.modules.product.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}


