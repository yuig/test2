package v21;

import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final rd.j f123855a;

    public b(rd.j pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f123855a = pinalytics;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        f1 f1Var;
        v request = (v) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof u) {
            f1Var = f1.PIN_OR_SPIN_REVEAL_REWARD_VIEW_INTENT;
        } else if (request instanceof s) {
            f1Var = f1.PIN_OR_SPIN_RESTART;
        } else if (request instanceof t) {
            f1Var = f1.PIN_OR_SPIN_REVEAL_REWARD;
        } else {
            if (!(request instanceof r)) {
                throw new NoWhenBranchMatchedException();
            }
            f1Var = f1.PIN_OR_SPIN_EXIT_REVEAL_REWARD_PAGE;
        }
        this.f123855a.n(new zy.a(request.getContext(), f1Var, null, request.getAuxData(), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
    }
}
