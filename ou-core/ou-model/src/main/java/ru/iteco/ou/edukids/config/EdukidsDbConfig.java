package ru.iteco.ou.edukids.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 23.10.20.
 */

@Configuration
@PropertySource(value = "classpath:micro.pg.local.yaml")
@ConfigurationProperties(prefix = "micro.datasource")
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"password"})
@Slf4j
public class EdukidsDbConfig {
}
