package com.pinterest.feature.todaytab.tab.view;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import so.oa;
import sq0.f0;
import we1.n1;
import x02.i2;
import x02.x2;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/pinterest/feature/todaytab/tab/view/k;", "Lwk1/k;", "Ldl1/s;", "", "Lnr0/j;", "<init>", "()V", "todayTab_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class k extends d<dl1.s> {
    public static final /* synthetic */ int X0 = 0;
    public i2 R0;
    public uk1.e S0;
    public nr0.m T0;
    public boolean U0;
    public final d4 V0 = d4.FEED;
    public final a4 W0 = a4.TODAY_TAB;

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER, new j(this, 1));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER, new j(this, 2));
        int[] iArr = n.f48737a;
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = iArr[i13];
            adapter.G(i14, new b2.t(this, i14, 10));
        }
        adapter.G(-2, new j(this, 3));
    }

    @Override // sq0.e
    public final tq0.b[] S8() {
        return new tq0.b[]{new tq0.c(pb0.g.f99432a, s7())};
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Bundle f49207c;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.S0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        i2 i2Var = this.R0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        Navigation navigation = this.I;
        Integer valueOf = navigation != null ? Integer.valueOf(navigation.J1("com.pinterest.EXTRA_TODAY_TAB_REFERRER")) : null;
        ScreenDescription screenDescription = this.f76937a;
        Integer valueOf2 = (screenDescription == null || (f49207c = screenDescription.getF49207c()) == null) ? null : Integer.valueOf(f49207c.getInt("com.pinterest.EXTRA_TODAY_TAB_REFERRER", c42.i.UNKNOWN.getValue()));
        Navigation navigation2 = this.I;
        this.U0 = navigation2 != null ? navigation2.S("com.pinterest.EXTRA_TODAY_TAB_FULL_SCREEN", false) : false;
        int intValue = valueOf != null ? valueOf.intValue() : valueOf2 != null ? valueOf2.intValue() : c42.i.UNKNOWN.getValue();
        boolean z13 = this.U0;
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        uk1.e eVar2 = this.S0;
        if (eVar2 == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar2).g();
        uj2.q p73 = p7();
        x2 A7 = A7();
        nr0.m mVar = this.T0;
        if (mVar != null) {
            return new dh1.f(a13, intValue, z13, aVar, g13, p73, A7, mVar, f7());
        }
        Intrinsics.r("dynamicgridviewbinderdelegateFactory");
        throw null;
    }

    @Override // sq0.e
    public final int X8() {
        return hf0.b.n() ? getResources().getDimensionPixelOffset(r0.margin_quadruple) * 3 : super.X8();
    }

    @Override // wk1.k, yq0.t
    /* renamed from: f9 */
    public final void y8(z adapter, f0 dataSourceProvider) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        super.y8(adapter, dataSourceProvider);
        wk1.i iVar = (wk1.i) dataSourceProvider;
        i iVar2 = new i(iVar, this, 2);
        i iVar3 = new i(iVar, this, 0);
        i iVar4 = new i(iVar, this, 1);
        a8(new eb2.d(iVar4, iVar2, iVar4, iVar3));
    }

    @Override // sq0.e, sq0.b0
    /* renamed from: getNumColumns */
    public final int getT0() {
        return hf0.b.q() ? 2 : 1;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF77583f1() {
        return this.W0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.V0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(n92.c.today_tab_loading_layout, n92.b.p_recycler_view);
        eVar.f979c = n92.b.empty_state_container;
        eVar.c(n92.b.today_tab_container);
        return eVar;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PinterestEmptyStateLayout pinterestEmptyStateLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.U0 || (pinterestEmptyStateLayout = this.f139733g0) == null) {
            return;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, requireContext, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = gestaltIconButton.getResources().getDimensionPixelSize(eo1.c.space_400);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        gestaltIconButton.setLayoutParams(layoutParams);
        gestaltIconButton.t(new n1(this, 15));
        gestaltIconButton.u(new ca1.h(this, 29));
        pinterestEmptyStateLayout.addView(gestaltIconButton);
    }
}
