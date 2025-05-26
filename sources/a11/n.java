package a11;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.my0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import ey.e5;
import h32.c1;
import h32.i0;
import h32.n0;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.text.e0;
import lh0.n1;
import nx.d0;
import nx.d1;
import u50.k0;
import x02.x0;
import x02.x2;

/* loaded from: classes.dex */
public final class n implements e {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f320a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.w f321b;

    /* renamed from: c, reason: collision with root package name */
    public final s01.c f322c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f323d;

    /* renamed from: e, reason: collision with root package name */
    public final nu1.a f324e;

    /* renamed from: f, reason: collision with root package name */
    public final c82.d f325f;

    /* renamed from: g, reason: collision with root package name */
    public final y f326g;

    /* renamed from: h, reason: collision with root package name */
    public final n1 f327h;

    /* renamed from: i, reason: collision with root package name */
    public final x2 f328i;

    /* renamed from: j, reason: collision with root package name */
    public final x0 f329j;

    /* renamed from: k, reason: collision with root package name */
    public final bs.b f330k;

    /* renamed from: l, reason: collision with root package name */
    public final es.a f331l;

    /* renamed from: m, reason: collision with root package name */
    public final nx.b0 f332m;

    /* renamed from: n, reason: collision with root package name */
    public final es.h f333n;

    public n(WeakReference pinalytics, m60.w eventManager, s01.c clickthroughLoggingInteractor, d1 trackingParamAttacher, j80.b carouselUtil, nu1.a inAppNavigator, c82.d siteApi, y urlInfoHelper, n1 experiments, x2 userRepository, x0 boardRepository, bs.b adsHandshakeQuarantine, es.a adFormats, nx.b0 pinAuxHelper, es.h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(clickthroughLoggingInteractor, "clickthroughLoggingInteractor");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(siteApi, "siteApi");
        Intrinsics.checkNotNullParameter(urlInfoHelper, "urlInfoHelper");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(adsHandshakeQuarantine, "adsHandshakeQuarantine");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f320a = pinalytics;
        this.f321b = eventManager;
        this.f322c = clickthroughLoggingInteractor;
        this.f323d = trackingParamAttacher;
        this.f324e = inAppNavigator;
        this.f325f = siteApi;
        this.f326g = urlInfoHelper;
        this.f327h = experiments;
        this.f328i = userRepository;
        this.f329j = boardRepository;
        this.f330k = adsHandshakeQuarantine;
        this.f331l = adFormats;
        this.f332m = pinAuxHelper;
        this.f333n = adsCommonDisplay;
    }

