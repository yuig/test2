package io.jsonwebtoken.io;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class Base64 {
    private static final char[] BASE64URL_ALPHABET;
    private static final int[] BASE64URL_IALPHABET;
    private static final char[] BASE64_ALPHABET;
    private static final int[] BASE64_IALPHABET;
    static final Base64 DEFAULT;
    private static final int IALPHABET_MAX_INDEX;
    static final Base64 URL_SAFE;
    private final char[] ALPHABET;
    private final int[] IALPHABET;
    private final boolean urlsafe;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        BASE64_ALPHABET = charArray;
        BASE64URL_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
        int[] iArr = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        BASE64_IALPHABET = iArr;
        int[] iArr2 = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        BASE64URL_IALPHABET = iArr2;
        IALPHABET_MAX_INDEX = iArr.length - 1;
        Arrays.fill(iArr, -1);
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        int length = charArray.length;
        for (int i13 = 0; i13 < length; i13++) {
            BASE64_IALPHABET[BASE64_ALPHABET[i13]] = i13;
            BASE64URL_IALPHABET[BASE64URL_ALPHABET[i13]] = i13;
        }
        BASE64_IALPHABET[61] = 0;
        BASE64URL_IALPHABET[61] = 0;
        DEFAULT = new Base64(false);
        URL_SAFE = new Base64(true);
    }

    private Base64(boolean z13) {
        this.urlsafe = z13;
        this.ALPHABET = z13 ? BASE64URL_ALPHABET : BASE64_ALPHABET;
        this.IALPHABET = z13 ? BASE64URL_IALPHABET : BASE64_IALPHABET;
    }

    private int ctoi(char c13) {
        int i13 = c13 > IALPHABET_MAX_INDEX ? -1 : this.IALPHABET[c13];
        if (i13 >= 0) {
            return i13;
        }
        throw new DecodingException("Illegal " + getName() + " character: '" + c13 + "'");
    }

    private char[] encodeToChar(byte[] bArr, boolean z13) {
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return new char[0];
        }
        int i13 = (length / 3) * 3;
        int i14 = length - i13;
        int i15 = length - 1;
        int i16 = ((i15 / 3) + 1) << 2;
        int i17 = i16 + (z13 ? ((i16 - 1) / 76) << 1 : 0);
        char[] cArr = new char[this.urlsafe ? i17 - (i14 == 2 ? 1 : i14 == 1 ? 2 : 0) : i17];
        int i18 = 0;
        int i19 = 0;
        int i23 = 0;
        while (i18 < i13) {
            int i24 = i18 + 2;
            int i25 = ((bArr[i18 + 1] & 255) << 8) | ((bArr[i18] & 255) << 16);
            i18 += 3;
            int i26 = i25 | (bArr[i24] & 255);
            char[] cArr2 = this.ALPHABET;
            cArr[i19] = cArr2[(i26 >>> 18) & 63];
            cArr[i19 + 1] = cArr2[(i26 >>> 12) & 63];
            cArr[i19 + 2] = cArr2[(i26 >>> 6) & 63];
            int i27 = i19 + 4;
            cArr[i19 + 3] = cArr2[i26 & 63];
            if (z13 && (i23 = i23 + 1) == 19 && i27 < i17 - 2) {
                int i28 = i19 + 5;
                cArr[i27] = '\r';
                i19 += 6;
                cArr[i28] = '\n';
                i23 = 0;
            } else {
                i19 = i27;
            }
        }
        if (i14 > 0) {
            int i29 = ((bArr[i13] & 255) << 10) | (i14 == 2 ? (bArr[i15] & 255) << 2 : 0);
            char[] cArr3 = this.ALPHABET;
            cArr[i17 - 4] = cArr3[i29 >> 12];
            cArr[i17 - 3] = cArr3[(i29 >>> 6) & 63];
            if (i14 == 2) {
                cArr[i17 - 2] = cArr3[i29 & 63];
            } else if (!this.urlsafe) {
                cArr[i17 - 2] = '=';
            }
            if (!this.urlsafe) {
                cArr[i17 - 1] = '=';
            }
        }
        return cArr;
    }

    private String getName() {
        return this.urlsafe ? "base64url" : "base64";
    }

    public final byte[] decodeFast(char[] cArr) {
        int i13;
        int length = cArr != null ? cArr.length : 0;
        if (length == 0) {
            return new byte[0];
        }
        int i14 = length - 1;
        int i15 = 0;
        while (i15 < i14 && this.IALPHABET[cArr[i15]] < 0) {
            i15++;
        }
        while (i14 > 0 && this.IALPHABET[cArr[i14]] < 0) {
            i14--;
        }
        int i16 = cArr[i14] == '=' ? cArr[i14 + (-1)] == '=' ? 2 : 1 : 0;
        int i17 = (i14 - i15) + 1;
        if (length > 76) {
            i13 = (cArr[76] == '\r' ? i17 / 78 : 0) << 1;
        } else {
            i13 = 0;
        }
        int i18 = (((i17 - i13) * 6) >> 3) - i16;
        byte[] bArr = new byte[i18];
        int i19 = (i18 / 3) * 3;
        int i23 = 0;
        int i24 = 0;
        while (i23 < i19) {
            int i25 = i15 + 4;
            int ctoi = (ctoi(cArr[i15 + 1]) << 12) | (ctoi(cArr[i15]) << 18) | (ctoi(cArr[i15 + 2]) << 6) | ctoi(cArr[i15 + 3]);
            bArr[i23] = (byte) (ctoi >> 16);
            int i26 = i23 + 2;
            bArr[i23 + 1] = (byte) (ctoi >> 8);
            i23 += 3;
            bArr[i26] = (byte) ctoi;
            if (i13 <= 0 || (i24 = i24 + 1) != 19) {
                i15 = i25;
            } else {
                i15 += 6;
                i24 = 0;
            }
        }
        if (i23 < i18) {
            int i27 = 0;
            int i28 = 0;
            while (i15 <= i14 - i16) {
                i27 |= ctoi(cArr[i15]) << (18 - (i28 * 6));
                i28++;
                i15++;
            }
            int i29 = 16;
            while (i23 < i18) {
                bArr[i23] = (byte) (i27 >> i29);
                i29 -= 8;
                i23++;
            }
        }
        return bArr;
    }

    public final String encodeToString(byte[] bArr, boolean z13) {
        return new String(encodeToChar(bArr, z13));
    }
}
