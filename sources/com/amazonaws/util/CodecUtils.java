package com.amazonaws.util;

/* loaded from: classes3.dex */
public enum CodecUtils {
    ;

    public static int sanitize(String str, byte[] bArr) {
        int length = bArr.length;
        char[] charArray = str.toCharArray();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char c13 = charArray[i14];
            if (c13 != '\r' && c13 != '\n' && c13 != ' ') {
                if (c13 > 127) {
                    throw new IllegalArgumentException("Invalid character found at position " + i14 + " for " + str);
                }
                bArr[i13] = (byte) c13;
                i13++;
            }
        }
        return i13;
    }

    public static void sanityCheckLastPos(int i13, int i14) {
        if ((i13 & i14) != 0) {
            throw new IllegalArgumentException("Invalid last non-pad character detected");
        }
    }

    public static byte[] toBytesDirect(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[length];
        for (int i13 = 0; i13 < length; i13++) {
            char c13 = charArray[i13];
            if (c13 > 127) {
                throw new IllegalArgumentException("Invalid character found at position " + i13 + " for " + str);
            }
            bArr[i13] = (byte) c13;
        }
        return bArr;
    }

    public static String toStringDirect(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int length = bArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            cArr[i14] = (char) bArr[i13];
            i13++;
            i14++;
        }
        return new String(cArr);
    }
}
