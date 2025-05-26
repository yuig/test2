package io.jsonwebtoken;

import io.jsonwebtoken.lang.Classes;

/* loaded from: classes4.dex */
public final class CompressionCodecs {
    public static final CompressionCodec DEFLATE = (CompressionCodec) Classes.newInstance("io.jsonwebtoken.impl.compression.DeflateCompressionCodec");
    public static final CompressionCodec GZIP = (CompressionCodec) Classes.newInstance("io.jsonwebtoken.impl.compression.GzipCompressionCodec");

    private CompressionCodecs() {
    }
}
