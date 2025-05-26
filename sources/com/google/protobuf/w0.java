package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f34008a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f34009b;

    static {
        Charset.forName("US-ASCII");
        f34008a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f34009b = bArr;
        ByteBuffer.wrap(bArr);
        p.f(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j13) {
        return (int) (j13 ^ (j13 >>> 32));
    }
}
