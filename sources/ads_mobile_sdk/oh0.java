package ads_mobile_sdk;

import android.util.Base64;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class oh0 {

    /* renamed from: e, reason: collision with root package name */
    public static final wg0 f9281e = wg0.f13026a;

    /* renamed from: f, reason: collision with root package name */
    public static final yg0 f9282f = yg0.f14238a;

    /* renamed from: g, reason: collision with root package name */
    public static final eh0 f9283g = eh0.f4860a;

    /* renamed from: h, reason: collision with root package name */
    public static final zg0 f9284h = zg0.f14761a;

    /* renamed from: i, reason: collision with root package name */
    public static final ah0 f9285i = ah0.f2407a;

    /* renamed from: j, reason: collision with root package name */
    public static final dh0 f9286j = dh0.f4282a;

    /* renamed from: k, reason: collision with root package name */
    public static final bh0 f9287k = bh0.f2879a;

    /* renamed from: l, reason: collision with root package name */
    public static final ch0 f9288l = ch0.f3913a;

    /* renamed from: m, reason: collision with root package name */
    public static final fh0 f9289m = fh0.f5156a;

    /* renamed from: n, reason: collision with root package name */
    public static final xg0 f9290n = xg0.f13650a;

    /* renamed from: o, reason: collision with root package name */
    public static final hh0 f9291o = hh0.f5973a;

    /* renamed from: p, reason: collision with root package name */
    public static final gh0 f9292p = gh0.f5567a;

    /* renamed from: q, reason: collision with root package name */
    public static final ih0 f9293q = ih0.f6403a;

    /* renamed from: r, reason: collision with root package name */
    public static final jh0 f9294r = jh0.f6817a;

    /* renamed from: s, reason: collision with root package name */
    public static final kh0 f9295s = kh0.f7309a;

    /* renamed from: a, reason: collision with root package name */
    public final tg0 f9296a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9297b;

    /* renamed from: c, reason: collision with root package name */
    public double f9298c;

    /* renamed from: d, reason: collision with root package name */
    public int f9299d;

    public oh0(tg0 flagValueProvider) {
        Intrinsics.checkNotNullParameter(flagValueProvider, "flagValueProvider");
        this.f9296a = flagValueProvider;
    }

    public final boolean A() {
        return ((Boolean) a("gads:cct_v2_connection:enabled", Boolean.FALSE, f9281e)).booleanValue();
    }

    public final boolean B() {
        return ((Boolean) a("gads:csrb_abtest_exception:enabled", Boolean.FALSE, f9281e)).booleanValue();
    }

    public final long C() {
        zn2.a aVar = zn2.b.f142311b;
        return ((zn2.b) a("gads:extension_version_expiration_in_days", new zn2.b(dl2.b.P2(365, zn2.d.DAYS)), f9290n)).f142314a;
    }

    public final boolean D() {
        return ((Boolean) a("gads:extension_version_signal_prefetching_enabled", Boolean.FALSE, f9281e)).booleanValue();
    }

    public final boolean E() {
        return ((Boolean) a("gads:extension_version_signal_signal_stale_results_enabled", Boolean.FALSE, f9281e)).booleanValue();
    }

    public final String F() {
        return (String) a("gads:firebase_analytics_class_name", "com.google.android.gms.measurement.api.AppMeasurementSdk", f9294r);
    }

    public final String G() {
        nm.q qVar = new nm.q();
        hs hsVar = hs.f6059b;
        nm.u uVar = new nm.u();
        uVar.u("consent_key", "gad_has_consent_for_cookies");
        uVar.u("consent_value_match", "0");
        uVar.s(1, "consent_value_type");
        qVar.t(uVar);
        nm.u uVar2 = new nm.u();
        uVar2.u("consent_key", "IABTCF_gdprApplies");
        uVar2.u("consent_value_match", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        uVar2.s(1, "consent_value_type");
        qVar.t(uVar2);
        Unit unit = Unit.f80348a;
        String sVar = qVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        return (String) a("gads:full_consent_check_map", sVar, f9294r);
    }

    public final boolean H() {
        return this.f9297b;
    }

    public final List I() {
        return (List) a("gad:scar_gks:enabled_list", kotlin.collections.e0.b("2"), f9286j);
    }

    public final boolean L() {
        return ((Boolean) a("gads:include_ping_attempts:enabled", Boolean.FALSE, f9281e)).booleanValue();
    }

    public final boolean M() {
        return ((Boolean) a("gads:inspector:enabled", Boolean.TRUE, f9281e)).booleanValue();
    }

    public final List N() {
        return (List) a("gads:logged_adapter_version_classes", kotlin.collections.f0.j("com.google.ads.mediation.inmobi.InMobiMediationAdapter", "com.google.ads.mediation.imobile.IMobileMediationAdapter", "com.google.ads.mediation.nend.NendMediationAdapter", "com.google.ads.mediation.adcolony.AdColonyMediationAdapter", "com.google.ads.mediation.facebook.FacebookMediationAdapter", "com.google.ads.mediation.mopub.MoPubMediationAdapter", "com.google.ads.mediation.applovin.AppLovinMediationAdapter", "com.google.ads.mediation.tapjoy.TapjoyMediationAdapter", "com.google.ads.mediation.vungle.VungleMediationAdapter", "com.google.ads.mediation.unity.UnityMediationAdapter", "com.google.ads.mediation.chartboost.ChartboostMediationAdapter", "com.google.ads.mediation.mytarget.MyTargetMediationAdapter", "com.google.ads.mediation.maio.MaioMediationAdapter", "com.google.ads.mediation.ironsource.IronSourceMediationAdapter", "com.google.ads.mediation.fyber.FyberMediationAdapter", "com.google.ads.mediation.verizon.VerizonMediationAdapter"), f9293q);
    }

    public final List O() {
        return (List) a("gads:missing_gmsg_handlers_to_ignore", kotlin.collections.f0.j("/noop", "/updateActiveView", "/trackActiveViewUnit", "/jsLoaded", "/impressionRecorded", "/refresh", "/requestReload", "/navigation", "/closeStoreOverlay"), f9286j);
    }

    public final String P() {
        return (String) a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js", f9294r);
    }

    public final String Q() {
        return (String) a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js", f9294r);
    }

    public final String R() {
        return (String) a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js", f9294r);
    }

    public final String S() {
        return (String) a("gad:mraid:version", "3.0", f9294r);
    }

    public final boolean T() {
        return ((Boolean) a("gads:nas_collect_layout_params:enabled", Boolean.FALSE, f9281e)).booleanValue();
    }

    public final boolean U() {
        return ((Boolean) a("gads:omid_javascript_session_service:enabled", Boolean.FALSE, f9281e)).booleanValue();
    }

    public final String V() {
        return (String) a("gads:pact_active_exp_id:enabled", "[]", f9294r);
    }

    public final wv1 W() {
        return (wv1) this.f9296a.f11542h.get();
    }

    public final tx1 X() {
        return (tx1) this.f9296a.f11543i.get();
    }

    public final long a(long j13, String str) {
        return ((zn2.b) a(str, new zn2.b(j13), f9289m)).f142314a;
    }

    public final String a0() {
        return (String) a("gads:remote_capture_service_url", "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1", f9294r);
    }

    public final long b(long j13, String str) {
        return ((zn2.b) a(str, new zn2.b(j13), f9291o)).f142314a;
    }

    public final boolean b0() {
        return ((Boolean) a("gads:request_throttler:enabled", Boolean.TRUE, f9281e)).booleanValue();
    }

    public final long c0() {
        zn2.a aVar = zn2.b.f142311b;
        return a(dl2.b.P2(500, zn2.d.MILLISECONDS), "gads:request_throttler_retry_delay_ms");
    }

    public final long d0() {
        zn2.a aVar = zn2.b.f142311b;
        return a(dl2.b.P2(900, zn2.d.MILLISECONDS), "(gads:rtb_v1_1:signal_timeout_ms");
    }

    public final double e0() {
        return ((Number) a("gads:rtb_timeout_multiplier", Double.valueOf(0.95d), f9282f)).doubleValue();
    }

    public final String f0() {
        nm.q qVar = new nm.q();
        hs hsVar = hs.f6059b;
        qVar.t(a("IABTCF_AddtlConsent", hsVar));
        qVar.t(a("IABConsent_CMPPresent", hs.f6061d));
        hs hsVar2 = hs.f6060c;
        qVar.t(a("IABTCF_CmpSdkID", hsVar2));
        qVar.t(a("IABConsent_ConsentString", hsVar));
        qVar.t(a("IABTCF_gdprApplies", hsVar2));
        qVar.t(a("IABGPP_HDR_GppString", hsVar));
        qVar.t(a("IABGPP_GppSID", hsVar));
        qVar.t(a("gad_has_consent_for_cookies", hsVar2));
        qVar.t(a("IABConsent_ParsedPurposeConsents", hsVar));
        qVar.t(a("personalized_ad_status", hsVar));
        qVar.t(a("IABTCF_PolicyVersion", hsVar2));
        qVar.t(a("IABUSPrivacy_String", hsVar));
        qVar.t(a("IABTCF_PurposeConsents", hsVar));
        qVar.t(a("gad_rdp", hsVar2));
        qVar.t(a("IABConsent_SubjectToGDPR", hsVar));
        qVar.t(a("IABTCF_TCString", hsVar));
        qVar.t(a("UPTC_UptcString", hsVar));
        qVar.t(a("IABConsent_ParsedVendorConsents", hsVar));
        Unit unit = Unit.f80348a;
        String sVar = qVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        return (String) a("gads:sp:json_string", sVar, f9294r);
    }

    public final boolean g0() {
        return ((Boolean) a("gads:paw_cache:enabled", Boolean.TRUE, f9281e)).booleanValue();
    }

    public final long h0() {
        zn2.a aVar = zn2.b.f142311b;
        return a(dl2.b.P2(60, zn2.d.SECONDS), "gads:paw_cache:ttl_ms");
    }

    public final int i() {
        return ((Number) a("gads:app_event_queue_size", 20, f9285i)).intValue();
    }

    public final List i0() {
        return (List) a("gad:scar_rtb_signal:enabled_list", kotlin.collections.e0.b("8"), f9286j);
    }

    public final boolean j() {
        return ((Boolean) a("gads:audio_signal_prefetching_enabled", Boolean.FALSE, f9281e)).booleanValue();
    }

    public final int j0() {
        return ((Number) a("gads:maximum_query_json_cache_size", 200, f9285i)).intValue();
    }

    public final boolean k() {
        return ((Boolean) a("gads:audio_signal_stale_results_enabled", Boolean.FALSE, f9281e)).booleanValue();
    }

    public final long k0() {
        zn2.a aVar = zn2.b.f142311b;
        return a(dl2.b.P2(1, zn2.d.HOURS), "gads:timeout_query_json_cache:millis");
    }

    public final long l() {
        zn2.a aVar = zn2.b.f142311b;
        return b(a(dl2.b.P2(30, zn2.d.SECONDS), "gads:default_signal_ttl"), "gads:audio_signal_ttl");
    }

    public final long l0() {
        zn2.b.f142311b.getClass();
        return a(0L, "gads:integration_signal_timeout:ms");
    }

    public final boolean m() {
        return ((Boolean) a("gads:battery_signal_prefetching_enabled", Boolean.FALSE, f9281e)).booleanValue();
    }

    public final String m0() {
        return (String) a("pps_rg", "\\d+=([a-zA-Z0-9]+)(\\|[a-zA-Z0-9]+)*$", f9294r);
    }

    public final boolean n() {
        return ((Boolean) a("gads:battery_signal_stale_results_enabled", Boolean.FALSE, f9281e)).booleanValue();
    }

    public final String n0() {
        return (String) a("gads:webview_cookie_url", "https://googleads.g.doubleclick.net", f9294r);
    }

    public final long o() {
        zn2.a aVar = zn2.b.f142311b;
        return b(dl2.b.P2(5, zn2.d.MINUTES), "gads:battery_signal_ttl");
    }

    public final String p() {
        return (String) a("gads:gads:blob_encryption_public_key", "MIGdMA0GCSqGSIb3DQEBAQUAA4GLADCBhwKBgQDILejyvRuVmPUcwUTpEVaE8A_-D7bZPnTOMs91 WZ0iSLQrK0lcICNKeWom1jWNBxjw89oyra30BlZCDEu7nfGacaTmzX74wD_RJV3xh81_9l2PWr46 0J9DJcXSi4yGzJyyUYp7Q1YXam8J6DYWV6PoemmP71T2fbm9i1VQy1NFgQIBAw", f9294r);
    }

    public final String q() {
        String encodeToString = Base64.encodeToString(new byte[]{0, 19, -48, -88, -79}, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return (String) a("gads:blob_encryption_public_key_first_hashed_bytes", encodeToString, f9294r);
    }

    public final String r() {
        return (String) a("gads:blob_url_key", "blob", f9294r);
    }

    public final boolean s() {
        return ((Boolean) a("gads:clear_webview_cache:enabled", Boolean.FALSE, f9281e)).booleanValue();
    }

    public final Map t() {
        return (Map) this.f9296a.f11544j.get();
    }

    public final String u() {
        return (String) a("gads:sdk_csi_server", "https://csi.gstatic.com/csi", f9294r);
    }

    public final List v() {
        return (List) a("gads:pact_navigation_event_to_request_channel", kotlin.collections.e0.b(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE), f9286j);
    }

    public final long w() {
        zn2.a aVar = zn2.b.f142311b;
        return a(dl2.b.P2(60, zn2.d.SECONDS), "gads:banner_refresh_time:seconds");
    }

    public final long x() {
        zn2.a aVar = zn2.b.f142311b;
        return a(dl2.b.P2(30, zn2.d.SECONDS), "gads:banner_refresh_load_ad_delay:seconds");
    }

    public final boolean y() {
        return ((Boolean) a("gads:webview_sound_effects:disabled", Boolean.TRUE, f9281e)).booleanValue();
    }

    public final boolean z() {
        return ((Boolean) a("gads:cct_v2_optimization:enabled", Boolean.FALSE, f9281e)).booleanValue();
    }

    public final Object a(String key, Object obj, Function1 converter) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Object a13 = this.f9296a.a(key, converter);
        return a13 == null ? obj : a13;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.oh0 r4, kotlin.coroutines.CoroutineContext r5, ao2.j0 r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.lh0
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.lh0 r0 = (ads_mobile_sdk.lh0) r0
            int r1 = r0.f7842d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7842d = r1
            goto L18
        L13:
            ads_mobile_sdk.lh0 r0 = new ads_mobile_sdk.lh0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f7840b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f7842d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ads_mobile_sdk.oh0 r4 = r0.f7839a
            ue.c.H(r7)
            goto L4f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ue.c.H(r7)
            ads_mobile_sdk.tg0 r7 = r4.f9296a
            r0.f7839a = r4
            r0.f7842d = r3
            r7.getClass()
            ads_mobile_sdk.og0 r2 = new ads_mobile_sdk.og0
            r3 = 0
            r2.<init>(r7, r6, r3)
            java.lang.Object r5 = kotlin.jvm.internal.j.M(r0, r5, r2)
            if (r5 != r1) goto L4a
            goto L4c
        L4a:
            kotlin.Unit r5 = kotlin.Unit.f80348a
        L4c:
            if (r5 != r1) goto L4f
            return r1
        L4f:
            ads_mobile_sdk.tg0 r5 = r4.f9296a
            ads_mobile_sdk.wg0 r6 = ads_mobile_sdk.oh0.f9281e
            java.lang.String r7 = "gads:csrb:enabled"
            java.lang.Object r5 = r5.a(r7, r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r6 = 0
            if (r5 == 0) goto L63
            boolean r5 = r5.booleanValue()
            goto L64
        L63:
            r5 = r6
        L64:
            r4.f9297b = r5
            ads_mobile_sdk.tg0 r5 = r4.f9296a
            ads_mobile_sdk.mh0 r7 = ads_mobile_sdk.mh0.f8224a
            java.lang.String r0 = "gads:csrb_abtest_enabled:ratio"
            java.lang.Object r5 = r5.a(r0, r7)
            java.lang.Double r5 = (java.lang.Double) r5
            if (r5 == 0) goto L79
            double r0 = r5.doubleValue()
            goto L7b
        L79:
            r0 = 0
        L7b:
            r4.f9298c = r0
            ads_mobile_sdk.tg0 r5 = r4.f9296a
            ads_mobile_sdk.nh0 r7 = ads_mobile_sdk.nh0.f8800a
            java.lang.String r0 = "gads:csrb_break_glass_mode"
            java.lang.Object r5 = r5.a(r0, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L8f
            int r6 = r5.intValue()
        L8f:
            r4.f9299d = r6
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.oh0.a(ads_mobile_sdk.oh0, kotlin.coroutines.CoroutineContext, ao2.j0, bl2.c):java.lang.Object");
    }

    public static nm.u a(String str, hs hsVar) {
        nm.u uVar = new nm.u();
        uVar.u("bk", str);
        uVar.u("sk", str);
        uVar.s(Integer.valueOf(hsVar.f6063a), "type");
        return uVar;
    }
}
