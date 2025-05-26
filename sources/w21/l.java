package w21;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final z20.a f127735a;

    public l(z20.a pinOrSpinService) {
        Intrinsics.checkNotNullParameter(pinOrSpinService, "pinOrSpinService");
        this.f127735a = pinOrSpinService;
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        v1 request = (v1) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof s1) {
            kotlin.jvm.internal.j.z(scope, null, null, new k(request, eventIntake, this, null), 3);
        }
    }
}
