package qf1;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.cp0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gn0;
import com.pinterest.api.model.lq0;
import com.pinterest.api.model.wo0;
import com.pinterest.api.model.wy0;
import java.util.Set;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f103760a = h1.f(Integer.valueOf(cp0.INGREDIENTS.getType()), Integer.valueOf(cp0.SUPPLIES.getType()));

    /* renamed from: b, reason: collision with root package name */
    public static final Set f103761b = h1.f(Integer.valueOf(cp0.COVER.getType()), Integer.valueOf(cp0.SPLIT.getType()));

    /* renamed from: c, reason: collision with root package name */
    public static final Set f103762c;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f103762c = h1.f(l0Var.b(gn0.class), l0Var.b(lq0.class));
    }

    public static final String a(f30 f30Var) {
        String C;
        wy0 c13;
        if (f30Var == null || (c13 = c(f30Var)) == null || (C = c13.getUid()) == null) {
            C = f30Var != null ? b40.C(f30Var) : null;
        }
        if (C != null) {
            return C;
        }
        String H = f30Var != null ? b40.H(f30Var) : null;
        return H == null ? "" : H;
    }

    public static final boolean b(dl1.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        if (sVar instanceof wo0) {
            if (f103760a.contains(((wo0) sVar).f43310a.r())) {
                return true;
            }
        }
        return false;
    }

    public static final wy0 c(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        wy0 n13 = b40.n(f30Var);
        return n13 == null ? bs1.c.O0(f30Var) : n13;
    }

    public static final boolean d(f30 f30Var, es.a adFormats) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        return (((es.c) adFormats).U(f30Var) || f30Var.u6() == null) ? false : true;
    }

    public static final boolean e(dl1.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return (sVar instanceof wo0) && com.bumptech.glide.d.c0(((wo0) sVar).f43310a);
    }
}
