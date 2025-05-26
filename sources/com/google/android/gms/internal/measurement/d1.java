package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: h, reason: collision with root package name */
    public static volatile d1 f31348h;

    /* renamed from: a, reason: collision with root package name */
    public final String f31349a = "FA";

    /* renamed from: b, reason: collision with root package name */
    public final oh.b f31350b = oh.b.f94454a;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f31351c;

    /* renamed from: d, reason: collision with root package name */
    public final rd.j f31352d;

    /* renamed from: e, reason: collision with root package name */
    public int f31353e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31354f;

    /* renamed from: g, reason: collision with root package name */
    public volatile t0 f31355g;

    public d1(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new dm.c());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f31351c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f31352d = new rd.j(this, 13);
        new ArrayList();
        try {
            String n13 = tb.e.n(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(n13)) {
                n13 = tb.e.n(context);
            }
            int identifier = resources.getIdentifier("google_app_id", "string", n13);
            String str = null;
            if (identifier != 0) {
                try {
                    str = resources.getString(identifier);
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (str != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, d1.class.getClassLoader());
                } catch (ClassNotFoundException unused2) {
                    this.f31354f = true;
                    Log.w(this.f31349a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused3) {
        }
        if (!true) {
            Log.w(this.f31349a, "Specified origin or custom app id is null. Both parameters will be ignored.");
        }
        b(new f1(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f31349a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c1(this));
        }
    }

    public static d1 a(Context context, Bundle bundle) {
        com.bumptech.glide.d.t(context);
        if (f31348h == null) {
            synchronized (d1.class) {
                try {
                    if (f31348h == null) {
                        f31348h = new d1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f31348h;
    }

    public final void b(b1 b1Var) {
        this.f31351c.execute(b1Var);
    }

    public final void d(Exception exc, boolean z13, boolean z14) {
        this.f31354f |= z13;
        String str = this.f31349a;
        if (z13) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z14) {
            b(new l1(this, exc));
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }
}
