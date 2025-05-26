package z31;

import ao2.j0;
import jc0.v;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import l82.h;
import m60.w;
import u50.r;

/* loaded from: classes5.dex */
public final class g implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final w f140805a;

    /* renamed from: b, reason: collision with root package name */
    public final lu1.b f140806b;

    public g(w eventManager, lu1.b baseActivityHelper) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        this.f140805a = eventManager;
        this.f140806b = baseActivityHelper;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        y31.j0 request = (y31.j0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f140805a.d(new v(u2.J(request.f136806a, this.f140806b), false, 0L, 30));
    }
}
