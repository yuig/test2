package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFk1eSDK {
    public int AFAdRevenueData;
    public int getMediationNetwork;
    public int getRevenue;

    public static int getCurrencyIso4217Code(int i13) {
        int[][] iArr = AFk1tSDK.getMonetizationNetwork.getCurrencyIso4217Code;
        return ((iArr[0][(i13 >>> 24) & 255] + iArr[1][(i13 >>> 16) & 255]) ^ iArr[2][(i13 >>> 8) & 255]) + iArr[3][i13 & 255];
    }

    public static void getMonetizationNetwork(int[] iArr) {
        for (int i13 = 0; i13 < iArr.length / 2; i13++) {
            int i14 = iArr[i13];
            iArr[i13] = iArr[(iArr.length - i13) - 1];
            iArr[(iArr.length - i13) - 1] = i14;
        }
    }
}
