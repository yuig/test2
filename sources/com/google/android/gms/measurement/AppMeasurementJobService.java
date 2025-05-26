package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import m.a;
import oi.a7;
import oi.o6;
import oi.r6;
import oi.u4;
import oi.y3;
import s.f;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements r6 {

    /* renamed from: a, reason: collision with root package name */
    public a f32012a;

    @Override // oi.r6
    public final void a(Intent intent) {
    }

    @Override // oi.r6
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final a c() {
        if (this.f32012a == null) {
            a aVar = new a();
            aVar.f85180a = this;
            this.f32012a = aVar;
        }
        return this.f32012a;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a c13 = c();
        y3 y3Var = u4.a(c13.f85180a, null, null).f95205i;
        u4.d(y3Var);
        String string = jobParameters.getExtras().getString("action");
        y3Var.f95276n.b(string, "Local AppMeasurementJobService called. action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f fVar = new f(c13, y3Var, jobParameters, 17, 0);
        a7 e13 = a7.e(c13.f85180a);
        e13.zzl().y(new o6(e13, fVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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
        throw new UnsupportedOperationException();
    }
}
