package oi;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class u5 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k5 f95223a;

    public u5(k5 k5Var) {
        this.f95223a = k5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        k5 k5Var = this.f95223a;
        try {
            try {
                k5Var.zzj().f95276n.c("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    k5Var.t().B(activity, bundle);
                    return;
                }
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (!TextUtils.isEmpty(string)) {
                            data = Uri.parse(string);
                        }
                    }
                    data = null;
                }
                Uri uri = data;
                if (uri != null && uri.isHierarchical()) {
                    k5Var.o();
                    k5Var.zzl().y(new hh.d(this, bundle == null, uri, f7.W(intent) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                    k5Var.t().B(activity, bundle);
                }
            } catch (RuntimeException e13) {
                k5Var.zzj().f95268f.b(e13, "Throwable caught in onActivityCreated");
                k5Var.t().B(activity, bundle);
            }
        } finally {
            k5Var.t().B(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a6 t13 = this.f95223a.t();
        synchronized (t13.f94654l) {
            try {
                if (activity == t13.f94649g) {
                    t13.f94649g = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (t13.l().B()) {
            t13.f94648f.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i13;
        a6 t13 = this.f95223a.t();
        synchronized (t13.f94654l) {
            i13 = 0;
            t13.f94653k = false;
            t13.f94650h = true;
        }
        ((oh.b) t13.zzb()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (t13.l().B()) {
            b6 F = t13.F(activity);
            t13.f94646d = t13.f94645c;
            t13.f94645c = null;
            t13.zzl().y(new o5(t13, F, elapsedRealtime));
        } else {
            t13.f94645c = null;
            t13.zzl().y(new j0(t13, elapsedRealtime, 1));
        }
        q6 v13 = this.f95223a.v();
        ((oh.b) v13.zzb()).getClass();
        v13.zzl().y(new s6(v13, SystemClock.elapsedRealtime(), i13));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        q6 v13 = this.f95223a.v();
        ((oh.b) v13.zzb()).getClass();
        v13.zzl().y(new s6(v13, SystemClock.elapsedRealtime(), 1));
        a6 t13 = this.f95223a.t();
        synchronized (t13.f94654l) {
            t13.f94653k = true;
            if (activity != t13.f94649g) {
                synchronized (t13.f94654l) {
                    t13.f94649g = activity;
                    t13.f94650h = false;
                }
                if (t13.l().B()) {
                    t13.f94651i = null;
                    t13.zzl().y(new c6(t13, 1));
                }
            }
        }
        if (!t13.l().B()) {
            t13.f94645c = t13.f94651i;
            t13.zzl().y(new c6(t13, 0));
            return;
        }
        t13.C(activity, t13.F(activity), false);
        o i13 = ((u4) t13.f24333a).i();
        ((oh.b) i13.zzb()).getClass();
        i13.zzl().y(new j0(i13, SystemClock.elapsedRealtime(), 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        b6 b6Var;
        a6 t13 = this.f95223a.t();
        if (!t13.l().B() || bundle == null || (b6Var = (b6) t13.f94648f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", b6Var.f94699c);
        bundle2.putString("name", b6Var.f94697a);
        bundle2.putString("referrer_name", b6Var.f94698b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
