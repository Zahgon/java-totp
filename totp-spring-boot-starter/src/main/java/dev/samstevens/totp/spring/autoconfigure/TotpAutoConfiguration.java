package dev.samstevens.totp.spring.autoconfigure;

import dev.samstevens.totp.TotpInfo;
import dev.samstevens.totp.code.*;
import dev.samstevens.totp.qr.QrDataFactory;
import dev.samstevens.totp.qr.QrGenerator;
import dev.samstevens.totp.qr.ZxingPngQrGenerator;
import dev.samstevens.totp.recovery.RecoveryCodeGenerator;
import dev.samstevens.totp.secret.DefaultSecretGenerator;
import dev.samstevens.totp.secret.SecretGenerator;
import dev.samstevens.totp.time.SystemTimeProvider;
import dev.samstevens.totp.time.TimeProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(TotpInfo.class)
@EnableConfigurationProperties(TotpProperties.class)
public class TotpAutoConfiguration {

    private TotpProperties props;

    @Autowired
    public TotpAutoConfiguration(TotpProperties props) {
        this.props = props;
    }

    @Bean
    @ConditionalOnMissingBean
    public SecretGenerator secretGenerator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    @ConditionalOnMissingBean
    public TimeProvider timeProvider() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    @ConditionalOnMissingBean
    public HashingAlgorithm hashingAlgorithm() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    @ConditionalOnMissingBean
    public QrDataFactory qrDataFactory(HashingAlgorithm hashingAlgorithm) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    @ConditionalOnMissingBean
    public QrGenerator qrGenerator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    @ConditionalOnMissingBean
    public CodeGenerator codeGenerator(HashingAlgorithm algorithm) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    @ConditionalOnMissingBean
    public CodeVerifier codeVerifier(CodeGenerator codeGenerator, TimeProvider timeProvider) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    @ConditionalOnMissingBean
    public RecoveryCodeGenerator recoveryCodeGenerator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private int getCodeLength() {
        return props.getCode().getLength();
    }

    private int getTimePeriod() {
        return props.getTime().getPeriod();
    }
}
