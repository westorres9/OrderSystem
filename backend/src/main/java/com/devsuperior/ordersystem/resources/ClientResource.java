package com.devsuperior.ordersystem.resources;

import com.devsuperior.ordersystem.dto.ClientDTO;
import com.devsuperior.ordersystem.dto.ProductDTO;
import com.devsuperior.ordersystem.services.ClientService;
import com.devsuperior.ordersystem.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
@RestController
@RequestMapping("/clients")
public class ClientResource {

        @Autowired
        private ClientService service;

        @GetMapping
        public ResponseEntity<Page<ClientDTO>> findAll(Pageable pageable) {
            Page<ClientDTO> page = service.findAll(pageable);
            return ResponseEntity.ok().body(page);
        }

        @GetMapping(value = "/{id}")
        public ResponseEntity<ClientDTO> findById(@PathVariable Long id){
            ClientDTO dto = service.findById(id);
            return ResponseEntity.ok().body(dto);
        }

        @PostMapping
        public ResponseEntity<ClientDTO> insert(@RequestBody ClientDTO dto){
            dto = service.insert(dto);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
            return ResponseEntity.created(uri).body(dto);
        }

        @PutMapping(value = "/{id}")
        public ResponseEntity<ClientDTO> update(@PathVariable Long id, @RequestBody ClientDTO dto){
            dto = service.update(id, dto);
            return ResponseEntity.ok().body(dto);
        }

        @DeleteMapping(value = "/{id}")
        public ResponseEntity<Void> delete(@PathVariable Long id) {
            service.delete(id);
            return ResponseEntity.noContent().build();
        }

}
