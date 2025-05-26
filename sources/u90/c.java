package u90;

import ao2.j0;
import ao2.v0;
import ho2.q;
import kotlin.jvm.internal.Intrinsics;
import s90.z0;
import u50.r;

/* loaded from: classes5.dex */
public final class c implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final ll.j f121175a;

    public c(ll.j navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f121175a = navigator;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        z0 request = (z0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        ko2.f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(scope, q.f69782a, null, new b(request, this, null), 2);
    }
}
