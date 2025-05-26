package dy;

import android.content.Context;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.internal.p;
import do2.t2;
import do2.u2;
import e5.k;
import ey.b0;
import ey.t4;
import h32.f1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb0.o;
import lh0.f2;
import m60.f0;
import nx.d0;
import nx.r0;
import vy.m;
import xk2.v;

/* loaded from: classes.dex */
public final class a implements AppsFlyerConversionListener {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f56508a;

    /* renamed from: b, reason: collision with root package name */
    public final o f56509b;

    /* renamed from: c, reason: collision with root package name */
    public final lu1.d f56510c;

    /* renamed from: d, reason: collision with root package name */
    public final f2 f56511d;

    /* renamed from: e, reason: collision with root package name */
    public final cr1.a f56512e;

    /* renamed from: f, reason: collision with root package name */
    public final cr1.a f56513f;

    /* renamed from: g, reason: collision with root package name */
    public final z10.a f56514g;

    /* renamed from: h, reason: collision with root package name */
    public final b60.b f56515h;

    /* renamed from: i, reason: collision with root package name */
    public final m60.e f56516i;

    /* renamed from: j, reason: collision with root package name */
    public m f56517j;

    /* renamed from: k, reason: collision with root package name */
    public d f56518k;

    /* renamed from: l, reason: collision with root package name */
    public String f56519l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f56520m;

    /* renamed from: n, reason: collision with root package name */
    public final v f56521n;

    /* renamed from: o, reason: collision with root package name */
    public final t2 f56522o;

    public a(d0 topLevelPinalytics, o preferencesManager, lu1.d activityIntentFactory, f2 experiments, cr1.a authAccountService, cr1.a unauthAccountService, f0 authTokenProvider, b60.b activeUserManager, m60.e applicationInfoProvider) {
        Intrinsics.checkNotNullParameter(topLevelPinalytics, "topLevelPinalytics");
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(authAccountService, "authAccountService");
        Intrinsics.checkNotNullParameter(unauthAccountService, "unauthAccountService");
        Intrinsics.checkNotNullParameter(authTokenProvider, "authTokenProvider");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        this.f56508a = topLevelPinalytics;
        this.f56509b = preferencesManager;
        this.f56510c = activityIntentFactory;
        this.f56511d = experiments;
        this.f56512e = authAccountService;
        this.f56513f = unauthAccountService;
        this.f56514g = authTokenProvider;
        this.f56515h = activeUserManager;
        this.f56516i = applicationInfoProvider;
        Boolean bool = Boolean.FALSE;
        this.f56520m = bool;
        this.f56521n = xk2.m.b(new r0(this, 1));
        this.f56522o = u2.a(bool);
    }

    public final void a(Context context, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (b()) {
            return;
        }
        f1 f1Var = f1.APPSFLYER_INIT;
        d0 d0Var = this.f56508a;
        d0.v(d0Var, f1Var, null, false, 12);
        boolean e13 = ((lb0.b) this.f56509b).e("PREF_FIRST_LAUNCH", true);
        int i13 = 25;
        int i14 = 8;
        if (e13 || z13) {
            d0.v(d0Var, e13 ? f1.APPSFLYER_FIRST_LAUNCH : f1.APPSFLYER_INIT_IMMEDIATE, null, false, 12);
            (b() ? new p(i14) : new k(i13, this, context)).run();
        } else {
            d0.v(d0Var, f1.APPSFLYER_COLD_START_TASK, null, false, 12);
            new t4(48, b0.TAG_APPSFLYER_INIT, b() ? new p(i14) : new k(i13, this, context), false, false).c();
        }
    }

    public final boolean b() {
        return ((Boolean) this.f56521n.getValue()).booleanValue();
    }

    public final void c(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("app", hf0.b.a().name());
        ((m60.d) m60.d.a()).b();
        hashMap.put("app_version", String.valueOf(13198010));
        if (str2 != null) {
            hashMap.put("error", str2);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("tags", hashMap);
        nm.o a13 = new nm.p().a();
        HashMap hashMap3 = new HashMap();
        String k13 = a13.k(hashMap2);
        Intrinsics.checkNotNullExpressionValue(k13, "toJson(...)");
        hashMap3.put("aux_data", k13);
        m mVar = this.f56517j;
        if (mVar != null) {
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap3);
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
            mVar.k(str, unmodifiableMap);
        }
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAppOpenAttribution(Map conversionData) {
        Intrinsics.checkNotNullParameter(conversionData, "conversionData");
        if (b()) {
            return;
        }
        Iterator it = conversionData.keySet().iterator();
        while (it.hasNext()) {
            Objects.toString(conversionData.get((String) it.next()));
        }
        if (Intrinsics.d(conversionData.get("media_source"), "mweb")) {
            c("appsflyer_dl_app_start", "");
        }
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAttributionFailure(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (b()) {
            return;
        }
        c("appsflyer_metadata_failure", errorMessage);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataFail(String str) {
        if (b()) {
            return;
        }
        c("appsflyer_metadata_failure", str);
        this.f56522o.i(Boolean.TRUE);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataSuccess(Map map) {
        if (b()) {
            return;
        }
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Objects.toString(key);
                Objects.toString(value);
                arrayList.add(Unit.f80348a);
            }
            if (map.containsKey("af_dp")) {
                Object obj = map.get("af_dp");
                this.f56519l = obj instanceof String ? (String) obj : null;
            }
            if (map.containsKey("preload")) {
                this.f56520m = Boolean.TRUE;
                c("appsflyer_preload_metadata_success", null);
            }
        }
        this.f56522o.i(Boolean.TRUE);
        if (Intrinsics.d(map != null ? map.get("media_source") : null, "mweb")) {
            c("appsflyer_metadata_success", null);
        }
    }
}
