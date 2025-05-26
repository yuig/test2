package x91;

import android.app.Application;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import o82.s0;
import w41.q1;

/* loaded from: classes5.dex */
public final class l0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final k22.m f134335c;

    /* renamed from: d, reason: collision with root package name */
    public final ws.q f134336d;

    /* renamed from: e, reason: collision with root package name */
    public final zb0.i f134337e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.d0 f134338f;

    /* renamed from: g, reason: collision with root package name */
    public final k92.l f134339g;

    /* renamed from: h, reason: collision with root package name */
    public final g01.a f134340h;

    /* renamed from: i, reason: collision with root package name */
    public final l82.y f134341i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Application application, ao2.j0 scope, k22.m userService, ws.q blockedAccountsSEP, zb0.i alertSEP, zy.d0 pinalyticsSEP, k92.l toastSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(blockedAccountsSEP, "blockedAccountsSEP");
        Intrinsics.checkNotNullParameter(alertSEP, "alertSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        this.f134335c = userService;
        this.f134336d = blockedAccountsSEP;
        this.f134337e = alertSEP;
        this.f134338f = pinalyticsSEP;
        this.f134339g = toastSEP;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new q1(1), new bt0.u(18), new s0(new i90.i(userService)), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f134340h = d2;
        l82.a0 a0Var = new l82.a0(scope);
        com.pinterest.boardAutoCollages.i0 stateTransformer = new com.pinterest.boardAutoCollages.i0((o82.i0) d2.f63224a, 3);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f134341i = l82.a0.b(a0Var, new k0(new zy.l0(new h32.i0(d4.USER, a4.UNBLOCKING_SETTINGS, null, null, null, null), 2), new o82.j0()), new q91.h(this, 6), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f134341i.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f134341i.e();
    }
}
