package cb2;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.o00;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.RepinAnimationData;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.repository.pin.PinService;
import com.pinterest.screens.z1;
import com.pinterest.ui.menu.ContextMenuItemView;
import e82.h0;
import h32.f1;
import h32.g0;
import h32.u0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kt0.e0;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.o0;
import lh0.s2;
import lh0.z3;
import m60.t0;
import m60.x0;
import nx.d0;
import nx.d1;
import so.c4;
import w1.l0;
import x02.i2;

/* loaded from: classes4.dex */
public final class x {
    public final h0 A;
    public final s2 B;
    public String C;
    public go0.l D;
    public ek2.j E;
    public hk2.b F;
    public kk2.l G;
    public AtomicReference H;
    public f30 I;

    /* renamed from: J, reason: collision with root package name */
    public d0 f27377J;
    public bs0.c K;
    public WeakReference L;
    public final xk2.v M;
    public String N;
    public List O;
    public boolean P;

    /* renamed from: a, reason: collision with root package name */
    public final i2 f27378a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.w f27379b;

    /* renamed from: c, reason: collision with root package name */
    public final i92.k f27380c;

    /* renamed from: d, reason: collision with root package name */
    public final j22.b f27381d;

    /* renamed from: e, reason: collision with root package name */
    public final uk1.e f27382e;

    /* renamed from: f, reason: collision with root package name */
    public final d1 f27383f;

    /* renamed from: g, reason: collision with root package name */
    public final jq.c f27384g;

    /* renamed from: h, reason: collision with root package name */
    public final jo1.c f27385h;

    /* renamed from: i, reason: collision with root package name */
    public final il1.a f27386i;

    /* renamed from: j, reason: collision with root package name */
    public final n1 f27387j;

    /* renamed from: k, reason: collision with root package name */
    public final o0 f27388k;

    /* renamed from: l, reason: collision with root package name */
    public final e02.a f27389l;

    /* renamed from: m, reason: collision with root package name */
    public final x10.b f27390m;

    /* renamed from: n, reason: collision with root package name */
    public final gs0.i f27391n;

    /* renamed from: o, reason: collision with root package name */
    public final bs0.d f27392o;

    /* renamed from: p, reason: collision with root package name */
    public final wk2.a f27393p;

    /* renamed from: q, reason: collision with root package name */
    public final js0.a f27394q;

    /* renamed from: r, reason: collision with root package name */
    public final b60.b f27395r;

    /* renamed from: s, reason: collision with root package name */
    public final q11.a f27396s;

    /* renamed from: t, reason: collision with root package name */
    public final k11.p f27397t;

    /* renamed from: u, reason: collision with root package name */
    public final PinService f27398u;

    /* renamed from: v, reason: collision with root package name */
    public final yk1.v f27399v;

    /* renamed from: w, reason: collision with root package name */
    public final c4 f27400w;

    /* renamed from: x, reason: collision with root package name */
    public final com.pinterest.feature.pin.r f27401x;

    /* renamed from: y, reason: collision with root package name */
    public final c2 f27402y;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.camera.core.impl.j f27403z;

