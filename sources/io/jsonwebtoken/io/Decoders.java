package io.jsonwebtoken.io;

/* loaded from: classes4.dex */
public final class Decoders {
    public static final Decoder<String, byte[]> BASE64 = new ExceptionPropagatingDecoder(new Base64Decoder());
    public static final Decoder<String, byte[]> BASE64URL = new ExceptionPropagatingDecoder(new Base64UrlDecoder());

    private Decoders() {
    }
}
