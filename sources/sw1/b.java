package sw1;

import ao2.j0;
import ao2.v0;
import ay1.v;
import bx1.o;
import ho2.q;
import ko2.f;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import ll.j;
import rw1.d;
import u50.r;

/* loaded from: classes4.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115599a;

    /* renamed from: b, reason: collision with root package name */
    public final j f115600b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f115601c;

    public b(j screenNavigator, b60.b activeUserManager, int i13) {
        this.f115599a = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
            Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
            this.f115600b = screenNavigator;
            this.f115601c = activeUserManager;
            return;
        }
        if (i13 != 2) {
            Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
            Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
            this.f115600b = screenNavigator;
            this.f115601c = activeUserManager;
            return;
        }
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f115600b = screenNavigator;
        this.f115601c = activeUserManager;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        switch (this.f115599a) {
            case 0:
                d request = (d) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                f fVar = v0.f20219a;
                kotlin.jvm.internal.j.z(scope, q.f69782a, null, new a(request, null), 2);
                break;
            case 1:
                o request2 = (o) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                f fVar2 = v0.f20219a;
                kotlin.jvm.internal.j.z(scope, q.f69782a, null, new cx1.a(request2, this, null), 2);
                break;
            default:
                v request3 = (v) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request3, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                f fVar3 = v0.f20219a;
                kotlin.jvm.internal.j.z(scope, q.f69782a, null, new by1.a(request3, this, null), 2);
                break;
        }
    }
}
