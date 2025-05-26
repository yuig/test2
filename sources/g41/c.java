package g41;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.v0;
import ar0.s;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.d0;
import m60.g0;
import m60.r0;
import m60.w;
import m60.y;
import nx.o0;
import sq0.c0;
import w01.e0;
import xk2.v;
import yq0.a0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg41/c;", "Lyq0/b0;", "Lyq0/a0;", "", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class c extends h<a0> implements c0 {
    public static final /* synthetic */ int J0 = 0;
    public uk1.e A0;
    public d0 B0;
    public pb0.d C0;
    public pb0.a D0;
    public o0 E0;
    public g70.h F0;
    public final v G0 = xk2.m.b(b.f63503i);
    public final d4 H0 = d4.USER;
    public final a4 I0 = a4.USER_FOLLOWING;

    /* renamed from: z0, reason: collision with root package name */
    public g0 f63504z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(43, new e0(this, 16));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_USER_ID", "");
        uj2.q p73 = p7();
        b60.b activeUserManager = getActiveUserManager();
        w f73 = f7();
        g0 g0Var = this.f63504z0;
        if (g0Var == null) {
            Intrinsics.r("pageSizeProvider");
            throw null;
        }
        uk1.e eVar = this.A0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        pb0.d dVar = this.C0;
        if (dVar == null) {
            Intrinsics.r("fuzzyDateFormatter");
            throw null;
        }
        g70.h hVar = this.F0;
        if (hVar != null) {
            return new e41.a(Z, p73, activeUserManager, f73, g0Var, g13, dVar, hVar);
        }
        Intrinsics.r("boardNavigator");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getS0() {
        return this.I0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getQ0() {
        return this.H0;
    }

    @Override // yq0.t
    public final v0 n8() {
        a aVar = new a(this, 0);
        getContext();
        d0 d0Var = this.B0;
        if (d0Var == null) {
            Intrinsics.r("gridColumnCountProvider");
            throw null;
        }
        PinterestGridLayoutManager pinterestGridLayoutManager = new PinterestGridLayoutManager(aVar, d0Var.a(y.REGULAR));
        pinterestGridLayoutManager.K = new ht0.p(this, pinterestGridLayoutManager, 2);
        return new v0(pinterestGridLayoutManager);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        boolean z13 = f13 != null && dl2.b.S1(f13, com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_USER_ID", ""));
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        LegoEmptyStateView legoEmptyStateView = new LegoEmptyStateView(requireContext);
        Resources resources = legoEmptyStateView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        legoEmptyStateView.setPaddingRelative(legoEmptyStateView.getPaddingStart(), bs1.c.U(r0.lego_empty_state_view_top_spacing, resources), legoEmptyStateView.getPaddingEnd(), legoEmptyStateView.getPaddingBottom());
        legoEmptyStateView.a();
        int i13 = z13 ? nz1.f.empty_my_followed_boards_message : nz1.f.empty_others_following_boards_message;
        Resources resources2 = legoEmptyStateView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        legoEmptyStateView.e(bs1.c.c2(i13, resources2));
        O8(legoEmptyStateView, 49);
        int Z = bs1.c.Z(view, eo1.c.lego_spacing_vertical_small);
        int Z2 = bs1.c.Z(view, eo1.c.space_100);
        a8(new eb2.d(jk.v.e0(Z2), null, jk.v.e0(Z2), jk.v.e0(Z), 2));
        view.setPaddingRelative(Z2, 0, Z2, 0);
        v vVar = this.G0;
        tq0.h hVar = (tq0.h) vVar.getValue();
        zy.m[] mVarArr = new zy.m[1];
        pb0.a aVar = this.D0;
        if (aVar == null) {
            Intrinsics.r("clock");
            throw null;
        }
        nx.d0 s73 = s7();
        o0 o0Var = this.E0;
        if (o0Var == null) {
            Intrinsics.r("pinalyticsManager");
            throw null;
        }
        mVarArr[0] = new tq0.c(aVar, s73, o0Var, null, null, 24);
        hVar.n(mVarArr);
        s sVar = (tq0.h) vVar.getValue();
        sVar.getClass();
        Intrinsics.checkNotNullParameter(this, "observable");
        addRecyclerViewEventListener(sVar);
    }
}
