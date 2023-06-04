package com.RecetasFinal.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RecetasFinal.Repositories.MultimediaRepository;

@Service
public class MultimediaService {

    @Autowired
    private MultimediaRepository multimediaRepository;
}
