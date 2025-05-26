package g31;

import ao2.j0;
import ao2.v0;
import c31.z;
import ho2.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.h;
import u50.r;

/* loaded from: classes5.dex */
public final class c implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final g f63443a;

    public c(g closeupNavigator) {
        Intrinsics.checkNotNullParameter(closeupNavigator, "closeupNavigator");
        this.f63443a = closeupNavigator;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        z request = (z) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        ko2.f fVar = v0.f20219a;
        j.z(scope, q.f69782a, null, new b(request, this, null), 2);
    }
}
