package com.amazonaws.util;

/* loaded from: classes3.dex */
public abstract class BinaryUtils {
    public static String a(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder(bArr.length * 2);
        for (byte b13 : bArr) {
            String hexString = Integer.toHexString(b13);
            if (hexString.length() == 1) {
                sb3.append("0");
            } else if (hexString.length() == 8) {
                hexString = hexString.substring(6);
            }
            sb3.append(hexString);
        }
        return StringUtils.a(sb3.toString());
    }
}
