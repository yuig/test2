package org.chromium.net.impl;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import bs1.c;
import dp2.e;
import h6.r;
import ip2.d;
import ip2.f;
import ip2.h;
import ip2.m;
import ip2.q;
import ip2.t;
import ja.c0;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jp2.j;
import jp2.u;
import lb.l0;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.NetworkChangeNotifier;
import so.a;

/* loaded from: classes2.dex */
public class CronetLibraryLoader {

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f97371c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f97372d;

    /* renamed from: g, reason: collision with root package name */
    public static c0 f97375g;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f97369a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final HandlerThread f97370b = new HandlerThread("CronetInit");

    /* renamed from: e, reason: collision with root package name */
    public static final ConditionVariable f97373e = new ConditionVariable();

    /* renamed from: f, reason: collision with root package name */
    public static final ConditionVariable f97374f = new ConditionVariable();

    public static void a(Context context, j jVar) {
        synchronized (f97369a) {
            try {
                if (!f97372d) {
                    a.f113317a = context;
                    HandlerThread handlerThread = f97370b;
                    if (!handlerThread.isAlive()) {
                        handlerThread.start();
                    }
                    r rVar = new r(4);
                    if (handlerThread.getLooper() == Looper.myLooper()) {
                        rVar.run();
                    } else {
                        new Handler(handlerThread.getLooper()).post(rVar);
                    }
                }
                if (!f97371c) {
                    if (((u) jVar).f77384p != null) {
                        ((u) jVar).f77384p.loadLibrary("cronet.119.0.6045.31");
                    } else {
                        System.loadLibrary("cronet.119.0.6045.31");
                    }
                    if (!"119.0.6045.31".equals(N.M6xubM8G())) {
                        throw new RuntimeException("Expected Cronet version number 119.0.6045.31, actual version number " + N.M6xubM8G() + ".");
                    }
                    e.f("CronetLibraryLoader", "Cronet version: %s, arch: %s", "119.0.6045.31", System.getProperty("os.arch"));
                    f97371c = true;
                    f97373e.open();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void b() {
        ApplicationInfo applicationInfo;
        if (f97372d) {
            return;
        }
        Context context = a.f113317a;
        q qVar = null;
        if (c.J0(context).getBoolean("android.net.http.EXPERIMENTAL_ReadHttpFlags", false)) {
            try {
                ResolveInfo resolveService = context.getPackageManager().resolveService(new Intent("android.net.http.FLAGS_FILE_PROVIDER"), 1048576);
                if (resolveService == null) {
                    Log.w("cr_HttpFlagsLoader", "Unable to resolve the HTTP flags file provider package. This is expected if the host system is not set up to provide HTTP flags.");
                    applicationInfo = null;
                } else {
                    applicationInfo = resolveService.serviceInfo.applicationInfo;
                }
                if (applicationInfo != null) {
                    File file = new File(new File(new File(applicationInfo.deviceProtectedDataDir), "app_httpflags"), "flags.binarypb");
                    file.getAbsolutePath();
                    q A = ue.c.A(file);
                    if (A != null) {
                        qVar = A;
                    }
                }
            } catch (RuntimeException e13) {
                Log.e("cr_HttpFlagsLoader", "Unable to load HTTP flags file", e13);
            }
        }
        if (qVar == null) {
            qVar = (q) q.f().m101build();
        }
        String packageName = context.getPackageName();
        int[] c13 = c0.c("119.0.6045.31");
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : qVar.e().entrySet()) {
            try {
                t a13 = t.a((m) entry.getValue(), packageName, c13);
                if (a13 != null) {
                    hashMap.put((String) entry.getKey(), a13);
                }
            } catch (RuntimeException e14) {
                throw new IllegalArgumentException(a.a.k("Unable to resolve HTTP flag `", (String) entry.getKey(), "`"), e14);
            }
        }
        f97375g = new c0(9, hashMap);
        f97374f.open();
        t tVar = (t) Collections.unmodifiableMap(f97375g.f75176a).get("Cronet_log_me");
        if (tVar != null) {
            e.e("CronetLibraryLoader", "HTTP flags log line: %s", tVar.c());
        }
        NetworkChangeNotifier.init();
        NetworkChangeNotifier.registerToReceiveNotificationsAlways();
        f97373e.block();
        N.MROCxiBo();
        f97372d = true;
    }

    @CalledByNative
    public static void ensureInitializedFromNative() {
        synchronized (f97369a) {
            f97371c = true;
            f97373e.open();
        }
        a(a.f113317a, null);
    }

    @CalledByNative
    public static byte[] getBaseFeatureOverrides() {
        f97374f.block();
        c0 c0Var = f97375g;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : Collections.unmodifiableMap(c0Var.f75176a).entrySet()) {
            try {
                l0.w((String) entry.getKey(), (t) entry.getValue(), hashMap);
            } catch (RuntimeException e13) {
                throw new IllegalArgumentException(a.a.k("Could not parse HTTP flag `", (String) entry.getKey(), "` as a base::Feature override"), e13);
            }
        }
        ip2.c f13 = h.f();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            f13.b((String) entry2.getKey(), (f) ((d) entry2.getValue()).m101build());
        }
        return ((h) f13.m101build()).toByteArray();
    }

    @CalledByNative
    public static String getDefaultUserAgent() {
        return jp2.c0.a(a.f113317a);
    }

    @CalledByNative
    public static void setNetworkThreadPriorityOnNetworkThread(int i13) {
        Process.setThreadPriority(i13);
    }
}
