package com.pinterest.boardAutoCollages;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import o82.i2;
import o82.s0;

/* loaded from: classes5.dex */
public final class m0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final w60.d f44582c;

    /* renamed from: d, reason: collision with root package name */
    public final nu.a f44583d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.d0 f44584e;

    /* renamed from: f, reason: collision with root package name */
    public final ta0.v f44585f;

    /* renamed from: g, reason: collision with root package name */
    public final k92.l f44586g;

    /* renamed from: h, reason: collision with root package name */
    public final g01.a f44587h;

    /* renamed from: i, reason: collision with root package name */
    public final l82.y f44588i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Application application, ao2.j0 scope, v60.d autoCollagesPageLoader, w60.d navigationSEP, nu.a autoCollageFeedOptionsSEP, zy.d0 pinalyticsSEP, ta0.v collageDraftDownloadSEP, k92.l toastSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(autoCollagesPageLoader, "autoCollagesPageLoader");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(autoCollageFeedOptionsSEP, "autoCollageFeedOptionsSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(collageDraftDownloadSEP, "collageDraftDownloadSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        this.f44582c = navigationSEP;
        this.f44583d = autoCollageFeedOptionsSEP;
        this.f44584e = pinalyticsSEP;
        this.f44585f = collageDraftDownloadSEP;
        this.f44586g = toastSEP;
        kv0.p pVar = new kv0.p(4);
        int i13 = 0;
        k0 k0Var = new k0(i13);
        ns.n0 n0Var = new ns.n0(1);
        Intrinsics.checkNotNullParameter(autoCollagesPageLoader, "<this>");
        kv0.p.b(pVar, k0Var, n0Var, new s0(autoCollagesPageLoader), false, new l0(i13), null, null, null, null, null, 1000);
        g01.a d2 = pVar.d();
        this.f44587h = d2;
        l82.a0 a0Var = new l82.a0(scope);
        i0 stateTransformer = new i0((o82.i0) d2.f63224a, 0);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f44588i = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f44588i.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f44588i.e();
    }

    public final void h(String str, String str2, String str3) {
        l82.y.i(this.f44588i, new j0(str, str2, str3, xa0.q.OpenComposer, new zy.l0((h32.i0) null, 3), new o82.j0(kotlin.collections.e0.b(new i2(new v60.a(str, str2, str3), 2)))), false, new mz.c(this, 12), 2);
    }
}
