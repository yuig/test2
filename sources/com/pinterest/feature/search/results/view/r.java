package com.pinterest.feature.search.results.view;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.unifiedproductfilters.errorstate.ShoppingFilterEmptyStateView;
import com.pinterest.ui.view.NoticesView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.u0;
import so.l6;
import so.m6;
import so.s8;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47825i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SearchGridMultiSectionFragment f47826j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(SearchGridMultiSectionFragment searchGridMultiSectionFragment, int i13) {
        super(0);
        this.f47825i = i13;
        this.f47826j = searchGridMultiSectionFragment;
    }

    public final mz.e b() {
        int i13 = this.f47825i;
        SearchGridMultiSectionFragment searchGridMultiSectionFragment = this.f47826j;
        switch (i13) {
            case 9:
                Context requireContext = searchGridMultiSectionFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                dz.a aVar = searchGridMultiSectionFragment.f47717l1;
                if (aVar == null) {
                    Intrinsics.r("anketViewPagerAdapter");
                    throw null;
                }
                cz.e eVar = searchGridMultiSectionFragment.f47719m1;
                if (eVar != null) {
                    return new mz.e(requireContext, aVar, eVar);
                }
                Intrinsics.r("anketManager");
                throw null;
            default:
                Context requireContext2 = searchGridMultiSectionFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                dz.a aVar2 = searchGridMultiSectionFragment.f47717l1;
                if (aVar2 == null) {
                    Intrinsics.r("anketViewPagerAdapter");
                    throw null;
                }
                cz.e eVar2 = searchGridMultiSectionFragment.f47719m1;
                if (eVar2 != null) {
                    return new mz.e(requireContext2, aVar2, eVar2);
                }
                Intrinsics.r("anketManager");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f47825i;
        SearchGridMultiSectionFragment searchGridMultiSectionFragment = this.f47826j;
        switch (i13) {
            case 0:
                return searchGridMultiSectionFragment.generateLoggingContext();
            case 1:
                ca2.e eVar = new ca2.e(true, null, u0.anim_speed_superfast, searchGridMultiSectionFragment.L1, null, 0, null, new bh.b(searchGridMultiSectionFragment.s7(), new r(searchGridMultiSectionFragment, 0)), false, false, 882);
                eVar.f27256o = true;
                return eVar;
            case 2:
                l11.f fVar = searchGridMultiSectionFragment.f47699b2;
                ky.d dVar = new ky.d(searchGridMultiSectionFragment.f7());
                m60.w f73 = searchGridMultiSectionFragment.f7();
                c71.b0 b0Var = searchGridMultiSectionFragment.P1;
                if (b0Var != null) {
                    return new pr0.g(fVar, dVar, searchGridMultiSectionFragment.f47742x2, f73, null, ey.x.class, b0Var.f26728a, null, null, 400);
                }
                Intrinsics.r("searchParameters");
                throw null;
            case 3:
                switch (i13) {
                    case 3:
                        return Boolean.valueOf(searchGridMultiSectionFragment.l9().h());
                    default:
                        return Boolean.valueOf(ph.a.w0(searchGridMultiSectionFragment.getActiveUserManager()));
                }
            case 4:
                switch (i13) {
                    case 3:
                        return Boolean.valueOf(searchGridMultiSectionFragment.l9().h());
                    default:
                        return Boolean.valueOf(ph.a.w0(searchGridMultiSectionFragment.getActiveUserManager()));
                }
            case 5:
                return new ky.a(searchGridMultiSectionFragment.f47728q2, searchGridMultiSectionFragment.f47730r2);
            case 6:
                Context requireContext = searchGridMultiSectionFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return ph.a.w(requireContext, searchGridMultiSectionFragment.f7());
            case 7:
                Context requireContext2 = searchGridMultiSectionFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                m60.w f74 = searchGridMultiSectionFragment.f7();
                yk1.j jVar = searchGridMultiSectionFragment.f47705f1;
                if (jVar == null) {
                    Intrinsics.r("mvpBinder");
                    throw null;
                }
                nx.f0 f0Var = searchGridMultiSectionFragment.Y0;
                if (f0Var != null) {
                    return new d0(requireContext2, f74, jVar, f0Var, searchGridMultiSectionFragment.A7());
                }
                Intrinsics.r("pinalyticsFactory");
                throw null;
            case 8:
                Context requireContext3 = searchGridMultiSectionFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner = searchGridMultiSectionFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
                yk1.j jVar2 = searchGridMultiSectionFragment.f47705f1;
                if (jVar2 == null) {
                    Intrinsics.r("mvpBinder");
                    throw null;
                }
                c71.b0 b0Var2 = searchGridMultiSectionFragment.P1;
                if (b0Var2 == null) {
                    Intrinsics.r("searchParameters");
                    throw null;
                }
                String str = b0Var2.f26738j;
                if (str == null) {
                    str = "";
                }
                nx.f0 f0Var2 = searchGridMultiSectionFragment.Y0;
                if (f0Var2 != null) {
                    return new com.pinterest.feature.todaytab.articlefeed.o(requireContext3, S, jVar2, new n70.o(f0Var2, str), searchGridMultiSectionFragment.p7(), searchGridMultiSectionFragment.f7(), searchGridMultiSectionFragment.A7());
                }
                Intrinsics.r("pinalyticsFactory");
                throw null;
            case 9:
                return b();
            case 10:
                return b();
            case 11:
                Context requireContext4 = searchGridMultiSectionFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                return new ye1.s(requireContext4);
            case 12:
                Context requireContext5 = searchGridMultiSectionFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                return new ye1.l(requireContext5);
            case 13:
                Context requireContext6 = searchGridMultiSectionFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
                return new ye1.v(requireContext6);
            case 14:
                l6 l6Var = searchGridMultiSectionFragment.f47727q1;
                if (l6Var == null) {
                    Intrinsics.r("seeItStyledModuleCarouselViewFactory");
                    throw null;
                }
                Context requireContext7 = searchGridMultiSectionFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext7, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner2 = searchGridMultiSectionFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                androidx.lifecycle.u S2 = bf.b.S(viewLifecycleOwner2);
                nx.d0 s73 = searchGridMultiSectionFragment.s7();
                int i14 = f62.d.see_it_styled_search_carousel_layout;
                s8 s8Var = l6Var.f113534a.f114091b;
                yw0.e eVar2 = new yw0.e(requireContext7, S2, s73, i14, (m6) s8Var.f114243c2.get());
                eVar2.f140279g = s8Var.F6();
                return eVar2;
            case 15:
                Context requireContext8 = searchGridMultiSectionFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext8, "requireContext(...)");
                return new ShoppingFilterEmptyStateView(requireContext8);
            case 16:
                NoticesView noticesView = new NoticesView(6, searchGridMultiSectionFragment.getContext(), (AttributeSet) null);
                noticesView.setId(k42.d.search_err_notice_view);
                return noticesView;
            case 17:
                String str2 = searchGridMultiSectionFragment.T1;
                c71.b0 b0Var3 = searchGridMultiSectionFragment.P1;
                if (b0Var3 == null) {
                    Intrinsics.r("searchParameters");
                    throw null;
                }
                String str3 = searchGridMultiSectionFragment.F2;
                nx.f0 f0Var3 = searchGridMultiSectionFragment.Y0;
                if (f0Var3 != null) {
                    return new i61.a(str2, b0Var3, str3, f0Var3);
                }
                Intrinsics.r("pinalyticsFactory");
                throw null;
            default:
                int i15 = SearchGridMultiSectionFragment.O2;
                searchGridMultiSectionFragment.o9("navigation");
                return Unit.f80348a;
        }
    }
}
