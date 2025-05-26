package ab1;

import com.pinterest.error.NetworkResponseError;
import fk2.x;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import v.f1;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class f extends t {

    /* renamed from: a, reason: collision with root package name */
    public final String f1709a;

    /* renamed from: b, reason: collision with root package name */
    public final cr1.a f1710b;

    /* renamed from: c, reason: collision with root package name */
    public final w f1711c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w eventManager, uk1.d presenterPinalytics, cr1.a accountService, uj2.q networkStateStream, String verifiedPassword, String str) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(verifiedPassword, "verifiedPassword");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f1709a = verifiedPassword;
        this.f1710b = accountService;
        this.f1711c = eventManager;
        this.f1712d = str;
    }

    public static final void p3(f fVar, Throwable th3) {
        f1 f1Var;
        qz.d M;
        ya1.b bVar = (ya1.b) fVar.getView();
        NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
        String str = (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || (M = k3.M(f1Var)) == null) ? null : M.f105384d;
        bb1.l lVar = (bb1.l) bVar;
        i92.k kVar = lVar.f22523l0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        if (str == null) {
            str = lVar.getString(x0.generic_error);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        kVar.i(str);
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        ya1.b view = (ya1.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((bb1.l) view).f22525n0 = this;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((bb1.l) ((ya1.b) getView())).f22525n0 = null;
        super.onUnbind();
    }

    public final void q3() {
        int i13 = 0;
        fk2.l lVar = new fk2.l(new x(this.f1710b.h().l(tk2.e.f118017c).h(wj2.c.a()), new ta1.c(12, new e(this, i13)), ck2.i.f27924d, ck2.i.f27923c), new d(this, i13), 0);
        int i14 = 1;
        ek2.f i15 = lVar.i(new d(this, i14), new ta1.c(13, new e(this, i14)));
        Intrinsics.checkNotNullExpressionValue(i15, "subscribe(...)");
        addDisposable(i15);
    }

    public final void r3(String verificationCode) {
        Intrinsics.checkNotNullParameter(verificationCode, "verificationCode");
        int i13 = 2;
        fk2.l lVar = new fk2.l(new x(this.f1710b.t(this.f1709a, verificationCode, this.f1712d).l(tk2.e.f118017c).h(wj2.c.a()), new ta1.c(14, new e(this, i13)), ck2.i.f27924d, ck2.i.f27923c), new d(this, i13), 0);
        int i14 = 3;
        ek2.f i15 = lVar.i(new d(this, i14), new ta1.c(15, new e(this, i14)));
        Intrinsics.checkNotNullExpressionValue(i15, "subscribe(...)");
        addDisposable(i15);
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        ya1.b view = (ya1.b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((bb1.l) view).f22525n0 = this;
    }
}
