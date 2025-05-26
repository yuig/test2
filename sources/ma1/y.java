package ma1;

import android.app.Application;
import ao2.j0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import o82.i0;
import o82.j3;
import w41.q1;

/* loaded from: classes5.dex */
public final class y extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final gx.e f86819c;

    /* renamed from: d, reason: collision with root package name */
    public final k92.l f86820d;

    /* renamed from: e, reason: collision with root package name */
    public final cr1.a f86821e;

    /* renamed from: f, reason: collision with root package name */
    public final g01.a f86822f;

    /* renamed from: g, reason: collision with root package name */
    public final l82.y f86823g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(gx.e connectedDevicesSEP, k92.l toastSEP, Application application, j0 scope, cr1.a accountService) {
        super(scope);
        Intrinsics.checkNotNullParameter(connectedDevicesSEP, "connectedDevicesSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        this.f86819c = connectedDevicesSEP;
        this.f86820d = toastSEP;
        this.f86821e = accountService;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new q1(3), new bt0.u(20), new j3(e0.b(new w())), false, null, null, null, null, null, null, 1016);
        kv0.p.b(pVar, new q1(4), new bt0.u(21), new o82.h(new androidx.appcompat.widget.q(this, 3)), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f86822f = d2;
        a0 a0Var = new a0(scope);
        tx0.x stateTransformer = new tx0.x((i0) d2.f63224a, 3);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f86823g = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f86823g.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f86823g.e();
    }

    public final void h() {
        l82.y.i(this.f86823g, new w(), false, new q91.h(this, 22), 2);
    }
}