    public x(i2 pinRepository, m60.w eventManager, i92.k toastUtils, j22.b searchService, uk1.e presenterPinalyticsFactory, d1 trackingParamAttacher, jq.c pinTrafficSourceMapper, jo1.c baseGridActionUtils, il1.a fragmentFactory, n1 hairballExperiments, o0 experiments, e02.a boardRouter, x10.b pinApiService, gs0.i pinFeedbackModalProvider, bs0.d hidePinInteractorProvider, bf2.d networkStateStream, js0.a hideRemoteRequest, b60.b activeUserManager, q11.a editPinLauncher, k11.p repinUtils, PinService pinService, yk1.v viewResources, c4 shareSheetIconOnClickListenerFactory, com.pinterest.feature.pin.r repinAnimationUtil, c2 sharesheetUtils, androidx.camera.core.impl.j repinHelper, h0 socialUtils, s2 pinLibraryExperiments) {
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinTrafficSourceMapper, "pinTrafficSourceMapper");
        Intrinsics.checkNotNullParameter(baseGridActionUtils, "baseGridActionUtils");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(hairballExperiments, "hairballExperiments");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(boardRouter, "boardRouter");
        Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
        Intrinsics.checkNotNullParameter(pinFeedbackModalProvider, "pinFeedbackModalProvider");
        Intrinsics.checkNotNullParameter(hidePinInteractorProvider, "hidePinInteractorProvider");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(hideRemoteRequest, "hideRemoteRequest");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(editPinLauncher, "editPinLauncher");
        Intrinsics.checkNotNullParameter(repinUtils, "repinUtils");
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(shareSheetIconOnClickListenerFactory, "shareSheetIconOnClickListenerFactory");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(repinHelper, "repinHelper");
        Intrinsics.checkNotNullParameter(socialUtils, "socialUtils");
        Intrinsics.checkNotNullParameter(pinLibraryExperiments, "pinLibraryExperiments");
        this.f27378a = pinRepository;
        this.f27379b = eventManager;
        this.f27380c = toastUtils;
        this.f27381d = searchService;
        this.f27382e = presenterPinalyticsFactory;
        this.f27383f = trackingParamAttacher;
        this.f27384g = pinTrafficSourceMapper;
        this.f27385h = baseGridActionUtils;
        this.f27386i = fragmentFactory;
        this.f27387j = hairballExperiments;
        this.f27388k = experiments;
        this.f27389l = boardRouter;
        this.f27390m = pinApiService;
        this.f27391n = pinFeedbackModalProvider;
        this.f27392o = hidePinInteractorProvider;
        this.f27393p = networkStateStream;
        this.f27394q = hideRemoteRequest;
        this.f27395r = activeUserManager;
        this.f27396s = editPinLauncher;
        this.f27397t = repinUtils;
        this.f27398u = pinService;
        this.f27399v = viewResources;
        this.f27400w = shareSheetIconOnClickListenerFactory;
        this.f27401x = repinAnimationUtil;
        this.f27402y = sharesheetUtils;
        this.f27403z = repinHelper;
        this.A = socialUtils;
        this.B = pinLibraryExperiments;
        xj2.e eVar = new xj2.e(ck2.i.f27922b);
        Intrinsics.checkNotNullExpressionValue(eVar, "empty(...)");
        this.H = eVar;
        this.M = xk2.m.b(new v(this, 4));
    }

    public final nl1.d a() {
        WeakReference weakReference = this.L;
        if (weakReference != null) {
            return (nl1.d) weakReference.get();
        }
        Intrinsics.r("fragmentRef");
        throw null;
    }

    public final jo1.a b() {
        nl1.d a13 = a();
        this.f27385h.getClass();
        return jo1.c.a(a13);
    }

    public final ContextMenuItemView c(LayoutInflater layoutInflater) {
        Pair pair;
        View inflate = layoutInflater.inflate(wc0.d.contextmenu_item, (ViewGroup) null);
        Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.ui.menu.ContextMenuItemView");
        ContextMenuItemView contextMenuItemView = (ContextMenuItemView) inflate;
        contextMenuItemView.setContentDescription(contextMenuItemView.getResources().getString(x0.content_description_closeup_flashlight));
        o0 o0Var = this.f27388k;
        o0Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) o0Var.f83446a;
        boolean z13 = g1Var.o("android_vs_entry_copy_update", "enabled", z3Var) || g1Var.l("android_vs_entry_copy_update");
        if (((Boolean) this.M.getValue()).booleanValue()) {
            pair = new Pair(rm1.q.MAGNIFYING_GLASS_SPARKLE, Integer.valueOf(z13 ? x0.contextmenu_visual_search_image : x0.contextmenu_visual_search_explore));
        } else {
            pair = new Pair(rm1.q.FLASHLIGHT, Integer.valueOf(z13 ? x0.contextmenu_visual_search_image : x0.contextmenu_visual_search));
        }
        rm1.q qVar = (rm1.q) pair.f80346a;
        int intValue = ((Number) pair.f80347b).intValue();
        Context context = contextMenuItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        contextMenuItemView.j(qVar.drawableRes(context));
        contextMenuItemView.l(intValue);
        contextMenuItemView.f52587j = k() ? t0.context_closeup_visual_search : t0.context_visual_search;
        contextMenuItemView.setVisibility(4);
        contextMenuItemView.setOnClickListener(new t(this, 4));
        if (o0Var.d() || o0Var.c()) {
            ig1.b.o1(contextMenuItemView);
        }
        return contextMenuItemView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String d() {
        wk2.a aVar;
        if (y.a(a())) {
            nl1.d a13 = a();
            Intrinsics.g(a13, "null cannot be cast to non-null type com.pinterest.ui.menu.CloseupFragmentProvider");
            return ((e) a13).X();
        }
        nl1.d a14 = a();
        Boolean bool = null;
        r1 = null;
        ScreenLocation screenLocation = null;
        if (Intrinsics.d(a14 != null ? a14.getClass() : null, ((ScreenLocation) com.pinterest.screens.x0.f51544f.getValue()).getF44622a())) {
            nl1.d a15 = a();
            Intrinsics.g(a15, "null cannot be cast to non-null type com.pinterest.ui.menu.HomepageTabFragmentProvider");
            e0 e0Var = ((kt0.q) ((n) a15)).H0;
            if (e0Var != null) {
                lt0.e eVar = (lt0.e) CollectionsKt.U(e0Var.f80819m, e0Var.f80816j);
                if (eVar != null && (aVar = eVar.f84781a) != null) {
                    screenLocation = (ScreenLocation) aVar.get();
                }
                bool = Boolean.valueOf(Intrinsics.d(screenLocation, (ScreenLocation) z1.f51668e.getValue()));
            }
            if (com.bumptech.glide.d.o0(bool)) {
                return "feed_holiday_finds";
            }
        }
        return "";
    }

    public final RepinAnimationData e(m10.d dVar) {
        boolean z13 = dVar instanceof ls1.p;
        com.pinterest.feature.pin.r rVar = this.f27401x;
        if (!z13) {
            KeyEvent.Callback a13 = dVar.a();
            qa2.h0 h0Var = a13 instanceof qa2.h0 ? (qa2.h0) a13 : null;
            if (h0Var == null) {
                return null;
            }
            rVar.getClass();
            return com.pinterest.feature.pin.r.a(h0Var);
        }
        ls1.p pVar = (ls1.p) dVar;
        Rect globalVisiblePinRect = pVar.f84707m;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(globalVisiblePinRect, "globalVisiblePinRect");
        Rect pinDrawableRect = pVar.f84708n;
        Intrinsics.checkNotNullParameter(pinDrawableRect, "pinDrawableRect");
        if (pinDrawableRect.width() > pVar.f84709o / 2) {
            return null;
        }
        return new RepinAnimationData(pinDrawableRect.width(), pinDrawableRect.height(), globalVisiblePinRect.top, globalVisiblePinRect.left, pVar.f84711q);
    }

    public final ContextMenuItemView f(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(wc0.d.contextmenu_item, (ViewGroup) null);
        Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.ui.menu.ContextMenuItemView");
        ContextMenuItemView contextMenuItemView = (ContextMenuItemView) inflate;
        contextMenuItemView.setContentDescription(contextMenuItemView.getResources().getString(x0.icon_send));
        rm1.q qVar = rm1.q.ANDROID_SHARE;
        Context context = contextMenuItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        contextMenuItemView.j(qVar.drawableRes(context));
        contextMenuItemView.l(x0.contextmenu_send);
        contextMenuItemView.f52587j = t0.context_share;
        contextMenuItemView.setVisibility(4);
        contextMenuItemView.setOnClickListener(new t(this, 1));
        o0 o0Var = this.f27388k;
        if (o0Var.d() || o0Var.c()) {
            ig1.b.o1(contextMenuItemView);
        }
        return contextMenuItemView;
    }

    public final String g() {
        nl1.d a13 = a();
        if (a13 == null) {
            return null;
        }
        String name = a13.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.f27384g.getClass();
        return jq.c.a(name);
    }

    public final void h(u0 u0Var, boolean z13) {
        uj2.l<f30> unfavorite;
        d0 d0Var = this.f27377J;
        if (d0Var == null) {
            Intrinsics.r("fragmentPinalytics");
            throw null;
        }
        l(d0Var, u0Var);
        hk2.b bVar = this.F;
        if (bVar != null) {
            bVar.dispose();
        }
        PinService pinService = this.f27398u;
        if (z13) {
            f30 f30Var = this.I;
            if (f30Var == null) {
                Intrinsics.r("pin");
                throw null;
            }
            String uid = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            unfavorite = pinService.favorite(uid, n00.b.a(n00.c.BOARD_PIN_FEED));
        } else {
            f30 f30Var2 = this.I;
            if (f30Var2 == null) {
                Intrinsics.r("pin");
                throw null;
            }
            String uid2 = f30Var2.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            unfavorite = pinService.unfavorite(uid2, n00.b.a(n00.c.BOARD_PIN_FEED));
        }
        hk2.k e13 = unfavorite.h(tk2.e.f118017c).e(wj2.c.a());
        hk2.b bVar2 = new hk2.b(new ua2.v(9, new w(this, 2)), new ua2.v(10, new w(this, 3)), ck2.i.f27923c);
        e13.f(bVar2);
        this.F = bVar2;
    }

    public final boolean i() {
        g00 g00Var;
        Map w13;
        Map w14;
        Object obj;
        d0 d0Var = this.f27377J;
        if (d0Var == null) {
            Intrinsics.r("fragmentPinalytics");
            throw null;
        }
        l(d0Var, u0.SEARCH_BUTTON);
        List list = this.O;
        if (list == null || (g00Var = (g00) CollectionsKt.firstOrNull(list)) == null) {
            return false;
        }
        ScreenLocation screenLocation = (ScreenLocation) com.pinterest.screens.x0.f51547i.getValue();
        k00 q13 = g00Var.q();
        String y13 = q13 != null ? q13.y() : null;
        if (y13 == null) {
            y13 = "";
        }
        NavigationImpl z03 = Navigation.z0(screenLocation, y13);
        z03.m0("com.pinterest.EXTRA_SEARCH_REFERRING_SOURCE", "hs");
        f30 f30Var = this.I;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        z03.m0("com.pinterest.EXTRA_HYBRID_SEARCH_PIN_ID", f30Var.getUid());
        f30 f30Var2 = this.I;
        if (f30Var2 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        z03.m0("com.pinterest.EXTRA_HYBRID_SEARCH_PIN_IMAGE_SIGNATURE", f30Var2.z4());
        z03.y0(this.O, "com.pinterest.EXTRA_OVERRIDE_ONE_BAR_MODULES");
        o00 v13 = g00Var.v();
        z03.m0("com.pinterest.EXTRA_PINNER_DISPLAYED_QUERY", v13 != null ? v13.p() : null);
        k00 q14 = g00Var.q();
        z03.m0("com.pinterest.EXTRA_SOURCE_MODULE_ID", (q14 == null || (w14 = q14.w()) == null || (obj = w14.get("source_module_id")) == null) ? null : obj.toString());
        k00 q15 = g00Var.q();
        Object obj2 = (q15 == null || (w13 = q15.w()) == null) ? null : w13.get("journey_depth");
        Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
        z03.m0("com.pinterest.EXTRA_JOURNEY_DEPTH", String.valueOf(d2 != null ? Integer.valueOf((int) d2.doubleValue()) : null));
        Map u13 = g00Var.u();
        z03.m0("com.pinterest.EXTRA_HYBRID_SEARCH_PARAMS", String.valueOf(u13 != null ? u13.get("hybrid_search_params") : null));
        this.f27379b.d(z03);
        return true;
    }

    public final boolean j(v7 v7Var) {
        String str;
        wy0 k13;
        wy0 f13 = ((b60.d) this.f27395r).f();
        if (f13 != null) {
            if (v7Var == null || (k13 = v7Var.k1()) == null || (str = k13.getUid()) == null) {
                str = "";
            }
            if (dl2.b.S1(f13, str)) {
                return true;
            }
        }
        Boolean G0 = v7Var != null ? v7Var.G0() : null;
        return G0 != null && G0.booleanValue();
    }

    public final boolean k() {
        f30 f30Var;
        f30 f30Var2 = this.I;
        if (f30Var2 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        String uid = f30Var2.getUid();
        if (y.a(a())) {
            com.pinterest.framework.screens.a a13 = a();
            Intrinsics.g(a13, "null cannot be cast to non-null type com.pinterest.ui.menu.CloseupFragmentProvider");
            f30Var = ((e) a13).getPin();
        } else {
            f30Var = null;
        }
        return Intrinsics.d(uid, f30Var != null ? f30Var.getUid() : null);
    }

    public final void l(d0 d0Var, u0 u0Var) {
        HashMap f13;
        HashMap hashMap = new HashMap();
        nl1.d a13 = a();
        if ((a13 != null ? a13.getP0() : null) == h32.a4.FEED_CALL_TO_CREATE_PAGE && (f13 = d0Var.f()) != null) {
            hashMap.putAll(f13);
        }
        if (u0Var == u0.PIN_REPIN_BUTTON) {
            f30 f30Var = this.I;
            if (f30Var == null) {
                Intrinsics.r("pin");
                throw null;
            }
            v7 D3 = f30Var.D3();
            if (D3 != null) {
            }
        }
        f1 f1Var = f1.DRAG;
        g0 g0Var = g0.CONTEXTUAL_MENU;
        f30 f30Var2 = this.I;
        if (f30Var2 != null) {
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : f30Var2.getUid(), (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        } else {
            Intrinsics.r("pin");
            throw null;
        }
    }

    public final boolean m(f30 f30Var, boolean z13) {
        wy0 f13;
        return (((Intrinsics.d(g(), "board") && j(f30Var.D3())) || rl2.g0.W(f30Var)) && (f13 = ((b60.d) this.f27395r).f()) != null && dl2.b.P0(f13)) || z13;
    }

    public final void n(nl1.d fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f27377J = fragment.s7();
        this.L = new WeakReference(fragment);
        yk1.a viewResources = new yk1.a(fragment.getResources(), fragment.requireContext().getTheme());
        jo1.a baseFragmentType = b();
        this.f27392o.getClass();
        Intrinsics.checkNotNullParameter(baseFragmentType, "baseFragmentType");
        j22.b searchService = this.f27381d;
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        x10.b pinApiService = this.f27390m;
        Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
        m60.w eventManager = this.f27379b;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.K = new bs0.c(baseFragmentType, searchService, viewResources, pinApiService, eventManager);
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x046a, code lost:
    
        if (r1.l("android_long_press_icons_clean_up_revert_hide_button") == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0401, code lost:
    
        if (r0 != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x041f, code lost:
    
        if (r1.l("android_news_hub_detail_hide_pin") == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0425, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d("notifications", r8) == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0443, code lost:
    
        if (r1.l("android_news_hub_detail_hide_pin") == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0449, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d("notifications", r7) == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (((ls1.p) r27).f84713s == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.S4(), java.lang.Boolean.TRUE) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x06a3  */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(final com.pinterest.ui.menu.ContextMenuView r26, final m10.d r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cb2.x.o(com.pinterest.ui.menu.ContextMenuView, m10.d, java.lang.String):void");
    }

    public final void p(ls1.r event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.I = event.f84722a;
        this.f27401x.getClass();
        boolean b13 = com.pinterest.feature.pin.r.b();
        boolean k13 = k();
        Intrinsics.d(g(), "board");
        String str = this.N;
        String d2 = d();
        d0 d0Var = this.f27377J;
        if (d0Var == null) {
            Intrinsics.r("fragmentPinalytics");
            throw null;
        }
        jo1.a b14 = b();
        this.f27403z.getClass();
        k11.p.a(this.f27397t, event.f84722a, k13, true, false, str, b13, d2, d0Var, androidx.camera.core.impl.j.i(b14), null, new l0(this, event, b13, 8), 2056);
    }
}
