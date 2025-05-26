package od1;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.m1;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.api.model.g00;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.imageview.WebImageView;
import de1.r0;
import ea1.t0;
import ea1.u0;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.k2;
import m60.x0;
import o82.b3;
import so.n5;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lod1/t;", "Lo82/v2;", "Lov1/d;", "<init>", "()V", "shopping_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class t extends a implements ov1.d {

    /* renamed from: d1, reason: collision with root package name */
    public static final /* synthetic */ int f94174d1 = 0;
    public n5 L0;
    public k2 M0;
    public vy.m N0;
    public lb0.q O0;
    public final m1 P0;
    public b Q0;
    public final xk2.v R0;
    public boolean S0;
    public ov1.k T0;
    public AppBarLayout U0;
    public LinearLayout V0;
    public GestaltText W0;
    public WebImageView X0;
    public final xk2.k Y0;
    public final d4 Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final a4 f94175a1;

    /* renamed from: b1, reason: collision with root package name */
    public final xk2.v f94176b1;

    /* renamed from: c1, reason: collision with root package name */
    public final cj0.e f94177c1;

    public t() {
        int i13 = 12;
        t0 t0Var = new t0(this, i13);
        xk2.n nVar = xk2.n.NONE;
        xk2.k r13 = d7.g.r(16, t0Var, nVar);
        int i14 = 13;
        this.P0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(o0.class), new u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
        this.Q0 = new b(null, null, null, 255);
        this.R0 = xk2.m.b(new o(this, 0));
        this.Y0 = xk2.m.a(nVar, new o(this, 1));
        this.Z0 = d4.CLOSEUP_SCENE_SHOP;
        this.f94175a1 = a4.SHOPPING_DOT_FEED;
        this.f94176b1 = xk2.m.b(m.f94137i);
        this.f94177c1 = new cj0.e(this, 3);
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Q(qVar.drawableRes(requireContext, dl2.b.f1(requireContext2)), eo1.b.color_themed_text_default, x0.back);
        gestaltToolbarImpl.m();
    }

    @Override // nl1.d
    public final ll1.a T6() {
        return new ll1.a(n7(), String.valueOf(q7()), null, getF68106k0(), 4);
    }

    @Override // o82.i3
    public final u50.r T8() {
        return new kd1.j(k9().c(), 3);
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new w41.g0(k9().a(), 10);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new kd1.j(k9().c(), 1);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Set set = pd1.c.f99804a;
        c0.d.A2(adapter, g4.u.o0(), n.f94144k, (o82.y) this.Y0.getValue());
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        kh2.j.x2(k9(), c.f94117a);
        return true;
    }

    @Override // uk1.c
    /* renamed from: getAuxData */
    public final HashMap getF68106k0() {
        return (HashMap) this.f94176b1.getValue();
    }

    @Override // o82.v2, sq0.b0
    /* renamed from: getNumColumns */
    public final int getT0() {
        return this.Q0.f();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF134484m0() {
        return this.f94175a1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF134483l0() {
        return this.Z0;
    }

    public final o0 k9() {
        return (o0) this.P0.getValue();
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new kd1.j(k9().c(), 2);
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(d62.b.fragment_shopping_module_landing_page, d62.a.p_recycler_view);
        eVar.c(d62.a.swipe_container);
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String g23;
        super.onCreate(bundle);
        Navigation navigation = this.I;
        String g24 = navigation != null ? navigation.g2("com.pinterest.EXTRA_PIN_ID", "") : null;
        Navigation navigation2 = this.I;
        Boolean valueOf = navigation2 != null ? Boolean.valueOf(navigation2.S("com.pinterest.EXTRA_IS_SHOPPING", false)) : null;
        Navigation navigation3 = this.I;
        String g25 = navigation3 != null ? navigation3.g2("com.pinterest.EXTRA_ENTRY_SOURCE", "") : null;
        Navigation navigation4 = this.I;
        String g26 = navigation4 != null ? navigation4.g2("com.pinterest.EXTRA_ENTRY_POINT", "") : null;
        Navigation navigation5 = this.I;
        String g27 = navigation5 != null ? navigation5.g2("com.pinterest.EXTRA_CROP_SOURCE", "") : null;
        Navigation navigation6 = this.I;
        String g28 = navigation6 != null ? navigation6.g2("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", "") : null;
        Navigation navigation7 = this.I;
        k9().h((h32.i0) this.R0.getValue(), (navigation7 == null || (g23 = navigation7.g2("com.pinterest.STRUCTURED_FEED_TITLE", "")) == null) ? "" : g23, g24 == null ? "" : g24, valueOf, g25, g26, g27, g28);
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AppBarLayout appBarLayout = this.U0;
        if (appBarLayout != null) {
            appBarLayout.l(this.f94177c1);
        }
        super.onDestroyView();
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        fo1.a i73 = i7();
        int i13 = 13;
        if (i73 != null) {
            ((GestaltToolbarImpl) i73).U(new lc1.b(this, i13));
        }
        Navigation navigation = this.I;
        if (navigation == null || (str = navigation.g2("com.pinterest.EXTRA_PIN_ID", "")) == null) {
            str = "";
        }
        this.U0 = (AppBarLayout) v13.findViewById(d62.a.stl_landing_appbarlayout);
        getResources().getDimensionPixelSize(eo1.c.space_400);
        WebImageView webImageView = new WebImageView(requireContext());
        webImageView.setId(View.generateViewId());
        float dimensionPixelSize = webImageView.getResources().getDimensionPixelSize(eo1.c.lego_image_corner_radius);
        webImageView.g2(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bs1.c.W(webImageView, eo1.c.lego_image_width_default), bs1.c.W(webImageView, eo1.c.lego_image_height_large));
        layoutParams.gravity = 1;
        webImageView.setLayoutParams(layoutParams);
        webImageView.loadUrl(this.Q0.g());
        this.X0 = webImageView;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltText gestaltText = new GestaltText(6, requireContext, (AttributeSet) null);
        gestaltText.setId(View.generateViewId());
        gestaltText.i(n.f94143j);
        gestaltText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int dimensionPixelSize2 = gestaltText.getResources().getDimensionPixelSize(eo1.c.structured_feed_header_horizontal_padding);
        int dimensionPixelSize3 = gestaltText.getResources().getDimensionPixelSize(eo1.c.structured_feed_header_top_padding);
        gestaltText.setPaddingRelative(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
        pk.a0.p(gestaltText, this.Q0.h());
        this.W0 = gestaltText;
        LinearLayout linearLayout = (LinearLayout) v13.findViewById(d62.a.stl_landing_hero_layout);
        this.V0 = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            WebImageView webImageView2 = this.X0;
            Intrinsics.g(webImageView2, "null cannot be cast to non-null type android.view.View");
            linearLayout.addView(webImageView2);
            linearLayout.addView(this.W0);
        }
        fo1.a i74 = i7();
        if (i74 != null) {
            ((GestaltToolbarImpl) i74).b0("");
        }
        AppBarLayout appBarLayout = this.U0;
        if (appBarLayout != null) {
            appBarLayout.b(this.f94177c1);
        }
        Context requireContext2 = requireContext();
        ov1.f fVar = new ov1.f(0, null, 7);
        uk1.d dVar = new uk1.d(new e3.a(5), ((nx.m) b7()).a(new mq.w(this, i13)), str);
        uj2.q p73 = p7();
        m60.w f73 = f7();
        int hashCode = hashCode();
        k2 k2Var = this.M0;
        if (k2Var == null) {
            Intrinsics.r("oneBarLibraryExperiments");
            throw null;
        }
        vy.m mVar = this.N0;
        if (mVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        b60.b activeUserManager = getActiveUserManager();
        lb0.q qVar = this.O0;
        if (qVar == null) {
            Intrinsics.r("prefsManagerPersisted");
            throw null;
        }
        ov1.e eVar = ov1.e.SINGLE_DESELECTABLE;
        r0 r0Var = r0.STL_LANDING_PAGE;
        Intrinsics.f(requireContext2);
        ov1.k kVar = new ov1.k(requireContext2, v13, fVar, dVar, p73, f73, false, hashCode, mVar, activeUserManager, qVar, k2Var, eVar, r0Var, 229376);
        this.T0 = kVar;
        kVar.k(this);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new s(this, null), 3);
    }

    @Override // ov1.d
    public final void t1(List selectedOneBarModules) {
        Object obj;
        Intrinsics.checkNotNullParameter(selectedOneBarModules, "selectedOneBarModules");
        Iterator it = selectedOneBarModules.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!Intrinsics.d(((g00) next).getUid(), null)) {
                obj = next;
                break;
            }
        }
        kh2.j.x2(k9(), new d((g00) obj));
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(m60.t0.toolbar);
    }
}
