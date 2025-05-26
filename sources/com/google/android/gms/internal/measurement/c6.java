package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class c6 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f31325a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f31326b;

    static {
        Charset.forName("US-ASCII");
        f31325a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f31326b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw zzji.b();
            }
            int i13 = (0 - 0) + length;
            if (i13 < 0) {
                throw zzji.c();
            }
            if (i13 > Integer.MAX_VALUE) {
                throw zzji.d();
            }
        } catch (zzji e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public static int a(long j13) {
        return (int) (j13 ^ (j13 >>> 32));
    }
}
