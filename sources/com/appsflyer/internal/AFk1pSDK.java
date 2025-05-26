package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFk1pSDK {
    public static void getMediationNetwork(byte[] bArr, byte b13, long j13) {
        for (int i13 = 0; i13 < bArr.length; i13++) {
            if (((1 << i13) & j13) != 0) {
                bArr[i13] = (byte) (bArr[i13] ^ b13);
            }
        }
    }
}
