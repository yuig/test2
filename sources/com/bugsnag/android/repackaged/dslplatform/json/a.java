package com.bugsnag.android.repackaged.dslplatform.json;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f29479a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f29480b;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f29481c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f29482d;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f29479a = charArray;
        int[] iArr = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        f29481c = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i13 = 0; i13 < length; i13++) {
            f29481c[f29479a[i13]] = i13;
        }
        f29481c[61] = 0;
        f29480b = new byte[f29479a.length];
        int i14 = 0;
        while (true) {
            char[] cArr = f29479a;
            if (i14 >= cArr.length) {
                f29482d = new byte[0];
                return;
            } else {
                f29480b[i14] = (byte) cArr[i14];
                i14++;
            }
        }
    }

    public static byte[] a(byte[] bArr, int i13, int i14) {
        int[] iArr;
        int i15;
        int i16 = i14 - i13;
        if (i16 == 0) {
            return f29482d;
        }
        int i17 = i14 - 1;
        int i18 = i13;
        while (true) {
            iArr = f29481c;
            if (i18 >= i17 || iArr[bArr[i18] & 255] >= 0) {
                break;
            }
            i18++;
        }
        while (i17 > 0 && iArr[bArr[i17] & 255] < 0) {
            i17--;
        }
        int i19 = bArr[i17] == 61 ? bArr[i17 + (-1)] == 61 ? 2 : 1 : 0;
        int i23 = (i17 - i18) + 1;
        if (i16 > 76) {
            i15 = (bArr[76] == 13 ? i23 / 78 : 0) << 1;
        } else {
            i15 = 0;
        }
        int i24 = (((i23 - i15) * 6) >> 3) - i19;
        byte[] bArr2 = new byte[i24];
        int i25 = (i24 / 3) * 3;
        int i26 = 0;
        loop2: while (true) {
            int i27 = 0;
            while (i26 < i25) {
                int i28 = i18 + 4;
                int i29 = (iArr[bArr[i18 + 1]] << 12) | (iArr[bArr[i18]] << 18) | (iArr[bArr[i18 + 2]] << 6) | iArr[bArr[i18 + 3]];
                bArr2[i26] = (byte) (i29 >> 16);
                int i33 = i26 + 2;
                bArr2[i26 + 1] = (byte) (i29 >> 8);
                i26 += 3;
                bArr2[i33] = (byte) i29;
                if (i15 <= 0 || (i27 = i27 + 1) != 19) {
                    i18 = i28;
                }
            }
            i18 += 6;
        }
        if (i26 < i24) {
            int i34 = 0;
            int i35 = 0;
            while (i18 <= i17 - i19) {
                i35 |= iArr[bArr[i18]] << (18 - (i34 * 6));
                i34++;
                i18++;
            }
            int i36 = 16;
            while (i26 < i24) {
                bArr2[i26] = (byte) (i35 >> i36);
                i36 -= 8;
                i26++;
            }
        }
        return bArr2;
    }
}
