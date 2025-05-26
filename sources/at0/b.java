package at0;

import ao2.j0;
import ao2.v0;
import ho2.q;
import ko2.f;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import ll.j;
import u50.r;

/* loaded from: classes5.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20435a;

    /* renamed from: b, reason: collision with root package name */
    public final j f20436b;

    /* renamed from: c, reason: collision with root package name */
    public final rd.j f20437c;

    public b(j screenNavigator, rd.j pinalytics, int i13) {
        this.f20435a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            this.f20436b = screenNavigator;
            this.f20437c = pinalytics;
            return;
        }
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f20436b = screenNavigator;
        this.f20437c = pinalytics;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        switch (this.f20435a) {
            case 0:
                ys0.j request = (ys0.j) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                f fVar = v0.f20219a;
                kotlin.jvm.internal.j.z(scope, q.f69782a, null, new a(this, request, null), 2);
                break;
            default:
                dt0.r request2 = (dt0.r) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                f fVar2 = v0.f20219a;
                kotlin.jvm.internal.j.z(scope, q.f69782a, null, new ft0.a(this, request2, null), 2);
                break;
        }
    }
}
