package bl;

import c50.c1;
import el.d0;
import el.e0;
import el.r0;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class t implements uk.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23471a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23472b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23473c;

    public t(r0 r0Var) {
        this.f23472b = r0Var;
        boolean c13 = r0Var.c();
        c1 c1Var = el.a.f59450j;
        if (!c13) {
            this.f23473c = c1Var;
            return;
        }
        d0 a13 = e0.f59476b.a();
        el.a.P(r0Var);
        a13.getClass();
        this.f23473c = c1Var;
    }

    @Override // uk.f
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i13 = this.f23471a;
        Object obj = this.f23472b;
        Object obj2 = this.f23473c;
        switch (i13) {
            case 0:
                if (((r0) obj).f59526c == null) {
                    ((c1) obj2).getClass();
                    throw new GeneralSecurityException("keyset without primary key");
                }
                try {
                    byte[] a13 = ((uk.f) ((r0) obj).f59526c.f59530a).a(bArr, bArr2);
                    int i14 = ((r0) obj).f59526c.f59533d;
                    int length = bArr.length;
                    ((c1) obj2).getClass();
                    return a13;
                } catch (GeneralSecurityException e13) {
                    ((c1) obj2).getClass();
                    throw e13;
                }
            default:
                byte[] bArr3 = (byte[]) obj2;
                return bArr3.length == 0 ? ((uk.f) obj).a(bArr, bArr2) : kg.t.u(bArr3, ((uk.f) obj).a(bArr, bArr2));
        }
    }

    public t(uk.f fVar, byte[] bArr) {
        this.f23472b = fVar;
        this.f23473c = bArr;
    }
}
