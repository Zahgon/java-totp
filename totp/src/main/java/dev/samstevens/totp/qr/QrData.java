package dev.samstevens.totp.qr;

import dev.samstevens.totp.code.HashingAlgorithm;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@SuppressWarnings("WeakerAccess")
public class QrData {

    private final String type;

    private final String label;

    private final String secret;

    private final String issuer;

    private final String algorithm;

    private final int digits;

    private final int period;

    /**
     * Force use of builder to create instances.
     */
    private QrData(String type, String label, String secret, String issuer, String algorithm, int digits, int period) {
        this.type = type;
        this.label = label;
        this.secret = secret;
        this.issuer = issuer;
        this.algorithm = algorithm;
        this.digits = digits;
        this.period = period;
    }

    public String getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLabel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSecret() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getIssuer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getAlgorithm() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getDigits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getPeriod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return The URI/message to encode into the QR image, in the format specified here:
     * https://github.com/google/google-authenticator/wiki/Key-Uri-Format
     */
    public String getUri() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String uriEncode(String text) {
        // Null check
        if (text == null) {
            return "";
        }
        try {
            return URLEncoder.encode(text, StandardCharsets.UTF_8.toString()).replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            // This should never throw, as we are certain the charset specified (UTF-8) is valid
            throw new RuntimeException("Could not URI encode QrData.");
        }
    }

    public static class Builder {

        private String label;

        private String secret;

        private String issuer;

        private HashingAlgorithm algorithm = HashingAlgorithm.SHA1;

        private int digits = 6;

        private int period = 30;

        public Builder label(String label) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder secret(String secret) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder issuer(String issuer) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder algorithm(HashingAlgorithm algorithm) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder digits(int digits) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder period(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public QrData build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
