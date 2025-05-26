package d51;

import kotlin.jvm.internal.Intrinsics;
import lh0.u2;

/* loaded from: classes5.dex */
public final class i extends l {
    public final String X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String userId, c51.e listener, g51.f environment, nr0.l viewBinderDelegate, boolean z13, boolean z14, u2 experiments, int i13) {
        super(userId, listener, environment, viewBinderDelegate, z13, z14, "users/me/boards/archived/", experiments, null, false, false, Integer.valueOf(i13), false, 5888);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.X = a.a.j("ARCHIVED_BOARDS_PAGED_LIST_CACHE_KEY-", userId);
    }

    @Override // d51.l, com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final boolean C() {
        return false;
    }

    @Override // d51.l, com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final boolean D() {
        return false;
    }

    @Override // d51.l, com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final String F() {
        return this.X;
    }
}
