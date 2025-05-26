package tn0;

import b22.f;
import bv0.k;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import com.pinterest.feature.board.organize.i;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import java.util.List;
import jk2.j1;
import jk2.x;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.w;
import nr0.l;
import nx.b0;
import oj0.g;
import oj0.h;
import qz.f0;
import rk0.j;
import uj2.q;
import x02.a2;
import x02.i2;
import x02.t0;
import x02.x0;
import xk2.m;
import xk2.v;
import z32.m0;

/* loaded from: classes5.dex */
public final class e extends com.pinterest.framework.multisection.datasource.pagedlist.c implements ar0.a {
    public final int L;
    public final String M;
    public final String N;
    public final i2 O;
    public final sn0.b P;
    public final i Q;
    public final w R;
    public final h S;
    public final b0 T;
    public final xj2.b U;
    public boolean V;
    public final v W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i13, String boardId, String boardSectionId, g0 pageSizeProvider, x0 boardRepository, i2 pinRepository, sn0.b boardSectionListener, String remoteUrl, x12.a pagedListService, l viewBinderDelegate, wa2.i pinFeatureConfig, wa2.i organizePinFeatureConfig, j organizeView, w eventManager, h hVar, b0 pinAuxHelper) {
        super(remoteUrl, viewBinderDelegate, null, null, null, new ke0.a[]{gh0.b.R(), gh0.b.N()}, null, pagedListService, null, 0L, null, 7900);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSectionId, "boardSectionId");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardSectionListener, "boardSectionListener");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(organizePinFeatureConfig, "organizePinFeatureConfig");
        Intrinsics.checkNotNullParameter(organizeView, "organizeView");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.L = i13;
        this.M = boardId;
        this.N = boardSectionId;
        this.O = pinRepository;
        this.P = boardSectionListener;
        this.Q = organizeView;
        this.R = eventManager;
        this.S = hVar;
        this.T = pinAuxHelper;
        xj2.b bVar = new xj2.b();
        this.U = bVar;
        int i14 = 1;
        v b13 = m.b(new b(this, i14));
        this.W = b13;
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.BOARD_SECTION_DETAIL_PIN_FEED));
        f0Var.e("page_size", pageSizeProvider.d());
        this.f49121k = f0Var;
        int i15 = 0;
        o(RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER, new pk0.b(0));
        o(RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED, new pk0.a(0, new b(this, i15)));
        o(66, new yi0.a(organizePinFeatureConfig, organizeView));
        x xVar = new x(pinRepository.B(), new k(4, new c(this, 8)), 2);
        xl0.a aVar = new xl0.a(28, new c(this, 9));
        xl0.a aVar2 = new xl0.a(29, d.f118604q);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        bVar.a(xVar.F(aVar, aVar2, cVar, a2Var));
        bVar.a(new x(boardRepository.k0(boardId, boardSectionId), new k(6, new c(this, i15)), 2).F(new a(2, new c(this, i14)), new a(3, d.f118597j), cVar, a2Var));
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSectionId, "boardSectionId");
        f fVar = new f(8, new uq.j(boardId, boardSectionId, 11));
        uk2.f fVar2 = boardRepository.O;
        fVar2.getClass();
        q i16 = new x(fVar2, fVar, 2).i(new f(15, new t0(boardRepository.f131526y, 3)));
        Intrinsics.checkNotNullExpressionValue(i16, "compose(...)");
        bVar.a(new x(i16, new k(7, new c(this, 4)), 2).F(new a(4, new c(this, 5)), new a(5, d.f118599l), cVar, a2Var));
        bVar.a(new x(pinRepository.z(), new k(5, new c(this, 2)), 2).F(new a(0, new c(this, 3)), new a(1, d.f118598k), cVar, a2Var));
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar3 = new qt.a(8, d.f118600m);
        dVar.getClass();
        bVar.a(new x(new j1(pk2.f.j(new j1(dVar, aVar3, 0), new qt.b(8, d.f118601n), 2, "filter(...)"), new qk0.b(4, d.f118602o), 0), new k(3, new c(this, 6)), 2).F(new xl0.a(26, new c(this, 7)), new xl0.a(27, d.f118603p), cVar, a2Var));
        int[] iArr = mj0.j.f87276a;
        mj0.j.a(this, pinFeatureConfig, (g) b13.getValue(), true, null, null, 48);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, wk1.e
    public final void E2() {
        super.E2();
        this.V = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (r8 == null) goto L27;
     */
    @Override // ar0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S2(int r8, ar0.b r9) {
        /*
            r7 = this;
            java.lang.String r0 = "clickableView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            dl1.s r1 = r7.getItem(r8)
            boolean r2 = r9 instanceof com.pinterest.feature.board.detail.contenttab.view.BoardIdeasPreviewDetailedView
            if (r2 != 0) goto L11
            boolean r3 = r9 instanceof com.pinterest.feature.board.detail.contenttab.view.BoardIdeasPreviewFooterView
            if (r3 == 0) goto Lbc
        L11:
            sn0.b r3 = r7.P
            un0.h r3 = (un0.h) r3
            r3.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "grid_index"
            if (r2 == 0) goto L9a
            nx.d0 r9 = r3.getPinalytics()
            h32.u0 r2 = h32.u0.MORE_IDEAS_DETAIL_BUTTON
            h32.g0 r4 = h32.g0.DYNAMIC_GRID_STORY
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r5.put(r0, r8)
            java.lang.String r8 = "board_id"
            java.lang.String r0 = r3.f122833a
            r5.put(r8, r0)
            java.lang.String r8 = "board_section_id"
            java.lang.String r0 = r3.f122834b
            r5.put(r8, r0)
            com.pinterest.api.model.v7 r8 = r3.f122857y
            r0 = 0
            if (r8 == 0) goto L4f
            java.lang.Integer r8 = r8.l1()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            goto L50
        L4f:
            r8 = r0
        L50:
            java.lang.String r6 = "board_pin_count"
            bs1.c.G1(r6, r8, r5)
            com.pinterest.api.model.ba r8 = r3.f122858z
            if (r8 == 0) goto L62
            java.lang.Integer r8 = r8.x()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            goto L63
        L62:
            r8 = r0
        L63:
            java.lang.String r6 = "board_section_pin_count"
            bs1.c.G1(r6, r8, r5)
            kotlin.Unit r8 = kotlin.Unit.f80348a
            r9.h(r4, r2, r5)
            boolean r8 = r1 instanceof com.pinterest.api.model.vh
            if (r8 == 0) goto L74
            com.pinterest.api.model.vh r1 = (com.pinterest.api.model.vh) r1
            goto L75
        L74:
            r1 = r0
        L75:
            if (r1 == 0) goto L83
            java.lang.String r8 = r1.A
            if (r8 == 0) goto L83
            int r8 = java.lang.Integer.parseInt(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L83:
            if (r0 == 0) goto L94
            int r8 = r0.intValue()
            x22.a r9 = x22.c.Companion
            r9.getClass()
            x22.c r8 = x22.a.a(r8)
            if (r8 != 0) goto L96
        L94:
            x22.c r8 = x22.c.SECTION_FOOTER_STORY
        L96:
            r3.I3(r8)
            goto Lbc
        L9a:
            boolean r9 = r9 instanceof com.pinterest.feature.board.detail.contenttab.view.BoardIdeasPreviewFooterView
            if (r9 == 0) goto Lbc
            nx.d0 r9 = r3.getPinalytics()
            h32.u0 r1 = h32.u0.MORE_IDEAS_FOOTER_BUTTON
            h32.g0 r2 = h32.g0.DYNAMIC_GRID_STORY
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r4.put(r0, r8)
            kotlin.Unit r8 = kotlin.Unit.f80348a
            r9.h(r2, r1, r4)
            x22.c r8 = x22.c.SECTION_FOOTER_STORY
            r3.I3(r8)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tn0.e.S2(int, ar0.b):void");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        if (itemsToSet.isEmpty() && this.f49127q.size() == 1 && (getItem(0) instanceof v31.f)) {
            return;
        }
        if (this.S != null) {
            ((g) this.W.getValue()).c();
        }
        super.b0(itemsToSet, z13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        if (i13 == 124 || i13 == 125) {
            return true;
        }
        return this.E.f(i13);
    }

    public final boolean f0() {
        return this.L == ((un0.h) this.P).C;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        s item = getItem(i13);
        if (((j) this.Q).G.inOrganize()) {
            return getItem(i13) instanceof f30 ? 66 : -1;
        }
        boolean z13 = item instanceof vh;
        if (z13 && ((vh) item).f42868z == m0.NEW_IDEAS_PREVIEW_DETAILED) {
            return RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;
        }
        if (z13) {
            vh vhVar = (vh) item;
            if (Intrinsics.d(vhVar.q(), "board_ideas_feed") && vhVar.f42868z == m0.NEW_IDEAS_FEED) {
                return RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
            }
        }
        return (z13 && ((vh) item).f42868z == m0.NEW_IDEAS_PREVIEW_FOOTER) ? RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER : this.E.getItemViewType(i13);
    }

    @Override // wt1.b
    public final boolean i() {
        return f0();
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.h0, wk1.e
    public final void onUnbind() {
        this.V = false;
        super.onUnbind();
    }
}
