package o22;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.z0;
import u50.r;

/* loaded from: classes4.dex */
public final class c implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f92842a;

    public c(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f92842a = experimentsActivator;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        d request = (d) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        request.getClass();
        ((g1) this.f92842a).c("android_curation_collage_cutout_carousel");
    }
}
