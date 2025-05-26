package u21;

import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final rd.j f120095a;

    public j(rd.j pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f120095a = pinalytics;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        f1 f1Var;
        w request = (w) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof v) {
            f1Var = f1.PIN_OR_SPIN_REWARD_VIEW_INTENT;
        } else if (request instanceof t) {
            f1Var = f1.PIN_OR_SPIN_REWARD_SAVE_BOARD;
        } else {
            if (!(request instanceof u)) {
                throw new NoWhenBranchMatchedException();
            }
            f1Var = f1.PIN_OR_SPIN_SHARE_SHEET_CLICKED;
        }
        this.f120095a.n(new zy.a(request.getContext(), f1Var, null, request.getAuxData(), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
    }
}
