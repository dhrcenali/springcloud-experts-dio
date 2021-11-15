package one.dioinnovation.experts.productcatalog.controller;

import one.dioinnovation.experts.productcatalog.model.Product;
import one.dioinnovation.experts.productcatalog.repository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRespository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product) {
        return productRepository.save(product);

    }

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id) {
        return productRepository.findById(id);

    }

}