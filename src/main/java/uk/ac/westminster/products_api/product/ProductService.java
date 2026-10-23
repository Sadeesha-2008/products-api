package uk.ac.westminster.products_api.product;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService(){
        products.add(new DigitalProduct(nextId++ , "Clean code(E-book)",99.00,"/download/clean-code.pdf", 4.2));

        products.add(new PhysicalProducts(nextId++, "27-inch Monitor", 249.99 , 5.2, "61cm * 41cm* 18cm"));
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id){
        return products.stream().
                filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void deleteProducts(Long id){
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName(String name){
        return products.stream()
                .filter(p -> p.getName().equals((name)))
                .toList();
    }






}
