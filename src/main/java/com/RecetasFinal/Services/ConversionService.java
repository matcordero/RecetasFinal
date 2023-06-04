package com.RecetasFinal.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RecetasFinal.Repositories.ConversionRepository;
import com.RecetasFinal.Repositories.FotoRepository;

@Service
public class ConversionService {
    @Autowired
    private ConversionRepository conversionRepository;
}
