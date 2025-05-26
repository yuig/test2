package na0;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import la0.o0;
import m60.w;
import u50.r;

/* loaded from: classes5.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final w f90088a;

    /* renamed from: b, reason: collision with root package name */
    public final o12.a f90089b;

    public c(w eventManager, o12.a collageService) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        this.f90088a = eventManager;
        this.f90089b = collageService;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        o0 request = (o0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        j.z(scope, null, null, new b(request, this, eventIntake, null), 3);
    }
}
