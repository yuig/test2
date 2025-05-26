package kw;

import android.os.Build;
import android.webkit.CookieManager;
import com.pinterest.api.model.bt0;
import com.pinterest.api.model.xs0;
import ew.k;
import ew.l;
import fw.c;
import h32.f1;
import ix.d;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lb0.g;
import lh0.i;
import m60.u;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final i f81033a;

    /* renamed from: b, reason: collision with root package name */
    public final d f81034b;

    /* renamed from: c, reason: collision with root package name */
    public final c f81035c;

    /* renamed from: d, reason: collision with root package name */
    public final l f81036d;

    public a(i adsGmaLibraryExperiments, d adsGmaConfigManager, c adsGmaLibraryAnalytics, l adsGmaHeaderManager) {
        Intrinsics.checkNotNullParameter(adsGmaLibraryExperiments, "adsGmaLibraryExperiments");
        Intrinsics.checkNotNullParameter(adsGmaConfigManager, "adsGmaConfigManager");
        Intrinsics.checkNotNullParameter(adsGmaLibraryAnalytics, "adsGmaLibraryAnalytics");
        Intrinsics.checkNotNullParameter(adsGmaHeaderManager, "adsGmaHeaderManager");
        this.f81033a = adsGmaLibraryExperiments;
        this.f81034b = adsGmaConfigManager;
        this.f81035c = adsGmaLibraryAnalytics;
        this.f81036d = adsGmaHeaderManager;
    }

    public static void b(String str) {
        u.f85943a.d(new z.a(str, 12));
    }

    public final boolean a() {
        bt0 f13;
        boolean z13;
        bt0 f14;
        String Z;
        String Z2;
        String Z3;
        String e13;
        bt0 f15;
        String Z4;
        String Z5;
        String Z6;
        String e14;
        k kVar = k.FAIL_QUARANTINE_STARTING;
        ew.c cVar = (ew.c) this.f81036d;
        cVar.e(kVar);
        c cVar2 = this.f81035c;
        cVar2.getClass();
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                cVar.e(k.PASS_VALID_ANDROID_API_VERSION);
                try {
                    CookieManager.getInstance();
                    cVar.e(k.PASS_HAS_WEBVIEW);
                    b("[Quarantine] PASS 0: WebView is installed");
                    if (!this.f81033a.a()) {
                        b("[Quarantine] FAILED, user is not part of the experiment");
                        cVar.e(k.FAIL_EXPERIMENT_NOT_ENABLED);
                        return false;
                    }
                    cVar.e(k.PASS_EXPERIMENT_ENABLED);
                    b("[Quarantine] PASS 1: User is in an eligible expt group");
                    d dVar = this.f81034b;
                    xs0 xs0Var = dVar.f73790f;
                    kx.b bVar = dVar.f73786b;
                    if (xs0Var == null) {
                        dVar.f73790f = null;
                        bVar.f81051c.getClass();
                        g.a("THIRD_PARTY_AD_CONFIG");
                        ((lb0.b) bVar.f81053e).m("PREF_THIRD_PARTY_AD_CONFIG_EXPIRY_MS", 0L);
                        dVar.d();
                        z13 = false;
                    } else {
                        boolean c13 = dVar.c();
                        jx.a aVar = dVar.f73787c;
                        if (c13) {
                            xs0 xs0Var2 = dVar.f73790f;
                            aVar.getClass();
                            f1 f1Var = f1.GMA_SDK_QUARANTINE_FAILED;
                            HashMap o13 = ep.b.o("fail_reason", "expired_configuration");
                            if (xs0Var2 != null && (e14 = xs0Var2.e()) != null) {
                            }
                            if (xs0Var2 != null && (f15 = xs0Var2.f()) != null) {
                                o13.put("load", String.valueOf(f15.s().booleanValue()));
                                List o14 = f15.o();
                                if (o14 != null && (Z6 = CollectionsKt.Z(o14, ",", null, null, 0, null, null, 62)) != null) {
                                }
                                List p13 = f15.p();
                                if (p13 != null && (Z5 = CollectionsKt.Z(p13, ",", null, null, 0, null, null, 62)) != null) {
                                }
                                List q13 = f15.q();
                                if (q13 != null && (Z4 = CollectionsKt.Z(q13, ",", null, null, 0, null, null, 62)) != null) {
                                    o13.put("deny_list", Z4);
                                }
                            }
                            Unit unit = Unit.f80348a;
                            aVar.f77675a.g(f1Var, null, o13, false);
                            dVar.f73790f = null;
                            bVar.f81051c.getClass();
                            g.a("THIRD_PARTY_AD_CONFIG");
                            ((lb0.b) bVar.f81053e).m("PREF_THIRD_PARTY_AD_CONFIG_EXPIRY_MS", 0L);
                            dVar.d();
                            z13 = false;
                        } else {
                            xs0 xs0Var3 = dVar.f73790f;
                            if (xs0Var3 == null || (f13 = xs0Var3.f()) == null || !Intrinsics.d(f13.s(), Boolean.FALSE)) {
                                cVar.e(k.PASS_VALID_CONFIG);
                                b("[Quarantine] PASS 2: User config.gma.load == true");
                                b("[Quarantine] SUCCESS: All quarantine checks passed");
                                cVar.e(k.SUCCESSFUL_QUARANTINE);
                                return true;
                            }
                            xs0 xs0Var4 = dVar.f73790f;
                            aVar.getClass();
                            f1 f1Var2 = f1.GMA_SDK_QUARANTINE_FAILED;
                            HashMap o15 = ep.b.o("fail_reason", "false_load");
                            if (xs0Var4 != null && (e13 = xs0Var4.e()) != null) {
                            }
                            if (xs0Var4 != null && (f14 = xs0Var4.f()) != null) {
                                o15.put("load", String.valueOf(f14.s().booleanValue()));
                                List o16 = f14.o();
                                if (o16 != null && (Z3 = CollectionsKt.Z(o16, ",", null, null, 0, null, null, 62)) != null) {
                                }
                                List p14 = f14.p();
                                if (p14 != null && (Z2 = CollectionsKt.Z(p14, ",", null, null, 0, null, null, 62)) != null) {
                                }
                                List q14 = f14.q();
                                if (q14 != null && (Z = CollectionsKt.Z(q14, ",", null, null, 0, null, null, 62)) != null) {
                                    o15.put("deny_list", Z);
                                }
                            }
                            Unit unit2 = Unit.f80348a;
                            z13 = false;
                            aVar.f77675a.g(f1Var2, null, o15, false);
                        }
                    }
                    b("[Quarantine] FAILED, GMA config is null or not enabled for the user");
                    cVar.e(k.FAIL_INVALID_CONFIG);
                    return z13;
                } catch (Exception unused) {
                    b("[Quarantine] FAILED, WebView is not installed");
                    c.b(cVar2, "webview_not_installed");
                    cVar.e(k.FAIL_NO_WEBVIEW);
                    return false;
                }
            }
        } catch (Exception unused2) {
        }
        b("[Quarantine] FAILED, User is below Android API 29");
        c.b(cVar2, "invalid_android_api_version");
        cVar.e(k.FAIL_INVALID_ANDROID_API_VERSION);
        return false;
    }
}
