package p91;

import h32.f1;
import h32.u0;
import jk2.j1;
import kotlin.jvm.internal.Intrinsics;
import x02.x2;
import x81.h0;

/* loaded from: classes5.dex */
public final class f extends yk1.t {

    /* renamed from: a, reason: collision with root package name */
    public final x10.d f99280a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f99281b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f99282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(uk1.e presenterPinalyticsFactory, uj2.q networkStateStream, x10.d settingsApi, x2 userRepository, b60.b activeUserManager) {
        super(((uk1.a) presenterPinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f99280a = settingsApi;
        this.f99281b = userRepository;
        this.f99282c = activeUserManager;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        l91.b view = (l91.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((k91.e) view).f78826n0 = this;
    }

    public final void p3() {
        getPinalytics().N(f1.TAP, u0.CREATE_BUTTON, null, null, false);
        uj2.b e13 = this.f99280a.f131564a.e();
        x2 e03 = this.f99281b.e0();
        String uid = com.bumptech.glide.d.Q(this.f99282c).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        uj2.q Q = e03.Q(uid);
        e13.getClass();
        j1 j1Var = new j1(new ik2.b(0, e13, Q), new t81.a(12, new e(this, 0)), 0);
        h0 h0Var = new h0(20, new e(this, 1));
        ck2.c cVar = ck2.i.f27923c;
        xj2.c F = new jk2.x(new jk2.v(j1Var, h0Var, cVar, 1), new g51.h(this, 1), 1).H(tk2.e.f118017c).A(wj2.c.a()).F(new h0(21, new e(this, 2)), new h0(22, new e(this, 3)), cVar, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        l91.b view = (l91.b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((k91.e) view).f78826n0 = this;
    }
}
