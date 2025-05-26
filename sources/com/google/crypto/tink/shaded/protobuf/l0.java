package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f33646a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f33647b;

    static {
        Charset.forName("US-ASCII");
        f33646a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f33647b = bArr;
        ByteBuffer.wrap(bArr);
        n.f(bArr, 0, 0, false);
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
