package mi1;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.wy0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lh0.r2;
import n60.o;
import qa2.g0;
import u50.k0;

/* loaded from: classes2.dex */
public abstract class e {
    public static final k0 a(boolean z13) {
        k0 k0Var = new k0(wy1.f.story_pin_feed_affiliate_link_indicator_text);
        return z13 ? new k0(wy1.f.sponsored_pins_eu_prefix, e0.b(k0Var)) : k0Var;
    }

    public static final g0 b(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        boolean z13 = f30Var.a6() != null;
        boolean d2 = Intrinsics.d(f30Var.a6(), b40.n(f30Var));
        boolean z14 = f30Var.u6() != null;
        return (o.B(f30Var, "getIsPromoted(...)") && z13 && z14 && !d2) ? g0.SHOW_PROMOTION : (f30Var.d5().booleanValue() || !z14) ? (f30Var.d5().booleanValue() || z14 || !b40.w(f30Var)) ? g0.DO_NOT_SHOW : g0.SHOW_AFFILIATION : g0.SHOW_SPONSORSHIP;
    }

    public static final k0 c(f30 f30Var, boolean z13, boolean z14, r2 r2Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        int i13 = d.f87216a[b(f30Var).ordinal()];
        if (i13 == 1) {
            return d(f30Var.a6(), z14);
        }
        if (i13 == 2) {
            return f(f30Var.u6(), z13);
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        b T1 = bs1.c.T1(a.AFFILIATE, r2Var);
        if (T1.f87214b && r2Var != null) {
            r2Var.D();
        }
        if (T1.f87213a) {
            return null;
        }
        return a(z13);
    }

    public static final k0 d(wy0 wy0Var, boolean z13) {
        int i13 = z13 ? wy1.f.sponsored_by : wy1.f.promoted_by;
        String[] strArr = new String[1];
        String j13 = wy0Var != null ? dl2.b.j1(wy0Var) : null;
        if (j13 == null) {
            j13 = "";
        }
        strArr[0] = j13;
        return new k0(strArr, i13);
    }

    public static final boolean e(f30 f30Var, boolean z13) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return c(f30Var, z13, false, null) != null;
    }

    public static final k0 f(rj0 rj0Var, boolean z13) {
        k0 k0Var;
        wy0 e13;
        String str = null;
        rj0.a f13 = rj0Var != null ? rj0Var.f() : null;
        int i13 = f13 == null ? -1 : d.f87217b[f13.ordinal()];
        if (i13 != -1) {
            if (i13 == 1) {
                int i14 = wy1.f.sponsored_pins_prefix;
                String[] strArr = new String[1];
                if (rj0Var != null && (e13 = rj0Var.e()) != null) {
                    str = dl2.b.j1(e13);
                }
                if (str == null) {
                    str = "";
                }
                strArr[0] = str;
                k0 k0Var2 = new k0(strArr, i14);
                if (!z13) {
                    return k0Var2;
                }
                k0Var = new k0(wy1.f.sponsored_pins_eu_prefix, e0.b(k0Var2));
                return k0Var;
            }
            if (i13 == 2) {
                return null;
            }
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        k0Var = new k0(wy1.f.sponsored_pins_simple_prefix);
        if (z13) {
            return new k0(wy1.f.sponsored_pins_eu_prefix, k0Var);
        }
        return k0Var;
    }
}
