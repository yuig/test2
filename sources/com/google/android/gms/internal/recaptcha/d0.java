package com.google.android.gms.internal.recaptcha;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f31745a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f31746b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f31746b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw new zzeo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if ((0 - 0) + length > Integer.MAX_VALUE) {
                throw new zzeo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } catch (zzeo e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public static int a(long j13) {
        return (int) (j13 ^ (j13 >>> 32));
    }
}
