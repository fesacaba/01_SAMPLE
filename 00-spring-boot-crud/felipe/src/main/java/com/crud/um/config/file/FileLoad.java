package com.crud.um.config.file;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FileLoad {

	public final ApplicationContext ctx;
	
	public FileLoad(ApplicationContext ctx){
		this.ctx = ctx;
	}

    public Optional<String> getFileContent(final String filePath) {
        try {
            Resource resource = ctx.getResource("classpath:" + filePath);
            try (InputStream is = resource.getInputStream()) {
                return Optional.ofNullable(IOUtils.toString(is));
            }
        } catch (IOException ex) {
            log.error("Falha ao tentar abrir arquivo", ex);
            return Optional.empty();
        }
    }

    public Optional<Properties> getPropertiesFile(final String filePath) {
        Properties prop = new Properties();
        try {
            Resource resource = ctx.getResource("classpath:" + filePath);
            try (InputStream is = resource.getInputStream()) {
                prop.load(is);
                return Optional.ofNullable(prop);
            }
        } catch (IOException ex) {
            log.error("Falha ao tentar abrir arquivo", ex);
            return Optional.empty();
        }
    }
}
