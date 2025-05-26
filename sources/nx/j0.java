package nx;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import h32.m1;
import h32.v2;
import h32.x3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public final class j0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f92406a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f92407b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f92408c;

    /* renamed from: d, reason: collision with root package name */
    public final m60.e f92409d;

    /* renamed from: e, reason: collision with root package name */
    public final tb0.h f92410e;

    /* renamed from: f, reason: collision with root package name */
    public final vy.m f92411f;

    /* renamed from: g, reason: collision with root package name */
    public final gw f92412g;

    /* renamed from: h, reason: collision with root package name */
    public final vb0.c f92413h;

    /* renamed from: i, reason: collision with root package name */
    public final b60.b f92414i;

    /* renamed from: j, reason: collision with root package name */
    public final gz1.b f92415j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f92416k;

    public j0(a contextProvider, e0 pinalyticsManager, d1 trackingParamAttacher, m60.e applicationInfoProvider, tb0.h crashReporting, vy.m analyticsApi, gw modelHelper, vb0.c applicationUtils, b60.b activeUserManager, gz1.b googlePlayServices) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter(applicationUtils, "applicationUtils");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(googlePlayServices, "googlePlayServices");
        this.f92406a = contextProvider;
        this.f92407b = pinalyticsManager;
        this.f92408c = trackingParamAttacher;
        this.f92409d = applicationInfoProvider;
        this.f92410e = crashReporting;
        this.f92411f = analyticsApi;
        this.f92412g = modelHelper;
        this.f92413h = applicationUtils;
        this.f92414i = activeUserManager;
        this.f92415j = googlePlayServices;
    }

    public static /* synthetic */ h32.w0 l0(j0 j0Var, h32.i0 i0Var, h32.f1 f1Var, h32.u0 u0Var, h32.g0 g0Var, String str, HashMap hashMap, h32.d0 d0Var, h32.v0 v0Var, boolean z13, int i13) {
        return j0Var.d(i0Var, f1Var, u0Var, g0Var, str, hashMap, d0Var, null, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : v0Var, (i13 & 1024) != 0 ? false : z13);
    }

    @Override // nx.d0
    public final h32.w0 A(h32.f1 et2, ArrayList impressions) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        if (!(!impressions.isEmpty())) {
            return null;
        }
        Boolean bool = Boolean.FALSE;
        return b(et2, null, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, impressions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, null, null);
    }

    @Override // nx.d0
    public final void C(h32.f1 et2, String str, ArrayList impressions, HashMap hashMap, h32.c1 c1Var, h32.v0 v0Var, h32.g0 g0Var) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        if (!impressions.isEmpty()) {
            h32.b1 b1Var = c1Var != null ? new h32.b1(c1Var) : new h32.b1();
            b1Var.f66854c = impressions;
            h32.c1 a13 = b1Var.a();
            AdvertisingIdClient.Info a14 = this.f92415j.a();
            String id3 = a14 != null ? a14.getId() : null;
            if (a14 != null && id3 != null && id3.length() != 0) {
                hashMap.put("advertising_identifier", id3);
                String bool = Boolean.toString(!a14.isLimitAdTrackingEnabled());
                Intrinsics.checkNotNullExpressionValue(bool, "toString(...)");
                hashMap.put("advertising_tracking_enabled", bool);
            }
            b(et2, str, a13, hashMap, v0Var, g0Var);
        }
    }

    @Override // nx.d0
    public final h32.w0 E(h32.f1 et2, ArrayList impressions, h32.g0 g0Var) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        if (!(!impressions.isEmpty())) {
            return null;
        }
        Boolean bool = Boolean.FALSE;
        return b(et2, null, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, impressions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, null, g0Var);
    }

    @Override // nx.d0
    public final h32.w0 F(h32.g0 g0Var, h32.u0 u0Var) {
        h32.w0 h03;
        h03 = h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        return h03;
    }

    @Override // nx.d0
    public final h32.w0 G(h32.g0 g0Var, h32.f1 et2, ArrayList impressions) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        if (!(!impressions.isEmpty())) {
            return null;
        }
        Boolean bool = Boolean.FALSE;
        return b(et2, null, new h32.c1(null, bool, null, Boolean.TRUE, bool, new m1(impressions), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, null, g0Var);
    }

    @Override // nx.d0
    public final h32.w0 H(h32.f1 et2, String str, h32.c1 c1Var, HashMap hashMap, h32.v0 v0Var, boolean z13) {
        Intrinsics.checkNotNullParameter(et2, "et");
        return c(this.f92406a.generateLoggingContext(), et2, str, c1Var, hashMap, v0Var, z13, true);
    }

    @Override // nx.d0
    public final void I() {
        m60.l0 addAdditionalAuxData = m60.l0.f85920i;
        Intrinsics.checkNotNullParameter(addAdditionalAuxData, "addAdditionalAuxData");
        h32.i0 generateLoggingContext = this.f92406a.generateLoggingContext();
        HashMap hashMap = new HashMap();
        AdvertisingIdClient.Info a13 = this.f92415j.a();
        String id3 = a13 != null ? a13.getId() : null;
        if (a13 != null && id3 != null && id3.length() != 0) {
            hashMap.put("advertising_tracking_enabled", String.valueOf(!a13.isLimitAdTrackingEnabled()));
            hashMap.put("advertising_identifier", id3);
        }
        addAdditionalAuxData.invoke(hashMap);
        c(generateLoggingContext, h32.f1.APP_BACKGROUND, null, null, hashMap, null, false, true);
    }

    @Override // nx.d0
    public final h32.w0 J(h32.u0 elementType, h32.g0 g0Var, String str, HashMap hashMap, h32.v0 v0Var, boolean z13) {
        h32.w0 h03;
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        h03 = h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : elementType, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : str, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z13);
        return h03;
    }

    @Override // nx.d0
    public final h32.w0 K(h32.f1 eventType, String str, h32.i0 context, HashMap hashMap, boolean z13) {
        h32.w0 h03;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(context, "context");
        h03 = h0((r18 & 1) != 0 ? h32.f1.TAP : eventType, (r18 & 2) != 0 ? null : context.f67086f, (r18 & 4) != 0 ? null : context.f67084d, (r18 & 8) != 0 ? null : str, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : context.f67085e, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z13);
        return h03;
    }

    @Override // nx.d0
    public final void L(h32.i0 i0Var, String pinUid, HashMap hashMap, String str, h32.g0 g0Var, h32.c1 c1Var, h32.u0 u0Var) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        h32.i0 z03 = i0Var != null ? com.bumptech.glide.d.z0(i0Var, new i0(g0Var, u0Var, 0)) : null;
        h32.v0 v0Var = new h32.v0();
        v0Var.G = str == null ? this.f92408c.c(pinUid) : str;
        HashMap f13 = f();
        if (f13 == null) {
            f13 = new HashMap();
        }
        HashMap hashMap2 = f13;
        hashMap2.putAll(hashMap);
        c(z03, h32.f1.PIN_CLICK, pinUid, c1Var, hashMap2, v0Var, false, true);
    }

    @Override // nx.d0
    public final h32.w0 M(h32.g0 g0Var, HashMap hashMap, h32.v0 v0Var, ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        if (!(!impressions.isEmpty())) {
            return null;
        }
        Boolean bool = Boolean.FALSE;
        return b(h32.f1.ONEBAR_IMPRESSION_ONE_PIXEL, null, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, impressions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), hashMap, v0Var, g0Var);
    }

    @Override // nx.d0
    public final h32.w0 N(h32.f1 eventType, h32.u0 u0Var, h32.g0 g0Var, String str, boolean z13) {
        h32.w0 h03;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        h03 = h0((r18 & 1) != 0 ? h32.f1.TAP : eventType, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : str, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z13);
        return h03;
    }

    @Override // nx.d0
    public final h32.w0 P(h32.f1 et2, u0 impressionWrapper) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(impressionWrapper, "impressionWrapper");
        Boolean bool = Boolean.FALSE;
        return b(et2, null, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, kotlin.collections.e0.b(impressionWrapper.f92470a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), impressionWrapper.f92471b, null, impressionWrapper.f92472c);
    }

    @Override // nx.d0
    public final h32.w0 Q(h32.f1 et2, ArrayList newsHubData) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(newsHubData, "newsHubData");
        if (!(!newsHubData.isEmpty())) {
            return null;
        }
        Boolean bool = Boolean.FALSE;
        return u(et2, null, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, newsHubData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, false);
    }

    @Override // nx.d0
    public final void R() {
        tb0.h hVar = this.f92410e;
        tb0.o oVar = hVar.f117098v;
        if (oVar == null || !oVar.f117108a) {
            return;
        }
        tb0.o d2 = hVar.d();
        HashMap o13 = ep.b.o("last_start_crashed", "true");
        if (!d2.f117109b) {
            String lastCrashMessage = d2.f117114g;
            Intrinsics.checkNotNullExpressionValue(lastCrashMessage, "lastCrashMessage");
            o13.put("last_start_crashed_message", lastCrashMessage);
            String lastCrashTraceLastLine = d2.f117116i;
            Intrinsics.checkNotNullExpressionValue(lastCrashTraceLastLine, "lastCrashTraceLastLine");
            o13.put("last_start_crashed_last_trace", lastCrashTraceLastLine);
            g(h32.f1.APP_CRASH_DETECTED, null, o13, false);
            return;
        }
        o13.put("last_start_crashed_oom", "true");
        String l13 = Long.toString(d2.f117110c);
        Intrinsics.checkNotNullExpressionValue(l13, "toString(...)");
        o13.put("last_start_crashed_oom_status_total", l13);
        String l14 = Long.toString(d2.f117111d);
        Intrinsics.checkNotNullExpressionValue(l14, "toString(...)");
        o13.put("last_start_crashed_oom_status_used", l14);
        g(h32.f1.APP_CRASH_OOM_DETECTED, null, o13, false);
        HashMap f13 = kotlin.collections.z0.f(new Pair("api_release_stage", d2.f117117j));
        vy.m mVar = this.f92411f;
        mVar.k("android.app_crash.oom", vy.m.c(mVar, null, f13, 1));
    }

    @Override // nx.d0
    public final h32.w0 S(v2 v2Var) {
        if (v2Var == null) {
            return null;
        }
        return s(new y0(v2Var, null, new HashMap(), null, 10));
    }

    @Override // nx.d0
    public final void T(d4 d4Var, HashMap hashMap) {
        h32.w0 w0Var;
        a4 a4Var;
        d4 d4Var2;
        a provider = this.f92406a;
        h32.i0 source = provider.generateLoggingContext();
        if (source != null) {
            o0 o0Var = (o0) this.f92407b;
            o0Var.getClass();
            Intrinsics.checkNotNullParameter(provider, "provider");
            ArrayList arrayList = o0Var.f92438a;
            if (arrayList.contains(provider)) {
                Intrinsics.checkNotNullParameter(provider, "provider");
                arrayList.remove(provider);
            }
            arrayList.add(0, provider);
            ((m60.d) this.f92409d).g();
            Intrinsics.checkNotNullParameter(source, "source");
            x3 x3Var = source.f67083c;
            String str = x3Var != null ? x3Var.f67402f : null;
            HashMap hashMap2 = hashMap == null ? new HashMap() : hashMap;
            boolean z13 = provider instanceof i1;
            h32.g0 g0Var = source.f67084d;
            if (z13) {
                i1 i1Var = (i1) provider;
                w0Var = i1Var.e();
                HashMap f63135d0 = i1Var.getF63135d0();
                if (f63135d0 != null) {
                    hashMap2.putAll(f63135d0);
                }
                if (g0Var == null) {
                    g0Var = i1Var.b2();
                }
            } else {
                w0Var = null;
            }
            h32.g0 g0Var2 = g0Var;
            d4 d4Var3 = d4Var != null ? d4Var : source.f67081a;
            h32.d0 d0Var = source.f67085e;
            h32.u0 u0Var = source.f67086f;
            a4 a4Var2 = source.f67082b;
            h32.i0 i0Var = new h32.i0(d4Var3, a4Var2, source.f67083c, g0Var2, d0Var, u0Var);
            if (w0Var != null) {
                if (Intrinsics.d(w0Var.A, Boolean.TRUE)) {
                    h32.f1 f1Var = h32.f1.VIEW;
                    h32.v0 v0Var = new h32.v0(w0Var);
                    AdvertisingIdClient.Info a13 = this.f92415j.a();
                    String id3 = a13 != null ? a13.getId() : null;
                    if (a13 != null && id3 != null && id3.length() != 0) {
                        hashMap2.put("advertising_identifier", id3);
                        String bool = Boolean.toString(!a13.isLimitAdTrackingEnabled());
                        Intrinsics.checkNotNullExpressionValue(bool, "toString(...)");
                        hashMap2.put("advertising_tracking_enabled", bool);
                    }
                    a4Var = a4Var2;
                    d4Var2 = d4Var3;
                    c(i0Var, f1Var, str, null, hashMap2, v0Var, false, true);
                    dl2.b.a3(d4Var2, a4Var);
                }
            }
            a4Var = a4Var2;
            d4Var2 = d4Var3;
            c(i0Var, h32.f1.VIEW, str, null, hashMap2, w0Var != null ? new h32.v0(w0Var) : null, false, true);
            dl2.b.a3(d4Var2, a4Var);
        }
    }

    @Override // nx.d0
    public final h32.w0 U(h32.i0 i0Var, h32.f1 et2, String str, h32.c1 c1Var, HashMap hashMap, boolean z13) {
        Intrinsics.checkNotNullParameter(et2, "et");
        if (i0Var == null) {
            i0Var = this.f92406a.generateLoggingContext();
        }
        return c(i0Var, et2, str, c1Var, hashMap, null, z13, true);
    }

    @Override // nx.d0
    public final void V(String str, String swipeDirection) {
        Intrinsics.checkNotNullParameter(swipeDirection, "swipeDirection");
        l0(this, this.f92406a.generateLoggingContext(), h32.f1.SWIPE, null, h32.g0.NAVIGATION, str, ep.b.o("mobile_p2p_swipe_direction", swipeDirection), null, null, true, BitmapUtils.BITMAP_TO_JPEG_SIZE);
    }

    @Override // nx.d0
    public final h32.w0 W(h32.f1 eventType, String str, h32.i0 context, HashMap hashMap, h32.v0 v0Var, boolean z13) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(context, "context");
        h32.d0 d0Var = context.f67085e;
        return h0(eventType, context.f67086f, context.f67084d, str, hashMap, d0Var, v0Var, z13);
    }

    @Override // nx.d0
    public final h32.w0 X(h32.u0 elementType) {
        h32.w0 h03;
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        h03 = h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : elementType, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        return h03;
    }

    @Override // nx.d0
    public final h32.w0 Y(h32.f1 et2, ArrayList impressions) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        if (!(!impressions.isEmpty())) {
            return null;
        }
        Boolean bool = Boolean.FALSE;
        return u(et2, null, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, impressions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, false);
    }

    @Override // nx.d0
    public final h32.w0 Z(h32.u0 elementType, HashMap hashMap) {
        h32.w0 h03;
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        h03 = h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : elementType, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        return h03;
    }

    @Override // nx.d0
    public final h32.w0 a(h32.f1 et2, String str, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(et2, "et");
        return c(this.f92406a.generateLoggingContext(), et2, str, null, null, null, z13, z14);
    }

    public final h32.w0 b(h32.f1 et2, String str, h32.c1 c1Var, HashMap hashMap, h32.v0 v0Var, h32.g0 g0Var) {
        h32.h0 h0Var;
        Intrinsics.checkNotNullParameter(et2, "et");
        h32.i0 generateLoggingContext = this.f92406a.generateLoggingContext();
        if (generateLoggingContext != null) {
            h0Var = new h32.h0(generateLoggingContext);
            h0Var.f67047f = null;
            h0Var.f67046e = null;
        } else {
            h0Var = new h32.h0();
        }
        h0Var.f67045d = g0Var;
        return c(h0Var.a(), et2, str, c1Var, hashMap, v0Var, false, true);
    }

    @Override // nx.d0
    public final h32.w0 b0(h32.u0 u0Var, h32.g0 g0Var, String str, boolean z13) {
        return N(h32.f1.TAP, u0Var, g0Var, str, z13);
    }

    public final h32.w0 c(h32.i0 i0Var, h32.f1 f1Var, String str, h32.c1 c1Var, HashMap hashMap, h32.v0 v0Var, boolean z13, boolean z14) {
        String str2;
        if (this.f92416k) {
            new Throwable("Submitting event " + f1Var + " on a destroyed Pinalytics instance.");
        }
        if (v0Var == null) {
            v0Var = new h32.v0();
        }
        v0Var.f67286i = hf0.b.a();
        m60.d dVar = (m60.d) this.f92409d;
        v0Var.f67297t = dVar.f85891a.getContextEnum();
        v0Var.f67278a = ep.b.f(1000000L);
        v0Var.f67279b = f1Var;
        v0Var.f67293p = this.f92413h.a();
        if (i0Var != null) {
            v0Var.f67285h = i0Var;
        }
        if (str != null && str.length() != 0) {
            v0Var.f67295r = str;
            h32.w0 a13 = v0Var.a();
            d1 d1Var = this.f92408c;
            String str3 = a13.G;
            if ((str3 == null || str3.length() == 0) && z14) {
                v0Var.G = d1Var.c(str);
            } else if (z13) {
                v0Var.G = d1Var.c(str);
            }
        }
        wy0 f13 = ((b60.d) this.f92414i).f();
        String uid = f13 != null ? f13.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        v0Var.f67294q = uid;
        HashMap auxData = hashMap != null ? new HashMap(hashMap) : new HashMap();
        dVar.e();
        dVar.f85896f.getClass();
        dVar.h();
        tb0.r release = tb0.r.PRODUCTION;
        Intrinsics.checkNotNullExpressionValue(release, "getReleaseStage(...)");
        Intrinsics.checkNotNullParameter(release, "release");
        int i13 = h0.f92400a[release.ordinal()];
        if (i13 == 1) {
            str2 = "alpha";
        } else if (i13 == 2) {
            str2 = "prod";
        } else if (i13 == 3) {
            str2 = "ota";
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "fastdev";
        }
        auxData.put("stage", str2);
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        HashMap hashMap2 = new HashMap(auxData);
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry : hashMap2.entrySet()) {
            String str4 = (String) entry.getValue();
            if (str4 != null) {
                Object key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                hashMap3.put(key, str4);
            } else {
                Objects.toString(entry.getKey());
            }
        }
        v0Var.f67282e = hashMap3;
        if (c1Var != null) {
            v0Var.f67283f = c1Var;
        }
        return ((o0) this.f92407b).k(v0Var.a());
    }

    @Override // nx.d0
    public final h32.w0 c0(h32.i0 i0Var, h32.u0 u0Var, h32.g0 g0Var, String str) {
        return l0(this, i0Var, h32.f1.TAP, u0Var, g0Var, str, null, null, null, false, 1792);
    }

    public final h32.w0 d(h32.i0 source, h32.f1 f1Var, h32.u0 u0Var, h32.g0 g0Var, String str, HashMap hashMap, h32.d0 d0Var, h32.c1 c1Var, h32.v0 v0Var, boolean z13) {
        if (source == null) {
            return null;
        }
        h32.g0 g0Var2 = g0Var == null ? source.f67084d : g0Var;
        Intrinsics.checkNotNullParameter(source, "source");
        h32.w0 c13 = c(new h32.i0(source.f67081a, source.f67082b, source.f67083c, g0Var2, d0Var, u0Var), f1Var, str, c1Var, hashMap, v0Var, z13, true);
        dl2.b.Z2(g0Var2, u0Var, c13.f67324b);
        return c13;
    }

    @Override // nx.d0
    public final h32.w0 d0(h32.f1 et2, String str, ArrayList impressions) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        if (!(!impressions.isEmpty())) {
            return null;
        }
        Boolean bool = Boolean.FALSE;
        return u(et2, str, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, impressions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, false);
    }

    @Override // nx.d0
    public final h32.w0 e() {
        a aVar = this.f92406a;
        if (aVar instanceof i1) {
            return ((i1) aVar).e();
        }
        return null;
    }

    @Override // nx.d0
    public final h32.w0 e0(h32.g0 component, h32.f1 et2, HashMap hashMap, ArrayList impressions) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Boolean bool = Boolean.FALSE;
        return b(et2, null, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, impressions, null, null, null, null, null, null, null, null, null, null, null, null, null), hashMap, null, component);
    }

    @Override // nx.d0
    public final HashMap f() {
        a aVar = this.f92406a;
        if (aVar instanceof i1) {
            return ((i1) aVar).getF63135d0();
        }
        return null;
    }

    @Override // nx.d0
    public final h32.w0 f0(h32.u0 elementType, h32.g0 g0Var, String str, HashMap hashMap, boolean z13) {
        h32.w0 h03;
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        h03 = h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : elementType, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : str, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z13);
        return h03;
    }

    @Override // nx.d0
    public final h32.w0 g(h32.f1 et2, String str, HashMap hashMap, boolean z13) {
        Intrinsics.checkNotNullParameter(et2, "et");
        return c(this.f92406a.generateLoggingContext(), et2, str, null, hashMap, null, z13, true);
    }

    @Override // nx.d0
    public final h32.w0 g0(String str, ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Boolean bool = Boolean.FALSE;
        return b(h32.f1.SHOWCASE_SUBPIN_IMPRESSION_ONE_PIXEL, str, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, impressions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, null, null);
    }

    @Override // nx.d0
    public final String getUniqueScreenKey() {
        return this.f92406a.getUniqueScreenKey();
    }

    @Override // nx.d0
    public final h32.w0 h(h32.g0 g0Var, h32.u0 u0Var, HashMap hashMap) {
        h32.w0 h03;
        h03 = h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        return h03;
    }

    @Override // nx.d0
    public final h32.w0 h0(h32.f1 eventType, h32.u0 u0Var, h32.g0 g0Var, String str, HashMap hashMap, h32.d0 d0Var, h32.v0 v0Var, boolean z13) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return l0(this, this.f92406a.generateLoggingContext(), eventType, u0Var, g0Var, str, hashMap, d0Var, v0Var, z13, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
    }

    @Override // nx.d0
    public final void i(String pinUid, String str, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        m(pinUid, hashMap, str, null, null);
    }

    @Override // nx.d0
    public final h32.w0 i0(String str, HashMap hashMap, String str2, h32.g0 componentType) {
        h32.i0 i0Var;
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        h32.i0 source = this.f92406a.generateLoggingContext();
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            i0Var = new h32.i0(source.f67081a, source.f67082b, source.f67083c, componentType, source.f67085e, source.f67086f);
        } else {
            i0Var = null;
        }
        h32.i0 i0Var2 = i0Var;
        h32.v0 v0Var = new h32.v0();
        v0Var.G = str2;
        return c(i0Var2, h32.f1.FULL_SCREEN_VIEW, str, null, hashMap, v0Var, false, true);
    }

    @Override // nx.d0
    public final h32.w0 j(h32.i0 i0Var, h32.u0 u0Var, h32.g0 g0Var, String str, HashMap hashMap) {
        return l0(this, i0Var, h32.f1.TAP, u0Var, g0Var, str, hashMap, null, null, false, 1792);
    }

    @Override // nx.d0
    public final h32.w0 j0(h32.f1 et2, String str, ArrayList impressions, HashMap hashMap, h32.c1 c1Var) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        if (!(!impressions.isEmpty())) {
            return null;
        }
        h32.b1 b1Var = c1Var != null ? new h32.b1(c1Var) : new h32.b1();
        b1Var.f66875t = impressions;
        return u(et2, str, b1Var.a(), hashMap, false);
    }

    @Override // nx.d0
    public final h32.w0 k(h32.f1 eventType, h32.g0 g0Var, String str, HashMap hashMap, String str2) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        h32.v0 v0Var = new h32.v0();
        if (str2 != null) {
            v0Var.G = str2;
        }
        return l0(this, this.f92406a.generateLoggingContext(), eventType, null, g0Var, str, hashMap, null, v0Var, false, 1280);
    }

    @Override // nx.d0
    public final h32.w0 k0(h32.f1 et2, HashMap hashMap, String str, h32.u impression) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(impression, "impression");
        Boolean bool = Boolean.FALSE;
        return u(et2, str, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, kotlin.collections.e0.b(impression), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), hashMap, false);
    }

    @Override // nx.d0
    public final h32.w0 l(h32.f1 et2, h32.g0 g0Var, String str, h32.v0 v0Var, ArrayList impressions) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        if (!(!impressions.isEmpty())) {
            return null;
        }
        Boolean bool = Boolean.FALSE;
        return b(et2, str, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, impressions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, v0Var, g0Var);
    }

    @Override // nx.d0
    public final void m(String pinUid, HashMap hashMap, String str, h32.g0 g0Var, h32.u0 u0Var) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        n(pinUid, hashMap, str, g0Var, null, u0Var);
    }

    @Override // nx.d0
    public final void n(String pinUid, HashMap hashMap, String str, h32.g0 g0Var, h32.c1 c1Var, h32.u0 u0Var) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        h32.i0 source = this.f92406a.generateLoggingContext();
        Intrinsics.f(source);
        Intrinsics.checkNotNullParameter(source, "source");
        h32.g0 g0Var2 = g0Var != null ? g0Var : source.f67084d;
        h32.u0 u0Var2 = u0Var != null ? u0Var : source.f67086f;
        h32.v0 v0Var = new h32.v0();
        v0Var.G = str == null ? this.f92408c.c(pinUid) : str;
        HashMap f13 = f();
        if (f13 == null) {
            f13 = new HashMap();
        }
        HashMap hashMap2 = f13;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        c(new h32.i0(source.f67081a, source.f67082b, source.f67083c, g0Var2, source.f67085e, u0Var2), h32.f1.PIN_CLICK, pinUid, c1Var, hashMap2, v0Var, false, true);
    }

    @Override // nx.d0
    public final h32.w0 o(h32.f1 eventType, h32.u0 u0Var, h32.g0 g0Var, String str, HashMap hashMap, h32.d0 d0Var, h32.c1 c1Var, h32.v0 v0Var, boolean z13) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return d(this.f92406a.generateLoggingContext(), eventType, u0Var, g0Var, str, hashMap, d0Var, c1Var, v0Var, z13);
    }

    @Override // nx.d0
    public final void onDestroy() {
        o0 o0Var = (o0) this.f92407b;
        o0Var.getClass();
        a provider = this.f92406a;
        Intrinsics.checkNotNullParameter(provider, "provider");
        o0Var.f92438a.remove(provider);
        this.f92416k = true;
    }

    @Override // nx.d0
    public final h32.i0 p() {
        return this.f92406a.generateLoggingContext();
    }

    @Override // nx.d0
    public final h32.w0 q(h32.g0 g0Var, h32.f1 et2, HashMap hashMap, ArrayList impressions) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        if (!(!impressions.isEmpty())) {
            return null;
        }
        Boolean bool = Boolean.FALSE;
        return b(et2, null, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, impressions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), hashMap, null, g0Var);
    }

    @Override // nx.d0
    public final h32.w0 r(h32.g0 g0Var, h32.f1 et2, HashMap hashMap, ArrayList impressions) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        if (!(!impressions.isEmpty())) {
            return null;
        }
        Boolean bool = Boolean.FALSE;
        return b(et2, null, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, impressions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), hashMap, null, g0Var);
    }

    @Override // nx.d0
    public final h32.w0 s(y0 y0Var) {
        v2 c13;
        Long l13;
        if (y0Var == null || (c13 = y0Var.c()) == null) {
            return null;
        }
        Boolean bool = Boolean.FALSE;
        h32.c1 c1Var = new h32.c1(null, bool, null, Boolean.TRUE, bool, null, c13, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        HashMap b13 = y0Var.b();
        if (b13 == null) {
            b13 = new HashMap();
        }
        HashMap hashMap = b13;
        Long l14 = c13.f67312b;
        if (l14 != null && (l13 = c13.f67314d) != null) {
            hashMap.put("total_time", String.valueOf(l13.longValue() - l14.longValue()));
        }
        this.f92412g.getClass();
        String str = c13.f67313c;
        vh vhVar = str == null ? null : (vh) ew.f37362f.get(str);
        HashMap d2 = y0Var.d();
        if (d2 == null) {
            d2 = vhVar != null ? kh2.d.E(vhVar) : null;
            if (d2 == null) {
                return null;
            }
        }
        hashMap.putAll(d2);
        return b(h32.f1.STORY_IMPRESSION_ONE_PIXEL, c13.f67313c, c1Var, hashMap, null, y0Var.a());
    }

    @Override // nx.d0
    public final h32.w0 t(h32.i0 i0Var, h32.v0 v0Var, h32.c1 c1Var, h32.f1 et2, String str, HashMap hashMap, boolean z13) {
        Intrinsics.checkNotNullParameter(et2, "et");
        return c(i0Var, et2, str, c1Var, hashMap, v0Var, z13, true);
    }

    @Override // nx.d0
    public final h32.w0 u(h32.f1 et2, String str, h32.c1 c1Var, HashMap hashMap, boolean z13) {
        Intrinsics.checkNotNullParameter(et2, "et");
        return c(this.f92406a.generateLoggingContext(), et2, str, c1Var, hashMap, null, z13, true);
    }

    @Override // nx.d0
    public final h32.w0 x(String str, ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Boolean bool = Boolean.FALSE;
        return b(h32.f1.SHOWCASE_SUBPAGE_IMPRESSION_ONE_PIXEL, str, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, impressions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, null, null);
    }

    @Override // nx.d0
    public final h32.w0 y(h32.g0 g0Var, h32.f1 et2, HashMap hashMap, ArrayList impressions) {
        Intrinsics.checkNotNullParameter(et2, "et");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        if (!(!impressions.isEmpty())) {
            return null;
        }
        Boolean bool = Boolean.FALSE;
        return b(et2, null, new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, impressions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), hashMap, null, g0Var);
    }

    @Override // nx.d0
    public final void z(HashMap hashMap) {
        T(null, hashMap);
    }
}
