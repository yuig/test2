package kx0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.v0;
import androidx.recyclerview.widget.v1;
import ca0.b0;
import com.pinterest.activity.newshub.view.header.NewsHubSectionHeader;
import com.pinterest.api.model.dh;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.tx;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.o0;
import so.n0;
import so.oa;
import x02.i2;
import yq0.z;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\u00020\u0005B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkx0/o;", "Lwk1/k;", "Ldl1/s;", "Lfx0/b;", "Lnr0/j;", "Lcom/pinterest/framework/screens/k;", "<init>", "()V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends a<dl1.s> implements fx0.b, com.pinterest.framework.screens.k {

    /* renamed from: g1, reason: collision with root package name */
    public static final /* synthetic */ int f81075g1 = 0;
    public n0 R0;
    public uk1.e S0;
    public i2 T0;
    public pb0.a U0;
    public o0 V0;
    public zf0.f W0;
    public v1 X0;
    public NewsHubSectionHeader Y0;
    public boolean Z0;

    /* renamed from: a1, reason: collision with root package name */
    public dv1.e f81076a1;

    /* renamed from: b1, reason: collision with root package name */
    public hx0.e f81077b1;

    /* renamed from: c1, reason: collision with root package name */
    public final xk2.k f81078c1 = xk2.m.a(xk2.n.NONE, n.f81074i);

    /* renamed from: d1, reason: collision with root package name */
    public final k f81079d1 = new k(this);

    /* renamed from: e1, reason: collision with root package name */
    public final d4 f81080e1 = d4.NEWS_HUB;

    /* renamed from: f1, reason: collision with root package name */
    public final a4 f81081f1 = a4.NEWS_HUB_DETAIL;

    @Override // com.pinterest.framework.screens.k
    public final void P4(Bundle bundle) {
        E8(0, true);
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(1502, new d(this, 3));
        adapter.G(1504, new e(this));
        adapter.G(1512, new f(this));
        adapter.G(1505, new g(this));
        adapter.G(1514, dl2.b.m2(s7(), null, new d(this, 4)));
        h creatorLambda = new h(this);
        Intrinsics.checkNotNullParameter(creatorLambda, "creatorLambda");
        adapter.f139765k.j(1513, new yq0.f(new b0(14, creatorLambda)));
        adapter.G(1507, new i(this));
        adapter.G(1508, new j(this));
        adapter.G(1509, new d(this, 5));
        adapter.G(1511, new d(this, 0));
        adapter.G(1500, new d(this, 1));
        adapter.G(1501, new d(this, 2));
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        if (navigation == null) {
            return;
        }
        Object X0 = navigation.X0();
        dv1.e eVar = null;
        if (X0 != null) {
            if (X0 instanceof qx) {
                eVar = g4.u.W(X0);
            } else if (X0 instanceof d40.i) {
                eVar = g4.u.W(X0);
            }
        }
        this.f81076a1 = eVar;
        if (eVar == null) {
            String f49940b = navigation.getF49940b();
            Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
            if (f49940b.length() > 0) {
                qx B = qx.B(f49940b);
                Intrinsics.checkNotNullExpressionValue(B, "makeMinimalItem(...)");
                this.f81076a1 = g4.u.W(B);
                this.Z0 = true;
            }
        }
    }

    @Override // sq0.e
    public final tq0.b[] S8() {
        tq0.b[] bVarArr = new tq0.b[1];
        pb0.a aVar = this.U0;
        if (aVar == null) {
            Intrinsics.r("clock");
            throw null;
        }
        d0 s73 = s7();
        o0 o0Var = this.V0;
        if (o0Var == null) {
            Intrinsics.r("pinalyticsManager");
            throw null;
        }
        bVarArr[0] = new tq0.c(aVar, s73, o0Var, null, new dx0.d(this, 3), 8);
        return bVarArr;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        String str;
        if (this.W0 == null) {
            Intrinsics.r("educationHelper");
            throw null;
        }
        boolean h10 = zf0.f.h();
        wa2.i iVar = W8().f103320a;
        iVar.f128797t = h10;
        iVar.F = h10;
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
        i2 i2Var = this.T0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        n0 n0Var = this.R0;
        if (n0Var == null) {
            Intrinsics.r("multiSectionNewsHubPresenterFactory");
            throw null;
        }
        dv1.e eVar2 = this.f81076a1;
        if (eVar2 == null || (str = eVar2.b()) == null) {
            str = "";
        }
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        return n0Var.a(str, a13, requireContext2, o7());
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        dv1.e eVar = this.f81076a1;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF81081f1() {
        return this.f81081f1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF81080e1() {
        return this.f81080e1;
    }

    public final v1 j9() {
        v1 v1Var = this.X0;
        if (v1Var != null) {
            return v1Var;
        }
        Intrinsics.r("layoutParamsFactory");
        throw null;
    }

    @Override // sq0.e, nr0.c
    public final void m() {
        com.pinterest.framework.screens.s sVar = ((ku1.j) o7()).f80914l;
        r70.a aVar = sVar != null ? sVar.f49234i : null;
        r70.a aVar2 = aVar instanceof r70.a ? aVar : null;
        if (aVar2 != null) {
            aVar2.k(com.pinterest.framework.screens.u.GO_TO_HOME_FEED_UPSELL);
        }
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(zu1.d.fragment_news_hub_multi_section, zu1.c.news_hub_recycler_view);
        eVar.c(zu1.c.swipe_container);
        eVar.f979c = zu1.c.empty_state_container;
        return eVar;
    }

    @Override // sq0.e, yq0.t
    public final v0 n8() {
        dv1.e eVar = this.f81076a1;
        if ((eVar != null ? eVar.a() : null) != dh.DISPLAY_MODE_SEARCH_GRID) {
            dv1.e eVar2 = this.f81076a1;
            if ((eVar2 != null ? eVar2.c() : null) != tx.FEATURED_EDITORIAL_BOARDS) {
                return super.n8();
            }
        }
        cp.b bVar = new cp.b(this, 26);
        getContext();
        PinterestGridLayoutManager pinterestGridLayoutManager = new PinterestGridLayoutManager(bVar, hf0.b.f69004d);
        pinterestGridLayoutManager.K = new c(this, 0);
        return new v0(pinterestGridLayoutManager);
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        NewsHubSectionHeader newsHubSectionHeader;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View view = getView();
        if (view != null) {
            view.setId(zu1.c.fragment_news_hub_detail);
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        NewsHubSectionHeader newsHubSectionHeader2 = new NewsHubSectionHeader(6, requireContext, (AttributeSet) null);
        newsHubSectionHeader2.setId(zu1.c.news_hub_section_header);
        fo1.a i73 = i7();
        if (i73 != null) {
            ((GestaltToolbarImpl) i73).d(newsHubSectionHeader2);
        }
        ViewGroup.LayoutParams layoutParams = newsHubSectionHeader2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = 0;
        marginLayoutParams.topMargin = 0;
        newsHubSectionHeader2.setLayoutParams(marginLayoutParams);
        this.Y0 = newsHubSectionHeader2;
        fo1.a i74 = i7();
        if (i74 != null) {
            GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i74;
            gestaltToolbarImpl.E();
            if (!gestaltToolbarImpl.isLaidOut() || gestaltToolbarImpl.isLayoutRequested()) {
                gestaltToolbarImpl.addOnLayoutChangeListener(new n5.h(3, i74, this));
            } else {
                gestaltToolbarImpl.H();
                int width = gestaltToolbarImpl.w().getWidth();
                NewsHubSectionHeader newsHubSectionHeader3 = this.Y0;
                if (newsHubSectionHeader3 != null) {
                    newsHubSectionHeader3.getF34975a().setPaddingRelative(0, 0, width, 0);
                    newsHubSectionHeader3.getF34976b().setPaddingRelative(0, 0, width, 0);
                }
            }
        }
        b8(new c0(this, 15));
        addRecyclerViewEventListener(new m(this, 0));
        NewsHubSectionHeader newsHubSectionHeader4 = this.Y0;
        if (newsHubSectionHeader4 != null) {
            b8(new w(newsHubSectionHeader4, this.f81079d1, n8().f19650a));
        }
        F8(getString(zu1.e.empty_network_news_feed_message));
        G8(getResources().getDimensionPixelOffset(eo1.c.toolbar_height));
        b9(bs1.c.X(this, eo1.c.bottom_nav_height));
        if (this.Z0) {
            hx0.e eVar = this.f81077b1;
            if (eVar != null) {
                dv1.e eVar2 = this.f81076a1;
                eVar.w3(eVar2 != null ? eVar2.b() : null);
                return;
            }
            return;
        }
        dv1.e eVar3 = this.f81076a1;
        if (eVar3 == null || (newsHubSectionHeader = this.Y0) == null) {
            return;
        }
        newsHubSectionHeader.d(eq.b.b((ye2.m) getContext(), eVar3.f56395g, eVar3.f56392d).toString());
    }
}
