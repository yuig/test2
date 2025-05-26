package s21;

import kotlin.jvm.internal.Intrinsics;
import ll.j;
import oa2.o;
import oa2.p;
import uj2.q;
import uk1.d;
import yk1.n;
import yk1.r;

/* loaded from: classes5.dex */
public final class c extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final p f110719a;

    /* renamed from: b, reason: collision with root package name */
    public final j f110720b;

    /* renamed from: c, reason: collision with root package name */
    public a f110721c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f110722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d pinalytics, q networkStateStream, p legoUserRepPresenterFactory) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        this.f110719a = legoUserRepPresenterFactory;
        this.f110720b = new j(16, 0);
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        r21.a view = (r21.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((t21.a) view).f115821c = this;
        q3(this.f110721c);
    }

    public final void q3(a aVar) {
        if (aVar == null || !isBound()) {
            return;
        }
        r21.a aVar2 = (r21.a) getView();
        o presenter = p.a(this.f110719a, getPresenterPinalytics(), null, null, null, null, null, b.f110718i, null, null, null, null, false, null, 65470);
        presenter.t3(aVar.f110716b);
        t21.a aVar3 = (t21.a) aVar2;
        aVar3.getClass();
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        yk1.j.a().d(aVar3.f115822d, presenter);
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        r21.a view = (r21.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((t21.a) view).f115821c = this;
        q3(this.f110721c);
    }
}
