package dy;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import ey.b0;
import ey.t4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import lb0.o;
import m60.f0;
import nm.p;
import vy.m;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final cr1.a f56528a;

    /* renamed from: b, reason: collision with root package name */
    public final cr1.a f56529b;

    /* renamed from: c, reason: collision with root package name */
    public final z10.a f56530c;

    /* renamed from: d, reason: collision with root package name */
    public final oc.c f56531d;

    /* renamed from: e, reason: collision with root package name */
    public final o f56532e;

    /* renamed from: f, reason: collision with root package name */
    public final b60.b f56533f;

    /* renamed from: g, reason: collision with root package name */
    public FirebaseAnalytics f56534g;

    /* renamed from: h, reason: collision with root package name */
    public m f56535h;

    public d(cr1.a authAccountService, cr1.a unauthAccountService, f0 authTokenProvider, oc.c apolloClient, o preferencesManager, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(authAccountService, "authAccountService");
        Intrinsics.checkNotNullParameter(unauthAccountService, "unauthAccountService");
        Intrinsics.checkNotNullParameter(authTokenProvider, "authTokenProvider");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f56528a = authAccountService;
        this.f56529b = unauthAccountService;
        this.f56530c = authTokenProvider;
        this.f56531d = apolloClient;
        this.f56532e = preferencesManager;
        this.f56533f = activeUserManager;
    }

    public final void a(Context context, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            this.f56534g = FirebaseAnalytics.getInstance(context);
        } catch (Throwable unused) {
            b("firebase_analytics_initialization_failure", "Error inititializing Firebase", null);
        }
        int i13 = 26;
        if (((lb0.b) this.f56532e).e("PREF_FIRST_LAUNCH", true) || z13) {
            new androidx.activity.d(this, i13).run();
            return;
        }
        int i14 = 48;
        new t4(i14, b0.TAG_FIREBASE_ANALYTICS_INIT, new androidx.activity.d(this, i13), false, false).c();
    }

    public final void b(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("app", hf0.b.a().name());
        ((m60.d) m60.d.a()).b();
        hashMap.put("app_version", String.valueOf(13198010));
        if (str2 != null) {
            hashMap.put("error", str2);
            hashMap.put("status", "error");
        } else {
            hashMap.put("status", "success");
            if (str3 != null) {
                hashMap.put("event", str3);
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("tags", hashMap);
        nm.o a13 = new p().a();
        HashMap hashMap3 = new HashMap();
        String k13 = a13.k(hashMap2);
        Intrinsics.checkNotNullExpressionValue(k13, "toJson(...)");
        hashMap3.put("aux_data", k13);
        m mVar = this.f56535h;
        if (mVar != null) {
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap3);
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
            mVar.k(str, unmodifiableMap);
        }
    }
}
