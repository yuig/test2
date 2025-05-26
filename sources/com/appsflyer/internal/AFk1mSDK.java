package com.appsflyer.internal;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public final class AFk1mSDK {
    private static byte[] component3 = new byte[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
    static final byte[] getRevenue = new byte[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
    static final int[] getMediationNetwork = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
    static final int[] getMonetizationNetwork = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
    static final int[] getCurrencyIso4217Code = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
    static final int[] AFAdRevenueData = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
    private static int[] areAllFieldsValid = new int[10];

    static {
        byte[] bArr;
        int i13;
        byte b13 = 1;
        byte b14 = 1;
        do {
            b13 = (byte) (((b13 & 128) != 0 ? 27 : 0) ^ ((b13 << 1) ^ b13));
            byte b15 = (byte) (b14 ^ (b14 << 1));
            byte b16 = (byte) (b15 ^ (b15 << 2));
            byte b17 = (byte) (b16 ^ (b16 << 4));
            b14 = (byte) (b17 ^ ((b17 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = component3;
            i13 = b13 & 255;
            int i14 = b14 & 255;
            bArr[i13] = (byte) (((((b14 ^ 99) ^ ((i14 << 1) | (i14 >> 7))) ^ ((i14 << 2) | (i14 >> 6))) ^ ((i14 << 3) | (i14 >> 5))) ^ ((i14 >> 4) | (i14 << 4)));
        } while (i13 != 1);
        bArr[0] = 99;
        for (int i15 = 0; i15 < 256; i15++) {
            int i16 = component3[i15] & 255;
            getRevenue[i16] = (byte) i15;
            int i17 = i15 << 1;
            if (i17 >= 256) {
                i17 ^= 283;
            }
            int i18 = i17 << 1;
            if (i18 >= 256) {
                i18 ^= 283;
            }
            int i19 = i18 << 1;
            if (i19 >= 256) {
                i19 ^= 283;
            }
            int i23 = i19 ^ i15;
            int i24 = ((i17 ^ (i18 ^ i19)) << 24) | (i23 << 16) | ((i23 ^ i18) << 8) | (i23 ^ i17);
            getMediationNetwork[i16] = i24;
            getMonetizationNetwork[i16] = (i24 >>> 8) | (i24 << 24);
            getCurrencyIso4217Code[i16] = (i24 >>> 16) | (i24 << 16);
            AFAdRevenueData[i16] = (i24 << 8) | (i24 >>> 24);
        }
        areAllFieldsValid[0] = 16777216;
        int i25 = 1;
        for (int i26 = 1; i26 < 10; i26++) {
            i25 <<= 1;
            if (i25 >= 256) {
                i25 ^= 283;
            }
            areAllFieldsValid[i26] = i25 << 24;
        }
    }

    public static byte[][] getCurrencyIso4217Code(int i13) {
        byte[][] bArr = new byte[4][];
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = i13 >>> (i14 << 3);
            bArr[i14] = new byte[]{(byte) (i15 & 3), (byte) ((i15 >> 2) & 3), (byte) ((i15 >> 4) & 3), (byte) ((i15 >> 6) & 3)};
        }
        return bArr;
    }

    public static int[] getCurrencyIso4217Code(byte[] bArr, int i13) {
        int i14 = i13;
        if (bArr.length == 16) {
            int i15 = 4;
            int i16 = (i14 + 1) * 4;
            int[] iArr = new int[i16];
            int i17 = 0;
            for (int i18 = 0; i18 < 4; i18++) {
                int i19 = i17 + 3;
                int i23 = ((bArr[i17 + 1] & 255) << 16) | (bArr[i17] << 24) | ((bArr[i17 + 2] & 255) << 8);
                i17 += 4;
                iArr[i18] = i23 | (bArr[i19] & 255);
            }
            int i24 = 4;
            int i25 = 0;
            int i26 = 0;
            while (i24 < i16) {
                int i27 = iArr[i24 - 1];
                if (i25 == 0) {
                    byte[] bArr2 = component3;
                    i27 = ((bArr2[i27 >>> 24] & 255) | (((bArr2[(i27 >>> 16) & 255] << 24) | ((bArr2[(i27 >>> 8) & 255] & 255) << 16)) | ((bArr2[i27 & 255] & 255) << 8))) ^ areAllFieldsValid[i26];
                    i25 = 4;
                    i26++;
                }
                iArr[i24] = i27 ^ iArr[i24 - 4];
                i24++;
                i25--;
            }
            if (bArr.length == 16) {
                int[] iArr2 = new int[i16];
                int i28 = i14 * 4;
                iArr2[0] = iArr[i28];
                int i29 = 1;
                iArr2[1] = iArr[i28 + 1];
                iArr2[2] = iArr[i28 + 2];
                iArr2[3] = iArr[i28 + 3];
                int i33 = i28 - 4;
                while (i29 < i14) {
                    int i34 = iArr[i33];
                    int[] iArr3 = getMediationNetwork;
                    byte[] bArr3 = component3;
                    int i35 = iArr3[bArr3[i34 >>> 24] & 255];
                    int[] iArr4 = getMonetizationNetwork;
                    int i36 = i35 ^ iArr4[bArr3[(i34 >>> 16) & 255] & 255];
                    int[] iArr5 = getCurrencyIso4217Code;
                    int i37 = i36 ^ iArr5[bArr3[(i34 >>> 8) & 255] & 255];
                    int[] iArr6 = AFAdRevenueData;
                    iArr2[i15] = iArr6[bArr3[i34 & 255] & 255] ^ i37;
                    int i38 = iArr[i33 + 1];
                    iArr2[i15 + 1] = ((iArr4[bArr3[(i38 >>> 16) & 255] & 255] ^ iArr3[bArr3[i38 >>> 24] & 255]) ^ iArr5[bArr3[(i38 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i38 & 255] & 255];
                    int i39 = iArr[i33 + 2];
                    int i43 = i15 + 3;
                    iArr2[i15 + 2] = iArr6[bArr3[i39 & 255] & 255] ^ ((iArr3[bArr3[i39 >>> 24] & 255] ^ iArr4[bArr3[(i39 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i39 >>> 8) & 255] & 255]);
                    int i44 = iArr[i33 + 3];
                    i15 += 4;
                    iArr2[i43] = iArr6[bArr3[i44 & 255] & 255] ^ ((iArr3[bArr3[i44 >>> 24] & 255] ^ iArr4[bArr3[(i44 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i44 >>> 8) & 255] & 255]);
                    i33 -= 4;
                    i29++;
                    i14 = i13;
                }
                iArr2[i15] = iArr[i33];
                iArr2[i15 + 1] = iArr[i33 + 1];
                iArr2[i15 + 2] = iArr[i33 + 2];
                iArr2[i15 + 3] = iArr[i33 + 3];
                return iArr2;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
