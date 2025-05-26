package mv0;

import a.cb;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.n3;
import androidx.recyclerview.widget.v0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.d4;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import so.n8;
import so.oa;
import x02.i2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmv0/i;", "Lwk1/k;", "Ldl1/s;", "Ljv0/d;", "Lnr0/j;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends b<dl1.s> implements jv0.d {

    /* renamed from: f1, reason: collision with root package name */
    public static final /* synthetic */ int f88365f1 = 0;
    public uk1.e R0;
    public i2 S0;
    public n8 T0;
    public n3 U0;
    public boolean V0;
    public int W0;
    public int X0;
    public String Y0;
    public lv0.c Z0;

    /* renamed from: a1, reason: collision with root package name */
    public GestaltSwitch f88366a1;

    /* renamed from: b1, reason: collision with root package name */
    public GestaltSpinner f88367b1;

    /* renamed from: c1, reason: collision with root package name */
    public ArrayList f88368c1;

    /* renamed from: d1, reason: collision with root package name */
    public final ArrayList f88369d1 = new ArrayList();

    /* renamed from: e1, reason: collision with root package name */
    public final d4 f88370e1 = d4.STORY_PIN;

    @Override // sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE, new h(this, 1));
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        if (navigation != null) {
            ArrayList M = navigation.M("com.pinterest.EXTRA_PINNABLE_IMAGE");
            Intrinsics.g(M, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            this.f88368c1 = M;
            this.V0 = navigation.S("com.pinterest.EXTRA_STORY_PIN_DISPLAY_AFFILIATE_OPTIONS", false);
            ArrayList arrayList = this.f88368c1;
            if (arrayList == null) {
                Intrinsics.r("imageList");
                throw null;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f88369d1.add(new kv0.w(kotlin.text.z.n((String) it.next(), "\"", "")));
            }
        }
    }

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        Context context = getContext();
        int drawableRes = context != null ? rm1.q.ARROW_BACK.drawableRes(context, dl2.b.f1(context)) : sm1.b.ic_arrow_back_gestalt;
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(r80.f.story_pin_product_tag_title);
        gestaltToolbarImpl.d0(vn1.c.LIGHT);
        Drawable f03 = bs1.c.f0(gestaltToolbarImpl, drawableRes, null, null, 6);
        f03.setTint(getResources().getColor(eo1.b.color_white_0, requireContext().getTheme()));
        gestaltToolbarImpl.S(f03);
        gestaltToolbarImpl.l();
        gestaltToolbarImpl.m();
        Context context2 = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltButton.SmallPrimaryButton smallPrimaryButton = new GestaltButton.SmallPrimaryButton(6, context2, (AttributeSet) null);
        smallPrimaryButton.d(g.f88349l);
        smallPrimaryButton.e(new lq0.o(7, this, smallPrimaryButton));
        gestaltToolbarImpl.c(smallPrimaryButton);
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.R0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        i2 i2Var = this.S0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        n8 n8Var = this.T0;
        if (n8Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        ArrayList arrayList = this.f88369d1;
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_PRODUCT_LINK", "");
        String Z2 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_PRODUCT_PIN_ID", "");
        String str = Z2.length() == 0 ? null : Z2;
        String Z3 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LANDING_URL", "");
        String str2 = Z3.length() == 0 ? null : Z3;
        String Z4 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_AFFILIATE_LINK", "");
        return n8Var.a(arrayList, a13, Z, Z4.length() == 0 ? null : Z4, str2, str, com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_IDEA_PIN_METADATA_IS_FROM_FINISHING_TOUCHES", false));
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getU0() {
        return this.f88370e1;
    }

    public final void j9(int i13) {
        GestaltSpinner gestaltSpinner = this.f88367b1;
        if (gestaltSpinner == null) {
            Intrinsics.r("gestaltSpinner");
            throw null;
        }
        dl2.b.X2(gestaltSpinner, ln1.e.LOADED);
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(getResources().getString(i13));
    }

    @Override // sq0.e, yq0.t
    public final g2 l8() {
        androidx.recyclerview.widget.s sVar = new androidx.recyclerview.widget.s();
        sVar.f19618g = false;
        return sVar;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(aq1.f.fragment_idea_pins_affiliate_product_feed, aq1.d.p_recycler_view);
        eVar.c(aq1.d.shopping_multisection_swipe_container);
        eVar.f979c = aq1.d.empty_state_container;
        return eVar;
    }

    @Override // sq0.e, yq0.t
    public final v0 n8() {
        n3 n3Var = this.U0;
        if (n3Var == null) {
            Intrinsics.r("staggeredGridLayoutManagerFactory");
            throw null;
        }
        PinterestStaggeredGridLayoutManagerImpl f13 = n3Var.f(r8(), hf0.b.f69004d);
        if (hf0.b.f69004d == 2) {
            f13.f1(10);
        } else {
            f13.f1(0);
        }
        f13.M1(RecyclerViewTypes.FULL_SPAN_ITEM_TYPES);
        return new v0(f13);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        int dimensionPixelSize = onCreateView.getResources().getDimensionPixelSize(r0.margin_quarter);
        this.f88366a1 = ((GestaltSwitch) onCreateView.findViewById(aq1.d.affiliate_link_switch)).i(new au0.f(this, 21));
        View findViewById = onCreateView.findViewById(aq1.d.affiliate_details_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        if (linearLayout == null) {
            Intrinsics.r("affiliateOptionsContainer");
            throw null;
        }
        bs1.c.U1(linearLayout);
        View findViewById2 = onCreateView.findViewById(aq1.d.loading_spinner);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltSpinner gestaltSpinner = (GestaltSpinner) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltSpinner, "<set-?>");
        this.f88367b1 = gestaltSpinner;
        a8(new eb2.k(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize));
        return onCreateView;
    }
}
