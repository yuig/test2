package u60;

import android.util.ArrayMap;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hh0;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Iterator;
import java.util.List;
import kh2.u2;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import nx.b0;
import x02.i2;
import x02.x0;
import z32.m0;

/* loaded from: classes5.dex */
public final class s extends com.pinterest.framework.multisection.datasource.pagedlist.c implements ar0.a {
    public final String L;
    public final String M;
    public final int N;
    public final i2 O;
    public final x0 P;
    public final g0 Q;
    public final com.pinterest.feature.board.detail.b R;
    public final oj0.i S;
    public final m60.w T;
    public final com.pinterest.feature.board.organize.i U;
    public final oj0.h V;
    public final b0 W;
    public boolean X;
    public final ArrayMap Y;
    public final xj2.b Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f120802a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f120803b0;

    /* renamed from: c0, reason: collision with root package name */
    public final xk2.v f120804c0;

    /* renamed from: d0, reason: collision with root package name */
    public final xk2.v f120805d0;

    /* renamed from: e0, reason: collision with root package name */
    public final xk2.v f120806e0;

    /* renamed from: f0, reason: collision with root package name */
    public final r f120807f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(java.lang.String r30, java.lang.String r31, int r32, x02.i2 r33, x02.x0 r34, m60.g0 r35, com.pinterest.feature.board.detail.b r36, oj0.i r37, m60.w r38, yk1.v r39, java.lang.String r40, x12.a r41, nr0.l r42, java.lang.String r43, wa2.i r44, wa2.i r45, com.pinterest.feature.board.organize.i r46, oj0.h r47, nx.b0 r48) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u60.s.<init>(java.lang.String, java.lang.String, int, x02.i2, x02.x0, m60.g0, com.pinterest.feature.board.detail.b, oj0.i, m60.w, yk1.v, java.lang.String, x12.a, nr0.l, java.lang.String, wa2.i, wa2.i, com.pinterest.feature.board.organize.i, oj0.h, nx.b0):void");
    }

    public static final boolean f0(s sVar) {
        if (!sVar.h0()) {
            return false;
        }
        Object firstOrNull = CollectionsKt.firstOrNull(sVar.d());
        Boolean bool = null;
        vh vhVar = firstOrNull instanceof vh ? (vh) firstOrNull : null;
        if (vhVar != null) {
            bool = Boolean.valueOf(u2.H0(vhVar) && Intrinsics.d(vhVar.q(), "board_shop_tool_module"));
        }
        return com.bumptech.glide.d.o0(bool);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.h0, nr0.a
    public final gb2.l[] E(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Object[] E = super.E(uid);
        Object obj = this.Y.get(uid);
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
        this.f120803b0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
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
            if (r3 == 0) goto Lad
        L11:
            com.pinterest.feature.board.detail.b r3 = r7.R
            hl0.v r3 = (hl0.v) r3
            r3.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "grid_index"
            if (r2 == 0) goto L8b
            nx.d0 r9 = r3.getPinalytics()
            h32.u0 r2 = h32.u0.MORE_IDEAS_DETAIL_BUTTON
            h32.g0 r4 = h32.g0.DYNAMIC_GRID_STORY
            java.util.HashMap r5 = r3.z3()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r5.put(r0, r8)
            com.pinterest.api.model.v7 r8 = r3.K
            r0 = 0
            if (r8 == 0) goto L40
            java.lang.Integer r8 = r8.l1()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            goto L41
        L40:
            r8 = r0
        L41:
            java.lang.String r6 = "board_pin_count"
            bs1.c.G1(r6, r8, r5)
            com.pinterest.api.model.v7 r8 = r3.K
            if (r8 == 0) goto L53
            java.lang.Integer r8 = r8.q1()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            goto L54
        L53:
            r8 = r0
        L54:
            java.lang.String r6 = "board_section_count"
            bs1.c.G1(r6, r8, r5)
            kotlin.Unit r8 = kotlin.Unit.f80348a
            r9.h(r4, r2, r5)
            boolean r8 = r1 instanceof com.pinterest.api.model.vh
            if (r8 == 0) goto L65
            com.pinterest.api.model.vh r1 = (com.pinterest.api.model.vh) r1
            goto L66
        L65:
            r1 = r0
        L66:
            if (r1 == 0) goto L74
            java.lang.String r8 = r1.A
            if (r8 == 0) goto L74
            int r8 = java.lang.Integer.parseInt(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L74:
            if (r0 == 0) goto L85
            int r8 = r0.intValue()
            x22.a r9 = x22.c.Companion
            r9.getClass()
            x22.c r8 = x22.a.a(r8)
            if (r8 != 0) goto L87
        L85:
            x22.c r8 = x22.c.BOARD_FOOTER_STORY
        L87:
            r3.a4(r8)
            goto Lad
        L8b:
            boolean r9 = r9 instanceof com.pinterest.feature.board.detail.contenttab.view.BoardIdeasPreviewFooterView
            if (r9 == 0) goto Lad
            nx.d0 r9 = r3.getPinalytics()
            h32.u0 r1 = h32.u0.MORE_IDEAS_FOOTER_BUTTON
            h32.g0 r2 = h32.g0.DYNAMIC_GRID_STORY
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r4.put(r0, r8)
            kotlin.Unit r8 = kotlin.Unit.f80348a
            r9.h(r2, r1, r4)
            x22.c r8 = x22.c.BOARD_FOOTER_STORY
            r3.a4(r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u60.s.S2(int, ar0.b):void");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        if (itemsToSet.isEmpty() && this.f49127q.size() == 1 && (getItem(0) instanceof v31.f)) {
            return;
        }
        if (h0()) {
            xk2.v vVar = this.f120805d0;
            ((oj0.f) vVar.getValue()).c();
            ((oj0.g) this.f120806e0.getValue()).c();
            this.X = false;
            this.S.n1();
            u2.d1(this, (oj0.f) vVar.getValue(), this.L);
        }
        super.b0(itemsToSet, z13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        if (i13 == 124 || i13 == 125 || i13 == 166 || i13 == 894721 || i13 == 22788101) {
            return true;
        }
        return this.E.f(i13);
    }

    public final int g0(f30 f30Var) {
        Iterator it = d().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (Intrinsics.d(f30Var.getUid(), ((dl1.s) it.next()).getUid())) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        dl1.s item = getItem(i13);
        if (((rk0.j) this.U).G.inOrganize()) {
            if (item instanceof f30) {
                return 66;
            }
            if (item instanceof hh0) {
                return RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE;
            }
            return -1;
        }
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
        if (item instanceof hh0) {
            return RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE;
        }
        if (item instanceof v31.f) {
            return 22788101;
        }
        return this.E.getItemViewType(i13);
    }

    public final boolean h0() {
        return this.V != null;
    }

    @Override // wt1.b
    public final boolean i() {
        return i0();
    }

    public final boolean i0() {
        return this.N == ((hl0.v) this.R).V;
    }

    public final void j0(f30 f30Var) {
        Object obj;
        Object obj2;
        List list;
        Object obj3;
        if (h0()) {
            Iterator it = d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                dl1.s sVar = (dl1.s) obj;
                if ((sVar instanceof vh) && Intrinsics.d(((vh) sVar).q(), "board_shop_tool_module") && u2.H0(sVar)) {
                    break;
                }
            }
            vh vhVar = obj instanceof vh ? (vh) obj : null;
            if (vhVar == null || (list = vhVar.f42865w) == null) {
                obj2 = null;
            } else {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    dl1.s sVar2 = (dl1.s) obj3;
                    if (sVar2 instanceof f30) {
                        f30 f30Var2 = (f30) sVar2;
                        if (Intrinsics.d(f30Var.z4(), f30Var2.z4()) || Intrinsics.d(f30Var.getUid(), f30Var2.getUid())) {
                            break;
                        }
                    }
                }
                obj2 = (dl1.s) obj3;
            }
            f30 f30Var3 = obj2 instanceof f30 ? (f30) obj2 : null;
            if (f30Var3 != null) {
                ((oj0.f) this.f120805d0.getValue()).b(f30Var, f30Var3);
            }
        }
    }

    public final void k0(f30 f30Var, boolean z13) {
        int i13 = -1;
        if (this.N != -1) {
            return;
        }
        Iterator it = d().iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((dl1.s) it.next()) instanceof hh0) {
                i13 = i14;
                break;
            }
            i14++;
        }
        if (i13 >= 0) {
            removeItem(i13);
        }
        if (f30Var.j6() == null && z13) {
            int G = G();
            P(G >= 0 ? G : 0, f30Var);
        }
        ((hl0.v) this.R).I3();
        gb2.f fVar = gb2.f.f64747a;
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        gb2.f.c(new gb2.j(uid, String.valueOf(f30Var.z4())));
        j0(f30Var);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.h0, wk1.e
    public final void onUnbind() {
        this.f120803b0 = false;
        super.onUnbind();
    }
}
