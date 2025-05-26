package jd1;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.v0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.ProductFilterIcon;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.ProductFilterIconV2;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import de1.t;
import dl1.s;
import h32.a4;
import h32.d4;
import ht0.p;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import m60.x0;
import nx.f0;
import qa2.n;
import rm1.q;
import so.oa;
import so.p6;
import wa2.g0;
import wk1.k;
import x02.i2;
import xk2.m;
import xk2.v;
import yq0.z;
import z32.a3;
import z32.y2;
import zd1.o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljd1/d;", "Lwk1/k;", "Ldl1/s;", "Lgd1/c;", "Lnr0/j;", "Lgd1/a;", "Lgd1/b;", "<init>", "()V", "shoppinglibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class d extends k<s> implements gd1.c, gd1.a, gd1.b {

    /* renamed from: b1, reason: collision with root package name */
    public static final /* synthetic */ int f75508b1 = 0;
    public e M0;
    public ProductFilterIcon V0;
    public ProductFilterIconV2 W0;
    public t X0;
    public id1.g Y0;
    public o Z0;
    public final v N0 = m.b(new b(this, 2));
    public final v O0 = m.b(new b(this, 0));
    public final v P0 = m.b(new b(this, 3));
    public final v Q0 = m.b(new b(this, 4));
    public final v R0 = m.b(new b(this, 5));
    public final v S0 = m.b(new b(this, 12));
    public final v T0 = m.b(new b(this, 1));
    public final boolean U0 = true;

    /* renamed from: a1, reason: collision with root package name */
    public final d4 f75509a1 = d4.FEED;

    public static void y9(d dVar, id1.g listener) {
        dVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "presenter");
        if (dVar.getF117461i1()) {
            dVar.Y0 = listener;
            o q93 = dVar.q9();
            Intrinsics.checkNotNullParameter(listener, "listener");
            q93.f141744h = listener;
            Context requireContext = dVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            dVar.X0 = dVar.l9(requireContext);
        }
    }

    public void B5(g0 configModel) {
        Intrinsics.checkNotNullParameter(configModel, "configModel");
        W8().f103320a.f128764c0 = configModel;
    }

    @Override // gd1.d
    public final void O5(String uri, HashMap analyticsMap) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(analyticsMap, "analyticsMap");
        l lVar = (l) this.S0.getValue();
        Context requireContext = requireContext();
        Intrinsics.f(requireContext);
        l.b(lVar, requireContext, uri, true, false, null, analyticsMap, 64);
    }

    @Override // nl1.d, ec2.o
    public final ac2.m P0() {
        return B7();
    }

    @Override // sq0.e, yq0.b0
    public void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT, new b(this, 7));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE, new b(this, 8));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN, new b(this, 9));
        adapter.G(44, new b(this, 10));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP, new b(this, 11));
    }

    @Override // sq0.e, nl1.d
    public void S7(fo1.a toolbar) {
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
        if (getF117461i1()) {
            gestaltToolbarImpl.I();
            this.V0 = null;
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            ProductFilterIconV2 productFilterIconV2 = this.W0;
            if (productFilterIconV2 == null) {
                productFilterIconV2 = new ProductFilterIconV2(requireContext3);
                productFilterIconV2.setOnClickListener(new a(this, 1));
                this.W0 = productFilterIconV2;
            }
            gestaltToolbarImpl.f(productFilterIconV2, "Product Filter Icon");
        }
        gestaltToolbarImpl.Q(drawableRes, eo1.b.color_themed_text_default, x0.back);
        String u93 = u9();
        if (u93 != null) {
            gestaltToolbarImpl.b0(u93);
        }
        gestaltToolbarImpl.e0(vn1.g.BODY_300);
        if (getU0()) {
            gestaltToolbarImpl.n();
            gestaltToolbarImpl.m();
        }
    }

    @Override // sq0.e
    public tq0.b[] S8() {
        return new tq0.b[]{new tq0.m(pb0.g.f99432a, s7())};
    }

    @Override // sq0.e
    public n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        return new xd1.h(s7(), y32.f.CLOSEUP_LONGPRESS, pinActionHandler, v9()).a(new yk1.a(getResources(), requireContext().getTheme()));
    }

    @Override // yk1.k
    public yk1.m V7() {
        p6 c13 = i9().c();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        id1.g a13 = c13.a(o9(requireContext));
        y9(this, a13);
        return a13;
    }

    public final String X() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("source") : null;
        return v03 == null ? "" : v03;
    }

    @Override // sq0.e
    /* renamed from: a9 */
    public final String getE2() {
        return v9();
    }

    @Override // nl1.d, nx.i1
    public final h32.g0 b2() {
        return k9();
    }

    public abstract String g9();

    @Override // uk1.c
    /* renamed from: getComponentType */
    public h32.g0 getF73409e1() {
        return k9();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public a4 getF86878d0() {
        return x9();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public d4 getF86877c0() {
        return this.f75509a1;
    }

    public HashMap h9() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("search_query") : null;
        if (v03 == null) {
            v03 = "";
        }
        return z0.f(new Pair("search_query", v03), new Pair("source", X()));
    }

    public final e i9() {
        e eVar = this.M0;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("baseShoppingFeedFragmentDependencies");
        throw null;
    }

    /* renamed from: j9, reason: from getter */
    public boolean getU0() {
        return this.U0;
    }

    public abstract h32.g0 k9();

    public final t l9(Context context) {
        t tVar = this.X0;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this.Y0, new c(this, n9(), 1), p7(), "", new yk1.a(context.getResources(), context.getTheme()), true, null, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
        q9().e(tVar2);
        this.X0 = tVar2;
        return tVar2;
    }

    @Override // yq0.t
    public a7.e m8() {
        a7.e eVar = new a7.e(f62.d.fragment_shopping_multisection, f62.c.p_recycler_view);
        eVar.c(f62.c.shopping_multisection_swipe_container);
        return eVar;
    }

    public final i2 m9() {
        return (i2) this.Q0.getValue();
    }

    @Override // sq0.e, yq0.t
    public v0 n8() {
        g41.a aVar = new g41.a(this, 5);
        getContext();
        PinterestGridLayoutManager pinterestGridLayoutManager = new PinterestGridLayoutManager(aVar, getZ0());
        pinterestGridLayoutManager.K = new p(this, pinterestGridLayoutManager, 4);
        return new v0(pinterestGridLayoutManager);
    }

    public final f0 n9() {
        return (f0) this.R0.getValue();
    }

    public final id1.h o9(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(context.getResources(), context.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        bVar.g(p9());
        bVar.f(m9());
        wk1.c a13 = bVar.a();
        m60.g0 g0Var = (m60.g0) this.P0.getValue();
        String g93 = g9();
        HashMap h93 = h9();
        ps.a aVar = (ps.a) this.O0.getValue();
        k81.k kVar = new k81.k();
        if (getF117461i1()) {
            kVar.a(q9());
        }
        return new id1.h(a13, g0Var, g93, h93, aVar, kVar, !getF117461i1() ? null : q9(), r9(), A7(), getActiveUserManager(), f7(), new h(w9(), 447), (x02.x0) this.T0.getValue(), i9().g(), i9().b(), i9().e(), i9().f(), i9().i(), i9().h(), i9().a(), i9().d());
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        L8();
        super.onCreate(bundle);
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.Z0 = null;
        this.V0 = null;
        this.W0 = null;
        this.X0 = null;
        this.Y0 = null;
        super.onDestroyView();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        int X8 = X8() / 2;
        H8(X8, Y8(), X8, getResources().getDimensionPixelOffset(eo1.c.space_1600));
    }

    public uk1.d p9() {
        return new c(this, n9(), 0);
    }

    public final o q9() {
        o oVar = this.Z0;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o();
        this.Z0 = oVar2;
        return oVar2;
    }

    public String r9() {
        return null;
    }

    /* renamed from: s9 */
    public boolean getF117461i1() {
        return false;
    }

    public final v0 t9() {
        return super.n8();
    }

    public String u9() {
        return null;
    }

    public abstract String v9();

    public final ze0.a w9() {
        Navigation navigation = this.I;
        int q13 = navigation != null ? navigation.q1(a3.AVATAR.value(), "com.pinterest.STRUCTURED_FEED_USER_REP_STYLE") : a3.AVATAR.value();
        a3.Companion.getClass();
        a3 a13 = y2.a(q13);
        if (a13 == null) {
            a13 = a3.AVATAR;
        }
        return l3.c.e1(a13);
    }

    public abstract a4 x9();
}
