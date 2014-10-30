package pl.java.scalatech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(basePackages="pl.java.scalatech.repository",useDefaultFilters=false,includeFilters={@Filter(Repository.class)})
public class RepositoryConfig {

}
