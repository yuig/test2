package qa2;

import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.pr;
import com.pinterest.api.model.sr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class e1 {
    public static final void a(d1 d1Var, f30 pin, PinterestStaggeredGridLayoutManager.LayoutParams layoutParams, int i13, lh0.z0 experimentsActivator, Integer num) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        Intrinsics.checkNotNullParameter(pin, "pin");
        as1.b a13 = as1.b.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        sr b13 = bs1.b.b(pin, a13);
        sr m13 = b40.m(pin);
        if (m13 != null && num != null) {
            Double h10 = m13.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getHeight(...)");
            double min = Math.min(h10.doubleValue(), num.intValue());
            double doubleValue = m13.k().doubleValue();
            Double h13 = m13.h();
            Intrinsics.checkNotNullExpressionValue(h13, "getHeight(...)");
            double doubleValue2 = (doubleValue / h13.doubleValue()) * min;
            pr f13 = sr.f();
            f13.f(Double.valueOf(doubleValue2));
            f13.c(Double.valueOf(min));
            f13.e(m13.j());
            f13.b(m13.g());
            f13.d(m13.i());
            b13 = f13.a();
        }
        d1Var.f103248a = bs1.c.E0(b13);
        d1Var.f103249b = bs1.c.w0(b13);
        c1 c1Var = c1.NONE;
        Intrinsics.checkNotNullParameter(c1Var, "<set-?>");
        d1Var.f103254g = c1Var;
        d1Var.f103252e = d1Var.f103248a;
        d1Var.f103253f = d1Var.f103249b;
        Float f14 = d1Var.f103250c;
        if (f14 != null) {
            d1Var.f103253f = ml2.c.c((d1Var.f103252e * f14.floatValue()) + d1Var.f103251d);
        }
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        if (layoutParams == null || layoutParams.getF19194h() <= 0) {
            return;
        }
        if (layoutParams.getF19199m() > 0) {
            d1Var.f103255h = 0.65f;
            d1Var.f103252e = i13;
            int f19194h = layoutParams.getF19194h() - ml2.c.c((layoutParams.getF19193g() / d1Var.f103248a) * d1Var.f103249b);
            if (f19194h < 0) {
                c1 c1Var2 = c1.CROPPED;
                Intrinsics.checkNotNullParameter(c1Var2, "<set-?>");
                d1Var.f103254g = c1Var2;
                return;
            }
            d1Var.f103253f = layoutParams.getF19199m() - f19194h;
        }
        float f15 = (d1Var.f103249b / d1Var.f103248a) / (d1Var.f103253f / d1Var.f103252e);
        if (f15 > 1.0f) {
            c1Var = c1.CROPPED;
        } else if (f15 < 1.0f) {
            c1Var = c1.SCALE_TO_FILL;
        }
        Intrinsics.checkNotNullParameter(c1Var, "<set-?>");
        d1Var.f103254g = c1Var;
    }
}
