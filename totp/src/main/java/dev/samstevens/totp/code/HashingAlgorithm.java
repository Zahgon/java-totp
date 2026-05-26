package dev.samstevens.totp.code;

public enum HashingAlgorithm {

    SHA1("HmacSHA1", "SHA1"), SHA256("HmacSHA256", "SHA256"), SHA512("HmacSHA512", "SHA512");

    private final String hmacAlgorithm;

    private final String friendlyName;

    HashingAlgorithm(String hmacAlgorithm, String friendlyName) {
        this.hmacAlgorithm = hmacAlgorithm;
        this.friendlyName = friendlyName;
    }

    public String getHmacAlgorithm() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFriendlyName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
