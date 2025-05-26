package yt;

import ck2.i;
import kotlin.jvm.internal.Intrinsics;
import xj2.c;
import xt.f;
import yk1.n;

/* loaded from: classes3.dex */
public final class b extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final f f140132a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f showcaseManager) {
        super(0);
        Intrinsics.checkNotNullParameter(showcaseManager, "showcaseManager");
        this.f140132a = showcaseManager;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        xu.a view = (xu.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        Intrinsics.checkNotNullParameter(this, "presenter");
        c F = this.f140132a.f135875r.F(new st.c(27, new wt.c(view, 1)), new st.c(28, a.f140131i), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    @Override // yk1.b
    public final void onUnbind() {
        clearDisposables();
        super.onUnbind();
    }
}
