package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import m.a;
import oi.a7;
import oi.o6;
import oi.p6;
import oi.r6;
import oi.u4;
import oi.w4;
import oi.y3;

/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements r6 {

    /* renamed from: a, reason: collision with root package name */
    public a f32014a;

    @Override // oi.r6
    public final void a(Intent intent) {
        SparseArray sparseArray = r6.a.f106305a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = r6.a.f106305a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } finally {
            }
        }
    }

    @Override // oi.r6
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final a c() {
        if (this.f32014a == null) {
            a aVar = new a();
            aVar.f85180a = this;
            this.f32014a = aVar;
        }
        return this.f32014a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        a c13 = c();
        if (intent == null) {
            c13.a().f95268f.c("onBind called with null intent");
            return null;
        }
        c13.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new w4(a7.e(c13.f85180a));
        }
        c13.a().f95271i.b(action, "onBind received unknown action");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        y3 y3Var = u4.a(c().f85180a, null, null).f95205i;
        u4.d(y3Var);
        y3Var.f95276n.c("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        y3 y3Var = u4.a(c().f85180a, null, null).f95205i;
        u4.d(y3Var);
        y3Var.f95276n.c("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        a c13 = c();
        if (intent == null) {
            c13.a().f95268f.c("onRebind called with null intent");
            return;
        }
        c13.getClass();
        c13.a().f95276n.b(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        a c13 = c();
        y3 y3Var = u4.a(c13.f85180a, null, null).f95205i;
        u4.d(y3Var);
        if (intent == null) {
            y3Var.f95271i.c("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        y3Var.f95276n.a(Integer.valueOf(i14), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        p6 p6Var = new p6(c13, i14, y3Var, intent);
        a7 e13 = a7.e(c13.f85180a);
        e13.zzl().y(new o6(e13, p6Var));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        a c13 = c();
        if (intent == null) {
            c13.a().f95268f.c("onUnbind called with null intent");
            return true;
        }
        c13.getClass();
        c13.a().f95276n.b(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }

    @Override // oi.r6
    public final boolean zza(int i13) {
        return stopSelfResult(i13);
    }
}