    public static HashMap f(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                hashMap2.put(str, value);
            }
        }
        if (hashMap2.size() == 0) {
            return null;
        }
        return hashMap2;
    }

    public final NavigationImpl g(ScreenLocation screenLocation, ScreenLocation screenLocation2, String str, int i13, f30 pin, String str2, int i14, boolean z13, c1 c1Var, HashMap hashMap, c1 c1Var2, boolean z14, boolean z15) {
        String str3;
        Object obj;
        NavigationImpl L = Navigation.L(screenLocation, str, i13);
        if (pin != null) {
            String b13 = this.f323d.b(pin);
            Set set = b40.f35967a;
            Intrinsics.checkNotNullParameter(pin, "<this>");
            String s53 = pin.s5();
            String str4 = "";
            if (s53 != null) {
                try {
                    str4 = new URI(j1.S(s53)).getScheme();
                } catch (URISyntaxException e13) {
                    ((tb0.h) ob0.b.f93978b).o("PStringUtils:GetUrlScheme", e13);
                }
            }
            L.m0("com.pinterest.EXTRA_REFERRER", a.a.l(Intrinsics.d("http", str4) ? "http" : "https", "://pinterest.com/pin/", pin.getUid(), "/?source_app=android"));
            if (str2 == null) {
                str3 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(str3, "getUid(...)");
            } else {
                str3 = str2;
            }
            L.m0("com.pinterest.CLOSEUP_PIN_ID", str3);
            L.m0("com.pinterest.TRACKING_PARAMETER", b13);
            if (((d0) this.f320a.get()) != null) {
                L.m0("com.pinterest.CLIENT_TRACKING_PARAMETER", b13);
            }
            nx.b0 b0Var = this.f332m;
            b0Var.getClass();
            Intrinsics.checkNotNullParameter(pin, "pin");
            HashMap auxData = nx.b0.p(b0Var, pin, i14, null);
            if (auxData == null) {
                auxData = new HashMap();
            }
            if (Intrinsics.d(screenLocation, screenLocation2)) {
                nx.b0.h(e0.C(4096, str), auxData, ((es.c) this.f331l).r(pin), n60.o.y(pin, "getIsThirdPartyAd(...)"));
            }
            if (z13 && (obj = hashMap.get("collection_pin_click_position")) != null) {
                String chipPosition = String.valueOf(obj);
                Intrinsics.checkNotNullParameter(auxData, "auxData");
                Intrinsics.checkNotNullParameter(chipPosition, "chipPosition");
                auxData.put("collection_pin_click_position", chipPosition);
            }
            if (hashMap.get("story_type") != null) {
                auxData.put("story_type", String.valueOf(hashMap.get("story_type")));
            }
            Object obj2 = hashMap.get("parent_dl_ad_closeup_ingress_variant");
            if (obj2 != null) {
                auxData.put("parent_dl_ad_closeup_ingress_variant", obj2.toString());
            }
            Object obj3 = hashMap.get("dl_ad_closeup_parent_object_id");
            if (obj3 != null) {
                auxData.put("dl_ad_closeup_parent_object_id", obj3.toString());
            }
            if (!(!auxData.isEmpty())) {
                auxData = null;
            }
            L.y0(new to0.y(auxData), "com.pinterest.PIN_LOGGING_AUX_DATA");
            Intrinsics.checkNotNullParameter(pin, "pin");
            boolean a13 = vb0.j.a();
            Intrinsics.checkNotNullParameter(pin, "pin");
            L.Y1("com.pinterest.EXCLUDE_AD", a13 && !b40.w0(pin));
        }
        L.Y1("com.pinterest.EXTRA_ENABLE_BOTTOM_TOOLBAR", z14);
        L.Y1("com.pinterest.EXTRA_LOG_PIN_CLICKTHROUGH_END", z15);
        L.y0(new to0.z(c1Var2), "com.pinterest.PIN_LOGGING_EVENT_DATA");
        if (z13) {
            L.y0(new to0.z(c1Var), "com.pinterest.EXTRA_PIN_DL_COLLECTION_EVENT_DATA");
        }
        L.Y1("com.pinterest.EXTRA_PIN_IS_DL_COLLECTION", z13);
        L.Y1("com.pinterest.EXTRA_WEBPAGE_PINNABLE", true);
        L.m0("IDEA_STREAM_EXTRAS_KEY_FEATURED_AGGREGATED_PIN_DATA_ID", pin != null ? b40.g(pin) : null);
        Intrinsics.checkNotNullExpressionValue(L, "apply(...)");
        return L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0192, code lost:
    
        if ((r2 != null ? r2.l() : null) != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x032f, code lost:
    
        if (r4.booleanValue() != false) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0220 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x048f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r20, int r21, com.pinterest.api.model.f30 r22, h32.i0 r23, h32.c1 r24, h32.c1 r25, java.lang.String r26, java.lang.String r27, java.util.HashMap r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a11.n.h(int, int, com.pinterest.api.model.f30, h32.i0, h32.c1, h32.c1, java.lang.String, java.lang.String, java.util.HashMap, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final void i(int i13, f30 f30Var, i0 i0Var, n0 finalDestinationUrlType, c1 c1Var, String url, String str, HashMap hashMap, boolean z13) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(finalDestinationUrlType, "finalDestinationUrlType");
        if (f30Var != null) {
            s01.d params = new s01.d(i13, f30Var, i0Var, finalDestinationUrlType, c1Var, url, str, hashMap, z13);
            s01.c cVar = this.f322c;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(params, "params");
            pk2.f.k(new kk2.b(new uv0.a(12, cVar, params), 0).r(tk2.e.f118017c), "observeOn(...)").o(new f(8, j.f287j), new f(9, j.f288k));
        }
    }

    public final void j(my0 my0Var, f30 f30Var, boolean z13, HashMap hashMap, Integer num, Integer num2, c1 c1Var, boolean z14, boolean z15, i0 i0Var, String str, boolean z16, boolean z17, c1 c1Var2, boolean z18, boolean z19, boolean z23) {
        String str2 = my0Var.f40258a;
        boolean z24 = str2.equalsIgnoreCase("blocked") || str2.equalsIgnoreCase("block");
        m60.w wVar = this.f321b;
        if (z24) {
            new e5().i();
            wVar.d(new yb0.f((u50.i0) (f30Var == null ? new k0(m60.x0.sorry) : new k0(m60.x0.sorry_pin_block)), (u50.i0) new k0(m60.x0.pin_state_alert_reported), new k0(m60.x0.f85950ok), (u50.i0) null, (yb0.h) null, false));
            return;
        }
        String str3 = my0Var.f40258a;
        if (str3.equalsIgnoreCase("suspicious") || str3.equalsIgnoreCase("warn")) {
            new e5().i();
            wVar.d(new yb0.f(new k0(m60.x0.warning), new k0(m60.x0.pin_state_alert_reported), new k0(m60.x0.show), new k0(m60.x0.cancel), new m(this, my0Var, f30Var), 32));
            return;
        }
        if (!z16) {
            String str4 = my0Var.f40259b;
            Intrinsics.checkNotNullExpressionValue(str4, "getUrl(...)");
            h(num != null ? num.intValue() : ml1.b.DEFAULT_TRANSITION.getValue(), num2 != null ? num2.intValue() : -1, f30Var, i0Var, c1Var, c1Var2, str4, str, hashMap == null ? new HashMap() : hashMap, z13, z14, z15, z17, z17, z18, z19, z23);
        }
    }

    public final xj2.c l(String url, f30 pin, boolean z13, HashMap hashMap, Integer num, Integer num2, c1 c1Var, boolean z14, boolean z15, i0 i0Var, String str, boolean z16, boolean z17, c1 c1Var2, boolean z18, boolean z19, boolean z23) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(pin, "pin");
        j0 j0Var = new j0();
        l lVar = new l(j0Var, this);
        this.f321b.h(lVar);
        xj2.c F = this.f326g.a(url, pin.getUid()).F(new f(2, new k(this, pin, z13, hashMap, num, num2, c1Var, z14, z15, i0Var, str, z16, z17, c1Var2, z18, z19, z23, lVar)), new f(3, new ky0.b(17, this, lVar)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        j0Var.f80434a = F;
        return F;
    }
}
