package ads_mobile_sdk;

import a.p6;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class w61 extends a.i7 {

    /* renamed from: a, reason: collision with root package name */
    public final i22 f12879a;

    /* renamed from: b, reason: collision with root package name */
    public final jl f12880b;

    public w61(i22 i22Var) {
        a(i22Var, me2.f8193a);
        this.f12879a = i22Var;
        this.f12880b = a(i22Var);
    }

    public static jl a(i22 i22Var) {
        if (i22Var.f6188e.equals(ju1.RAW)) {
            return jl.a(new byte[0], 0);
        }
        if (i22Var.f6188e.equals(ju1.TINK)) {
            return ku1.b(i22Var.f6189f.intValue());
        }
        if (i22Var.f6188e.equals(ju1.LEGACY) || i22Var.f6188e.equals(ju1.CRUNCHY)) {
            return ku1.a(i22Var.f6189f.intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    public final i22 a(me2 me2Var) {
        a(this.f12879a, me2Var);
        return this.f12879a;
    }

    public static void a(i22 i22Var, me2 me2Var) {
        int ordinal = i22Var.f6187d.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            me2.a(me2Var);
        }
    }

    @Override // a.i7
    public final p6 a() {
        i22 i22Var = this.f12879a;
        return new v61(i22Var.f6184a, i22Var.f6188e);
    }
}
