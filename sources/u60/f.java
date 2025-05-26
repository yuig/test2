package u60;

import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import qz.f0;

/* loaded from: classes5.dex */
public final class f extends com.pinterest.framework.multisection.datasource.pagedlist.c implements ar0.a {
    public final com.pinterest.feature.board.detail.b L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g0 pageSizeProvider, com.pinterest.feature.board.detail.b boardViewListener, String remoteUrl, x12.a pagedListService, nr0.l viewBinderDelegate) {
        super(remoteUrl, viewBinderDelegate, null, null, null, new ke0.a[]{gh0.b.R(), gh0.b.N()}, null, pagedListService, null, 0L, null, 7900);
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(boardViewListener, "boardViewListener");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        this.L = boardViewListener;
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.BOARD_DETAIL_PIN_FEED));
        f0Var.e("page_size", pageSizeProvider.d());
        this.f49121k = f0Var;
        o(52, new ep.c(18));
    }

    @Override // ar0.a
    public final void S2(int i13, ar0.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        if (i13 == 52) {
            return true;
        }
        return this.E.f(i13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        dl1.s item = getItem(i13);
        if ((item instanceof vh) && Intrinsics.d(((vh) item).q(), "board_expanded_section_title")) {
            return 52;
        }
        return this.E.getItemViewType(i13);
    }

    @Override // wt1.b
    public final boolean i() {
        hl0.v vVar = (hl0.v) this.L;
        if (vVar.H3() && vVar.V == -1) {
            v7 v7Var = vVar.K;
            if (com.bumptech.glide.d.o0(v7Var != null ? Boolean.valueOf(kh2.d.K(v7Var)) : null)) {
                v7 v7Var2 = vVar.K;
                if (!com.bumptech.glide.d.o0(v7Var2 != null ? Boolean.valueOf(kh2.w.h0(v7Var2)) : null) || vVar.f69527j) {
                    return true;
                }
            }
        }
        return false;
    }
}
