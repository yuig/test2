package el0;

import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.board.detail.moreboardsview.BoardMoreBoardsView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import g70.g;
import g70.h;
import h32.f1;
import h32.g0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.f0;
import kotlin.collections.u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import nm.u;
import nx.d0;
import pk.a0;
import sq0.e0;
import uj2.q;

/* loaded from: classes5.dex */
public final class c extends vq0.b {

    /* renamed from: c, reason: collision with root package name */
    public qk0.a f59562c;

    /* renamed from: d, reason: collision with root package name */
    public int f59563d;

    /* renamed from: e, reason: collision with root package name */
    public int f59564e;

    /* renamed from: f, reason: collision with root package name */
    public final c f59565f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uk1.d presenterPinalytics, q networkStateStream, b60.b activeUserManager, pb0.d fuzzyDateFormatter, h boardNavigator) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        wy0 f13 = ((b60.d) activeUserManager).f();
        ka2.a aVar = new ka2.a(null, false, false, null, true, false, true, true, null, false, false, false, false, false, 57135);
        d0 d0Var = presenterPinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.f126436a.j(43, new yo0.a(new g(boardNavigator, 2), b.f59561i, f13, fuzzyDateFormatter, new ka2.c(d0Var, g0.RECOMMENDED_BOARDS, new a(this, 0)), aVar, RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL));
        this.f59565f = this;
    }

    public final HashMap D3(Pair... pairArr) {
        HashMap o13 = bs1.c.o(new Pair("page_boards_count", String.valueOf(this.f59564e)));
        qk0.a aVar = this.f59562c;
        bs1.c.G1("source_board_id", aVar != null ? aVar.f104046c : null, o13);
        bs1.c.F1(o13, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        return o13;
    }

    public final HashMap F3(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Iterator it = d().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (Intrinsics.d(((v7) it.next()).getId(), boardId)) {
                break;
            }
            i13++;
        }
        Integer valueOf = Integer.valueOf(i13);
        if (i13 == -1) {
            valueOf = null;
        }
        return valueOf != null ? D3(new Pair("page_index", String.valueOf(valueOf.intValue() / 2))) : new HashMap();
    }

    public final String G3(int i13, int i14) {
        nm.q qVar = new nm.q();
        Iterator it = new IntRange(i13, i14, 1).iterator();
        while (it.hasNext()) {
            int b13 = ((u0) it).b();
            u uVar = new u();
            uVar.u("board_id", ((v7) d().get(b13)).getId());
            uVar.s(Integer.valueOf(b13 / 2), "page_index");
            qVar.t(uVar);
        }
        String sVar = qVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        return sVar;
    }

    public final void H3() {
        int i13 = this.f59563d * 2;
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : h32.u0.RECOMMENDED_BOARD_PAGE, (r18 & 4) != 0 ? null : g0.RECOMMENDED_BOARDS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : D3(new Pair("page_board_id_list", G3(i13, Math.min(i13 + 1, f0.i(d())))), new Pair("page_index", String.valueOf(this.f59563d))), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // vq0.g
    /* renamed from: I3, reason: merged with bridge method [inline-methods] */
    public final void r3(e eVar) {
        String name;
        super.r3(eVar);
        if (eVar != null) {
            ((BoardMoreBoardsView) eVar).f45236e.d(this.f59564e);
        }
        if (eVar != null) {
            ((BoardMoreBoardsView) eVar).getPinterestRecyclerView().f52535e.M0(this.f59563d * 2);
        }
        if (eVar != null) {
            ((BoardMoreBoardsView) eVar).f45236e.setVisibility(this.f59564e >= 2 ? 0 : 8);
        }
        qk0.a aVar = this.f59562c;
        if (aVar == null || (name = aVar.f104045b) == null || eVar == null) {
            return;
        }
        BoardMoreBoardsView boardMoreBoardsView = (BoardMoreBoardsView) eVar;
        Intrinsics.checkNotNullParameter(name, "name");
        String string = boardMoreBoardsView.getContext().getString(d70.g.board_more_boards_by_the_same_curator, name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(boardMoreBoardsView.f45237f, string);
    }

    public final void J3(int i13) {
        int t13 = ve.h.t(i13, 2);
        if (this.f59563d == t13) {
            return;
        }
        this.f59563d = t13;
        e eVar = (e) getView();
        if (eVar != null) {
            ((BoardMoreBoardsView) eVar).f45236e.e(this.f59563d);
        }
        H3();
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 43;
    }

    @Override // vq0.g
    public final e0 p3() {
        return this.f59565f;
    }
}
