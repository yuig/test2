package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.tasks.Tasks;
import dm.e;
import dm.f;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import nl.g;
import oi.w5;
import ol.a;
import ol.b;
import ol.c;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f33718b;

    /* renamed from: a, reason: collision with root package name */
    public final d1 f33719a;

    public FirebaseAnalytics(d1 d1Var) {
        d.t(d1Var);
        this.f33719a = d1Var;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f33718b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f33718b == null) {
                        f33718b = new FirebaseAnalytics(d1.a(context, null));
                    }
                } finally {
                }
            }
        }
        return f33718b;
    }

    @Keep
    public static w5 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        d1 a13 = d1.a(context, bundle);
        if (a13 == null) {
            return null;
        }
        return new c(a13);
    }

    public final void a(LinkedHashMap linkedHashMap) {
        Bundle bundle = new Bundle();
        a aVar = (a) linkedHashMap.get(b.AD_STORAGE);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) linkedHashMap.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) linkedHashMap.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int ordinal3 = aVar3.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = (a) linkedHashMap.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int ordinal4 = aVar4.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        d1 d1Var = this.f33719a;
        d1Var.getClass();
        d1Var.b(new e1(d1Var, bundle, 1));
    }

    @NonNull
    @Keep
    public final String getFirebaseInstanceId() {
        try {
            Object obj = e.f55311m;
            g c13 = g.c();
            c13.b();
            return (String) Tasks.await(((e) c13.f91220d.a(f.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e13) {
            throw new IllegalStateException(e13);
        } catch (ExecutionException e14) {
            throw new IllegalStateException(e14.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        d1 d1Var = this.f33719a;
        d1Var.getClass();
        d1Var.b(new g1(d1Var, activity, str, str2));
    }
}
