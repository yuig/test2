package com.google.android.recaptcha.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zznl {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        zzli.zzH(bArr, 0, 0, false);
    }

    public static int zza(boolean z13) {
        return z13 ? 1231 : 1237;
    }

    public static int zzb(int i13, byte[] bArr, int i14, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            i13 = (i13 * 31) + bArr[i16];
        }
        return i13;
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
