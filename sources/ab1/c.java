package ab1;

import com.pinterest.api.model.wy0;
import com.pinterest.error.NetworkResponseError;
import fk2.x;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import v.f1;
import x02.x2;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class c extends t {

    /* renamed from: a, reason: collision with root package name */
    public final x2 f1701a;

    /* renamed from: b, reason: collision with root package name */
    public final cr1.a f1702b;

    /* renamed from: c, reason: collision with root package name */
    public final w f1703c;

    /* renamed from: d, reason: collision with root package name */
    public wy0 f1704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uk1.d presenterPinalytics, uj2.q networkStateStateStream, x2 userRepository, cr1.a accountService, w eventManager) {
        super(presenterPinalytics, networkStateStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStateStream, "networkStateStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f1701a = userRepository;
        this.f1702b = accountService;
        this.f1703c = eventManager;
    }

    public static final void p3(c cVar, Throwable th3) {
        f1 f1Var;
        cVar.getClass();
        NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
        qz.d M = (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null) ? null : k3.M(f1Var);
        ya1.a aVar = (ya1.a) cVar.getView();
        String e13 = M != null ? M.e() : null;
        bb1.i iVar = (bb1.i) aVar;
        i92.k kVar = iVar.f22511l0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        if (e13 == null) {
            e13 = iVar.getString(x0.generic_error);
            Intrinsics.checkNotNullExpressionValue(e13, "getString(...)");
        }
        kVar.i(e13);
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((bb1.i) ((ya1.a) getView())).f22512m0 = null;
        super.onUnbind();
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(ya1.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        xj2.c F = this.f1701a.P("me").H(tk2.e.f118017c).A(wj2.c.a()).F(new ta1.c(6, new y71.b(22, this, view)), new ta1.c(7, new b(this, 0)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void r3(boolean z13) {
        wy0 wy0Var = this.f1704d;
        if (wy0Var == null) {
            Intrinsics.r("user");
            throw null;
        }
        String N2 = wy0Var.N2();
        if (N2 == null) {
            N2 = "";
        }
        int i13 = 2;
        ek2.f i14 = new fk2.l(new x(this.f1702b.j(N2).l(tk2.e.f118017c).h(wj2.c.a()), new ta1.c(8, new b(this, 1)), ck2.i.f27924d, ck2.i.f27923c), new a(this, 0), 0).i(new w01.n(this, z13, i13), new ta1.c(9, new b(this, i13)));
        Intrinsics.checkNotNullExpressionValue(i14, "subscribe(...)");
        addDisposable(i14);
    }

    public final void s3(String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        ek2.f i13 = new fk2.l(new x(this.f1702b.o(password).l(tk2.e.f118017c).h(wj2.c.a()), new ta1.c(10, new b(this, 3)), ck2.i.f27924d, ck2.i.f27923c), new a(this, 1), 0).i(new a(this, 2), new ta1.c(11, new b(this, 4)));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        addDisposable(i13);
    }
}
