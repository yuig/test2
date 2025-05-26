package gq0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.design.widget.NestedScrollingViewGroup;
import com.pinterest.framework.screens.u;
import com.pinterest.ui.grid.PinterestRecyclerView;
import dl1.s;
import dq0.i;
import ek2.j;
import h32.d4;
import jk2.j1;
import jk2.x;
import kh2.k3;
import kl0.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.d0;
import qa2.n;
import sq0.f0;
import u81.o;
import wk1.k;
import y32.f;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgq0/d;", "Lwk1/k;", "Ldl1/s;", "Luk1/b;", "La41/b;", "<init>", "()V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class d extends k<s> implements uk1.b, a41.b {
    public static final /* synthetic */ int R0 = 0;
    public d0 M0;
    public f0 N0;
    public j P0;
    public String O0 = "";
    public final d4 Q0 = d4.USER;

    public static void h9(ViewGroup viewGroup, boolean z13) {
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            if (childAt instanceof PinterestSwipeRefreshLayout) {
                NestedScrollingViewGroup nestedScrollingViewGroup = childAt instanceof NestedScrollingViewGroup ? (NestedScrollingViewGroup) childAt : null;
                if (nestedScrollingViewGroup != null) {
                    nestedScrollingViewGroup.setNestedScrollingEnabled(z13);
                }
            }
            if (childAt instanceof ViewGroup) {
                h9((ViewGroup) childAt, z13);
            }
        }
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        super.L7();
    }

    @Override // sq0.e
    public n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        return new e(s7(), f.CLOSEUP_LONGPRESS, pinActionHandler).a(new yk1.a(getResources(), requireContext().getTheme()));
    }

    @Override // sq0.e
    public final int Y8() {
        return 0;
    }

    @Override // nl1.d
    public final boolean Z6() {
        return false;
    }

    @Override // wk1.k
    public final eb2.a d9(f0 dataSourceProvider, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        int i16 = i13 / 2;
        return new b(i16, i14, i16, i15);
    }

    @Override // wk1.k, yq0.t
    /* renamed from: f9 */
    public final void y8(z adapter, f0 dataSourceProvider) {
        wy0 f13;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        super.y8(adapter, dataSourceProvider);
        this.N0 = dataSourceProvider;
        if (!dl2.b.S1(com.bumptech.glide.d.Q(getActiveUserManager()), g9()) || (f13 = ((b60.d) getActiveUserManager()).f()) == null) {
            return;
        }
        Intrinsics.d(f13.u4(), Boolean.FALSE);
    }

    public final String g9() {
        if (this.O0.length() == 0) {
            this.O0 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_USER_ID", "");
        }
        return this.O0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x001d, code lost:
    
        if (r1 == r2.ordinal()) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @Override // sq0.e, sq0.b0
    /* renamed from: getNumColumns */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int getZ0() {
        /*
            r4 = this;
            b22.l r0 = b22.l.DEFAULT
            int r1 = r0.ordinal()
            b22.l r2 = b22.l.WIDE
            int r3 = r2.ordinal()
            if (r1 != r3) goto L10
        Le:
            r0 = r2
            goto L20
        L10:
            int r2 = r0.ordinal()
            if (r1 != r2) goto L17
            goto L20
        L17:
            b22.l r2 = b22.l.COMPACT
            int r3 = r2.ordinal()
            if (r1 != r3) goto L20
            goto Le
        L20:
            m60.d0 r1 = r4.M0
            if (r1 == 0) goto L48
            int[] r2 = gq0.a.f65973a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            if (r0 == r2) goto L41
            r2 = 2
            if (r0 == r2) goto L3e
            r2 = 3
            if (r0 != r2) goto L38
            m60.y r0 = m60.y.COMPACT
            goto L43
        L38:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L3e:
            m60.y r0 = m60.y.REGULAR
            goto L43
        L41:
            m60.y r0 = m60.y.WIDE
        L43:
            int r0 = r1.a(r0)
            return r0
        L48:
            java.lang.String r0 = "gridColumnCountProvider"
            kotlin.jvm.internal.Intrinsics.r(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gq0.d.getZ0():int");
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public d4 getR0() {
        return this.Q0;
    }

    @Override // sq0.e, nr0.c
    public final void m() {
        com.pinterest.framework.screens.s sVar = ((ku1.j) o7()).f80914l;
        r70.a aVar = sVar != null ? sVar.f49234i : null;
        Intrinsics.g(aVar, "null cannot be cast to non-null type com.pinterest.bottomNavBar.BottomNavBar");
        aVar.k(u.GO_TO_HOME_FEED_UPSELL);
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(xc0.f.fragment_user_library_pins, xc0.e.p_recycler_pins_view);
        eVar.f979c = xc0.e.empty_state_container;
        eVar.c(xc0.e.user_library_swipe_container);
        return eVar;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        j jVar = this.P0;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        super.onDestroy();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView g83 = g8();
        if (g83 != null) {
            k3.v((int) r70.b.f106349i.k0().b(), g83);
            f0 dataSourceProvider = this.N0;
            if (dataSourceProvider == null) {
                Intrinsics.r("dataSourceProvider");
                throw null;
            }
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            int F0 = dl2.b.F0(requireContext, eo1.a.item_horizontal_spacing);
            int Z8 = Z8();
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            int F02 = dl2.b.F0(requireContext2, eo1.a.item_vertical_spacing);
            Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
            eb2.c cVar = new eb2.c(d9(dataSourceProvider, F0, Z8, F02), new o(this, 1));
            PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
            if (pinterestRecyclerView != null) {
                pinterestRecyclerView.d(0);
            }
            a8(cVar);
        }
        W8().f103320a.f128803w = true ^ dl2.b.S1(com.bumptech.glide.d.Q(getActiveUserManager()), g9());
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar = new qt.a(10, c.f65974j);
        dVar.getClass();
        xj2.c F = new x(new j1(pk2.f.j(new j1(dVar, aVar, 0), new qt.b(10, c.f65975k), 2, "filter(...)"), new qk0.b(24, c.f65976l), 0), new bv0.k(11, c.f65977m), 2).F(new i(7, new t(this, 28)), new i(8, c.f65978n), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        this.P0 = (j) F;
    }

    @Override // sq0.e, np0.f
    public final void v4(String pinUid, PinFeed pinFeed, int i13, int i14, i01.e metadataProvider) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        super.v4(pinUid, pinFeed, i13, i14, metadataProvider);
        int p83 = p8() + i14;
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.i(p83, 0);
        }
    }
}
