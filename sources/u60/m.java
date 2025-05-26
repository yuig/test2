package u60;

import android.util.ArrayMap;
import com.pinterest.api.model.hh0;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kh2.u2;
import kotlin.collections.c0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import nx.b0;
import x02.i2;
import z32.m0;

/* loaded from: classes5.dex */
public final class m extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    public final String L;
    public final String M;
    public final g0 N;
    public final i2 O;
    public final com.pinterest.feature.board.detail.b P;
    public final oj0.i Q;
    public final uk1.d R;
    public final oj0.h S;
    public final m60.w T;
    public final b0 U;
    public boolean V;
    public final ArrayMap W;
    public final xj2.b X;
    public int Y;
    public final xk2.v Z;

    /* renamed from: a0, reason: collision with root package name */
    public final xk2.v f120791a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(java.lang.String r29, java.lang.String r30, m60.g0 r31, x02.i2 r32, com.pinterest.feature.board.detail.b r33, oj0.i r34, yk1.v r35, java.lang.String r36, java.lang.String r37, nr0.l r38, uk1.d r39, oj0.h r40, m60.w r41, nx.b0 r42, zy.q0 r43, ku1.l r44) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u60.m.<init>(java.lang.String, java.lang.String, m60.g0, x02.i2, com.pinterest.feature.board.detail.b, oj0.i, yk1.v, java.lang.String, java.lang.String, nr0.l, uk1.d, oj0.h, m60.w, nx.b0, zy.q0, ku1.l):void");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.h0, nr0.a
    public final gb2.l[] E(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Object[] E = super.E(uid);
        Object obj = this.W.get(uid);
        if (obj != null) {
            if (E == null) {
                E = new gb2.l[]{obj};
            } else if (!c0.y(E, obj)) {
                E = z.t(E, obj);
            }
        }
        return (gb2.l[]) E;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        if (itemsToSet.isEmpty() && this.f49127q.size() == 1 && (getItem(0) instanceof v31.f)) {
            return;
        }
        if (this.S != null) {
            f0().c();
            this.V = false;
            this.Q.n1();
            u2.d1(this, f0(), this.L);
        }
        super.b0(itemsToSet, z13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        switch (i13) {
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
            case RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE /* 166 */:
            case 894721:
            case 894722:
            case 22788101:
                return true;
            default:
                return this.E.f(i13);
        }
    }

    public final oj0.f f0() {
        return (oj0.f) this.f120791a0.getValue();
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        m0 m0Var;
        dl1.s item = getItem(i13);
        boolean z13 = item instanceof vh;
        if (z13 && ((vh) item).f42868z == m0.NEW_IDEAS_PREVIEW_DETAILED) {
            return RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;
        }
        if (z13 && ((vh) item).f42868z == m0.NEW_IDEAS_PREVIEW_FOOTER) {
            return RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER;
        }
        if (z13) {
            vh vhVar = (vh) item;
            if (Intrinsics.d(vhVar.q(), "board_ideas_feed") && vhVar.f42868z == m0.NEW_IDEAS_FEED) {
                return RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
            }
        }
        if (z13 && ((vh) item).f42868z == m0.STYLE_SUMMARY_ENTRY_MODULE) {
            return 894721;
        }
        if (z13 && ((m0Var = ((vh) item).f42868z) == m0.SEE_IT_STYLED_MODULE || m0Var == m0.SHOP_YOUR_SAVES_MODULE)) {
            return 894722;
        }
        if (item instanceof hh0) {
            return RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE;
        }
        if (item instanceof v31.f) {
            return 22788101;
        }
        return this.E.getItemViewType(i13);
    }

    @Override // wt1.b
    public final boolean i() {
        return -1 == ((hl0.v) this.P).V;
    }
}
