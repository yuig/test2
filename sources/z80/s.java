package z80;

import ao2.j0;
import ao2.v0;
import kotlin.jvm.internal.Intrinsics;
import s80.t5;

/* loaded from: classes5.dex */
public final class s implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final ll.j f141087a;

    /* renamed from: b, reason: collision with root package name */
    public final ab0.e f141088b;

    public s(ll.j screenNavigator, ab0.e cutoutToolNavigator) {
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(cutoutToolNavigator, "cutoutToolNavigator");
        this.f141087a = screenNavigator;
        this.f141088b = cutoutToolNavigator;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        t5 request = (t5) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        ko2.f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new r(request, this, null), 2);
    }
}
