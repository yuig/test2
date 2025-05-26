package io.jsonwebtoken;

/* loaded from: classes4.dex */
public interface CompressionCodec {
    byte[] compress(byte[] bArr);

    byte[] decompress(byte[] bArr);

    String getAlgorithmName();
}
