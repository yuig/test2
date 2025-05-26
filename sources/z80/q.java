package z80;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import s80.i5;
import s80.j5;
import s80.k5;
import x02.b1;
import x02.i2;

/* loaded from: classes5.dex */
public final class q implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f141083a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f141084b;

    public q(b1 collageRepository, i2 pinRepository) {
        Intrinsics.checkNotNullParameter(collageRepository, "collageRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f141083a = collageRepository;
        this.f141084b = pinRepository;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        k5 request = (k5) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof i5) {
            kotlin.jvm.internal.j.z(scope, null, null, new o(this, request, eventIntake, null), 3);
        } else if (request instanceof j5) {
            kotlin.jvm.internal.j.z(scope, null, null, new p(this, request, eventIntake, null), 3);
        }
    }
}
