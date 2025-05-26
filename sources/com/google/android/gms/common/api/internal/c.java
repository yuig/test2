package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final c f30794e = new c();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f30795a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f30796b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f30797c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f30798d = false;

    public static void a(Application application) {
        c cVar = f30794e;
        synchronized (cVar) {
            try {
                if (!cVar.f30798d) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f30798d = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void b(boolean z13) {
        synchronized (f30794e) {
            try {
                Iterator it = this.f30797c.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a(z13);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f30796b;
        boolean compareAndSet = this.f30795a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f30796b;
        boolean compareAndSet = this.f30795a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        if (i13 == 20 && this.f30795a.compareAndSet(false, true)) {
            this.f30796b.set(true);
            b(true);
        }
    }
}
