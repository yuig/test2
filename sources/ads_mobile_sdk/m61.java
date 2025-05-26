package ads_mobile_sdk;

import a.p6;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class m61 extends a.ab {

    /* renamed from: a, reason: collision with root package name */
    public final o61 f8108a;

    /* renamed from: b, reason: collision with root package name */
    public final jl f8109b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f8110c;

    public m61(o61 o61Var, jl jlVar, Integer num) {
        this.f8108a = o61Var;
        this.f8109b = jlVar;
        this.f8110c = num;
    }

    public static m61 a(o61 o61Var, Integer num) {
        jl a13;
        n61 n61Var = o61Var.f9155b;
        if (n61Var == n61.f8687b) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            a13 = jl.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (n61Var != n61.f8688c) {
                throw new GeneralSecurityException("Unknown Variant: " + o61Var.f9155b);
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            a13 = jl.a(new byte[0], 0);
        }
        return new m61(o61Var, a13, num);
    }

    @Override // a.ab
    public final jl b() {
        return this.f8109b;
    }

    @Override // a.i7
    public final p6 a() {
        return this.f8108a;
    }
}
