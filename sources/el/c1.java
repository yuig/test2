package el;

import com.google.crypto.tink.internal.TinkBugException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f59463a = Charset.forName("UTF-8");

    public static final ml.a a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
            bArr[i13] = (byte) charAt;
        }
        return ml.a.a(bArr);
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
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

    public static final ml.a c(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (charAt < '!' || charAt > '~') {
                throw new TinkBugException("Not a printable ASCII character: " + charAt);
            }
            bArr[i13] = (byte) charAt;
        }
        return ml.a.a(bArr);
    }
}
