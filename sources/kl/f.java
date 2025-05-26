package kl;

import el.c1;
import el.i0;
import el.u0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import kg.t;
import uk.s;

/* loaded from: classes3.dex */
public final class f implements s {

    /* renamed from: a, reason: collision with root package name */
    public final s f80018a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f80019b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f80020c;

    public f(s sVar, byte[] bArr, byte[] bArr2) {
        this.f80018a = sVar;
        this.f80019b = bArr;
        this.f80020c = bArr2;
    }

    public static byte[] b(u0 u0Var) {
        int i13 = e.f80017a[u0Var.f59541e.ordinal()];
        Integer num = u0Var.f59542f;
        if (i13 == 1 || i13 == 2) {
            return i0.a(num.intValue()).b();
        }
        if (i13 == 3) {
            return i0.b(num.intValue()).b();
        }
        if (i13 == 4) {
            return i0.f59494a.b();
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }

    @Override // uk.s
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f80019b;
        int length = bArr3.length;
        s sVar = this.f80018a;
        byte[] bArr4 = this.f80020c;
        if (length == 0 && bArr4.length == 0) {
            sVar.a(bArr, bArr2);
        } else {
            if (!c1.b(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            if (bArr4.length != 0) {
                bArr2 = t.u(bArr2, bArr4);
            }
            sVar.a(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
    }
}
