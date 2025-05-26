package vq0;

import kotlin.jvm.internal.Intrinsics;
import sq0.c0;
import uj2.q;
import yk1.r;

/* loaded from: classes5.dex */
public abstract class d extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uk1.d pinalytics, q networkStateStream) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        c0 view = (c0) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        getPresenterPinalytics().c(view.getD0(), view.getC0(), null);
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
        getPresenterPinalytics().k();
    }
}
