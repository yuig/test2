package p90;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f99247a = h1.f(1, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE), 2, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_AD_EXCLUDE), 5, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_VIDEO_AD_EXCLUDE), 3, 4, 6, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_VIDEO_AD_EXCLUDE), 8, 9, 10, 11, 12, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN), Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN_AD_EXCLUDE));

    public static final qa2.e a() {
        return new qa2.e(new wa2.m(1800273407, 2147481599, 1023, null, null, y32.f.UNKNOWN, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, true, false, false, true, true, false, false, true, false, true, false, false, false, false, false, false, false, false));
    }

    public static final Set b() {
        return f99247a;
    }

    public static final q90.b c(z0 z0Var) {
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        if (z0Var instanceof x0) {
            return new q90.b(null, 3);
        }
        if (!(z0Var instanceof y0)) {
            throw new NoWhenBranchMatchedException();
        }
        String s03 = j1.s0(((y0) z0Var).f99248a);
        if (s03 == null) {
            s03 = "";
        }
        return new q90.b(bs1.c.h2(s03), 2);
    }
}
