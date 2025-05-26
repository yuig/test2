package me;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import df.a0;
import df.j1;
import df.k1;
import df.u0;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import le.g0;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: d */
    public static ScheduledThreadPoolExecutor f86997d;

    /* renamed from: g */
    public static String f87000g;

    /* renamed from: h */
    public static boolean f87001h;

    /* renamed from: a */
    public final String f87002a;

    /* renamed from: b */
    public final b f87003b;

    /* renamed from: c */
    public static final wc.j f86996c = new wc.j(23, 0);

    /* renamed from: e */
    public static final k f86998e = k.AUTO;

    /* renamed from: f */
    public static final Object f86999f = new Object();

    public m(String activityName, String str) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        k1.f();
        this.f87002a = activityName;
        Date date = AccessToken.f29844l;
        AccessToken s13 = wc.j.s();
        if (s13 == null || s13.d() || !(str == null || Intrinsics.d(str, s13.f29854h))) {
            if (str == null) {
                k1.d(le.v.a(), "context");
                str = le.v.b();
            }
            this.f87003b = new b(null, str);
        } else {
            this.f87003b = new b(s13);
        }
        wc.j.y();
    }

    public static final /* synthetic */ String a() {
        if (p001if.a.b(m.class)) {
            return null;
        }
        try {
            return f87000g;
        } catch (Throwable th3) {
            p001if.a.a(m.class, th3);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (p001if.a.b(m.class)) {
            return null;
        }
        try {
            return f86997d;
        } catch (Throwable th3) {
            p001if.a.a(m.class, th3);
            return null;
        }
    }

    public static final /* synthetic */ Object c() {
        if (p001if.a.b(m.class)) {
            return null;
        }
        try {
            return f86999f;
        } catch (Throwable th3) {
            p001if.a.a(m.class, th3);
            return null;
        }
    }

    public final void d(String str, Bundle bundle) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            e(str, null, bundle, false, ue.b.b());
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void e(String str, Double d2, Bundle bundle, boolean z13, UUID uuid) {
        if (p001if.a.b(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            AtomicBoolean atomicBoolean = a0.f54697a;
            if (a0.b("app_events_killswitch", le.v.b(), false)) {
                wc.b bVar = u0.f54860d;
                wc.b.y(g0.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                try {
                    wc.j.n(new e(this.f87002a, str, d2, bundle, z13, ue.b.c(), uuid), this.f87003b);
                } catch (JSONException e13) {
                    wc.b bVar2 = u0.f54860d;
                    wc.b.y(g0.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e13.toString());
                }
            } catch (FacebookException e14) {
                wc.b bVar3 = u0.f54860d;
                wc.b.y(g0.APP_EVENTS, "AppEvents", "Invalid app event: %s", e14.toString());
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void f(String str, Bundle bundle) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            e(str, null, bundle, true, ue.b.b());
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void g(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (p001if.a.b(this)) {
            return;
        }
        wc.j jVar = f86996c;
        try {
            if (bigDecimal == null) {
                wc.b bVar = u0.f54860d;
                wc.b.x(g0.DEVELOPER_ERRORS, "AppEvents", "purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                wc.b bVar2 = u0.f54860d;
                wc.b.x(g0.DEVELOPER_ERRORS, "AppEvents", "currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            e("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, true, ue.b.b());
            if (jVar.u() != k.EXPLICIT_ONLY) {
                String str = i.f86987a;
                i.c(p.EAGER_FLUSHING_EVENT);
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public m(Context context, String str) {
        this(j1.d0(context), str);
    }
}
