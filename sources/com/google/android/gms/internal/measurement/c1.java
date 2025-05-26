package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31315a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31316b;

    public c1(d1 d1Var) {
        this.f31315a = 0;
        this.f31316b = d1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i13;
        int i14 = this.f31315a;
        Object obj = this.f31316b;
        switch (i14) {
            case 0:
                ((d1) obj).b(new o1(this, bundle, activity));
                break;
            case 1:
                Intent intent = activity.getIntent();
                if (intent != null && ((Set) obj).add(intent)) {
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException e13) {
                        Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e13);
                    }
                    if (bundle2 != null && SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(bundle2.getString("google.c.a.e"))) {
                        if (SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(bundle2.getString("google.c.a.tc"))) {
                            nl.g c13 = nl.g.c();
                            c13.b();
                            pl.a aVar = (pl.a) c13.f91220d.a(pl.a.class);
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                            }
                            if (aVar != null) {
                                String string = bundle2.getString("google.c.a.c_id");
                                pl.b bVar = (pl.b) aVar;
                                if (ql.a.c()) {
                                    d1 d1Var = (d1) bVar.f100556a.f107506b;
                                    d1Var.getClass();
                                    d1Var.b(new j1(d1Var, string));
                                }
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("source", "Firebase");
                                bundle3.putString("medium", "notification");
                                bundle3.putString("campaign", string);
                                bVar.a("_cmp", bundle3);
                            } else {
                                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                            }
                        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                        }
                        com.bumptech.glide.c.I0("_no", bundle2);
                        break;
                    }
                }
                break;
            default:
                p000do.b bVar2 = (p000do.b) obj;
                bVar2.f55649h = true;
                bVar2.f55650i = false;
                if (bVar2.f55651j) {
                    bVar2.f55651j = false;
                    if (bundle == null) {
                        List<ActivityManager.AppTask> appTasks = ((ActivityManager) activity.getSystemService("activity")).getAppTasks();
                        if (appTasks.size() == 1) {
                            i13 = appTasks.get(0).getTaskInfo().numActivities;
                            if (i13 == 1) {
                                bVar2.f55645d.clear();
                                bVar2.f55646e.clear();
                                bVar2.f55643b.execute(new androidx.appcompat.app.v(bVar2, 12));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i13 = this.f31315a;
        Object obj = this.f31316b;
        switch (i13) {
            case 0:
                ((d1) obj).b(new p1(this, activity, 4));
                break;
            case 1:
                break;
            default:
                ((p000do.b) obj).f55649h = activity.isFinishing();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i13 = this.f31315a;
        Object obj = this.f31316b;
        switch (i13) {
            case 0:
                ((d1) obj).b(new p1(this, activity, 3));
                break;
            case 1:
                if (activity.isFinishing()) {
                    ((Set) obj).remove(activity.getIntent());
                    break;
                }
                break;
            default:
                ((p000do.b) obj).f55650i = activity.isChangingConfigurations();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f31315a) {
            case 0:
                ((d1) this.f31316b).b(new p1(this, activity, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f31315a) {
            case 0:
                r0 r0Var = new r0();
                ((d1) this.f31316b).b(new m1(this, activity, r0Var));
                Bundle B = r0Var.B(50L);
                if (B != null) {
                    bundle.putAll(B);
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i13 = this.f31315a;
        Object obj = this.f31316b;
        switch (i13) {
            case 0:
                ((d1) obj).b(new p1(this, activity, 1));
                break;
            case 1:
                break;
            default:
                ((p000do.b) obj).f55648g++;
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i13 = this.f31315a;
        Object obj = this.f31316b;
        switch (i13) {
            case 0:
                ((d1) obj).b(new p1(this, activity, 2));
                break;
            case 1:
                break;
            default:
                p000do.b bVar = (p000do.b) obj;
                bVar.f55648g--;
                break;
        }
    }

    public c1() {
        this.f31315a = 1;
        this.f31316b = Collections.newSetFromMap(new WeakHashMap());
    }

    public c1(p000do.b bVar) {
        this.f31315a = 2;
        this.f31316b = bVar;
    }
}
