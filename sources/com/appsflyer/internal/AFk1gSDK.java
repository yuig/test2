package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFk1gSDK {
    public int AFAdRevenueData;
    public int getCurrencyIso4217Code;

    public static char[] getMediationNetwork(long j13, char[] cArr, int i13) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i14 = 0;
        int i15 = 4;
        for (int i16 = 0; i16 < cArr.length; i16++) {
            if (((j13 >>> i16) & 1) == i13 && i14 < 4) {
                cArr2[i14] = cArr[i16];
            } else if (i15 < length) {
                cArr2[i15] = cArr[i16];
                i15++;
            } else {
                cArr2[i14] = cArr[i16];
            }
            i14++;
        }
        return cArr2;
    }
}
