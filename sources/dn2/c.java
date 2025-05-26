package dn2;

import am2.d0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.h0;

/* loaded from: classes4.dex */
public final class c extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55620b = 1;

    public c(double d2) {
        super(Double.valueOf(d2));
    }

    @Override // dn2.g
    public final /* bridge */ /* synthetic */ b0 a(d0 d0Var) {
        switch (this.f55620b) {
        }
        return c(d0Var);
    }

    public final h0 c(d0 module) {
        switch (this.f55620b) {
            case 0:
                Intrinsics.checkNotNullParameter(module, "module");
                xl2.l f13 = module.f();
                f13.getClass();
                h0 t13 = f13.t(xl2.o.BOOLEAN);
                if (t13 != null) {
                    Intrinsics.checkNotNullExpressionValue(t13, "getBooleanType(...)");
                    return t13;
                }
                xl2.l.a(64);
                throw null;
            case 1:
                Intrinsics.checkNotNullParameter(module, "module");
                xl2.l f14 = module.f();
                f14.getClass();
                h0 t14 = f14.t(xl2.o.DOUBLE);
                if (t14 != null) {
                    Intrinsics.checkNotNullExpressionValue(t14, "getDoubleType(...)");
                    return t14;
                }
                xl2.l.a(62);
                throw null;
            default:
                Intrinsics.checkNotNullParameter(module, "module");
                xl2.l f15 = module.f();
                f15.getClass();
                h0 t15 = f15.t(xl2.o.FLOAT);
                if (t15 != null) {
                    Intrinsics.checkNotNullExpressionValue(t15, "getFloatType(...)");
                    return t15;
                }
                xl2.l.a(61);
                throw null;
        }
    }

    @Override // dn2.g
    public final String toString() {
        int i13 = this.f55620b;
        Object obj = this.f55623a;
        switch (i13) {
            case 1:
                return ((Number) obj).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) obj).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public c(float f13) {
        super(Float.valueOf(f13));
    }

    public c(boolean z13) {
        super(Boolean.valueOf(z13));
    }
}
