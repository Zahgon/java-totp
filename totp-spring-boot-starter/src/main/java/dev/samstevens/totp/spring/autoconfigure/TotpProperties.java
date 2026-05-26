package dev.samstevens.totp.spring.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "totp")
public class TotpProperties {

    private static final int DEFAULT_SECRET_LENGTH = 32;

    private static final int DEFAULT_CODE_LENGTH = 6;

    private static final int DEFAULT_TIME_PERIOD = 30;

    private static final int DEFAULT_TIME_DISCREPANCY = 1;

    private final Secret secret = new Secret();

    private final Code code = new Code();

    private final Time time = new Time();

    public Secret getSecret() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Code getCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Time getTime() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Secret {

        private int length = DEFAULT_SECRET_LENGTH;

        public int getLength() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void setLength(int length) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static class Code {

        private int length = DEFAULT_CODE_LENGTH;

        public int getLength() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void setLength(int length) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static class Time {

        private int period = DEFAULT_TIME_PERIOD;

        private int discrepancy = DEFAULT_TIME_DISCREPANCY;

        public int getPeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void setPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getDiscrepancy() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void setDiscrepancy(int discrepancy) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
