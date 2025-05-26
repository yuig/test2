package x91;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.a4;
import h32.d4;
import kh2.a1;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx91/s;", "Lo82/i3;", "<init>", "()V", "permissions_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class s extends m0 {
    public static final /* synthetic */ int L0 = 0;
    public final m1 F0;
    public SettingsRoundHeaderView G0;
    public GestaltSearchField H0;
    public final xk2.v I0;
    public final d4 J0;
    public final a4 K0;

    public s() {
        int i13 = 25;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(29, new kl0.w(this, i13)));
        int i14 = 26;
        this.F0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(l0.class), new ml0.v(a13, i13), new kl0.x(null, a13, i14), new kl0.y(this, a13, i14));
        this.I0 = xk2.m.b(new m(this, 0));
        this.J0 = d4.USER;
        this.K0 = a4.UNBLOCKING_SETTINGS;
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void L7() {
        hf0.b.k(getView());
        super.L7();
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new w41.g0(b9().a(), 2);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new tx0.j(b9().c(), 20);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        u uVar = new u();
        mj.m mVar = new mj.m(21);
        b3.G(adapter, 100, new m(this, 1), uVar, new com.pinterest.boardAutoCollages.l(this, 4), mVar, null, 96);
    }

    public final l0 b9() {
        return (l0) this.F0.getValue();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF15520d1() {
        return this.K0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF15519c1() {
        return this.J0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(g52.b.fragment_blocked_accounts, g52.a.p_recycler_view);
        eVar.f979c = g52.a.empty_state_container;
        return eVar;
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(g52.a.header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.G0 = (SettingsRoundHeaderView) findViewById;
        View findViewById2 = v13.findViewById(g52.a.search_field);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.H0 = (GestaltSearchField) findViewById2;
        SettingsRoundHeaderView settingsRoundHeaderView = this.G0;
        if (settingsRoundHeaderView == null) {
            Intrinsics.r("headerView");
            throw null;
        }
        settingsRoundHeaderView.g0(new k(this, 0));
        settingsRoundHeaderView.k0(c52.e.blocked_accounts_page_title);
        GestaltSearchField gestaltSearchField = this.H0;
        if (gestaltSearchField == null) {
            Intrinsics.r("searchField");
            throw null;
        }
        gestaltSearchField.g0(new l11.p(this, 28));
        RecyclerView g83 = g8();
        if (g83 != null) {
            k3.v((int) r70.b.f106349i.k0().b(), g83);
        }
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new q(this, null), 3);
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.h((GestaltText) this.I0.getValue(), 17);
        }
        View findViewById3 = v13.findViewById(g52.a.description);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        String string = requireContext().getString(c52.e.block_or_unblock_someone_url);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = requireContext().getString(c52.e.blocked_accounts_page_subtitle, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        kg.t.m((GestaltText) findViewById3, string2, new y71.b(7, this, string));
        RelativeLayout relativeLayout = (RelativeLayout) v13.findViewById(g52.a.bottom_sheet_view);
        if (relativeLayout != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(relativeLayout);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.widget.RelativeLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.g0();
            lockableBottomSheetBehavior.X(3);
            relativeLayout.requestLayout();
        }
    }
}
