package com.example.cache.demo;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames={"test_cache"})
public class TestDataServiceImpl implements TestDataService {
    
    @Cacheable
    public String getEmail(String email) {
        return email;
    }
}
