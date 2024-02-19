package io.project.chagchagchag.foobarpay.banking.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties
@EnableConfigurationProperties(BankingConfig.class)
public class BankingConfig {
}
