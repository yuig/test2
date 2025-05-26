package o91;

import ao2.j0;
import k22.m;
import k92.j;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import m60.w;
import n91.s;
import n91.t;
import n91.u;
import n91.v;
import n91.x;
import n91.y;
import p91.k;
import u50.r;
import zy.d0;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final m f93829a;

    /* renamed from: b, reason: collision with root package name */
    public final w f93830b;

    /* renamed from: c, reason: collision with root package name */
    public final j f93831c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f93832d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f93833e;

    public e(m userService, w eventManager, j toastSEP, w60.d navigationSEP, d0 pinalyticsSEP) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        this.f93829a = userService;
        this.f93830b = eventManager;
        this.f93831c = toastSEP;
        this.f93832d = navigationSEP;
        this.f93833e = pinalyticsSEP;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        y request = (y) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof u) {
            kotlin.jvm.internal.j.z(scope, null, null, new d(this, eventIntake, (u) request, null), 3);
            return;
        }
        if (request instanceof t) {
            kotlin.jvm.internal.j.z(scope, null, null, new b(this, eventIntake, (t) request, null), 3);
            return;
        }
        if (request instanceof s) {
            this.f93830b.d(new k(bd1.b.EMAIL_FIELD, ((s) request).f90068a));
            return;
        }
        if (request instanceof x) {
            this.f93831c.e(scope, ((x) request).f90074a, new tx0.j(eventIntake, 19));
        } else if (request instanceof v) {
            this.f93832d.j(scope, ((v) request).f90072a, eventIntake);
        } else if (request instanceof n91.w) {
            this.f93833e.e(scope, ((n91.w) request).f90073a, eventIntake);
        }
    }
}
