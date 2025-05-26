package ads_mobile_sdk;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class sx2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11275a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final jl a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
            bArr[i13] = (byte) charAt;
        }
        return jl.a(bArr, length);
    }

    public static final jl b(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (charAt < '!' || charAt > '~') {
                throw new ir2("Not a printable ASCII character: " + charAt);
            }
            bArr[i13] = (byte) charAt;
        }
        return jl.a(bArr, length);
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i13 = 0; i13 < bArr.length; i13++) {
            if (bArr2[i13] != bArr[i13]) {
                return false;
            }
        }
        return true;
    }
}
