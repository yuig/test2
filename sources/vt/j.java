package vt;

import kotlin.jvm.internal.Intrinsics;
import lu.v;
import tq.a0;

/* loaded from: classes3.dex */
public final class j extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public e f126601a;

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        clearDisposables();
        super.onUnbind();
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(ft.f view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "presenter");
        ((v) view).f84958g = this;
        addDisposable(this.f126601a.f126582i.F(new st.c(19, new a0(view, 29)), new st.c(20, a.f126562u), ck2.i.f27923c, ck2.i.f27924d));
    }
}
