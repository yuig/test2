package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFk1uSDK {
    public static long[] getCurrencyIso4217Code(int i13, int i14) {
        long[] jArr = new long[4];
        jArr[0] = (i14 & 4294967295L) | ((i13 & 4294967295L) << 32);
        for (int i15 = 1; i15 < 4; i15++) {
            long j13 = jArr[i15 - 1];
            jArr[i15] = ((j13 ^ (j13 >> 30)) * 1812433253) + i15;
        }
        return jArr;
    }
}
