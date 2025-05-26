package na0;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import la0.h0;
import la0.i0;
import m60.w;
import u50.r;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final w f90091a;

    /* renamed from: b, reason: collision with root package name */
    public d f90092b;

    public e(w eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f90091a = eventManager;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        la0.j0 request = (la0.j0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean d2 = Intrinsics.d(request, h0.f82407a);
        w wVar = this.f90091a;
        if (d2) {
            d dVar = new d(eventIntake);
            this.f90092b = dVar;
            wVar.h(dVar);
        } else if (Intrinsics.d(request, i0.f82410a)) {
            wVar.j(this.f90092b);
            this.f90092b = null;
        }
    }
}
