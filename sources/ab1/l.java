package ab1;

import bb1.s;
import com.pinterest.api.model.wy0;
import fk2.x;
import kotlin.jvm.internal.Intrinsics;
import x02.x2;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class l extends t {

    /* renamed from: a, reason: collision with root package name */
    public final x2 f1725a;

    /* renamed from: b, reason: collision with root package name */
    public final cr1.a f1726b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1727c;

    /* renamed from: d, reason: collision with root package name */
    public wy0 f1728d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(uk1.d presenterPinalytics, uj2.q networkStateStream, x2 userRepository, cr1.a accountService, String str) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        this.f1725a = userRepository;
        this.f1726b = accountService;
        this.f1727c = str;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((s) ((ya1.d) getView())).f22556n0 = null;
        super.onUnbind();
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public final void r3(ya1.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        xj2.c F = this.f1725a.d0().P("me").H(tk2.e.f118017c).A(wj2.c.a()).F(new ta1.c(19, new y71.b(23, this, view)), new ta1.c(20, new q91.h(view, 28)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void q3() {
        wy0 wy0Var = this.f1728d;
        if (wy0Var == null) {
            Intrinsics.r("user");
            throw null;
        }
        String N2 = wy0Var.N2();
        if (N2 != null) {
            int i13 = 0;
            ek2.f i14 = new fk2.l(new x(this.f1726b.j(N2).l(tk2.e.f118017c).h(wj2.c.a()), new ta1.c(21, new k(this, i13)), ck2.i.f27924d, ck2.i.f27923c), new i(this, i13), 0).i(new j(this, N2, i13), new ta1.c(22, new k(this, 1)));
            Intrinsics.checkNotNullExpressionValue(i14, "subscribe(...)");
            addDisposable(i14);
        }
    }

    public final void r3(String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        int i13 = 1;
        ek2.f i14 = new fk2.l(new x(this.f1726b.f(password).l(tk2.e.f118017c).h(wj2.c.a()), new ta1.c(23, new k(this, 4)), ck2.i.f27924d, ck2.i.f27923c), new i(this, i13), 0).i(new j(this, password, i13), new ta1.c(24, new k(this, 5)));
        Intrinsics.checkNotNullExpressionValue(i14, "subscribe(...)");
        addDisposable(i14);
    }
}
