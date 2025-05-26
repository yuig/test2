package xr1;

import ao2.j0;
import ao2.v0;
import ko2.e;
import ko2.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import lb2.q;
import so.h9;
import u50.r;
import wr1.s0;
import zy.d0;

/* loaded from: classes4.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final cr1.a f135690a;

    /* renamed from: b, reason: collision with root package name */
    public final q f135691b;

    /* renamed from: c, reason: collision with root package name */
    public final h9 f135692c;

    /* renamed from: d, reason: collision with root package name */
    public final mr1.a f135693d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f135694e;

    /* renamed from: f, reason: collision with root package name */
    public final gz1.b f135695f;

    public d(cr1.a unauthenticatedAccountService, q authManager, h9 pinterestLoginFactory, mr1.a accountSwitcher, d0 pinalyticsSEP, gz1.b googlePlayServices) {
        Intrinsics.checkNotNullParameter(unauthenticatedAccountService, "unauthenticatedAccountService");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(pinterestLoginFactory, "pinterestLoginFactory");
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(googlePlayServices, "googlePlayServices");
        this.f135690a = unauthenticatedAccountService;
        this.f135691b = authManager;
        this.f135692c = pinterestLoginFactory;
        this.f135693d = accountSwitcher;
        this.f135694e = pinalyticsSEP;
        this.f135695f = googlePlayServices;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        s0 request = (s0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        f fVar = v0.f20219a;
        j.z(scope, e.f80326c, null, new c(request, this, scope, eventIntake, null), 2);
    }
}
