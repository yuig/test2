package com.amazonaws.util;

/* loaded from: classes3.dex */
public enum Base64 {
    ;

    private static final Base64Codec CODEC = new Base64Codec();

    public static byte[] decode(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length()];
        int sanitize = CodecUtils.sanitize(str, bArr);
        CODEC.getClass();
        return Base64Codec.a(sanitize, bArr);
    }

    public static byte[] encode(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : CODEC.b(bArr);
    }

    public static String encodeAsString(byte... bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? "" : CodecUtils.toStringDirect(CODEC.b(bArr));
    }

    public static byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64Codec base64Codec = CODEC;
        int length = bArr.length;
        base64Codec.getClass();
        return Base64Codec.a(length, bArr);
    }
}
