package com.pinterest.feature.settings.notifications;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import o82.i2;
import w41.q1;

/* loaded from: classes5.dex */
public final class z0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final g01.a f48290c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.y f48291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ll.j notificationsSettingsDataSource, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(notificationsSettingsDataSource, "notificationsSettingsDataSource");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.j.z(scope, null, null, new v0(this, null), 3);
        kotlin.jvm.internal.j.z(scope, null, null, new w0(this, null), 3);
        kotlin.jvm.internal.j.z(scope, null, null, new x0(this, null), 3);
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new q1(5), new bt0.u(22), new o82.h(new i(notificationsSettingsDataSource)), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f48290c = d2;
        l82.a0 a0Var = new l82.a0(scope);
        tx0.x stateTransformer = new tx0.x((o82.i0) d2.f63224a, 4);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f48291d = l82.a0.b(a0Var, new t0("", new o82.j0(kotlin.collections.e0.b(new i2((Object) null, 3)))), new y0(this, 0), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f48291d.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f48291d.e();
    }
}
