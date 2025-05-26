package k92;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import u50.r;

/* loaded from: classes2.dex */
public final class j implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final b20.c f78884a;

    public j(b20.c toastForSEP) {
        Intrinsics.checkNotNullParameter(toastForSEP, "toastForSEP");
        this.f78884a = toastForSEP;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(j0 scope, o request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof n) {
            this.f78884a.A(new b(((n) request).j()), new i(eventIntake, request, 0), new i(eventIntake, request, 1), new i(eventIntake, request, 2), new i(eventIntake, request, 3));
            return;
        }
        if (request instanceof m) {
            this.f78884a.A(((m) request).j(), new i(eventIntake, request, 4), new i(eventIntake, request, 5), new i(eventIntake, request, 6), new i(eventIntake, request, 7));
        }
    }
}
