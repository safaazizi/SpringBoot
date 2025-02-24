package com.example.demo.Services;

import com.example.demo.Repositories.DetailComposantRepository;
import com.example.demo.entity.DetailComposant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DetailComposantService implements IDetailComposantService {
    DetailComposantRepository detailComposant;
}
