package r02;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.m1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.base.LockableViewPager;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.settings.SettingsRoundHeaderView;
import ea1.u0;
import h32.d4;
import java.util.List;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr02/r;", "Lnl1/d;", "<init>", "()V", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class r extends c {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f105790l0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public wk2.a f105791c0;

    /* renamed from: d0, reason: collision with root package name */
    public b20.c f105792d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltTabLayout f105793e0;

    /* renamed from: f0, reason: collision with root package name */
    public LinearLayout f105794f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltText f105795g0;

    /* renamed from: h0, reason: collision with root package name */
    public List f105796h0 = kotlin.collections.q0.f80391a;

    /* renamed from: i0, reason: collision with root package name */
    public final m1 f105797i0;

    /* renamed from: j0, reason: collision with root package name */
    public final q f105798j0;

    /* renamed from: k0, reason: collision with root package name */
    public final d4 f105799k0;

    public r() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ax1.a(6, new ea1.t0(this, 29)));
        int i13 = 27;
        this.f105797i0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(s02.i.class), new u0(a13, 26), new ca1.m(a13, i13), new ca1.n(this, a13, i13));
        this.f105798j0 = new q(this);
        this.f105799k0 = d4.REPORTS_AND_VIOLATION_CENTER;
    }

    public final void Y7(int i13) {
        if (i13 > p02.a.values().length - 1) {
            vb0.j.f125466a.G(a.a.d("Unsupported tab index = ", i13), new Object[0]);
            return;
        }
        b20.c cVar = this.f105792d0;
        if (cVar == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        cVar.w(i13, true);
        GestaltTabLayout gestaltTabLayout = this.f105793e0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabBarNavigation");
            throw null;
        }
        ek.e n13 = gestaltTabLayout.n(i13);
        if (n13 != null) {
            n13.b();
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF104324b1() {
        return this.f105799k0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = h02.d.rvc_fragment;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        if (settingsRoundHeaderView != null) {
            settingsRoundHeaderView.g0(new m(this, 1));
            settingsRoundHeaderView.k0(c52.e.settings_main_reports_and_violations_center);
        }
        View findViewById = onCreateView.findViewById(h02.c.gt_description);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        String string = getResources().getString(h02.e.rvc_description, getResources().getString(h02.e.url_reports_violations_center));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        kg.t.m((GestaltText) findViewById, string, null);
        RelativeLayout relativeLayout = (RelativeLayout) onCreateView.findViewById(c52.c.bottom_sheet_view);
        if (relativeLayout != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(relativeLayout);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.widget.RelativeLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            relativeLayout.requestLayout();
        }
        View findViewById2 = onCreateView.findViewById(h02.c.content_pager_vw);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        LockableViewPager lockableViewPager = (LockableViewPager) findViewById2;
        b20.c cVar = new b20.c(lockableViewPager);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f105792d0 = cVar;
        wk2.a aVar = this.f105791c0;
        if (aVar != null) {
            lockableViewPager.z((xa.a) aVar.get());
            return onCreateView;
        }
        Intrinsics.r("adapterProvider");
        throw null;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f7().j(this.f105798j0);
        super.onDestroy();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(h02.c.gt_description);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = view.findViewById(h02.c.hub_pager_tabs);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltTabLayout gestaltTabLayout = (GestaltTabLayout) findViewById2;
        this.f105793e0 = gestaltTabLayout;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabBarNavigation");
            throw null;
        }
        for (p02.a aVar : p02.a.values()) {
            GestaltTabLayout gestaltTabLayout2 = this.f105793e0;
            if (gestaltTabLayout2 == null) {
                Intrinsics.r("tabBarNavigation");
                throw null;
            }
            String string = getResources().getString(aVar.getTitle());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            gestaltTabLayout2.c(kh2.b0.U(gestaltTabLayout2, string, aVar.getTabIndex(), 8));
        }
        GestaltTabLayout gestaltTabLayout3 = this.f105793e0;
        if (gestaltTabLayout3 == null) {
            Intrinsics.r("tabBarNavigation");
            throw null;
        }
        gestaltTabLayout3.b(new ek.i(this, 4));
        Y7(com.bumptech.glide.d.O(this, "com.pinterest.rvc_section", 0));
        b20.c cVar = this.f105792d0;
        if (cVar == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        cVar.y(new hz.l(this, 6));
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new p(this, null), 3);
        View findViewById3 = view.findViewById(h02.c.ll_account_header);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f105794f0 = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(h02.c.sp_account_selector);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f105795g0 = (GestaltText) findViewById4;
        ((GestaltText) view.findViewById(h02.c.gt_account_txt)).i(new ex1.n(this, 22));
        ((s02.i) this.f105797i0.getValue()).h();
        f7().h(this.f105798j0);
    }
}
