package w41;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o82.i2;

/* loaded from: classes5.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f128069a = kotlin.collections.h1.f(1, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE), 2, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_AD_EXCLUDE), 3, 4, 5, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_VIDEO_AD_EXCLUDE), 6, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_VIDEO_AD_EXCLUDE), 8, 9, 10, 11, 12, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN), Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN_AD_EXCLUDE));

    public static final Set a() {
        return f128069a;
    }

    public static final int b(p1 p1Var) {
        Intrinsics.checkNotNullParameter(p1Var, "<this>");
        Iterator it = p1Var.f128063d.f93634a.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (((i2) it.next()).f93619a instanceof r0) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public static final int c(p1 p1Var) {
        Intrinsics.checkNotNullParameter(p1Var, "<this>");
        Iterator it = p1Var.f128063d.f93634a.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (((i2) it.next()).f93619a instanceof v41.i) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public static final qa2.e d(y32.f sendShareSurface, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        return new qa2.e(new wa2.m(2138021286, 1610612735, 1020, null, null, sendShareSurface, null, null, null, null, null, null, "user_pins", !z13, true, true, true, false, true, true, false, false, false, false, false, z13, false, false, false, false, false, z13, false, false, false, false, false, z14, false, false));
    }
}
