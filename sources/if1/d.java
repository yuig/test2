package if1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.feature.core.view.MvpViewPagerFragment;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.o4;
import hz.l;
import k22.m;
import kh2.b0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.x0;
import nc0.f;
import rm1.q;
import uk1.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lif1/d;", "Lff1/b;", "Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "Ljf1/a;", "<init>", "()V", "shopping_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends MvpViewPagerFragment<jf1.a> implements ff1.b {

    /* renamed from: m0, reason: collision with root package name */
    public e f72232m0;

    /* renamed from: n0, reason: collision with root package name */
    public wk2.a f72233n0;

    /* renamed from: o0, reason: collision with root package name */
    public m f72234o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltTabLayout f72235p0;

    /* renamed from: q0, reason: collision with root package name */
    public hf1.c f72236q0;

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        q qVar = q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Q(qVar.drawableRes(requireContext, dl2.b.f1(requireContext2)), eo1.b.color_themed_text_default, x0.back);
        IconView w13 = gestaltToolbarImpl.w();
        ViewGroup.LayoutParams layoutParams = w13.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        com.bumptech.glide.c.a1(marginLayoutParams, w13.getResources().getDimensionPixelOffset(r0.margin_half), 0, 0, 0);
        w13.setLayoutParams(marginLayoutParams);
        gestaltToolbarImpl.Y(d62.c.wishlist_shop_your_pins);
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        e eVar = this.f72232m0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        uj2.q p73 = p7();
        m mVar = this.f72234o0;
        if (mVar != null) {
            Navigation navigation = this.I;
            return new hf1.c(f13, p73, mVar, navigation != null ? navigation.g2("com.pinterest.EXTRA_USER_ID", "me") : null);
        }
        Intrinsics.r("userService");
        throw null;
    }

    public final void g8(String str, int i13, String str2, boolean z13) {
        GestaltTabLayout gestaltTabLayout = this.f72235p0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        String valueOf = String.valueOf(str);
        GestaltTabLayout gestaltTabLayout2 = this.f72235p0;
        if (gestaltTabLayout2 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        gestaltTabLayout.d(b0.U(gestaltTabLayout2, valueOf, 0, 12), i13, z13);
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
        jf1.a aVar = (jf1.a) a8();
        Navigation navigation3 = this.I;
        String g23 = navigation3 != null ? navigation3.g2("com.pinterest.EXTRA_USER_ID", "me") : null;
        Bundle bundle = new Bundle();
        if (str2 != null) {
            bundle.putString("com.pinterest.EXTRA_BOARD_ID", str2);
        }
        if (g23 != null) {
            bundle.putString("com.pinterest.EXTRA_USER_ID", g23);
        }
        if (v03 != null) {
            bundle.putString("request_params", v03);
        }
        if (v04 != null) {
            bundle.putString("shop_source", v04);
        }
        ScreenModel screenDescription = jr.a.o((ScreenLocation) o4.f51174b.getValue(), bundle);
        Intrinsics.checkNotNullExpressionValue(screenDescription, "createScreenDescription(...)");
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        aVar.C(CollectionsKt.m0(screenDescription, aVar.f77529f));
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = d62.b.fragment_wishlist;
        wk2.a aVar = this.f72233n0;
        if (aVar == null) {
            Intrinsics.r("adapterProvider");
            throw null;
        }
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        f8((jr.a) obj);
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(d62.a.wishlist_tabs_layout);
        GestaltTabLayout gestaltTabLayout = (GestaltTabLayout) findViewById;
        gestaltTabLayout.b(new iq0.c(this, 3));
        gestaltTabLayout.setVisibility(4);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f72235p0 = gestaltTabLayout;
        Y7(new l(this, 5));
    }

    @Override // nl1.d
    public final f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (f) mainView.findViewById(d62.a.toolbar);
    }
}
