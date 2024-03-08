package com.kz.mapmanager;

import com.kz.mapmanager.bsp.parser.BSPParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class MapManagerApplication {
        private static final Logger LOG = LoggerFactory.getLogger(MapManagerApplication.class);

        public static void main(String[] args) {
            try {
                SpringApplication.run(MapManagerApplication.class, args);

                BSPParser.parseBSP(new File("test"));
            } catch (Exception e) {
                LOG.error(e.getMessage());
            }
        }
}
