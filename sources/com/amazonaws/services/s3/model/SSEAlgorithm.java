package com.amazonaws.services.s3.model;

/* loaded from: classes3.dex */
public enum SSEAlgorithm {
    AES256("AES256"),
    KMS("aws:kms");

    private final String algorithm;

    SSEAlgorithm(String str) {
        this.algorithm = str;
    }

    public static SSEAlgorithm fromString(String str) {
        if (str == null) {
            return null;
        }
        for (SSEAlgorithm sSEAlgorithm : values()) {
            if (sSEAlgorithm.getAlgorithm().equals(str)) {
                return sSEAlgorithm;
            }
        }
        throw new IllegalArgumentException("Unsupported algorithm ".concat(str));
    }

    public static SSEAlgorithm getDefault() {
        return AES256;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.algorithm;
    }
}
