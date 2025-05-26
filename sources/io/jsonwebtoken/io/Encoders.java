package io.jsonwebtoken.io;

/* loaded from: classes4.dex */
public final class Encoders {
    public static final Encoder<byte[], String> BASE64 = new ExceptionPropagatingEncoder(new Base64Encoder());
    public static final Encoder<byte[], String> BASE64URL = new ExceptionPropagatingEncoder(new Base64UrlEncoder());

    private Encoders() {
    }
}
