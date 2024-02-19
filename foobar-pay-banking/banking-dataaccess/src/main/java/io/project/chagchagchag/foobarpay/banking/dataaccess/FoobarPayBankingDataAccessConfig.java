package io.project.chagchagchag.foobarpay.banking.dataaccess;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(
    basePackages = {
        "io.project.chagchagchag.foobarpay.core",
        "io.project.chagchagchag.foobarpay.banking.dataaccess"
    }
)
@EntityScan(
    basePackages = {
        "io.project.chagchagchag.foobarpay.core",
        "io.project.chagchagchag.foobarpay.banking.dataaccess"
    }
)
@EnableJpaAuditing
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableCaching
@ComponentScan(basePackages = {
    "io.project.chagchagchag.foobarpay.banking.dataaccess"
})
@EnableAutoConfiguration
public class FoobarPayBankingDataAccessConfig {

}
