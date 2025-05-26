package ai;

import android.util.Base64;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final SecureRandom f15229a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f15229a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
