package xo0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import ar0.y;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.r0;
import nx.f0;
import so.v5;
import x02.i2;
import x02.x0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxo0/k;", "Lsq0/n;", "Luo0/a;", "Lcom/pinterest/framework/screens/k;", "<init>", "()V", "bubbles_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class k extends t implements uo0.a, com.pinterest.framework.screens.k {

    /* renamed from: g1, reason: collision with root package name */
    public static final /* synthetic */ int f135597g1 = 0;
    public x0 O0;
    public i2 P0;
    public g0 Q0;
    public l12.b R0;
    public rr0.a S0;
    public nr0.m T0;
    public yk1.j U0;
    public f0 V0;
    public z12.b W0;
    public lh0.x X0;
    public v5 Y0;
    public String Z0;

    /* renamed from: a1, reason: collision with root package name */
    public IconView f135598a1;

    /* renamed from: b1, reason: collision with root package name */
    public j f135599b1;

    /* renamed from: c1, reason: collision with root package name */
    public wo0.e f135600c1;

    /* renamed from: d1, reason: collision with root package name */
    public Boolean f135601d1;

    /* renamed from: e1, reason: collision with root package name */
    public final d4 f135602e1 = d4.ARTICLE;

    /* renamed from: f1, reason: collision with root package name */
    public final a4 f135603f1 = a4.EXPLORE_ARTICLE;

    @Override // com.pinterest.framework.screens.k
    public final void P4(Bundle bundle) {
        E8(0, false);
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER, new ba.q(requireContext, 29));
        adapter.G(62, new i(requireContext, 0));
        adapter.G(63, new i(requireContext, 1));
        adapter.G(82, new i(requireContext, 2));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE, new i(requireContext, 3));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN, new i(requireContext, 4));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_USER, new i(requireContext, 5));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION, new i(requireContext, 6));
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        Intrinsics.f(navigation);
        String f49940b = navigation.getF49940b();
        Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
        this.Z0 = f49940b;
    }

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.I();
        lh0.x xVar = this.X0;
        if (xVar == null) {
            Intrinsics.r("bubblesExperiments");
            throw null;
        }
        gestaltToolbarImpl.g(xVar.a());
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context context = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable g03 = bs1.c.g0(this, qVar.drawableRes(context, dl2.b.f1(context2)), Integer.valueOf(r0.default_pds_icon_size), 2);
        String string = getString(m60.x0.back);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        gestaltToolbarImpl.T(g03, string);
        IconView w13 = gestaltToolbarImpl.w();
        Context context3 = gestaltToolbarImpl.getContext();
        int i13 = eo1.b.color_themed_text_default;
        Object obj = d5.a.f53679a;
        w13.setColorFilter(context3.getColor(i13));
        Drawable drawable = gestaltToolbarImpl.getContext().getDrawable(sm1.b.ic_share_android_gestalt);
        if (drawable != null) {
            IconView F = gestaltToolbarImpl.F(drawable);
            F.setOnClickListener(new lj0.a(this, 12));
            F.setColorFilter(F.getContext().getColor(eo1.b.color_themed_text_default));
            bs1.c.R1(F, false);
            this.f135598a1 = F;
            String string2 = getString(m60.x0.share);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            gestaltToolbarImpl.f(F, string2);
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        g0 g0Var = this.Q0;
        if (g0Var == null) {
            Intrinsics.r("pageSizeProvider");
            throw null;
        }
        l12.b bVar = this.R0;
        if (bVar == null) {
            Intrinsics.r("exploreService");
            throw null;
        }
        no0.a aVar = new no0.a(g0Var, bVar);
        z12.b bVar2 = this.W0;
        if (bVar2 == null) {
            Intrinsics.r("paginatedModelFeedPagingService");
            throw null;
        }
        vo0.a aVar2 = new vo0.a(bVar2);
        rr0.a aVar3 = this.S0;
        if (aVar3 == null) {
            Intrinsics.r("dynamicFeedNextPageUrlFactory");
            throw null;
        }
        vo0.b bVar3 = new vo0.b(aVar, aVar2, aVar3);
        Context requireContext = requireContext();
        nr0.m mVar = this.T0;
        if (mVar == null) {
            Intrinsics.r("dynamicGridViewBinderDelegateFactory");
            throw null;
        }
        rr0.h hVar = new rr0.h(requireContext, mVar);
        String str = this.Z0;
        if (str == null) {
            Intrinsics.r("bubbleId");
            throw null;
        }
        f0 f0Var = this.V0;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        hVar.f109912a = new i61.a(str, null, null, f0Var);
        hVar.f109913b = bVar3;
        qa2.n W8 = W8();
        W8.f103320a.f128795s = true;
        hVar.f109914c = W8;
        x0 x0Var = this.O0;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        hVar.f109925n = x0Var;
        yk1.j jVar = this.U0;
        if (jVar == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        hVar.f109926o = jVar;
        i2 i2Var = this.P0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        hVar.f109927p = i2Var;
        hVar.f109916e = z7();
        rr0.h a13 = hVar.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("request_params") : null;
        Navigation navigation2 = this.I;
        String v04 = navigation2 != null ? navigation2.v0("shop_source") : null;
        if (v03 == null || v03.length() == 0) {
            v03 = null;
        }
        if (v04 == null || v04.length() == 0) {
            v04 = null;
        }
        v5 v5Var = this.Y0;
        if (v5Var == null) {
            Intrinsics.r("bubbleContentPresenterFactory");
            throw null;
        }
        String str2 = this.Z0;
        if (str2 != null) {
            return v5Var.a(str2, a13, v03, v04);
        }
        Intrinsics.r("bubbleId");
        throw null;
    }

    @Override // sq0.e
    public final int Y8() {
        return 0;
    }

    @Override // sq0.e
    /* renamed from: a9 */
    public final String getE2() {
        return "bubble";
    }

    public final void g9(boolean z13) {
        this.f135601d1 = Boolean.valueOf(z13);
        IconView iconView = this.f135598a1;
        if (iconView != null) {
            bs1.c.R1(iconView, z13);
        } else {
            Intrinsics.r("shareButton");
            throw null;
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF63535l0() {
        return this.f135603f1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getS0() {
        return this.f135602e1;
    }

    public final void h9(boolean z13) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.setPaddingRelative(g83.getPaddingStart(), getResources().getDimensionPixelSize(z13 ? eo1.c.ignore : eo1.c.toolbar_height), g83.getPaddingEnd(), getResources().getDimensionPixelSize(eo1.c.bottom_nav_height));
        }
        y yVar = this.f135599b1;
        if (yVar != null) {
            C8(yVar);
        }
        j jVar = new j(this, z13, (ye2.m) context);
        addScrollListener(jVar);
        this.f135599b1 = jVar;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(b80.c.fragment_bubble_content, b80.b.p_recycler_view);
        eVar.c(b80.b.swipe_container);
        eVar.f979c = b80.b.empty_state_container;
        return eVar;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        j jVar = this.f135599b1;
        if (jVar != null) {
            C8(jVar);
        }
        this.f135599b1 = null;
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        IconView w13;
        super.onResume();
        RecyclerView g83 = g8();
        Intrinsics.f(g83);
        l2 l2Var = g83.f19242n;
        Intrinsics.f(l2Var);
        if (eb2.j.b(l2Var, null) > 0) {
            fo1.a i73 = i7();
            Drawable background = i73 != null ? ((GestaltToolbarImpl) i73).getBackground() : null;
            if (background != null) {
                background.setAlpha(255);
            }
            fo1.a i74 = i7();
            if (i74 == null || (w13 = ((GestaltToolbarImpl) i74).w()) == null) {
                return;
            }
            Context requireContext = requireContext();
            int i13 = eo1.b.color_themed_text_default;
            Object obj = d5.a.f53679a;
            w13.setColorFilter(requireContext.getColor(i13));
        }
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.setClipChildren(false);
            g83.setClipToPadding(false);
        }
    }

    @Override // nl1.d
    public final y32.f v7() {
        return y32.f.EXPLORE;
    }
}
