package oa0;

import ao2.j0;
import ao2.v0;
import ho2.q;
import ka0.o;
import ko2.f;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import ll.j;
import u50.r;

/* loaded from: classes5.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final j f93843a;

    public b(j screenNavigator) {
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        this.f93843a = screenNavigator;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        o request = (o) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(scope, q.f69782a, null, new a(request, this, null), 2);
    }
}
