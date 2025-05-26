package ov1;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.pinterest.api.model.px0;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import com.pinterest.ui.grid.GridPlaceholderLoadingLayout;
import com.pinterest.ui.grid.PinterestRecyclerView;
import de1.c0;
import de1.d0;
import de1.e0;
import de1.h0;
import de1.m0;
import de1.r0;
import h32.a4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jc0.v;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.k2;
import lh0.z0;
import lh0.z3;
import m60.w;
import uj2.q;
import vy.m;

/* loaded from: classes4.dex */
public final class k implements e0, c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f97733a;

    /* renamed from: b, reason: collision with root package name */
    public final View f97734b;

    /* renamed from: c, reason: collision with root package name */
    public final f f97735c;

    /* renamed from: d, reason: collision with root package name */
    public final uk1.d f97736d;

    /* renamed from: e, reason: collision with root package name */
    public final q f97737e;

    /* renamed from: f, reason: collision with root package name */
    public final w f97738f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f97739g;

    /* renamed from: h, reason: collision with root package name */
    public final k2 f97740h;

    /* renamed from: i, reason: collision with root package name */
    public final yk1.a f97741i;

    /* renamed from: j, reason: collision with root package name */
    public final OneBarContainer f97742j;

    /* renamed from: k, reason: collision with root package name */
    public final PinterestRecyclerView f97743k;

    /* renamed from: l, reason: collision with root package name */
    public GridPlaceholderLoadingLayout f97744l;

    /* renamed from: m, reason: collision with root package name */
    public qv1.f f97745m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f97746n;

    /* renamed from: o, reason: collision with root package name */
    public final pv1.e f97747o;

    /* renamed from: p, reason: collision with root package name */
    public d0 f97748p;

    /* renamed from: q, reason: collision with root package name */
    public final zd1.e0 f97749q;

    /* renamed from: r, reason: collision with root package name */
    public zd1.d0 f97750r;

    public /* synthetic */ k(Context context, View view, f fVar, uk1.d dVar, q qVar, w wVar, boolean z13, int i13, m mVar, b60.b bVar, lb0.q qVar2, k2 k2Var, e eVar, r0 r0Var, int i14) {
        this(context, view, fVar, dVar, qVar, wVar, z13, i13, mVar, bVar, qVar2, k2Var, eVar, (i14 & 8192) != 0, r0Var, false, null, null);
    }

    public final void a(String moduleId) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        this.f97747o.F3(moduleId);
    }

    public final void b(String pinId, d0 inlineFilterUpdateListener) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(inlineFilterUpdateListener, "inlineFilterUpdateListener");
        this.f97748p = inlineFilterUpdateListener;
        i iVar = new i(this);
        e3.a aVar = new e3.a(5);
        uk1.d dVar = this.f97736d;
        aVar.p(dVar.j(), a4.ONEBAR_DRAWER, null, null);
        this.f97750r = new m0(new uk1.d(aVar, dVar.f122379a, ""), this.f97737e, pinId, new yk1.a(this.f97734b.getResources(), this.f97733a.getTheme()), iVar, null, this.f97739g, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN);
    }

    public final boolean c() {
        return this.f97746n;
    }

    public final void d() {
        bs1.c.X0(this.f97742j);
        bs1.c.X0(this.f97743k);
    }

    public final void e() {
        this.f97743k.animate().alpha(0.0f).setDuration(200L).withEndAction(new v.k(this, this.f97742j.getHeight(), 17)).start();
    }

    public final void f(int i13) {
        this.f97742j.setBackgroundColor(i13);
    }

    public final void g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f97747o.x3(items);
    }

    @Override // de1.e0
    public final void g4(h0 unifiedInlineFilterDataModel) {
        Intrinsics.checkNotNullParameter(unifiedInlineFilterDataModel, "unifiedInlineFilterDataModel");
        zd1.d0 d0Var = this.f97750r;
        if (d0Var != null) {
            this.f97738f.f(new v(d0Var, false, 0L, 30));
            ArrayList arrayList = unifiedInlineFilterDataModel.f54574c;
            if (arrayList != null) {
                ((m0) d0Var).i(arrayList);
            }
            String str = unifiedInlineFilterDataModel.f54573b;
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                px0 px0Var = unifiedInlineFilterDataModel.f54572a;
                str = ph.a.S((px0Var != null ? px0Var.o() : -1).intValue(), this.f97741i);
            }
            String str2 = str;
            String valueOf = String.valueOf(t32.f.PRODUCT_MERCHANT.getValue());
            String str3 = unifiedInlineFilterDataModel.f54576e;
            ((m0) d0Var).b(str2, Intrinsics.d(str3, valueOf) || Intrinsics.d(str3, String.valueOf(t32.f.PRODUCT_BRAND.getValue())) || unifiedInlineFilterDataModel.f54575d, unifiedInlineFilterDataModel.f54576e, unifiedInlineFilterDataModel.f54580i, unifiedInlineFilterDataModel.f54577f, false);
        }
    }

    public final void h(boolean z13) {
        PinterestRecyclerView pinterestRecyclerView = this.f97743k;
        OneBarContainer oneBarContainer = this.f97742j;
        if (z13 && this.f97746n) {
            if (this.f97745m == null) {
                Integer num = this.f97735c.f97727c;
                if (num != null) {
                    int intValue = num.intValue();
                    View view = this.f97734b;
                    PinterestEmptyStateLayout pinterestEmptyStateLayout = (PinterestEmptyStateLayout) view.findViewById(intValue);
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout = new GridPlaceholderLoadingLayout(6, context, (AttributeSet) (false ? 1 : 0));
                    this.f97744l = gridPlaceholderLoadingLayout;
                    if (pinterestEmptyStateLayout != null) {
                        pinterestEmptyStateLayout.addView(gridPlaceholderLoadingLayout, 0);
                    }
                    GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout2 = this.f97744l;
                    Object layoutParams = gridPlaceholderLoadingLayout2 != null ? gridPlaceholderLoadingLayout2.getLayoutParams() : null;
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(m60.r0.search_toolbar_height);
                        int marginStart = marginLayoutParams.getMarginStart();
                        int marginEnd = marginLayoutParams.getMarginEnd();
                        int i13 = marginLayoutParams.bottomMargin;
                        marginLayoutParams.setMarginStart(marginStart);
                        marginLayoutParams.topMargin = dimensionPixelOffset;
                        marginLayoutParams.setMarginEnd(marginEnd);
                        marginLayoutParams.bottomMargin = i13;
                    }
                    Context context2 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
                    k2 k2Var = this.f97740h;
                    k2Var.getClass();
                    Intrinsics.checkNotNullParameter(activate, "activate");
                    qv1.f fVar = new qv1.f(context2, ((g1) k2Var.f83403a).g("android_search_filter_button_migration_expansion", activate) != null);
                    this.f97745m = fVar;
                    pinterestEmptyStateLayout.addView(fVar, 0);
                }
            }
            bs1.c.X0(oneBarContainer);
            bs1.c.X0(pinterestRecyclerView);
            GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout3 = this.f97744l;
            if (gridPlaceholderLoadingLayout3 != null) {
                bs1.c.U1(gridPlaceholderLoadingLayout3);
            }
            GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout4 = this.f97744l;
            if (gridPlaceholderLoadingLayout4 != null) {
                gridPlaceholderLoadingLayout4.i();
            }
            qv1.f fVar2 = this.f97745m;
            if (fVar2 != null) {
                bs1.c.U1(fVar2);
            }
            qv1.f fVar3 = this.f97745m;
            if (fVar3 != null) {
                fVar3.d();
                return;
            }
            return;
        }
        qv1.f fVar4 = this.f97745m;
        if (fVar4 != null) {
            bs1.c.X0(fVar4);
        }
        GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout5 = this.f97744l;
        if (gridPlaceholderLoadingLayout5 != null) {
            bs1.c.X0(gridPlaceholderLoadingLayout5);
        }
        bs1.c.U1(oneBarContainer);
        bs1.c.U1(pinterestRecyclerView);
    }

    public final void i(int i13) {
        this.f97743k.setBackgroundColor(i13);
    }

    public final void j(int i13) {
        this.f97743k.getLayoutParams().height = i13;
    }

    public final void k(d screenModuleListener) {
        Intrinsics.checkNotNullParameter(screenModuleListener, "screenModuleListener");
        this.f97747o.f101481k = screenModuleListener;
    }

    public final void l(Function0 searchParametersProvider) {
        Intrinsics.checkNotNullParameter(searchParametersProvider, "searchParametersProvider");
        OneBarContainer oneBarContainer = this.f97742j;
        oneBarContainer.getClass();
        Intrinsics.checkNotNullParameter(searchParametersProvider, "<set-?>");
        oneBarContainer.f49985i = searchParametersProvider;
        this.f97747o.N3(searchParametersProvider);
    }

    public final void m() {
        bs1.c.U1(this.f97742j);
        bs1.c.U1(this.f97743k);
    }

    public final void n() {
        OneBarContainer oneBarContainer = this.f97742j;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(oneBarContainer.getWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        PinterestRecyclerView pinterestRecyclerView = this.f97743k;
        pinterestRecyclerView.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = pinterestRecyclerView.getMeasuredHeight();
        oneBarContainer.getLayoutParams().height = 0;
        oneBarContainer.setVisibility(0);
        oneBarContainer.setAlpha(1.0f);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, measuredHeight);
        ofInt.setDuration(100L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new androidx.media3.ui.c(oneBarContainer, 19));
        ofInt.addListener(new j(this, 1));
        ofInt.start();
    }

    @Override // de1.c0
    public final void w0(q42.f searchOneBarModuleType, h0 unifiedInlineFilterDataModel) {
        zd1.e0 e0Var;
        Intrinsics.checkNotNullParameter(searchOneBarModuleType, "searchOneBarModuleType");
        Intrinsics.checkNotNullParameter(unifiedInlineFilterDataModel, "unifiedInlineFilterDataModel");
        int i13 = h.f97729a[searchOneBarModuleType.ordinal()];
        if (i13 == 1 || i13 == 2) {
            px0 px0Var = unifiedInlineFilterDataModel.f54572a;
            ArrayList filterList = px0Var != null ? ph.a.N(px0Var) : null;
            String productFilterType = String.valueOf(px0Var != null ? px0Var.o() : null);
            if (filterList == null || (e0Var = this.f97749q) == null) {
                return;
            }
            Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
            Intrinsics.checkNotNullParameter(filterList, "filterList");
            LinkedHashMap linkedHashMap = e0Var.f141707b;
            if (!unifiedInlineFilterDataModel.f54579h) {
                LinkedHashMap linkedHashMap2 = e0Var.f141708c;
                if ((true ^ linkedHashMap2.isEmpty()) && !linkedHashMap2.containsKey(productFilterType) && linkedHashMap.containsKey(productFilterType)) {
                    linkedHashMap.put(productFilterType, filterList);
                    Pair c13 = e0Var.c(productFilterType);
                    if (c13 == null || ((ArrayList) c13.f80346a) == null) {
                        return;
                    }
                    Iterator it = e0Var.f141709d.iterator();
                    if (it.hasNext()) {
                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                        throw null;
                    }
                    return;
                }
            }
            linkedHashMap.putIfAbsent(productFilterType, filterList);
        }
    }

    @Override // de1.c0
    public final void w1(String productFilterType, boolean z13, h0 unifiedInlineFilterDataModel) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        Intrinsics.checkNotNullParameter(unifiedInlineFilterDataModel, "unifiedInlineFilterDataModel");
        zd1.e0 e0Var = this.f97749q;
        Pair c13 = e0Var != null ? e0Var.c(productFilterType) : null;
        if (!z13) {
            if (c13 != null) {
                g4(h0.a(unifiedInlineFilterDataModel, null, null, (ArrayList) c13.f80346a, ((Boolean) c13.f80347b).booleanValue(), productFilterType, 483));
                return;
            }
            return;
        }
        if (c13 == null || (arrayList = (ArrayList) c13.f80346a) == null) {
            return;
        }
        boolean z14 = !unifiedInlineFilterDataModel.f54579h;
        de1.a aVar = (z14 || e0Var == null || e0Var.f141708c.size() != 1) ? de1.a.APPLY : de1.a.CLEAR;
        ph.a.H0(z14, arrayList);
        de1.a aVar2 = de1.a.APPLY;
        pv1.e eVar = this.f97747o;
        if (aVar == aVar2) {
            if (e0Var != null) {
                e0Var.h(productFilterType, arrayList);
            }
            t32.d dVar = t32.f.Companion;
            int parseInt = Integer.parseInt(productFilterType);
            dVar.getClass();
            eVar.Q3(t32.d.a(parseInt), arrayList);
        } else {
            if (e0Var != null) {
                e0Var.g(productFilterType);
            }
            t32.d dVar2 = t32.f.Companion;
            int parseInt2 = Integer.parseInt(productFilterType);
            dVar2.getClass();
            eVar.G3(t32.d.a(parseInt2));
        }
        d0 d0Var = this.f97748p;
        if (d0Var != null) {
            t32.d dVar3 = t32.f.Companion;
            int parseInt3 = Integer.parseInt(productFilterType);
            dVar3.getClass();
            d0.b3(d0Var, arrayList, 1, aVar, true, t32.d.a(parseInt3), 32);
        }
        if (e0Var != null) {
            ArrayList e13 = e0Var.e(null);
            d0 d0Var2 = this.f97748p;
            if (d0Var2 != null) {
                d0Var2.Z(e13);
            }
        }
    }

    public k(Context context, View fragmentView, f oneBarLayoutResources, uk1.d presenterPinalytics, q networkStateStream, w eventManager, boolean z13, int i13, m analyticsApi, b60.b activeUserManager, lb0.q prefsManagerPersisted, k2 oneBarLibraryExperiments, e oneBarContainerSelectionMode, boolean z14, r0 unifiedProductFilterHostScreenType, boolean z15, Integer num, Integer num2) {
        PinterestRecyclerView pinterestRecyclerView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentView, "fragmentView");
        Intrinsics.checkNotNullParameter(oneBarLayoutResources, "oneBarLayoutResources");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(oneBarLibraryExperiments, "oneBarLibraryExperiments");
        Intrinsics.checkNotNullParameter(oneBarContainerSelectionMode, "oneBarContainerSelectionMode");
        Intrinsics.checkNotNullParameter(unifiedProductFilterHostScreenType, "unifiedProductFilterHostScreenType");
        this.f97733a = context;
        this.f97734b = fragmentView;
        this.f97735c = oneBarLayoutResources;
        this.f97736d = presenterPinalytics;
        this.f97737e = networkStateStream;
        this.f97738f = eventManager;
        this.f97739g = z13;
        this.f97740h = oneBarLibraryExperiments;
        yk1.a aVar = new yk1.a(fragmentView.getResources(), context.getTheme());
        this.f97741i = aVar;
        View findViewById = fragmentView.findViewById(oneBarLayoutResources.f97725a);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        OneBarContainer oneBarContainer = (OneBarContainer) findViewById;
        this.f97742j = oneBarContainer;
        oneBarLibraryExperiments.getClass();
        z3 z3Var = lh0.a4.f83297a;
        z0 z0Var = oneBarLibraryExperiments.f83403a;
        g1 g1Var = (g1) z0Var;
        boolean o13 = g1Var.o("android_vs_pin_level_descriptors", "enabled", z3Var);
        int i14 = oneBarLayoutResources.f97726b;
        if (!o13 && !g1Var.l("android_vs_pin_level_descriptors")) {
            g1 g1Var2 = (g1) z0Var;
            if (!g1Var2.o("android_uk_descriptor", "enabled", z3Var) && !g1Var2.l("android_uk_descriptor")) {
                View findViewById2 = fragmentView.findViewById(i14);
                Intrinsics.f(findViewById2);
                pinterestRecyclerView = (PinterestRecyclerView) findViewById2;
                this.f97743k = pinterestRecyclerView;
                pv1.e eVar = new pv1.e(context, presenterPinalytics, networkStateStream, null, null, eventManager, i13, oneBarLibraryExperiments, analyticsApi, activeUserManager, aVar, prefsManagerPersisted, oneBarContainerSelectionMode, unifiedProductFilterHostScreenType, z14, z15, num, num2, 24);
                this.f97747o = eVar;
                yk1.j.a().d(oneBarContainer, eVar);
                eVar.f101487q.f136039e = new g(this);
                this.f97749q = new zd1.e0();
            }
        }
        View findViewById3 = oneBarContainer.findViewById(i14);
        Intrinsics.f(findViewById3);
        pinterestRecyclerView = (PinterestRecyclerView) findViewById3;
        this.f97743k = pinterestRecyclerView;
        pv1.e eVar2 = new pv1.e(context, presenterPinalytics, networkStateStream, null, null, eventManager, i13, oneBarLibraryExperiments, analyticsApi, activeUserManager, aVar, prefsManagerPersisted, oneBarContainerSelectionMode, unifiedProductFilterHostScreenType, z14, z15, num, num2, 24);
        this.f97747o = eVar2;
        yk1.j.a().d(oneBarContainer, eVar2);
        eVar2.f101487q.f136039e = new g(this);
        this.f97749q = new zd1.e0();
    }
}
