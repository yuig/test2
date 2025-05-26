package td1;

import a7.e;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.v0;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.ProductFilterIcon;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import df.j1;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import jd1.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.x0;
import qa2.n;
import rm1.q;
import s71.o;
import so.u3;
import vn1.g;
import wa2.g0;
import yk1.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltd1/b;", "Ljd1/d;", "", "Lnr0/j;", "Ldl1/s;", "<init>", "()V", "shopping_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: h1, reason: collision with root package name */
    public u3 f117460h1;

    /* renamed from: o1, reason: collision with root package name */
    public String f117467o1;

    /* renamed from: p1, reason: collision with root package name */
    public String f117468p1;

    /* renamed from: i1, reason: collision with root package name */
    public final boolean f117461i1 = true;

    /* renamed from: j1, reason: collision with root package name */
    public String f117462j1 = "";

    /* renamed from: k1, reason: collision with root package name */
    public String f117463k1 = "0";

    /* renamed from: l1, reason: collision with root package name */
    public String f117464l1 = "0";

    /* renamed from: m1, reason: collision with root package name */
    public String f117465m1 = SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE;

    /* renamed from: n1, reason: collision with root package name */
    public String f117466n1 = SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE;

    /* renamed from: q1, reason: collision with root package name */
    public String f117469q1 = "";

    /* renamed from: r1, reason: collision with root package name */
    public final d4 f117470r1 = d4.CLOSEUP_SCENE_SHOP;

    /* renamed from: s1, reason: collision with root package name */
    public final a4 f117471s1 = a4.VISUAL_SEARCH_PRODUCT_FEED;

    @Override // jd1.d, gd1.a
    public final void B5(g0 configModel) {
        Intrinsics.checkNotNullParameter(configModel, "configModel");
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        if (navigation == null) {
            return;
        }
        String g23 = navigation.g2("com.pinterest.EXTRA_PIN_ID", "");
        Intrinsics.checkNotNullExpressionValue(g23, "getStringParcelable(...)");
        this.f117462j1 = g23;
        String g24 = navigation.g2("com.pinterest.EXTRA_CROPBOX_DIMENSIONS", "");
        Intrinsics.checkNotNullExpressionValue(g24, "getStringParcelable(...)");
        String[] e13 = o.e(g24);
        if (e13.length == 4) {
            this.f117463k1 = e13[0];
            this.f117464l1 = e13[1];
            this.f117465m1 = e13[2];
            this.f117466n1 = e13[3];
        }
        Intrinsics.checkNotNullExpressionValue(navigation.g2("com.pinterest.EXTRA_CROP_SOURCE", ""), "getStringParcelable(...)");
        this.f117468p1 = navigation.v0("com.pinterest.EXTRA_TITLE");
        String g25 = navigation.g2("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", "");
        Intrinsics.checkNotNullExpressionValue(g25, "getStringParcelable(...)");
        this.f117469q1 = g25;
        String v03 = navigation.v0("com.pinterest.EXTRA_ENTRY_SOURCE");
        this.f117467o1 = v03 != null ? v03 : "";
    }

    @Override // jd1.d, sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        q qVar = q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.g0();
        gestaltToolbarImpl.b0(this.f117468p1);
        gestaltToolbarImpl.e0(g.UI_400);
        Drawable g03 = bs1.c.g0(this, drawableRes, Integer.valueOf(r0.header_view_back_icon_size), 2);
        String string = getString(x0.back);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        gestaltToolbarImpl.T(g03, string);
        gestaltToolbarImpl.m();
        Context requireContext3 = requireContext();
        int i13 = eo1.b.color_themed_icon_default;
        Object obj = d5.a.f53679a;
        int color = requireContext3.getColor(i13);
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.V0 == null) {
            ProductFilterIcon productFilterIcon = new ProductFilterIcon(context);
            productFilterIcon.setOnClickListener(new jd1.a(this, 0));
            this.V0 = productFilterIcon;
        }
        gestaltToolbarImpl.w().f2(color);
    }

    @Override // jd1.d, sq0.e
    public final n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        n T8 = super.T8(pinActionHandler);
        T8.f103320a.f128764c0 = new g0(false, false, false, false, false, false, null, null, null, false, false, false, false, 0, false, false, false, false, false, false, false, false, 33554367);
        return T8;
    }

    @Override // jd1.d, yk1.k
    public final m V7() {
        u3 u3Var = this.f117460h1;
        if (u3Var == null) {
            Intrinsics.r("visualShoppingPresenterFactory");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        sd1.a a13 = u3Var.a(o9(requireContext), pp2.a.w(this.I));
        d.y9(this, a13);
        return a13;
    }

    @Override // jd1.d
    public final String g9() {
        return j1.V("visual_search/flashlight/pin/%s/unified/", this.f117462j1);
    }

    @Override // jd1.d, uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF85780v0() {
        return this.f117471s1;
    }

    @Override // jd1.d, nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.f117470r1;
    }

    @Override // jd1.d
    public final HashMap h9() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("search_query") : null;
        if (v03 == null) {
            v03 = "";
        }
        HashMap f13 = z0.f(new Pair("search_query", v03), new Pair("source", X()), new Pair("is_shopping", "true"), new Pair("entrypoint", "feed_module"));
        f13.put("crop_source", String.valueOf(g42.c.STELA_DOT.getValue()));
        f13.put("x", this.f117463k1);
        f13.put("y", this.f117464l1);
        f13.put("w", this.f117465m1);
        f13.put("h", this.f117466n1);
        String str = this.f117467o1;
        f13.put("entry_source", str != null ? str : "");
        if (this.f117469q1.length() > 0) {
            f13.put("request_params", this.f117469q1);
        }
        return f13;
    }

    @Override // jd1.d
    public final /* bridge */ /* synthetic */ h32.g0 k9() {
        return null;
    }

    @Override // jd1.d, yq0.t
    public final e m8() {
        e eVar = new e(f62.d.fragment_shopping_multisection, f62.c.p_recycler_view);
        eVar.c(f62.c.shopping_multisection_swipe_container);
        return eVar;
    }

    @Override // jd1.d, sq0.e, yq0.t
    public final v0 n8() {
        return t9();
    }

    @Override // jd1.d
    public final uk1.d p9() {
        return new n70.o(this, n9(), 8);
    }

    @Override // jd1.d
    /* renamed from: s9, reason: from getter */
    public final boolean getF117461i1() {
        return this.f117461i1;
    }

    @Override // jd1.d
    public final String v9() {
        return "shop_feed";
    }

    @Override // jd1.d
    public final a4 x9() {
        return a4.SHOPPING_DOT_FEED;
    }
}
