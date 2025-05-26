package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33772a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f33773b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f33774c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f33775d;

    /* renamed from: e, reason: collision with root package name */
    public c0 f33776e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33777f;

    public e0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new o.c("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f33775d = new ArrayDeque();
        this.f33777f = false;
        Context applicationContext = context.getApplicationContext();
        this.f33772a = applicationContext;
        this.f33773b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f33774c = scheduledThreadPoolExecutor;
    }

    public final void a() {
        while (true) {
            ArrayDeque arrayDeque = this.f33775d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((d0) arrayDeque.poll()).f33770b.trySetResult(null);
            }
        }
    }

    public final synchronized void b() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f33775d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                c0 c0Var = this.f33776e;
                if (c0Var == null || !c0Var.isBinderAlive()) {
                    d();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f33776e.a((d0) this.f33775d.poll());
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized Task c(Intent intent) {
        d0 d0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            d0Var = new d0(intent);
            ScheduledExecutorService scheduledExecutorService = this.f33774c;
            d0Var.f33770b.getTask().addOnCompleteListener(scheduledExecutorService, new a0(scheduledExecutorService.schedule(new androidx.activity.d(d0Var, 24), (d0Var.f33769a.getFlags() & 268435456) != 0 ? b0.f33761a : 9000L, TimeUnit.MILLISECONDS), 2));
            this.f33775d.add(d0Var);
            b();
        } catch (Throwable th3) {
            throw th3;
        }
        return d0Var.f33770b.getTask();
    }

    public final void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb3 = new StringBuilder("binder is dead. start connection? ");
            sb3.append(!this.f33777f);
            Log.d("FirebaseMessaging", sb3.toString());
        }
        if (this.f33777f) {
            return;
        }
        this.f33777f = true;
        try {
        } catch (SecurityException e13) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e13);
        }
        if (nh.a.b().a(this.f33772a, this.f33773b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f33777f = false;
        a();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f33777f = false;
            if (iBinder instanceof c0) {
                this.f33776e = (c0) iBinder;
                b();
            } else {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                a();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }
}
