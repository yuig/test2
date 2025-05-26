package fl;

import c50.c1;
import el.d0;
import el.e0;
import el.r0;
import el.s0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class o implements uk.p {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f62538a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f62539b;

    /* renamed from: c, reason: collision with root package name */
    public final c1 f62540c;

    public o(r0 r0Var) {
        this.f62538a = r0Var;
        boolean c13 = r0Var.c();
        c1 c1Var = el.a.f59450j;
        if (!c13) {
            this.f62539b = c1Var;
            this.f62540c = c1Var;
            return;
        }
        d0 a13 = e0.f59476b.a();
        el.a.P(r0Var);
        a13.getClass();
        this.f62539b = c1Var;
        this.f62540c = c1Var;
    }

    @Override // uk.p
    public final void a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        c1 c1Var = this.f62540c;
        if (length <= 5) {
            c1Var.getClass();
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        r0 r0Var = this.f62538a;
        Iterator it = r0Var.b(copyOf).iterator();
        while (it.hasNext()) {
            try {
                ((uk.p) ((s0) it.next()).f59530a).a(bArr, bArr2);
                int length2 = bArr2.length;
                c1Var.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        Iterator it2 = r0Var.b(uk.c.f122357a).iterator();
        while (it2.hasNext()) {
            try {
                ((uk.p) ((s0) it2.next()).f59530a).a(bArr, bArr2);
                int length3 = bArr2.length;
                c1Var.getClass();
                return;
            } catch (GeneralSecurityException unused2) {
            }
        }
        c1Var.getClass();
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // uk.p
    public final byte[] b(byte[] bArr) {
        c1 c1Var = this.f62539b;
        r0 r0Var = this.f62538a;
        try {
            byte[] b13 = ((uk.p) r0Var.f59526c.f59530a).b(bArr);
            int i13 = r0Var.f59526c.f59533d;
            int length = bArr.length;
            c1Var.getClass();
            return b13;
        } catch (GeneralSecurityException e13) {
            c1Var.getClass();
            throw e13;
        }
    }
}
