package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class j81 implements a.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final my1 f6727a;

    public j81(my1 my1Var) {
        this.f6727a = my1Var;
    }

    @Override // a.a2
    public final void a(byte[] bArr, byte[] bArr2) {
        Iterator it = this.f6727a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((i81) it.next()).f6278a.a(bArr, bArr2);
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
