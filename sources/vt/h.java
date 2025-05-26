package vt;

import kotlin.jvm.internal.Intrinsics;
import tq.a0;

/* loaded from: classes3.dex */
public final class h extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public e f126599a;

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(ft.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "presenter");
        ((lu.n) view).f84917g = this;
        addDisposable(this.f126599a.f126582i.F(new st.c(13, new a0(view, 27)), new st.c(14, a.f126560s), ck2.i.f27923c, ck2.i.f27924d));
    }
}
