package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class z implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f33838f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f33839g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f33840h;

    /* renamed from: a, reason: collision with root package name */
    public final Context f33841a;

    /* renamed from: b, reason: collision with root package name */
    public final m f33842b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f33843c;

    /* renamed from: d, reason: collision with root package name */
    public final x f33844d;

    /* renamed from: e, reason: collision with root package name */
    public final long f33845e;

    public z(x xVar, Context context, m mVar, long j13) {
        this.f33844d = xVar;
        this.f33841a = context;
        this.f33845e = j13;
        this.f33842b = mVar;
        this.f33843c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f33838f) {
            try {
                Boolean bool = f33840h;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f33840h = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z13 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z13 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z13;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f33838f) {
            try {
                Boolean bool = f33839g;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f33839g = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z13;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f33841a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z13 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f33844d;
        Context context = this.f33841a;
        boolean c13 = c(context);
        PowerManager.WakeLock wakeLock = this.f33843c;
        if (c13) {
            wakeLock.acquire(f.f33778a);
        }
        try {
            try {
                synchronized (xVar) {
                    xVar.f33834g = true;
                }
            } catch (IOException e13) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e13.getMessage());
                synchronized (xVar) {
                    xVar.f33834g = false;
                    if (!c(context)) {
                        return;
                    }
                }
            }
            if (!this.f33842b.d()) {
                synchronized (xVar) {
                    xVar.f33834g = false;
                }
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (a(context) && !d()) {
                new y(this, this).a();
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (xVar.e()) {
                synchronized (xVar) {
                    xVar.f33834g = false;
                }
            } else {
                xVar.f(this.f33845e);
            }
            if (!c(context)) {
                return;
            }
            try {
                wakeLock.release();
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th3) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th3;
        }
    }
}
