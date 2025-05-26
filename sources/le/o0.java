package le;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.facebook.FacebookSdkNotInitializedException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f83080a = new o0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f83081b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f83082c;

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f83083d;

    /* renamed from: e, reason: collision with root package name */
    public static final n0 f83084e;

    /* renamed from: f, reason: collision with root package name */
    public static final n0 f83085f;

    /* renamed from: g, reason: collision with root package name */
    public static final n0 f83086g;

    /* renamed from: h, reason: collision with root package name */
    public static final n0 f83087h;

    /* renamed from: i, reason: collision with root package name */
    public static final n0 f83088i;

    /* renamed from: j, reason: collision with root package name */
    public static SharedPreferences f83089j;

    static {
        String name = o0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "UserSettingsManager::class.java.name");
        f83081b = name;
        f83082c = new AtomicBoolean(false);
        f83083d = new AtomicBoolean(false);
        f83084e = new n0("com.facebook.sdk.AutoInitEnabled", true);
        f83085f = new n0("com.facebook.sdk.AutoLogAppEventsEnabled", true);
        f83086g = new n0("com.facebook.sdk.AdvertiserIDCollectionEnabled", true);
        f83087h = new n0("auto_event_setup_enabled", false);
        f83088i = new n0("com.facebook.sdk.MonitorEnabled", true);
    }

    public static final boolean a() {
        if (p001if.a.b(o0.class)) {
            return false;
        }
        try {
            f83080a.d();
            return f83086g.b();
        } catch (Throwable th3) {
            p001if.a.a(o0.class, th3);
            return false;
        }
    }

    public static final boolean b() {
        if (p001if.a.b(o0.class)) {
            return false;
        }
        try {
            f83080a.d();
            return f83085f.b();
        } catch (Throwable th3) {
            p001if.a.a(o0.class, th3);
            return false;
        }
    }

    public final void c() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            n0 n0Var = f83087h;
            h(n0Var);
            long currentTimeMillis = System.currentTimeMillis();
            if (n0Var.f83077c == null || currentTimeMillis - n0Var.a() >= 604800000) {
                n0Var.f83077c = null;
                n0Var.f83078d = 0L;
                int i13 = 0;
                if (f83083d.compareAndSet(false, true)) {
                    v.d().execute(new m0(currentTimeMillis, i13));
                }
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void d() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (v.f83119p.get()) {
                int i13 = 0;
                if (f83082c.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = v.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                    f83089j = sharedPreferences;
                    n0[] n0VarArr = {f83085f, f83086g, f83084e};
                    if (!p001if.a.b(this)) {
                        while (i13 < 3) {
                            try {
                                n0 n0Var = n0VarArr[i13];
                                i13++;
                                if (n0Var == f83087h) {
                                    c();
                                } else if (n0Var.f83077c == null) {
                                    h(n0Var);
                                    if (n0Var.f83077c == null) {
                                        e(n0Var);
                                    }
                                } else {
                                    j(n0Var);
                                }
                            } catch (Throwable th3) {
                                p001if.a.a(this, th3);
                            }
                        }
                    }
                    c();
                    g();
                    f();
                }
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    public final void e(n0 n0Var) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                Context a13 = v.a();
                ApplicationInfo applicationInfo = a13.getPackageManager().getApplicationInfo(a13.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                if ((applicationInfo == null ? null : applicationInfo.metaData) == null || !applicationInfo.metaData.containsKey(n0Var.f83076b)) {
                    return;
                }
                n0Var.f83077c = Boolean.valueOf(applicationInfo.metaData.getBoolean(n0Var.f83076b, n0Var.f83075a));
            } catch (PackageManager.NameNotFoundException unused) {
                v vVar = v.f83104a;
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:6:0x000d, B:9:0x0016, B:12:0x001f, B:16:0x004b, B:18:0x0051, B:20:0x0055, B:22:0x0060, B:26:0x0075, B:30:0x0090, B:36:0x00b9, B:39:0x00e8, B:41:0x00e2, B:49:0x0071, B:51:0x00f0, B:52:0x00f3, B:54:0x00f5, B:55:0x00f8), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: le.o0.f():void");
    }

    public final void g() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Context a13 = v.a();
            ApplicationInfo applicationInfo = a13.getPackageManager().getApplicationInfo(a13.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            if ((applicationInfo == null ? null : applicationInfo.metaData) != null) {
                boolean containsKey = applicationInfo.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
                String str = f83081b;
                if (!containsKey) {
                    Log.w(str, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(str, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (a()) {
                    return;
                }
                Log.w(str, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void h(n0 n0Var) {
        String str = "";
        if (p001if.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                SharedPreferences sharedPreferences = f83089j;
                if (sharedPreferences == null) {
                    Intrinsics.r("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(n0Var.f83076b, "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    n0Var.f83077c = Boolean.valueOf(jSONObject.getBoolean("value"));
                    n0Var.f83078d = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException unused) {
                v vVar = v.f83104a;
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void i() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (f83082c.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void j(n0 n0Var) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", n0Var.f83077c);
                jSONObject.put("last_timestamp", n0Var.f83078d);
                SharedPreferences sharedPreferences = f83089j;
                if (sharedPreferences == null) {
                    Intrinsics.r("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(n0Var.f83076b, jSONObject.toString()).apply();
                f();
            } catch (Exception unused) {
                v vVar = v.f83104a;
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
