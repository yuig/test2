package v41;

import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.i0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import la0.l1;
import u50.r;
import w41.d1;
import w41.e1;
import w41.f1;

/* loaded from: classes5.dex */
public final class e implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final rd.j f124119a;

    public e(rd.j pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f124119a = pinalytics;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        f1 request = (f1) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof e1) {
            j(request.f128005a, u0.PINS_TAB_EMPTY_STATE_FIND_IDEAS_BUTTON);
        } else if (request instanceof d1) {
            ((d1) request).getClass();
            j(request.f128005a, u0.PINS_TAB_EMPTY_STATE_CREATE_IDEA_BUTTON);
        }
    }

    public final void j(i0 i0Var, u0 u0Var) {
        this.f124119a.n(new zy.a(com.bumptech.glide.d.z0(i0Var, new l1(u0Var, 4)), h32.f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN));
    }
}
