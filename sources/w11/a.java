package w11;

import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import kotlin.jvm.internal.Intrinsics;
import n00.c;
import ni0.f;
import qz.f0;
import uj2.q;
import uk1.d;

/* loaded from: classes5.dex */
public final class a extends h0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String boardUid, b listener, q networkStateStream, d presenterPinalytics) {
        super(a.a.p(new StringBuilder("board/"), boardUid, "/sections/all/"), new ke0.a[]{gh0.b.L()}, null, null, null, null, null, null, 0L, 2044);
        Intrinsics.checkNotNullParameter(boardUid, "boardUid");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(c.BOARD_SECTION_SUMMARY));
        this.f49121k = f0Var;
        o(0, new f(listener, networkStateStream, presenterPinalytics));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 0;
    }
}
