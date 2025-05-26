package com.bugsnag.android;

import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class s1 extends i {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f29633a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f29634b;

    /* renamed from: c, reason: collision with root package name */
    public final u1 f29635c;

    public s1(hd.h hVar) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.f29633a = scheduledThreadPoolExecutor;
        this.f29634b = new AtomicBoolean(true);
        this.f29635c = hVar.f68826r;
        long j13 = hVar.f68825q;
        if (j13 > 0) {
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            try {
                scheduledThreadPoolExecutor.schedule(new com.airbnb.lottie.k(this, 5), j13, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e13) {
                this.f29635c.a("Failed to schedule timer for LaunchCrashTracker", e13);
            }
        }
    }

    public final void a() {
        this.f29633a.shutdown();
        this.f29634b.set(false);
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            f3 f3Var = new f3();
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((hd.m) it.next()).onStateChange(f3Var);
            }
        }
        this.f29635c.i("App launch period marked as complete");
    }
}
