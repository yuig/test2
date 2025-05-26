package xs;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d0 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final zy.d0 f135707a;

    /* renamed from: b, reason: collision with root package name */
    public final l80.c f135708b;

    public d0(zy.d0 pinalyticsSEM, ll.j cartingAvailabilitiesDataSourceCreator) {
        Intrinsics.checkNotNullParameter(pinalyticsSEM, "pinalyticsSEM");
        Intrinsics.checkNotNullParameter(cartingAvailabilitiesDataSourceCreator, "cartingAvailabilitiesDataSourceCreator");
        this.f135707a = pinalyticsSEM;
        this.f135708b = (l80.c) cartingAvailabilitiesDataSourceCreator.f83754b;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        d request = (d) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof a) {
            kotlin.jvm.internal.j.z(scope, null, null, new c0(this, request, eventIntake, null), 3);
            return;
        }
        if (request instanceof b) {
            kotlin.jvm.internal.j.z(scope, null, null, new b0(System.currentTimeMillis(), eventIntake, null), 3);
        } else if (request instanceof c) {
            this.f135707a.e(scope, ((c) request).f135702a, eventIntake);
        }
    }
}
