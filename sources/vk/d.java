package vk;

import c50.c1;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d implements uk.a {

    /* renamed from: a, reason: collision with root package name */
    public final el.r0 f125934a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f125935b;

    /* renamed from: c, reason: collision with root package name */
    public final c1 f125936c;

    public d(el.r0 r0Var) {
        this.f125934a = r0Var;
        boolean c13 = r0Var.c();
        c1 c1Var = el.a.f59450j;
        if (!c13) {
            this.f125935b = c1Var;
            this.f125936c = c1Var;
            return;
        }
        el.d0 a13 = el.e0.f59476b.a();
        el.a.P(r0Var);
        a13.getClass();
        this.f125935b = c1Var;
        this.f125936c = c1Var;
    }

    @Override // uk.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        c1 c1Var = this.f125935b;
        el.r0 r0Var = this.f125934a;
        try {
            byte[] a13 = ((uk.a) r0Var.f59526c.f59530a).a(bArr, bArr2);
            int i13 = r0Var.f59526c.f59533d;
            int length = bArr.length;
            c1Var.getClass();
            return a13;
        } catch (GeneralSecurityException e13) {
            c1Var.getClass();
            throw e13;
        }
    }

    @Override // uk.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        el.r0 r0Var = this.f125934a;
        c1 c1Var = this.f125936c;
        if (length > 5) {
            Iterator it = r0Var.b(Arrays.copyOf(bArr, 5)).iterator();
            while (it.hasNext()) {
                try {
                    byte[] b13 = ((uk.a) ((el.s0) it.next()).f59530a).b(bArr, bArr2);
                    c1Var.getClass();
                    return b13;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        Iterator it2 = r0Var.b(uk.c.f122357a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] b14 = ((uk.a) ((el.s0) it2.next()).f59530a).b(bArr, bArr2);
                c1Var.getClass();
                return b14;
            } catch (GeneralSecurityException unused2) {
            }
        }
        c1Var.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
