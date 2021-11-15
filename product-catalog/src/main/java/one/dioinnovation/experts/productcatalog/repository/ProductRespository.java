package one.dioinnovation.experts.productcatalog.repository;

import one.dioinnovation.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRespository extends CrudRepository<Product, Integer> {
}
