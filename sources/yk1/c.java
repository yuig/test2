package yk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class c extends p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uk1.d presenterPinalytics, uj2.q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public void bindPinalytics(d view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // yk1.p
    public void unbindPinalytics() {
    }
}
