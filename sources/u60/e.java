package u60;

import android.util.ArrayMap;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hh0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import java.util.List;
import kotlin.collections.c0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import qz.f0;
import x02.i2;

/* loaded from: classes5.dex */
public final class e extends com.pinterest.framework.multisection.datasource.pagedlist.c implements ar0.a {
    public final i2 L;
    public final com.pinterest.feature.board.detail.b M;
    public final boolean N;
    public final ArrayMap O;
    public final xj2.b P;
    public boolean Q;
    public int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String boardSessionId, i2 pinRepository, g0 pageSizeProvider, com.pinterest.feature.board.detail.b boardViewListener, yk1.v viewResources, String remoteUrl, x12.a pagedListService, nr0.l viewBinderDelegate, String str, wa2.i pinFeatureConfig, boolean z13) {
        super(remoteUrl, viewBinderDelegate, null, null, null, new ke0.a[]{gh0.b.R(), gh0.b.N()}, null, pagedListService, null, 0L, null, 7900);
        i2 i2Var;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(boardViewListener, "boardViewListener");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.L = pinRepository;
        this.M = boardViewListener;
        this.N = z13;
        this.O = new ArrayMap();
        xj2.b bVar = new xj2.b();
        this.P = bVar;
        this.R = pinRepository.t();
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.BOARD_DETAIL_PIN_FEED));
        f0Var.e("page_size", pageSizeProvider.d());
        if (str != null) {
            f0Var.e("request_params", str);
        }
        f0Var.e("image_header_links_count", "6");
        if (j1.U0(boardSessionId)) {
            i2Var = pinRepository;
            f0Var.e("board_session_id", boardSessionId);
        } else {
            i2Var = pinRepository;
        }
        this.f49121k = f0Var;
        o(RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE, new u42.c(viewResources));
        o(22788101, new v31.g());
        if (z13) {
            i13 = 0;
            mj0.j.a(this, pinFeatureConfig, new a(this, i13), true, null, null, 48);
            i14 = 1;
            bVar.a(nl.b.s(i2Var.E(this.R), new c(this, i13), new c(this, i14), null, 4));
        } else {
            i13 = 0;
            i14 = 1;
        }
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar = new qt.a(i14, d.f120764j);
        dVar.getClass();
        jk2.j1 j1Var = new jk2.j1(dVar, aVar, i13);
        qt.b bVar2 = new qt.b(i14, d.f120765k);
        int i15 = 2;
        jk2.x xVar = new jk2.x(new jk2.j1(pk2.f.j(j1Var, bVar2, 2, "filter(...)"), new ep.a(26, d.f120766l), i13), new com.pinterest.framework.multisection.datasource.pagedlist.h(10, new c(this, i15)), i15);
        Intrinsics.checkNotNullExpressionValue(xVar, "filter(...)");
        bVar.a(nl.b.s(xVar, new c(this, 3), null, null, 6));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.h0, nr0.a
    public final gb2.l[] E(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Object[] E = super.E(uid);
        Object obj = this.O.get(uid);
        if (obj != null) {
            if (E == null) {
                E = new gb2.l[]{obj};
            } else if (!c0.y(E, obj)) {
                E = z.t(E, obj);
            }
        }
        return (gb2.l[]) E;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, wk1.e
    public final void E2() {
        super.E2();
        this.Q = true;
    }

    @Override // ar0.a
    public final void S2(int i13, ar0.b clickableView) {
        Intrinsics.checkNotNullParameter(clickableView, "clickableView");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        if (itemsToSet.isEmpty() && this.f49127q.size() == 1 && (getItem(0) instanceof v31.f)) {
            return;
        }
        super.b0(itemsToSet, z13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        if (i13 == 166 || i13 == 22788101) {
            return true;
        }
        return this.E.f(i13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        dl1.s item = getItem(i13);
        if ((item instanceof f30) && this.N) {
            return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL;
        }
        if (item instanceof hh0) {
            return RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE;
        }
        if (item instanceof v31.f) {
            return 22788101;
        }
        return this.E.getItemViewType(i13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.h0, wk1.e
    public final void onUnbind() {
        this.Q = false;
        super.onUnbind();
    }
}
