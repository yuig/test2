package vt;

import kotlin.jvm.internal.Intrinsics;
import lu.s;
import tq.a0;

/* loaded from: classes3.dex */
public final class i extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public e f126600a;

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        clearDisposables();
        super.onUnbind();
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(ft.e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "presenter");
        ((s) view).f84936h = this;
        addDisposable(this.f126600a.f126582i.F(new st.c(17, new a0(view, 28)), new st.c(18, a.f126561t), ck2.i.f27923c, ck2.i.f27924d));
    }
}
