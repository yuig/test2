package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Method f31534b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f31535c;

    /* renamed from: a, reason: collision with root package name */
    public final JobScheduler f31536a;

    static {
        Method method;
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            method = null;
        }
        f31534b = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        f31535c = method2;
    }

    public n0(JobScheduler jobScheduler) {
        this.f31536a = jobScheduler;
    }
}
