package oi;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class v6 extends y6 {

    /* renamed from: d, reason: collision with root package name */
    public final AlarmManager f95237d;

    /* renamed from: e, reason: collision with root package name */
    public r5 f95238e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f95239f;

    public v6(a7 a7Var) {
        super(a7Var);
        this.f95237d = (AlarmManager) zza().getSystemService("alarm");
    }

    @Override // oi.y6
    public final boolean v() {
        AlarmManager alarmManager = this.f95237d;
        if (alarmManager != null) {
            Context zza = zza();
            alarmManager.cancel(PendingIntent.getBroadcast(zza, 0, new Intent().setClassName(zza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.m0.f31517a));
        }
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(x());
        }
        return false;
    }

    public final void w() {
        t();
        zzj().f95276n.c("Unscheduling upload");
        AlarmManager alarmManager = this.f95237d;
        if (alarmManager != null) {
            Context zza = zza();
            alarmManager.cancel(PendingIntent.getBroadcast(zza, 0, new Intent().setClassName(zza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.m0.f31517a));
        }
        y().a();
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(x());
        }
    }

    public final int x() {
        if (this.f95239f == null) {
            this.f95239f = Integer.valueOf(("measurement" + zza().getPackageName()).hashCode());
        }
        return this.f95239f.intValue();
    }

    public final l y() {
        if (this.f95238e == null) {
            this.f95238e = new r5(this, this.f95249b.f94666l, 2);
        }
        return this.f95238e;
    }
}
