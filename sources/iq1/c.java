package iq1;

import ck2.i;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import dl1.l;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class c extends t {

    /* renamed from: a, reason: collision with root package name */
    public final dl1.t f73420a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73421b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f73422c;

    /* renamed from: d, reason: collision with root package name */
    public f30 f73423d;

    /* renamed from: e, reason: collision with root package name */
    public wy0 f73424e;

    /* renamed from: f, reason: collision with root package name */
    public wy0 f73425f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q networkStateStream, dl1.t pinRepository, uk1.d presenterPinalytics, String pinId) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f73420a = pinRepository;
        this.f73421b = pinId;
        this.f73422c = true;
    }

    @Override // yk1.b
    public final void onActivate() {
        addDisposable(((l) this.f73420a).L(this.f73421b).A(wj2.c.a()).F(new tp1.c(3, new a(this)), new tp1.c(4, b.f73416j), i.f27923c, i.f27924d));
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        gq1.a view = (gq1.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "presenter");
        ((jq1.c) view).f77469n0 = this;
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        gq1.a view = (gq1.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "presenter");
        ((jq1.c) view).f77469n0 = this;
    }
}
