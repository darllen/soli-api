package com.soli.soliapi.api;


import com.soli.soliapi.facade.ProductFacade;
import com.soli.soliapi.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/home", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductAPI {
    @Autowired
    private ProductFacade productFacade;

    @PostMapping
    @ResponseBody
    private ProductDTO create(@RequestBody ProductDTO produto){
        return productFacade.create(produto);
    }

    @PutMapping("/{id}")
    @ResponseBody
    private ProductDTO update(@PathVariable("id") Long id, @RequestBody ProductDTO produto){
        return productFacade.update(produto, id);
    }

    // ===============================================================
    @GetMapping
    @ResponseBody
    public List<ProductDTO> getAll(){
        return productFacade.getAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ProductDTO getById(@PathVariable("id") Long id){
        return productFacade.getById(id);
    }
// ===============================================================
    @DeleteMapping("/{id}")
    @ResponseBody
    public String delete(@PathVariable("id") Long id){
        return productFacade.delete(id);
    }



}
