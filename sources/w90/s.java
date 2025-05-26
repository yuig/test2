package w90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final lb0.r f128577a;

    public s(lb0.r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f128577a = prefsManagerUser;
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        x request = (x) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        kotlin.jvm.internal.j.z(scope, null, null, new r(this, request, null), 3);
    }
}
