package com.satsure.memcache;

import com.satsure.memcache.service.MemCacheImpl;
import com.satsure.memcache.service.Memcache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemcacheApplication.class, args);

//		Memcache memcache = new MemCacheImpl();
	}

}
