package kt0;

import android.animation.AnimatorSet;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.pinterest.base.LockableViewPager;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import com.pinterest.feature.home.viewpager.tabs.HomeFeedTabView;
import com.pinterest.feature.home.viewpager.tabs.HomeFeedTunerTab;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.tabs.GestaltTab;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.ui.grid.GridPlaceholderLoadingLayout;
import com.pinterest.ui.tabs.TabBarPlaceholderLoadingLayout;
import d7.j0;
import df.j1;
import ey.j3;
import ey.v4;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.p1;
import lh0.z3;
import m60.t0;
import ps0.r0;
import q5.v0;
import u50.i0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\n\u000bB\t\b\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lkt0/q;", "Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "Lcom/pinterest/feature/home/viewpager/a;", "Lcb2/n;", "Lkt0/c;", "Lkt0/e;", "Landroid/view/View$OnScrollChangeListener;", "Lcom/pinterest/framework/screens/k;", "<init>", "()V", "ps0/y", "kt0/g", "homeFeed_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class q extends a<com.pinterest.feature.home.viewpager.a> implements cb2.n, c, e, View.OnScrollChangeListener, com.pinterest.framework.screens.k {
    public static final /* synthetic */ int R0 = 0;
    public View A0;
    public e0 H0;
    public int I0;
    public boolean L0;
    public f Q0;

    /* renamed from: r0, reason: collision with root package name */
    public uo.a f80847r0;

    /* renamed from: s0, reason: collision with root package name */
    public fv1.b f80848s0;

    /* renamed from: t0, reason: collision with root package name */
    public wk2.a f80849t0;

    /* renamed from: u0, reason: collision with root package name */
    public wk2.a f80850u0;

    /* renamed from: v0, reason: collision with root package name */
    public p1 f80851v0;

    /* renamed from: w0, reason: collision with root package name */
    public b20.c f80852w0;

    /* renamed from: x0, reason: collision with root package name */
    public i92.k f80853x0;

    /* renamed from: y0, reason: collision with root package name */
    public j0 f80854y0;

    /* renamed from: z0, reason: collision with root package name */
    public TabLayout f80855z0;
    public boolean B0 = true;
    public final ArrayList C0 = new ArrayList();
    public final LinkedHashMap D0 = new LinkedHashMap();
    public final xk2.k E0 = xk2.m.a(xk2.n.NONE, new h(this, 0));
    public final xk2.v F0 = xk2.m.b(new h(this, 1));
    public final k G0 = new k(this);
    public int J0 = -1;
    public String K0 = "";
    public final xk2.v M0 = xk2.m.b(new h(this, 2));
    public final int N0 = wp1.e.fragment_home_feed_view_pager_with_tuner;
    public final d4 O0 = d4.FEED;
    public final a4 P0 = a4.FEED_HOME;

    public q() {
        this.Y = true;
        this.Q0 = f.RESET;
    }

    public static final boolean k8(q qVar, int i13) {
        return qVar.J0 == i13;
    }

    public static final boolean l8(q qVar, int i13) {
        return qVar.J0 == i13 - 1;
    }

    public static final boolean m8(q qVar, int i13) {
        return qVar.J0 == i13 + 1;
    }

    public static final void n8(q qVar, int i13, boolean z13) {
        View view;
        TabLayout tabLayout = qVar.f80855z0;
        if (tabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        int size = tabLayout.f33126b.size();
        for (int i14 = 0; i14 < size; i14++) {
            TabLayout tabLayout2 = qVar.f80855z0;
            if (tabLayout2 == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            ek.e n13 = tabLayout2.n(i14);
            if (n13 != null && (view = n13.f59129f) != null) {
                GestaltTab gestaltTab = view instanceof GestaltTab ? (GestaltTab) view : null;
                if (gestaltTab != null) {
                    gestaltTab.L(new rn0.d(z13, 20));
                }
            }
        }
        TabLayout tabLayout3 = qVar.f80855z0;
        if (tabLayout3 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ColorStateList j13 = TabLayout.j(i13, i13);
        if (tabLayout3.f33136l != j13) {
            tabLayout3.f33136l = j13;
            ArrayList arrayList = tabLayout3.f33126b;
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                ((ek.e) arrayList.get(i15)).c();
            }
        }
        TabLayout tabLayout4 = qVar.f80855z0;
        if (tabLayout4 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        tabLayout4.f33140p = i13;
        Drawable drawable = tabLayout4.f33139o;
        if (i13 != 0) {
            drawable.setTint(i13);
        } else {
            drawable.setTintList(null);
        }
        tabLayout4.A(false);
    }

    public static void p8(e0 e0Var) {
        vb0.j.f125466a.N(e0Var, "Expected HomeViewListener to not be null", new Object[0]);
    }

    @Override // nl1.d
    public final boolean H7() {
        return c8() && ((com.pinterest.feature.home.viewpager.a) a8()).f77530g == 0;
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        f7().h(this.G0);
        com.pinterest.framework.screens.s sVar = ((ku1.j) o7()).f80914l;
        r70.a aVar = sVar != null ? sVar.f49234i : null;
        if (!(aVar instanceof r70.a)) {
            aVar = null;
        }
        int i13 = 0;
        if (aVar != null) {
            aVar.e(0, null);
        }
        nl1.d Z7 = Z7();
        HomeFeedFragment homeFeedFragment = Z7 instanceof HomeFeedFragment ? (HomeFeedFragment) Z7 : null;
        if (homeFeedFragment != null) {
            ps0.c cVar = homeFeedFragment.f45768x1;
            if (homeFeedFragment.I1 && cVar != null && ((r0) cVar).f109906r.size() != 0) {
                homeFeedFragment.p9();
            }
        }
        TabLayout tabLayout = this.f80855z0;
        if (tabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        tabLayout.setOnScrollChangeListener(this);
        uo.a aVar2 = this.f80847r0;
        if (aVar2 == null) {
            Intrinsics.r("graphQLNewsHubDataSource");
            throw null;
        }
        xj2.c o13 = aVar2.b().r(tk2.e.f118017c).l(wj2.c.a()).o(new com.pinterest.feature.home.model.h(1, new l(this, i13)), new com.pinterest.feature.home.model.h(2, new l(this, 1)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        R6(o13);
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d
    public final void L7() {
        super.L7();
        if (j1.E1() && !((Boolean) this.F0.getValue()).booleanValue()) {
            com.pinterest.framework.screens.s sVar = ((ku1.j) o7()).f80914l;
            r70.a aVar = sVar != null ? sVar.f49234i : null;
            if (!(aVar instanceof r70.a)) {
                aVar = null;
            }
            if (aVar != null) {
                aVar.d();
            }
        }
        f7().j(this.G0);
        TabLayout tabLayout = this.f80855z0;
        if (tabLayout != null) {
            tabLayout.setOnScrollChangeListener(null);
        } else {
            Intrinsics.r("tabLayout");
            throw null;
        }
    }

    @Override // com.pinterest.framework.screens.k
    public final void P4(Bundle bundle) {
        if (c8()) {
            b8().w(0, false);
            s8(0);
            ComponentCallbacks u13 = ((com.pinterest.feature.home.viewpager.a) a8()).u(0);
            if (u13 == null || !(u13 instanceof com.pinterest.framework.screens.k)) {
                return;
            }
            ((com.pinterest.framework.screens.k) u13).P4(null);
        }
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, androidx.fragment.app.Fragment, oc2.j
    public final View T() {
        return null;
    }

    @Override // yq0.w
    public final void T0(long j13) {
        ComponentCallbacks u13;
        p8(this.H0);
        if (c8() && (u13 = ((com.pinterest.feature.home.viewpager.a) a8()).u(0)) != null && (u13 instanceof yq0.w)) {
            ((yq0.w) u13).T0(j13);
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        wk2.a aVar = this.f80849t0;
        if (aVar == null) {
            Intrinsics.r("presenterProvider");
            throw null;
        }
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (yk1.m) obj;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        if (!c8()) {
            return false;
        }
        if (((com.pinterest.feature.home.viewpager.a) a8()).f77530g != 0) {
            s8(0);
            this.B0 = true;
            return true;
        }
        nl1.d Z7 = Z7();
        HomeFeedFragment homeFeedFragment = Z7 instanceof HomeFeedFragment ? (HomeFeedFragment) Z7 : null;
        if (homeFeedFragment != null) {
            return homeFeedFragment.getF103154e0();
        }
        return false;
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF22577t0() {
        return this.P0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF103061h0() {
        return this.O0;
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, xa.i
    public final void i5(int i13) {
        int i14;
        super.i5(i13);
        int i15 = this.J0;
        if (i15 == -1) {
            return;
        }
        if (i13 == 0 && (i14 = this.I0) != i15 && (i14 == i15 - 1 || i14 == i15 + 1)) {
            f7().f(new te1.c(false));
            return;
        }
        TabLayout tabLayout = this.f80855z0;
        if (tabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ek.e n13 = tabLayout.n(this.I0);
        KeyEvent.Callback callback = n13 != null ? n13.f59129f : null;
        GestaltTab gestaltTab = callback instanceof GestaltTab ? (GestaltTab) callback : null;
        boolean z13 = gestaltTab != null && gestaltTab.getId() == t0.pinterest_picks_tab;
        if (z13 && i13 == 1) {
            f7().f(new te1.c(false));
        } else if (z13 && i13 == 0) {
            f7().f(new te1.c(true));
        }
    }

    public final void o8(GestaltTab gestaltTab) {
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(gestaltTab, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String obj = gestaltTab.T().f100735a.a(context).toString();
        SpannableString valueOf = SpannableString.valueOf(obj);
        int C = bs1.c.C(this, wp1.a.tab_gradient_start);
        int C2 = bs1.c.C(this, wp1.a.tab_gradient_end);
        valueOf.setSpan(new cf0.a(obj, C, C2, obj), 0, obj.length(), 33);
        new cf0.a(obj, C, C2, obj);
        gestaltTab.L(new i(valueOf, 3));
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = this.N0;
        this.f45640g0 = 1;
        wk2.a aVar = this.f80850u0;
        if (aVar == null) {
            Intrinsics.r("adapterProvider");
            throw null;
        }
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        f8((jr.a) obj);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        super.onPause();
        ir.c cVar = (ir.c) this.E0.getValue();
        if (cVar != null) {
            AnimatorSet animatorSet3 = cVar.f73451b;
            if (animatorSet3 != null && animatorSet3.isRunning() && (animatorSet2 = cVar.f73451b) != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet4 = cVar.f73452c;
            if (animatorSet4 != null && animatorSet4.isRunning() && (animatorSet = cVar.f73452c) != null) {
                animatorSet.cancel();
            }
            GridPlaceholderLoadingLayout b13 = cVar.b();
            if (b13 != null) {
                b13.g();
            }
            TabBarPlaceholderLoadingLayout c13 = cVar.c();
            if (c13 != null) {
                c13.g();
            }
        }
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (c8()) {
            outState.putInt("HOME_FEED_VIEW_PAGER_CURRENT_POSITION", ((com.pinterest.feature.home.viewpager.a) a8()).f77530g);
        }
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i13, int i14, int i15, int i16) {
        Context context = getContext();
        boolean z13 = context != null && j1.Y0(context);
        if ((i15 <= i13 || z13) && (i15 >= i13 || !z13 || i15 == 0)) {
            j0 r83 = r8();
            TabLayout tabLayout = this.f80855z0;
            if (tabLayout != null) {
                r83.b(tabLayout, this.H0);
                return;
            } else {
                Intrinsics.r("tabLayout");
                throw null;
            }
        }
        j0 r84 = r8();
        TabLayout tabLayout2 = this.f80855z0;
        if (tabLayout2 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        e0 e0Var = this.H0;
        Intrinsics.checkNotNullParameter(tabLayout2, "tabLayout");
        int i17 = r84.f53836c;
        if (i17 == -1) {
            return;
        }
        kotlin.ranges.a o13 = ql2.s.o(ql2.s.q(0, i17 + 1));
        int i18 = o13.f80453a;
        int i19 = o13.f80454b;
        int i23 = o13.f80455c;
        if ((i23 > 0 && i18 <= i19) || (i23 < 0 && i19 <= i18)) {
            while (true) {
                ek.e n13 = tabLayout2.n(i18);
                View view2 = n13 != null ? n13.f59129f : null;
                if (view2 != null) {
                    boolean e13 = r84.e(view2);
                    if (!e13) {
                        ((Set) r84.f53838e).remove(Integer.valueOf(i18));
                        if (i18 < r84.f53835b) {
                            r84.f53835b = i18 + 1;
                            return;
                        } else {
                            int i24 = r84.f53836c;
                            if (i18 <= i24) {
                                r84.f53836c = i24 - 1;
                            }
                        }
                    }
                    if (e13 && !((Set) r84.f53838e).contains(Integer.valueOf(i18))) {
                        r84.f(n13, i18, e0Var);
                    }
                }
                if (i18 == i19) {
                    break;
                } else {
                    i18 += i23;
                }
            }
        }
        r84.f53835b = 0;
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (bundle != null) {
            e8(bundle.getInt("HOME_FEED_VIEW_PAGER_CURRENT_POSITION", -1));
        } else if (j3.f60517h && Build.VERSION.SDK_INT >= 33) {
            bs1.c.U1(view.findViewById(t0.home_feed_tab_bar_cover));
        }
        super.onViewCreated(view, bundle);
        this.A0 = view.findViewById(t0.home_feed_view_pager_tab_layout_container);
        View findViewById = view.findViewById(t0.home_feed_view_pager_tab_layout);
        GestaltTabLayout gestaltTabLayout = (GestaltTabLayout) findViewById;
        if (gestaltTabLayout.f33150z != 2) {
            gestaltTabLayout.f33150z = 2;
            gestaltTabLayout.h();
        }
        Y7(new g(this));
        gestaltTabLayout.b(new p(this));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        TabLayout tabLayout = (TabLayout) findViewById;
        this.f80855z0 = tabLayout;
        if (tabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        if (tabLayout.f33138n != null) {
            tabLayout.f33138n = null;
            int i13 = 0;
            while (true) {
                ek.d dVar = tabLayout.f33128d;
                if (i13 >= dVar.getChildCount()) {
                    break;
                }
                View childAt = dVar.getChildAt(i13);
                if (childAt instanceof ek.h) {
                    ((ek.h) childAt).d(tabLayout.getContext());
                }
                i13++;
            }
        }
        this.C0.add(tabLayout);
    }

    public final ek.e q8() {
        GestaltIconButton gestaltIconButton;
        TabLayout tabLayout = this.f80855z0;
        AttributeSet attributeSet = null;
        if (tabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ek.e p13 = tabLayout.p();
        Intrinsics.checkNotNullExpressionValue(p13, "newTab(...)");
        TabLayout tabLayout2 = this.f80855z0;
        if (tabLayout2 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        Context context = tabLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HomeFeedTunerTab homeFeedTunerTab = new HomeFeedTunerTab(6, context, attributeSet);
        homeFeedTunerTab.setOnClickListener(new com.google.android.material.textfield.a(this, 2));
        if (((Boolean) this.M0.getValue()).booleanValue() && (gestaltIconButton = (GestaltIconButton) homeFeedTunerTab.findViewById(wp1.d.tab_icon)) != null) {
            gestaltIconButton.t(new i(this, 0));
        }
        p13.f59129f = homeFeedTunerTab;
        p13.c();
        return p13;
    }

    public final j0 r8() {
        j0 j0Var = this.f80854y0;
        if (j0Var != null) {
            return j0Var;
        }
        Intrinsics.r("tabsVisibilityLoggingHelper");
        throw null;
    }

    public final void s8(Integer num) {
        int i13 = this.I0;
        if (num != null && num.intValue() == i13) {
            if (H7() && c8()) {
                ComponentCallbacks u13 = ((com.pinterest.feature.home.viewpager.a) a8()).u(b8().j());
                if (u13 instanceof d) {
                    HomeFeedFragment homeFeedFragment = (HomeFeedFragment) ((d) u13);
                    homeFeedFragment.getClass();
                    Intrinsics.checkNotNullParameter(this, "listener");
                    homeFeedFragment.f45767w1 = this;
                    return;
                }
                return;
            }
            return;
        }
        this.I0 = num != null ? num.intValue() : 0;
        ((LockableViewPager) b8().f21278a).A(this.I0);
        TabLayout tabLayout = this.f80855z0;
        if (tabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ek.e n13 = tabLayout.n(this.I0);
        if (n13 != null) {
            n13.b();
        }
        z8(this.I0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        if ((r5 - r6) < (r13.getDimension(om1.t.button_size_md) + (r13.getDimension(eo1.c.sema_space_400) * r7))) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t8(boolean r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kt0.q.t8(boolean):void");
    }

    public final void u8(boolean z13) {
        this.L0 = z13;
    }

    public final void v8(boolean z13) {
        if (!c8()) {
            return;
        }
        com.pinterest.feature.home.viewpager.a aVar = (com.pinterest.feature.home.viewpager.a) a8();
        if (aVar.f77529f.size() != 0) {
            aVar.E();
        }
        while (true) {
            TabLayout tabLayout = this.f80855z0;
            if (tabLayout == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            if (tabLayout.f33126b.size() <= 1) {
                if (z13) {
                    TabLayout tabLayout2 = this.f80855z0;
                    if (tabLayout2 == null) {
                        Intrinsics.r("tabLayout");
                        throw null;
                    }
                    ek.e n13 = tabLayout2.n(0);
                    KeyEvent.Callback callback = n13 != null ? n13.f59129f : null;
                    HomeFeedTabView homeFeedTabView = callback instanceof HomeFeedTabView ? (HomeFeedTabView) callback : null;
                    if (homeFeedTabView != null) {
                        o nextState = o.f80840j;
                        Intrinsics.checkNotNullParameter(nextState, "nextState");
                    }
                    t8(true);
                    return;
                }
                return;
            }
            TabLayout tabLayout3 = this.f80855z0;
            if (tabLayout3 == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            tabLayout3.s(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    public final void w8(int i13, List tabDataList, boolean z13) {
        ?? r53;
        Intrinsics.checkNotNullParameter(tabDataList, "allTabs");
        if (c8()) {
            com.pinterest.feature.home.viewpager.a aVar = (com.pinterest.feature.home.viewpager.a) a8();
            Intrinsics.checkNotNullParameter(tabDataList, "tabDataList");
            int i14 = 1;
            boolean z14 = aVar.f45883o;
            if (z14) {
                aVar.f77528e = true;
            }
            if (aVar.f77529f.size() != 0) {
                if ((!tabDataList.isEmpty()) && com.pinterest.feature.home.viewpager.a.H(((lt0.e) tabDataList.get(0)).f84789i) && aVar.m(((lt0.e) tabDataList.get(0)).f84786f)) {
                    aVar.E();
                }
                r53 = new ArrayList();
                for (Object obj : tabDataList) {
                    lt0.e eVar = (lt0.e) obj;
                    if (!com.pinterest.feature.home.viewpager.a.H(eVar.f84789i) || (com.pinterest.feature.home.viewpager.a.H(eVar.f84789i) && !aVar.m(eVar.f84786f))) {
                        r53.add(obj);
                    }
                }
            } else {
                r53 = tabDataList;
            }
            Iterable<lt0.e> iterable = (Iterable) r53;
            ArrayList arrayList = new ArrayList(g0.q(iterable, 10));
            for (lt0.e eVar2 : iterable) {
                wk2.a aVar2 = eVar2.f84781a;
                Intrinsics.f(aVar2);
                ScreenModel p13 = jr.a.p((ScreenLocation) aVar2.get(), eVar2.f84785e, eVar2.f84786f);
                Intrinsics.checkNotNullExpressionValue(p13, "createScreenDescription(...)");
                arrayList.add(p13);
            }
            if (z14) {
                aVar.f77528e = false;
                int size = aVar.f77529f.size();
                aVar.D(0, new rq.a0(size, arrayList, aVar, 3), new n(aVar, i14), size == 0 ? arrayList.size() : 1 + arrayList.size());
            } else {
                aVar.k(arrayList);
            }
            x8(i13, tabDataList, z13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x8(int i13, List allTabs, boolean z13) {
        View fragmentView;
        ek.e p13;
        e0 e0Var;
        int i14;
        String str;
        Intrinsics.checkNotNullParameter(allTabs, "allTabs");
        TabLayout tabLayout = this.f80855z0;
        if (tabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        p1 experiments = this.f80851v0;
        if (experiments == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        Intrinsics.checkNotNullParameter(allTabs, "allTabs");
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        int size = tabLayout.f33126b.size();
        int i15 = 1;
        if (size >= 1) {
            ek.e n13 = tabLayout.n(size - 1);
            if ((n13 != null ? n13.f59129f : null) instanceof HomeFeedTunerTab) {
                size--;
            }
        }
        if (size == allTabs.size()) {
            while (i14 < size) {
                ek.e n14 = tabLayout.n(i14);
                View view = n14 != null ? n14.f59129f : null;
                if (view != null && view.getId() == ((lt0.e) allTabs.get(i14)).f84787g) {
                    boolean z14 = view instanceof HomeFeedTabView;
                    if (z14) {
                        i0 i0Var = ((HomeFeedTabView) view).L().f84771b;
                        Context context = tabLayout.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        str = i0Var.a(context).toString();
                    } else if (view instanceof GestaltTab) {
                        GestaltTab gestaltTab = (GestaltTab) view;
                        Context context2 = tabLayout.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        Intrinsics.checkNotNullParameter(gestaltTab, "<this>");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        str = gestaltTab.T().f100735a.a(context2).toString();
                    } else {
                        str = "";
                    }
                    i14 = (Intrinsics.d(str, ((lt0.e) allTabs.get(i14)).f84782b) && (!z14 || Intrinsics.d(((HomeFeedTabView) view).L().f84775f, ((lt0.e) allTabs.get(i14)).f84783c))) ? i14 + 1 : 0;
                }
            }
            if (allTabs.size() > 1 || z13 || (e0Var = this.H0) == null) {
                return;
            }
            pg0.t tVar = new pg0.t();
            m60.w wVar = e0Var.f80808b;
            wVar.f(tVar);
            e0Var.f80824r = true;
            r70.m mVar = e0Var.f80825s;
            if (mVar != null) {
                wVar.f(mVar);
                e0Var.f80825s = null;
                return;
            }
            return;
        }
        TabLayout tabLayout2 = this.f80855z0;
        if (tabLayout2 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        tabLayout2.r();
        this.K0 = "";
        this.J0 = -1;
        int i16 = 0;
        for (Object obj : allTabs) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            lt0.e eVar = (lt0.e) obj;
            TabLayout tabLayout3 = this.f80855z0;
            if (tabLayout3 == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            boolean z15 = allTabs.size() > i15 ? i15 : 0;
            p1 p1Var = this.f80851v0;
            if (p1Var == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            z3 z3Var = lh0.a4.f83298b;
            g1 g1Var = (g1) p1Var.f83456a;
            if (g1Var.o("hfp_visual_tabs_android", "enabled", z3Var) || g1Var.l("hfp_visual_tabs_android")) {
                TabLayout tabLayout4 = this.f80855z0;
                if (tabLayout4 == null) {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
                p13 = tabLayout4.p();
                Intrinsics.checkNotNullExpressionValue(p13, "newTab(...)");
                TabLayout tabLayout5 = this.f80855z0;
                if (tabLayout5 == null) {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
                Context context3 = tabLayout5.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                String str2 = eVar.f84782b;
                u50.f0 x13 = ep.b.x(str2, "string", str2);
                String str3 = eVar.f84788h;
                p13.f59129f = new HomeFeedTabView(context3, new lt0.b(i16, x13, ep.b.x(str3, "string", str3), z15, eVar.f84787g, eVar.f84783c, eVar.f84784d));
                p13.c();
            } else {
                TabLayout tabLayout6 = this.f80855z0;
                if (tabLayout6 == null) {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
                String tabText = eVar.f84782b;
                pn1.c tabSize = pn1.c.SMALL;
                Intrinsics.checkNotNullParameter(tabLayout6, "tabLayout");
                Intrinsics.checkNotNullParameter(tabText, "tabText");
                Intrinsics.checkNotNullParameter(tabSize, "tabSize");
                p13 = j1.H(tabLayout6, bs1.c.h2(tabText), eVar.f84787g, null, tabSize);
                View view2 = p13.f59129f;
                GestaltTab gestaltTab2 = view2 instanceof GestaltTab ? (GestaltTab) view2 : null;
                if (gestaltTab2 != null) {
                    gestaltTab2.L(new u00.e(eVar, 8));
                    if (Intrinsics.d(eVar.f84790j, "pinterest_picks")) {
                        this.K0 = eVar.f84782b;
                        this.J0 = i16;
                        o8(gestaltTab2);
                    }
                }
            }
            tabLayout3.e(p13, i16 == i13);
            i16 = i17;
            i15 = 1;
        }
        j0 r83 = r8();
        r83.f53835b = 0;
        r83.f53836c = -1;
        ((Set) r83.f53838e).clear();
        TabLayout tabLayout7 = this.f80855z0;
        if (tabLayout7 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ek.e n15 = tabLayout7.n(tabLayout7.f33126b.size() - 1);
        if (n15 != null && (fragmentView = n15.f59129f) != null) {
            v4 action = new v4(this, z13, 1);
            Intrinsics.checkNotNullParameter(fragmentView, "fragmentView");
            Intrinsics.checkNotNullParameter(action, "action");
            WeakHashMap weakHashMap = v0.f102521a;
            if (!fragmentView.isLaidOut() || fragmentView.isLayoutRequested()) {
                fragmentView.addOnLayoutChangeListener(new m(action));
            } else {
                action.invoke();
            }
        }
        if (allTabs.size() > 1) {
        }
    }

    public final void y8(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.Q0 = fVar;
    }

    public final void z8(int i13) {
        int i14 = this.J0;
        if (i14 == -1) {
            return;
        }
        TabLayout tabLayout = this.f80855z0;
        if (tabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ek.e n13 = tabLayout.n(i14);
        KeyEvent.Callback callback = n13 != null ? n13.f59129f : null;
        GestaltTab gestaltTab = callback instanceof GestaltTab ? (GestaltTab) callback : null;
        if (gestaltTab == null) {
            return;
        }
        if (i13 != this.J0) {
            o8(gestaltTab);
        } else if (j1.U0(this.K0)) {
            gestaltTab.L(new i(this, 2));
        }
    }
}
