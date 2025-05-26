package jw0;

import a.cb;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import dl1.s;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.r0;
import m60.t0;
import m60.v0;
import m60.w;
import m60.x0;
import np0.h;
import nr0.m;
import nx.f0;
import so.oa;
import x02.i2;
import x02.v1;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljw0/d;", "Lwk1/k;", "Ldl1/s;", "Lhw0/a;", "Lnr0/j;", "<init>", "()V", "interest_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends a<s> implements hw0.a {

    /* renamed from: e1, reason: collision with root package name */
    public static final /* synthetic */ int f77658e1 = 0;
    public GestaltButton.SmallSecondaryButton R0;
    public View S0;
    public GestaltText T0;
    public boolean U0;
    public iw0.c W0;
    public i2 X0;
    public g0 Y0;
    public x12.a Z0;

    /* renamed from: a1, reason: collision with root package name */
    public f0 f77659a1;

    /* renamed from: b1, reason: collision with root package name */
    public v1 f77660b1;

    /* renamed from: c1, reason: collision with root package name */
    public m f77661c1;
    public String V0 = "";

    /* renamed from: d1, reason: collision with root package name */
    public final d4 f77662d1 = d4.FEED;

    @Override // nl1.d, ec2.o
    public final ac2.m P0() {
        return B7();
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        boolean z13 = false;
        if (navigation != null && navigation.J1("com.pinterest.EXTRA_INTEREST_TYPE") == wp.a.getValue(wp.a.KLP)) {
            z13 = true;
        }
        this.U0 = z13;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        if (f49940b == null) {
            f49940b = "";
        }
        this.V0 = f49940b;
    }

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, requireContext, (AttributeSet) null);
        String string = getString(x0.follow);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.f(smallSecondaryButton, string);
        ViewGroup.LayoutParams layoutParams = smallSecondaryButton.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int dimensionPixelSize = smallSecondaryButton.getResources().getDimensionPixelSize(r0.margin_half);
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        marginLayoutParams.height = smallSecondaryButton.getResources().getDimensionPixelSize(es1.a.search_topbar_height) - dimensionPixelSize;
        smallSecondaryButton.e(new h(this, 20));
        this.R0 = smallSecondaryButton;
        View inflate = LayoutInflater.from(requireContext).inflate(v0.view_actionbar_search, (ViewGroup) gestaltToolbarImpl, false);
        this.T0 = ((GestaltText) inflate.findViewById(t0.search_tv)).i(c.f77657i);
        gestaltToolbarImpl.d(inflate);
        this.S0 = inflate;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        i2 i2Var = this.X0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        boolean z13 = this.U0;
        f0 f0Var = this.f77659a1;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        bVar.g(new fq0.a(z13, f0Var, 1));
        wk1.c a13 = bVar.a();
        boolean z14 = this.U0;
        String str = this.V0;
        g0 g0Var = this.Y0;
        if (g0Var == null) {
            Intrinsics.r("pageSizeProvider");
            throw null;
        }
        x12.a aVar = this.Z0;
        if (aVar == null) {
            Intrinsics.r("pagedListService");
            throw null;
        }
        v1 v1Var = this.f77660b1;
        if (v1Var == null) {
            Intrinsics.r("interestRepository");
            throw null;
        }
        yk1.a aVar2 = new yk1.a(requireContext().getResources(), requireContext().getTheme());
        w f73 = f7();
        m mVar = this.f77661c1;
        if (mVar != null) {
            return new iw0.c(z14, str, g0Var, a13, aVar, v1Var, aVar2, f73, mVar);
        }
        Intrinsics.r("dynamicGridViewBinderDelegateFactory");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF78844q0() {
        return this.f77662d1;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(es1.c.fragment_interest, es1.b.p_recycler_view);
        eVar.f979c = es1.b.empty_state_container;
        eVar.c(es1.b.swipe_container);
        return eVar;
    }
}
