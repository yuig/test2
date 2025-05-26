package vb1;

import ao2.j0;
import k22.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import u50.r;
import ub1.q;
import ub1.s;

/* loaded from: classes5.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final m f125498a;

    public c(m userService) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.f125498a = userService;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        s request = (s) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof q) {
            j.z(scope, null, null, new a(this, eventIntake, (q) request, null), 3);
        } else if (request instanceof ub1.r) {
            j.z(scope, null, null, new b(this, (ub1.r) request, eventIntake, null), 3);
        }
    }
}
