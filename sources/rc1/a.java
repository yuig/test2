package rc1;

import b60.b;
import com.pinterest.api.model.wy0;
import g51.h;
import kc1.w;
import kotlin.jvm.internal.Intrinsics;
import tk2.e;
import uj2.q;
import uk1.d;
import wj2.c;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class a extends t {

    /* renamed from: a, reason: collision with root package name */
    public final cr1.a f107492a;

    /* renamed from: b, reason: collision with root package name */
    public final b f107493b;

    /* renamed from: c, reason: collision with root package name */
    public final int f107494c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d pinalytics, q networkStateStream, cr1.a accountService, b activeUserManager) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f107492a = accountService;
        this.f107493b = activeUserManager;
        this.f107494c = 422;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        qc1.a view = (qc1.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((sc1.b) view).f112297m0 = this;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((sc1.b) ((qc1.a) getView())).f112297m0 = null;
        super.onUnbind();
    }

    public final void p3() {
        wy0 f13 = ((b60.d) this.f107493b).f();
        if (f13 != null) {
            String uid = f13.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            addDisposable(this.f107492a.z(uid).l(e.f118017c).h(c.a()).i(new h(this, 11), new ec1.a(11, new w(this, 7))));
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        qc1.a view = (qc1.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((sc1.b) view).f112297m0 = this;
    }
}
