package com.spot.spotapi.facade;

import com.spot.spotapi.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductFacade {
    private static final Map<Long, ProductDTO> products = new HashMap<>();

    public ProductDTO create(ProductDTO produto){
        Long id = products.keySet().size() + 1L;
        produto.setId(id);

        products.put(id, produto);
        return produto;
    }

    public ProductDTO update(ProductDTO produto, Long id){
        products.put(id, produto);
        return produto;
    }

    public ProductDTO getById(Long id){
        return products.get(id);
    }

    public List<ProductDTO> getAll(){
        return new ArrayList<>(products.values());
    }

    public String delete(Long id){
        products.remove(id);
        return "deleted!";
    }
}
