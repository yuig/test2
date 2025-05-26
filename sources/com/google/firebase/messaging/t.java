package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import androidx.appcompat.app.i0;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f33812a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f33813b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f33814c;

    public t(FirebaseMessaging firebaseMessaging, long j13) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o.c("firebase-iid-executor"));
        this.f33814c = firebaseMessaging;
        this.f33812a = j13;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f33731b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f33813b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f33814c.f33731b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() {
        try {
            if (this.f33814c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e13) {
            String message = e13.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e13.getMessage() != null) {
                    throw e13;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e13.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        q n13 = q.n();
        FirebaseMessaging firebaseMessaging = this.f33814c;
        boolean p13 = n13.p(firebaseMessaging.f33731b);
        PowerManager.WakeLock wakeLock = this.f33813b;
        if (p13) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f33738i = true;
                }
            } catch (IOException e13) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e13.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f33738i = false;
                    if (!q.n().p(firebaseMessaging.f33731b)) {
                        return;
                    }
                }
            }
            if (!firebaseMessaging.f33737h.d()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f33738i = false;
                }
                if (q.n().p(firebaseMessaging.f33731b)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (q.n().o(firebaseMessaging.f33731b) && !a()) {
                new i0(this, 9, 0).a();
                if (q.n().p(firebaseMessaging.f33731b)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (b()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f33738i = false;
                }
            } else {
                firebaseMessaging.g(this.f33812a);
            }
            if (!q.n().p(firebaseMessaging.f33731b)) {
                return;
            }
            wakeLock.release();
        } catch (Throwable th3) {
            if (q.n().p(firebaseMessaging.f33731b)) {
                wakeLock.release();
            }
            throw th3;
        }
    }
}
