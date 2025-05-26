package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class k61 implements a.a2 {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f7138d = {0};

    /* renamed from: a, reason: collision with root package name */
    public final a.a2 f7139a;

    /* renamed from: b, reason: collision with root package name */
    public final ju1 f7140b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7141c;

    public k61(a.a2 a2Var, ju1 ju1Var, byte[] bArr) {
        this.f7139a = a2Var;
        this.f7140b = ju1Var;
        this.f7141c = bArr;
    }

    public static a.a2 a(w61 w61Var) {
        byte[] a13;
        w61.a(w61Var.f12879a, me2.f8193a);
        i22 i22Var = w61Var.f12879a;
        a.w9 a14 = q41.f9943d.a(a.a2.class, i22Var.f6184a);
        l61 l61Var = (l61) a14;
        a.i7 a15 = cf1.f3890b.a(i22.a(l61Var.f7695a, i22Var.f6186c, l61Var.f7697c, ju1.RAW, null));
        bf1 bf1Var = bf1.f2867b;
        a.a2 a2Var = (a.a2) ((g12) bf1Var.f2868a.get()).a(a15, l61Var.f7696b);
        ju1 ju1Var = i22Var.f6188e;
        int ordinal = ju1Var.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    a13 = ku1.f7535a.a();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            a13 = ku1.a(w61Var.f12879a.f6189f.intValue()).a();
        } else {
            a13 = ku1.b(w61Var.f12879a.f6189f.intValue()).a();
        }
        return new k61(a2Var, ju1Var, a13);
    }

    @Override // a.a2
    public final void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 10) {
            if (this.f7140b.equals(ju1.LEGACY)) {
                bArr2 = jk.r.d(bArr2, f7138d);
            }
            byte[] bArr3 = new byte[0];
            if (!this.f7140b.equals(ju1.RAW)) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
                bArr3 = copyOf;
            }
            if (Arrays.equals(this.f7141c, bArr3)) {
                this.f7139a.a(bArr, bArr2);
                return;
            }
            throw new GeneralSecurityException("wrong prefix");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
