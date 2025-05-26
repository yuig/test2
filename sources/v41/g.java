package v41;

import ao2.j0;
import ao2.v0;
import ho2.q;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import u50.r;
import w41.i1;

/* loaded from: classes5.dex */
public final class g implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final g31.g f124122a;

    /* renamed from: b, reason: collision with root package name */
    public final w f124123b;

    public g(g31.g closeupNavigator, w eventManager) {
        Intrinsics.checkNotNullParameter(closeupNavigator, "closeupNavigator");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f124122a = closeupNavigator;
        this.f124123b = eventManager;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        i1 request = (i1) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        ko2.f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(scope, q.f69782a, null, new f(request, this, null), 2);
    }
}
