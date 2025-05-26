package np0;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.s;
import df.j1;
import h32.c1;
import h32.g0;
import h32.u0;
import i32.y0;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import k11.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.z;
import m60.w;
import nx.b0;
import nx.d0;
import nx.d1;
import xk2.v;

/* loaded from: classes5.dex */
public class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final a11.d f91726a;

    /* renamed from: b, reason: collision with root package name */
    public final ro1.c f91727b;

    /* renamed from: c, reason: collision with root package name */
    public final w f91728c;

    /* renamed from: d, reason: collision with root package name */
    public final zf0.f f91729d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f91730e;

    /* renamed from: f, reason: collision with root package name */
    public final il1.a f91731f;

    /* renamed from: g, reason: collision with root package name */
    public final c82.d f91732g;

    /* renamed from: h, reason: collision with root package name */
    public final j80.b f91733h;

    /* renamed from: i, reason: collision with root package name */
    public final gs0.k f91734i;

    /* renamed from: j, reason: collision with root package name */
    public final d1 f91735j;

    /* renamed from: k, reason: collision with root package name */
    public final e02.a f91736k;

    /* renamed from: l, reason: collision with root package name */
    public final p f91737l;

    /* renamed from: m, reason: collision with root package name */
    public final xr.a f91738m;

    /* renamed from: n, reason: collision with root package name */
    public final yb2.c f91739n;

    /* renamed from: o, reason: collision with root package name */
    public final k11.k f91740o;

    /* renamed from: p, reason: collision with root package name */
    public final ku1.j f91741p;

    /* renamed from: q, reason: collision with root package name */
    public final c2 f91742q;

    /* renamed from: r, reason: collision with root package name */
    public final b0 f91743r;

    /* renamed from: s, reason: collision with root package name */
    public final es.a f91744s;

    /* renamed from: t, reason: collision with root package name */
    public final ur.a f91745t;

    /* renamed from: u, reason: collision with root package name */
    public final es.h f91746u;

    /* renamed from: v, reason: collision with root package name */
    public final ni1.d f91747v;

    public d(c2 sharesheetUtils, ur.a ads, xr.a attributionReporting, es.a adFormats, es.h adsCommonDisplay, b0 pinAuxHelper, d1 trackingParamAttacher, b60.b activeUserManager, w eventManager, j80.b carouselUtil, zf0.f educationHelper, z closeupExperiment, gs0.k pinOverflowMenuModalProvider, a11.d clickThroughHelperFactory, k11.k repinSessionDataManager, p repinUtils, ni1.d deepLinkHelper, il1.a fragmentFactory, ro1.c deepLinkAdUtil, ku1.j navigationManager, nu1.a inAppNavigator, e02.a boardRouter, c82.d siteApi, yb2.c shuffleUtils) {
        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(siteApi, "siteApi");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(pinOverflowMenuModalProvider, "pinOverflowMenuModalProvider");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(boardRouter, "boardRouter");
        Intrinsics.checkNotNullParameter(repinUtils, "repinUtils");
        Intrinsics.checkNotNullParameter(closeupExperiment, "closeupExperiment");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(shuffleUtils, "shuffleUtils");
        Intrinsics.checkNotNullParameter(repinSessionDataManager, "repinSessionDataManager");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(ads, "ads");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(deepLinkHelper, "deepLinkHelper");
        this.f91726a = clickThroughHelperFactory;
        this.f91727b = deepLinkAdUtil;
        this.f91728c = eventManager;
        this.f91729d = educationHelper;
        this.f91730e = activeUserManager;
        this.f91731f = fragmentFactory;
        this.f91732g = siteApi;
        this.f91733h = carouselUtil;
        this.f91734i = pinOverflowMenuModalProvider;
        this.f91735j = trackingParamAttacher;
        this.f91736k = boardRouter;
        this.f91737l = repinUtils;
        this.f91738m = attributionReporting;
        this.f91739n = shuffleUtils;
        this.f91740o = repinSessionDataManager;
        this.f91741p = navigationManager;
        this.f91742q = sharesheetUtils;
        this.f91743r = pinAuxHelper;
        this.f91744s = adFormats;
        this.f91745t = ads;
        this.f91746u = adsCommonDisplay;
        this.f91747v = deepLinkHelper;
    }

    public static final void d(d dVar, f30 f30Var, String str, String str2) {
        d32.c cVar;
        Object obj;
        dVar.getClass();
        String name = ai0.a.a(f30Var).name();
        gp1.k kVar = gp1.k.CLOSEUP;
        if (str2 != null) {
            Iterator it = a.f91716a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((d32.c) obj).name(), str2)) {
                        break;
                    }
                }
            }
            d32.c cVar2 = (d32.c) obj;
            if (cVar2 != null) {
                cVar = cVar2;
                e02.a.b(dVar.f91736k, f30Var, true, dVar.f91731f, null, null, null, null, null, null, null, null, name, null, null, str, false, false, null, null, "closeup", kVar, cVar, 505848);
            }
        }
        cVar = d32.c.PIN_CLOSEUP_SAVE_BUTTON;
        e02.a.b(dVar.f91736k, f30Var, true, dVar.f91731f, null, null, null, null, null, null, null, null, name, null, null, str, false, false, null, null, "closeup", kVar, cVar, 505848);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x010b, code lost:
    
        if (r3.contains(r0.get(0)) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02cb  */
    @Override // np0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r29, com.pinterest.api.model.f30 r30, java.lang.String r31, java.lang.String r32, nx.d0 r33, c82.a r34, xj2.b r35, h32.c1 r36, java.lang.Boolean r37, java.util.HashMap r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: np0.d.a(android.content.Context, com.pinterest.api.model.f30, java.lang.String, java.lang.String, nx.d0, c82.a, xj2.b, h32.c1, java.lang.Boolean, java.util.HashMap, boolean):void");
    }

    public final void e(f30 pin, d0 pinalytics, String str, String str2, HashMap hashMap, u0 u0Var) {
        HashMap hashMap2;
        ScreenDescription k13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        u0 u0Var2 = u0Var == null ? u0.PIN_REPIN_BUTTON : u0Var;
        g0 g0Var = g0.MODAL_PIN;
        String uid = pin.getUid();
        HashMap m13 = this.f91743r.m(pin);
        if (m13 != null) {
            if (hashMap != null) {
                bs1.c.E1(m13, hashMap);
                v7 D3 = pin.D3();
                if (D3 != null) {
                }
            }
            Unit unit = Unit.f80348a;
            hashMap2 = m13;
        } else {
            hashMap2 = hashMap;
        }
        pinalytics.f0(u0Var2, g0Var, uid, hashMap2, false);
        this.f91740o.b(b.f91717j, true);
        s sVar = this.f91741p.f80914l;
        if (kotlin.text.z.i((sVar == null || (k13 = sVar.k()) == null) ? null : k13.L1(), "COLLAGES_BOTTOM_SHEET_FRAGMENT", false)) {
            p.a(this.f91737l, pin, true, false, true, str2, false, str, pinalytics, gp1.k.CLOSEUP, null, new c(this, pin, str2, str, 0), 2260);
            return;
        }
        v vVar = zf0.f.f141903e;
        vb0.e.e().getClass();
        if (!j1.D0(y0.ANDROID_QUICKSAVE, i32.l.ANDROID_QUICKSAVE)) {
            p.a(this.f91737l, pin, true, false, true, str2, false, str, pinalytics, gp1.k.CLOSEUP, null, new c(this, pin, str2, str, 1), 2260);
        }
        this.f91728c.d(new lq.a(pin.getUid()));
    }

    public final void f(View view, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(view, "view");
        ig1.b.N0(view);
        this.f91742q.q(y32.f.CLOSEUP.getValue(), pin);
    }

    public final void g(Context context, d0 pinalytics, f30 pin, c1 c1Var, HashMap auxData) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        boolean z13 = dl2.b.z1(context, "com.android.chrome");
        boolean l03 = ((es.c) this.f91744s).l0(pin);
        xr.a aVar = this.f91738m;
        if (l03) {
            aVar.a(pin, true);
        }
        auxData.put("closeup_navigation_type", nq.b.CLICK.getType());
        b0 b0Var = this.f91743r;
        b0Var.a(pin, aVar, auxData);
        Set set = b40.f35967a;
        Intrinsics.checkNotNullParameter(pin, "<this>");
        String s53 = pin.s5();
        if (s53 == null) {
            s53 = null;
        } else if (kotlin.text.z.p(s53, "www.", true)) {
            s53 = "http://".concat(s53);
        }
        if (s53 != null) {
            try {
                str = new URI(s53).getHost();
            } catch (URISyntaxException unused) {
                str = "invalid_uri_syntax";
            }
            if (str != null) {
                auxData.put("clickthrough_domain", str);
            }
        }
        auxData.put("is_cct_enabled", String.valueOf(z13));
        b0Var.c(pin, auxData);
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        pinalytics.n(uid, auxData, this.f91735j.b(pin), null, c1Var, null);
    }
}
