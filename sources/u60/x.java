package u60;

import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.u0;
import java.util.List;
import kh2.u2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import nx.b0;
import nx.d0;
import x02.i2;
import x02.z0;

/* loaded from: classes5.dex */
public final class x extends com.pinterest.framework.multisection.datasource.pagedlist.c implements ar0.a {
    public final String L;
    public final String M;
    public final z0 N;
    public final com.pinterest.feature.board.detail.b O;
    public final oj0.i P;
    public final com.pinterest.feature.board.b Q;
    public final g0 R;
    public final m60.w S;
    public final d0 T;
    public final com.pinterest.feature.board.organize.i U;
    public final oj0.h V;
    public final i2 W;
    public final b0 X;
    public boolean Y;
    public final xj2.b Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f120814a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f120815b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f120816c0;

    /* renamed from: d0, reason: collision with root package name */
    public final xk2.v f120817d0;

    /* renamed from: e0, reason: collision with root package name */
    public final xk2.v f120818e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x(java.lang.String r54, java.lang.String r55, x02.z0 r56, com.pinterest.feature.board.detail.b r57, oj0.i r58, com.pinterest.feature.board.b r59, m60.g0 r60, m60.w r61, nx.d0 r62, java.lang.String r63, x12.a r64, nr0.l r65, com.pinterest.feature.board.organize.i r66, oj0.h r67, x02.i2 r68, nx.b0 r69, nr0.t r70, yk1.v r71, uk1.d r72) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u60.x.<init>(java.lang.String, java.lang.String, x02.z0, com.pinterest.feature.board.detail.b, oj0.i, com.pinterest.feature.board.b, m60.g0, m60.w, nx.d0, java.lang.String, x12.a, nr0.l, com.pinterest.feature.board.organize.i, oj0.h, x02.i2, nx.b0, nr0.t, yk1.v, uk1.d):void");
    }

    @Override // ar0.a
    public final void S2(int i13, ar0.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        sq0.o dataSourceAndLocalPositionFromGlobalPosition = ((hl0.v) this.O).getDataSourceAndLocalPositionFromGlobalPosition(i13);
        dl1.s item = getItem(dataSourceAndLocalPositionFromGlobalPosition != null ? dataSourceAndLocalPositionFromGlobalPosition.f115028b : -1);
        if (item == null) {
            return;
        }
        this.T.b0(u0.BOARD_SECTION, null, item.getUid(), false);
        NavigationImpl z03 = Navigation.z0((ScreenLocation) com.pinterest.screens.q.f51216f.getValue(), item.getUid());
        z03.m0("com.pinterest.EXTRA_BOARD_ID", this.L);
        this.S.d(z03);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        if (itemsToSet.isEmpty() && this.f49127q.size() == 1 && (getItem(0) instanceof v31.f)) {
            return;
        }
        if (f0()) {
            xk2.v vVar = this.f120817d0;
            ((oj0.f) vVar.getValue()).c();
            this.Y = false;
            this.P.n1();
            u2.d1(this, (oj0.f) vVar.getValue(), this.L);
        }
        super.b0(itemsToSet, z13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean e(int i13) {
        if (getItemViewType(i13) == -2) {
            return false;
        }
        return this.E.e(i13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        if (i13 == 30) {
            return true;
        }
        int i14 = t.f120808a[this.Q.h2().ordinal()];
        if (i14 == 1) {
            return true;
        }
        if (i14 == 2) {
            return false;
        }
        if (i14 == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean f0() {
        return this.V != null;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        boolean inOrganize = ((rk0.j) this.U).G.inOrganize();
        com.pinterest.feature.board.b bVar = this.Q;
        if (inOrganize) {
            if (getItem(i13) instanceof vh) {
                return -2;
            }
            int i14 = t.f120808a[bVar.h2().ordinal()];
            if (i14 == 1) {
                return 86753091;
            }
            if (i14 == 2) {
                return 86753092;
            }
            if (i14 == 3) {
                return 86753093;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (getItem(i13) instanceof vh) {
            return this.E.getItemViewType(i13);
        }
        int i15 = t.f120808a[bVar.h2().ordinal()];
        if (i15 == 1) {
            return 70;
        }
        if (i15 == 2) {
            return 71;
        }
        if (i15 == 3) {
            return 72;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean h(int i13) {
        if (getItemViewType(i13) == -2) {
            return false;
        }
        return this.E.h(i13);
    }

    @Override // wt1.b
    public final boolean i() {
        if (this.f120815b0) {
            this.f120815b0 = false;
            return true;
        }
        hl0.v vVar = (hl0.v) this.O;
        if (vVar.V == -1) {
            v7 v7Var = vVar.K;
            if (v7Var != null && !kh2.d.K(v7Var)) {
                return true;
            }
            v7 v7Var2 = vVar.K;
            if (com.bumptech.glide.d.o0(v7Var2 != null ? Boolean.valueOf(kh2.w.h0(v7Var2)) : null) && !vVar.f69527j) {
                return true;
            }
        }
        return false;
    }
}
