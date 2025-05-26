package df;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f54743a = new e0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f54744b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f54745c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f54746d;

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReference f54747e;

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f54748f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f54749g;

    static {
        String simpleName = e0.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "FetchedAppSettingsManager::class.java.simpleName");
        f54744b = simpleName;
        f54745c = kotlin.collections.f0.j("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");
        f54746d = new ConcurrentHashMap();
        f54747e = new AtomicReference(d0.NOT_LOADED);
        f54748f = new ConcurrentLinkedQueue();
    }

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f54745c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = le.a0.f83002j;
        le.a0 A = wc.b.A(null, "app", null);
        A.f83014i = true;
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        A.f83009d = bundle;
        JSONObject jSONObject = A.d().f83047d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final c0 b(String str) {
        return (c0) f54746d.get(str);
    }

    public static final void c() {
        Context a13 = le.v.a();
        String b13 = le.v.b();
        boolean V0 = j1.V0(b13);
        e0 e0Var = f54743a;
        AtomicReference atomicReference = f54747e;
        if (V0) {
            atomicReference.set(d0.ERROR);
            e0Var.e();
            return;
        }
        if (f54746d.containsKey(b13)) {
            atomicReference.set(d0.SUCCESS);
            e0Var.e();
            return;
        }
        d0 d0Var = d0.NOT_LOADED;
        d0 d0Var2 = d0.LOADING;
        while (true) {
            if (atomicReference.compareAndSet(d0Var, d0Var2)) {
                break;
            }
            if (atomicReference.get() != d0Var) {
                d0 d0Var3 = d0.ERROR;
                d0 d0Var4 = d0.LOADING;
                while (!atomicReference.compareAndSet(d0Var3, d0Var4)) {
                    if (atomicReference.get() != d0Var3) {
                        e0Var.e();
                        return;
                    }
                }
            }
        }
        le.v.d().execute(new z(a13, t3.s1.d(new Object[]{b13}, 1, "com.facebook.internal.APP_SETTINGS.%s", "java.lang.String.format(format, *args)"), b13));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0208 A[LOOP:0: B:27:0x0139->B:36:0x0208, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0210 A[EDGE_INSN: B:37:0x0210->B:69:0x0210 BREAK  A[LOOP:0: B:27:0x0139->B:36:0x0208], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008f A[LOOP:2: B:78:0x002d->B:83:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0082 A[EDGE_INSN: B:84:0x0082->B:85:0x0082 BREAK  A[LOOP:2: B:78:0x002d->B:83:0x008f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static df.c0 d(java.lang.String r34, org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.e0.d(java.lang.String, org.json.JSONObject):df.c0");
    }

    public static final c0 f(String applicationId, boolean z13) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z13) {
            ConcurrentHashMap concurrentHashMap = f54746d;
            if (concurrentHashMap.containsKey(applicationId)) {
                return (c0) concurrentHashMap.get(applicationId);
            }
        }
        e0 e0Var = f54743a;
        c0 d2 = d(applicationId, a());
        if (Intrinsics.d(applicationId, le.v.b())) {
            f54747e.set(d0.SUCCESS);
            e0Var.e();
        }
        return d2;
    }

    public final synchronized void e() {
        d0 d0Var = (d0) f54747e.get();
        if (d0.NOT_LOADED != d0Var && d0.LOADING != d0Var) {
            c0 c0Var = (c0) f54746d.get(le.v.b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (d0.ERROR == d0Var) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f54748f;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new androidx.activity.d((me.n) concurrentLinkedQueue.poll(), 20));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f54748f;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    handler.post(new e5.k(18, (me.n) concurrentLinkedQueue2.poll(), c0Var));
                }
            }
        }
    }
}
