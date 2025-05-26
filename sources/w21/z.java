package w21;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final rd.j f127880a;

    public z(rd.j pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f127880a = pinalytics;
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        h32.f1 f1Var;
        q1 request = (q1) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof p1) {
            f1Var = h32.f1.PIN_OR_SPIN_VIEW_INTENT;
        } else if (request instanceof n1) {
            f1Var = h32.f1.PIN_OR_SPIN_REFRESH;
        } else if (request instanceof m1) {
            f1Var = h32.f1.PIN_OR_SPIN_PIN_SELECTED;
        } else if (request instanceof l1) {
            f1Var = h32.f1.PIN_OR_SPIN_EXIT;
        } else {
            if (!(request instanceof o1)) {
                throw new NoWhenBranchMatchedException();
            }
            f1Var = h32.f1.PIN_OR_SPIN_CHOSEN_PIN_SELECTED;
        }
        this.f127880a.n(new zy.a(request.getContext(), f1Var, null, request.getAuxData(), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
    }
}
