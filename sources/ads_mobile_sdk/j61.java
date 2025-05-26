package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j61 implements a.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final a.y9 f6704a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6705b;

    public j61(a.y9 y9Var, byte[] bArr) {
        this.f6704a = y9Var;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f6705b = bArr;
    }

    public static a.y9 a(w61 w61Var) {
        byte[] a13;
        w61.a(w61Var.f12879a, me2.f8193a);
        i22 i22Var = w61Var.f12879a;
        l61 l61Var = (l61) q41.f9943d.a(a.y9.class, i22Var.f6184a);
        a.y9 y9Var = (a.y9) ((g12) bf1.f2867b.f2868a.get()).a(cf1.f3890b.a(i22.a(l61Var.f7695a, i22Var.f6186c, l61Var.f7697c, ju1.RAW, null)), l61Var.f7696b);
        ju1 ju1Var = i22Var.f6188e;
        int ordinal = ju1Var.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    a13 = ku1.f7535a.a();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type " + ju1Var);
                }
            }
            a13 = ku1.a(w61Var.f12879a.f6189f.intValue()).a();
        } else {
            a13 = ku1.b(w61Var.f12879a.f6189f.intValue()).a();
        }
        return new j61(y9Var, a13);
    }

    @Override // a.y9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f6705b;
        if (bArr3.length == 0) {
            return this.f6704a.a(bArr, bArr2);
        }
        if (sx2.a(bArr3, bArr)) {
            return this.f6704a.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
