package r90;

import ao2.j0;
import ao2.v0;
import ho2.q;
import kotlin.jvm.internal.Intrinsics;
import p90.i0;
import u50.r;

/* loaded from: classes5.dex */
public final class c implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final ll.j f106865a;

    /* renamed from: b, reason: collision with root package name */
    public final ab0.e f106866b;

    public c(ll.j screenNavigator, ab0.e cutoutToolNavigator) {
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(cutoutToolNavigator, "cutoutToolNavigator");
        this.f106865a = screenNavigator;
        this.f106866b = cutoutToolNavigator;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        i0 request = (i0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        ko2.f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(scope, q.f69782a, null, new b(request, this, null), 2);
    }
}
