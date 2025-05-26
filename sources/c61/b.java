package c61;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.style.spotlight.view.SearchTypeaheadTodayArticleCellContainer;
import com.pinterest.gestalt.text.GestaltText;
import ey.c3;
import h32.d4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.e3;
import lh0.z3;
import we1.d2;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26519i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f26520j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(i iVar, int i13) {
        super(0);
        this.f26519i = i13;
        this.f26520j = iVar;
    }

    public final View b() {
        AttributeSet attributeSet = null;
        int i13 = this.f26519i;
        i iVar = this.f26520j;
        switch (i13) {
            case 1:
                Context requireContext = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                d61.b bVar = new d61.b(requireContext);
                if (iVar.f26568c1) {
                    bVar.setPaddingRelative(0, 0, 0, 0);
                    kg.t.O(bVar.f53745i);
                    ViewGroup.LayoutParams layoutParams = bVar.f53744h.getLayoutParams();
                    Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bVar.getResources().getDimensionPixelSize(eo1.c.space_200);
                    d61.a aVar = d61.a.f53739i;
                    GestaltText gestaltText = bVar.f53743g;
                    gestaltText.i(aVar);
                    ViewGroup.LayoutParams layoutParams2 = gestaltText.getLayoutParams();
                    Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = bVar.getResources().getDimensionPixelSize(eo1.c.space_100);
                    ViewGroup.LayoutParams layoutParams3 = bVar.f53747k.getLayoutParams();
                    Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams3).setMarginStart(bVar.getResources().getDimensionPixelSize(j42.a.unified_bundle_spacing));
                    ViewGroup.LayoutParams layoutParams4 = bVar.f53748l.getLayoutParams();
                    Intrinsics.g(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams4).setMarginStart(bVar.getResources().getDimensionPixelSize(j42.a.unified_bundle_spacing));
                    ViewGroup.LayoutParams layoutParams5 = bVar.f53749m.getLayoutParams();
                    Intrinsics.g(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams5).setMarginStart(bVar.getResources().getDimensionPixelSize(j42.a.unified_bundle_spacing));
                }
                return bVar;
            case 2:
                Context requireContext2 = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner = iVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                d2 d2Var = new d2(requireContext2, bf.b.S(viewLifecycleOwner));
                d2Var.setId(m60.t0.search_landing_bundle);
                return d2Var;
            case 3:
                Context requireContext3 = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner2 = iVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                return new d2(requireContext3, bf.b.S(viewLifecycleOwner2));
            case 4:
                Context requireContext4 = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner3 = iVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                return new d2(requireContext4, bf.b.S(viewLifecycleOwner3));
            case 5:
                Context requireContext5 = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner4 = iVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                return new d2(requireContext5, bf.b.S(viewLifecycleOwner4));
            case 6:
                Context requireContext6 = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
                return new xo0.g(requireContext6);
            case 7:
                Context requireContext7 = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext7, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner5 = iVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
                return new d2(requireContext7, bf.b.S(viewLifecycleOwner5));
            case 8:
                Context requireContext8 = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext8, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner6 = iVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
                return new d2(requireContext8, bf.b.S(viewLifecycleOwner6));
            case 9:
            default:
                Context requireContext9 = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext9, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner7 = iVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
                d61.e eVar = new d61.e(requireContext9, iVar.s7(), bf.b.S(viewLifecycleOwner7));
                eVar.f45880g.f45859n = eVar.getResources().getInteger(m60.u0.default_num_pins_on_screen);
                return eVar;
            case 10:
                Context requireContext10 = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext10, "requireContext(...)");
                uk1.e eVar2 = iVar.F0;
                if (eVar2 != null) {
                    return new wg1.r(requireContext10, ((uk1.a) eVar2).f(iVar.s7(), ""), new b(iVar, 9));
                }
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            case 11:
                Context requireContext11 = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext11, "requireContext(...)");
                return new SearchTypeaheadTodayArticleCellContainer(6, requireContext11, attributeSet);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z13;
        int i13 = this.f26519i;
        i iVar = this.f26520j;
        switch (i13) {
            case 0:
                rg0.s sVar = iVar.Z0;
                if (sVar == null) {
                    Intrinsics.r("experiences");
                    throw null;
                }
                if (((dh0.d) sVar).b(i32.y0.ANDROID_SEARCH_TAB_LANDING_TAKEOVER) != null) {
                    e3 e3Var = iVar.R0;
                    if (e3Var == null) {
                        Intrinsics.r("searchLandingExperiment");
                        throw null;
                    }
                    z3 z3Var = a4.f83297a;
                    lh0.g1 g1Var = (lh0.g1) e3Var.f83338a;
                    if (g1Var.o("android_search_landing_experience_pwt_fix", "enabled", z3Var) || g1Var.l("android_search_landing_experience_pwt_fix")) {
                        z13 = true;
                        return Boolean.valueOf(z13);
                    }
                }
                z13 = false;
                return Boolean.valueOf(z13);
            case 9:
                return Boolean.valueOf(iVar.f76941e);
            default:
                return Boolean.valueOf(iVar.f76941e);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        uk1.d e13;
        int i13 = this.f26519i;
        i iVar = this.f26520j;
        switch (i13) {
            case 0:
                return invoke();
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                return b();
            case 7:
                return b();
            case 8:
                return b();
            case 9:
                return invoke();
            case 10:
                return b();
            case 11:
                return b();
            case 12:
                return invoke();
            case 13:
                return b();
            case 14:
                uk1.e eVar = iVar.F0;
                if (eVar != null) {
                    return ((uk1.a) eVar).f(iVar.s7(), "");
                }
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            case 15:
                m79invoke();
                return Unit.f80348a;
            case 16:
                l11.f fVar = new l11.f(new b(iVar, 15));
                ky.d dVar = new ky.d(iVar.f7());
                m60.w f73 = iVar.f7();
                s92.i iVar2 = s92.i.SEARCH_TAB_RENDER;
                c3 c3Var = iVar.U0;
                if (c3Var != null) {
                    return new pr0.g(fVar, dVar, null, f73, my.k.class, my.e.class, null, iVar2, c3Var, 68);
                }
                Intrinsics.r("perfEventsRouter");
                throw null;
            case 17:
                uk1.e eVar2 = iVar.F0;
                if (eVar2 != null) {
                    e3.a aVar = new e3.a(5);
                    aVar.p(d4.SEARCH, h32.a4.SEARCH_TAB, null, null);
                    Unit unit = Unit.f80348a;
                    e13 = ((uk1.a) eVar2).e("", aVar);
                    nr0.t tVar = iVar.P0;
                    if (tVar != null) {
                        int type = a61.c.VIEW_TYPE_STRUCTURED_FEED_HEADER_VIEW.getType();
                        wa2.i iVar3 = new wa2.i(0, -1, -1, 1023, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
                        nx.d0 d0Var = e13.f122379a;
                        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                        qa2.f fVar2 = new qa2.f(d0Var, (y32.f) null, (nr0.b) null, 14);
                        yk1.v vVar = iVar.O0;
                        if (vVar != null) {
                            qa2.n a13 = fVar2.a(vVar);
                            yk1.v vVar2 = iVar.O0;
                            if (vVar2 != null) {
                                vq0.h x03 = kh2.b0.x0(tVar, type, e13, iVar3, a13, vVar2);
                                Intrinsics.g(x03, "null cannot be cast to non-null type com.pinterest.feature.shopping.shoppingstories.structuredfeed.binder.StructuredFeedStoryViewBinderDelegate");
                                return (se1.d) x03;
                            }
                            Intrinsics.r("viewResources");
                            throw null;
                        }
                        Intrinsics.r("viewResources");
                        throw null;
                    }
                    Intrinsics.r("viewBindersMapProvider");
                    throw null;
                }
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            default:
                m79invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m79invoke() {
        int i13 = this.f26519i;
        i iVar = this.f26520j;
        switch (i13) {
            case 15:
                new Handler(Looper.getMainLooper()).post(new vs0.b(iVar, 22));
                break;
            default:
                int i14 = i.f26565m1;
                kh2.j.x2(iVar.c9(), u.f26642a);
                break;
        }
    }
}
