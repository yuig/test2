package com.appsflyer.internal;

/* loaded from: classes3.dex */
public final class AFk1rSDK {
    private static void AFAdRevenueData(int[] iArr) {
        for (int i13 = 0; i13 < iArr.length / 2; i13++) {
            int i14 = iArr[i13];
            iArr[i13] = iArr[(iArr.length - i13) - 1];
            iArr[(iArr.length - i13) - 1] = i14;
        }
    }

    public static void getMediationNetwork(int i13, int i14, boolean z13, int i15, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z13) {
            AFAdRevenueData(iArr);
        }
        int i16 = 0;
        while (i16 < i15) {
            int i17 = i13 ^ iArr[i16];
            int monetizationNetwork = i14 ^ getMonetizationNetwork(i17, iArr2);
            i16++;
            i14 = i17;
            i13 = monetizationNetwork;
        }
        int i18 = i13 ^ iArr[iArr.length - 2];
        int i19 = i14 ^ iArr[iArr.length - 1];
        if (!z13) {
            AFAdRevenueData(iArr);
        }
        iArr3[0] = i19;
        iArr3[1] = i18;
    }

    private static int getMonetizationNetwork(int i13, int[][] iArr) {
        return ((iArr[0][i13 >>> 24] + iArr[1][(i13 >>> 16) & 255]) ^ iArr[2][(i13 >>> 8) & 255]) + iArr[3][i13 & 255];
    }
}
