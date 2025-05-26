package jl;

import c50.c1;
import el.r0;
import el.s0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class q implements uk.s {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f76886a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f76887b;

    public q(r0 r0Var) {
        this.f76886a = r0Var;
        boolean c13 = r0Var.c();
        c1 c1Var = el.a.f59450j;
        if (!c13) {
            this.f76887b = c1Var;
            return;
        }
        el.d0 a13 = el.e0.f59476b.a();
        el.a.P(r0Var);
        a13.getClass();
        this.f76887b = c1Var;
    }

    @Override // uk.s
    public final void a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        c1 c1Var = this.f76887b;
        if (length <= 5) {
            c1Var.getClass();
            throw new GeneralSecurityException("signature too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        r0 r0Var = this.f76886a;
        Iterator it = r0Var.b(copyOf).iterator();
        while (it.hasNext()) {
            try {
                ((uk.s) ((s0) it.next()).f59530a).a(bArr, bArr2);
                int length2 = bArr2.length;
                c1Var.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        Iterator it2 = r0Var.b(uk.c.f122357a).iterator();
        while (it2.hasNext()) {
            try {
                ((uk.s) ((s0) it2.next()).f59530a).a(bArr, bArr2);
                int length3 = bArr2.length;
                c1Var.getClass();
                return;
            } catch (GeneralSecurityException unused2) {
            }
        }
        c1Var.getClass();
        throw new GeneralSecurityException("invalid signature");
    }
}
