package y41;

import com.pinterest.feature.profile.recentpins.datasource.PinsFilter;
import com.pinterest.framework.multisection.datasource.pagedlist.c;
import gh0.b;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import nr0.l;
import qz.f0;
import wk1.e;

/* loaded from: classes5.dex */
public final class a extends c implements e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x41.a recentPinActionType, String remoteUrl, l viewBinderDelegate, g0 pageSizeProvider) {
        super(remoteUrl, viewBinderDelegate, null, null, null, new ke0.a[]{b.R()}, new PinsFilter(), null, null, 0L, null, 8092);
        Intrinsics.checkNotNullParameter(recentPinActionType, "recentPinActionType");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.BOARD_PIN_FEED));
        f0Var.e("page_size", pageSizeProvider.d());
        if (recentPinActionType == x41.a.RECENTLY_VIEWED) {
            f0Var.c(2, "feed_type");
        }
        this.f49121k = f0Var;
    }
}
