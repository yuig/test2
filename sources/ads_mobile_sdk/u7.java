package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class u7 implements a.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final my1 f11869a;

    public u7(my1 my1Var) {
        this.f11869a = my1Var;
    }

    @Override // a.y9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Iterator it = this.f11869a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((t7) it.next()).f11433a.a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
