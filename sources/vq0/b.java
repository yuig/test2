package vq0;

import kotlin.jvm.internal.Intrinsics;
import sq0.x;
import uj2.q;
import yk1.r;

/* loaded from: classes.dex */
public abstract class b extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(uk1.d pinalytics, q networkStateStream) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        x view = (x) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
    }
}
