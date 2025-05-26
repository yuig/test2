package oq1;

import ck2.i;
import i92.k;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import x02.i2;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class h extends t {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f97242a;

    /* renamed from: b, reason: collision with root package name */
    public final k f97243b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(uk1.d presenterPinalytics, i2 pinRepository, q networkStateStream, k toastUtils) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f97242a = pinRepository;
        this.f97243b = toastUtils;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        b view = (b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "viewListener");
        ((e) view).f97236s0 = this;
    }

    public final void p3(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        addDisposable(this.f97242a.P(pinId).F(new tp1.c(9, new g(this, 0)), new tp1.c(10, new g(this, 1)), i.f27923c, i.f27924d));
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        b view = (b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "viewListener");
        ((e) view).f97236s0 = this;
    }
}
