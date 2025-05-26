package com.google.android.gms.measurement.internal;

import ae.r;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.j;
import com.bumptech.glide.d;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.z0;
import com.google.android.gms.internal.measurement.zzdd;
import g1.g;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kh2.j1;
import oi.a6;
import oi.b5;
import oi.b6;
import oi.f7;
import oi.k5;
import oi.l5;
import oi.n5;
import oi.o4;
import oi.o5;
import oi.o6;
import oi.p5;
import oi.u4;
import oi.u5;
import oi.y3;
import rh.a;
import rh.b;
import tb.e;

@DynamiteApi
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public u4 f32015a;

    /* renamed from: b, reason: collision with root package name */
    public final g f32016b;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f32015a = null;
        this.f32016b = new g(0);
    }

    public final void B() {
        if (this.f32015a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public final void C(String str, u0 u0Var) {
        B();
        f7 f7Var = this.f32015a.f95208l;
        u4.c(f7Var);
        f7Var.O(str, u0Var);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void beginAdUnitExposure(@NonNull String str, long j13) {
        B();
        this.f32015a.i().x(j13, str);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.G(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void clearMeasurementEnabled(long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.w();
        k5Var.zzl().y(new j(26, k5Var, (Object) null));
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void endAdUnitExposure(@NonNull String str, long j13) {
        B();
        this.f32015a.i().B(j13, str);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void generateEventId(u0 u0Var) {
        B();
        f7 f7Var = this.f32015a.f95208l;
        u4.c(f7Var);
        long x03 = f7Var.x0();
        B();
        f7 f7Var2 = this.f32015a.f95208l;
        u4.c(f7Var2);
        f7Var2.J(u0Var, x03);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void getAppInstanceId(u0 u0Var) {
        B();
        o4 o4Var = this.f32015a.f95206j;
        u4.d(o4Var);
        o4Var.y(new b5(this, u0Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void getCachedAppInstanceId(u0 u0Var) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        C((String) k5Var.f94910g.get(), u0Var);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void getConditionalUserProperties(String str, String str2, u0 u0Var) {
        B();
        o4 o4Var = this.f32015a.f95206j;
        u4.d(o4Var);
        o4Var.y(new n.g(this, u0Var, str, str2, 5));
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void getCurrentScreenClass(u0 u0Var) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        a6 a6Var = ((u4) k5Var.f24333a).f95211o;
        u4.b(a6Var);
        b6 b6Var = a6Var.f94645c;
        C(b6Var != null ? b6Var.f94698b : null, u0Var);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void getCurrentScreenName(u0 u0Var) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        a6 a6Var = ((u4) k5Var.f24333a).f95211o;
        u4.b(a6Var);
        b6 b6Var = a6Var.f94645c;
        C(b6Var != null ? b6Var.f94697a : null, u0Var);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void getGmpAppId(u0 u0Var) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        String str = ((u4) k5Var.f24333a).f95198b;
        if (str == null) {
            str = null;
            try {
                Context zza = k5Var.zza();
                String str2 = ((u4) k5Var.f24333a).f95215s;
                d.t(zza);
                Resources resources = zza.getResources();
                if (TextUtils.isEmpty(str2)) {
                    str2 = e.n(zza);
                }
                int identifier = resources.getIdentifier("google_app_id", "string", str2);
                if (identifier != 0) {
                    try {
                        str = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            } catch (IllegalStateException e13) {
                y3 y3Var = ((u4) k5Var.f24333a).f95205i;
                u4.d(y3Var);
                y3Var.f95268f.b(e13, "getGoogleAppId failed with exception");
            }
        }
        C(str, u0Var);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void getMaxUserProperties(String str, u0 u0Var) {
        B();
        u4.b(this.f32015a.f95212p);
        d.o(str);
        B();
        f7 f7Var = this.f32015a.f95208l;
        u4.c(f7Var);
        f7Var.I(u0Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void getSessionId(u0 u0Var) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.zzl().y(new j(25, k5Var, u0Var));
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void getTestFlag(u0 u0Var, int i13) {
        B();
        int i14 = 2;
        if (i13 == 0) {
            f7 f7Var = this.f32015a.f95208l;
            u4.c(f7Var);
            k5 k5Var = this.f32015a.f95212p;
            u4.b(k5Var);
            AtomicReference atomicReference = new AtomicReference();
            f7Var.O((String) k5Var.zzl().t(atomicReference, 15000L, "String test flag value", new l5(k5Var, atomicReference, i14)), u0Var);
            return;
        }
        int i15 = 4;
        int i16 = 1;
        if (i13 == 1) {
            f7 f7Var2 = this.f32015a.f95208l;
            u4.c(f7Var2);
            k5 k5Var2 = this.f32015a.f95212p;
            u4.b(k5Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            f7Var2.J(u0Var, ((Long) k5Var2.zzl().t(atomicReference2, 15000L, "long test flag value", new l5(k5Var2, atomicReference2, i15))).longValue());
            return;
        }
        if (i13 == 2) {
            f7 f7Var3 = this.f32015a.f95208l;
            u4.c(f7Var3);
            k5 k5Var3 = this.f32015a.f95212p;
            u4.b(k5Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) k5Var3.zzl().t(atomicReference3, 15000L, "double test flag value", new l5(k5Var3, atomicReference3, 5))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                u0Var.f(bundle);
                return;
            } catch (RemoteException e13) {
                y3 y3Var = ((u4) f7Var3.f24333a).f95205i;
                u4.d(y3Var);
                y3Var.f95271i.b(e13, "Error returning double value to wrapper");
                return;
            }
        }
        int i17 = 3;
        if (i13 == 3) {
            f7 f7Var4 = this.f32015a.f95208l;
            u4.c(f7Var4);
            k5 k5Var4 = this.f32015a.f95212p;
            u4.b(k5Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            f7Var4.I(u0Var, ((Integer) k5Var4.zzl().t(atomicReference4, 15000L, "int test flag value", new l5(k5Var4, atomicReference4, i17))).intValue());
            return;
        }
        if (i13 != 4) {
            return;
        }
        f7 f7Var5 = this.f32015a.f95208l;
        u4.c(f7Var5);
        k5 k5Var5 = this.f32015a.f95212p;
        u4.b(k5Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        f7Var5.M(u0Var, ((Boolean) k5Var5.zzl().t(atomicReference5, 15000L, "boolean test flag value", new l5(k5Var5, atomicReference5, i16))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void getUserProperties(String str, String str2, boolean z13, u0 u0Var) {
        B();
        o4 o4Var = this.f32015a.f95206j;
        u4.d(o4Var);
        o4Var.y(new hh.d(this, u0Var, str, str2, z13));
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void initForTests(@NonNull Map map) {
        B();
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void initialize(a aVar, zzdd zzddVar, long j13) {
        u4 u4Var = this.f32015a;
        if (u4Var == null) {
            Context context = (Context) b.E(aVar);
            d.t(context);
            this.f32015a = u4.a(context, zzddVar, Long.valueOf(j13));
        } else {
            y3 y3Var = u4Var.f95205i;
            u4.d(y3Var);
            y3Var.f95271i.c("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void isDataCollectionEnabled(u0 u0Var) {
        B();
        o4 o4Var = this.f32015a.f95206j;
        u4.d(o4Var);
        o4Var.y(new b5(this, u0Var, 1));
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z13, boolean z14, long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.H(str, str2, bundle, z13, z14, j13);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void logEventAndBundle(String str, String str2, Bundle bundle, u0 u0Var, long j13) {
        B();
        d.o(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        zzbg zzbgVar = new zzbg(str2, new zzbb(bundle), "app", j13);
        o4 o4Var = this.f32015a.f95206j;
        u4.d(o4Var);
        o4Var.y(new n.g(this, u0Var, zzbgVar, str, 3));
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void logHealthData(int i13, @NonNull String str, @NonNull a aVar, @NonNull a aVar2, @NonNull a aVar3) {
        B();
        Object E = aVar == null ? null : b.E(aVar);
        Object E2 = aVar2 == null ? null : b.E(aVar2);
        Object E3 = aVar3 != null ? b.E(aVar3) : null;
        y3 y3Var = this.f32015a.f95205i;
        u4.d(y3Var);
        y3Var.w(i13, true, false, str, E, E2, E3);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void onActivityCreated(@NonNull a aVar, @NonNull Bundle bundle, long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        u5 u5Var = k5Var.f94906c;
        if (u5Var != null) {
            k5 k5Var2 = this.f32015a.f95212p;
            u4.b(k5Var2);
            k5Var2.R();
            u5Var.onActivityCreated((Activity) b.E(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void onActivityDestroyed(@NonNull a aVar, long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        u5 u5Var = k5Var.f94906c;
        if (u5Var != null) {
            k5 k5Var2 = this.f32015a.f95212p;
            u4.b(k5Var2);
            k5Var2.R();
            u5Var.onActivityDestroyed((Activity) b.E(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void onActivityPaused(@NonNull a aVar, long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        u5 u5Var = k5Var.f94906c;
        if (u5Var != null) {
            k5 k5Var2 = this.f32015a.f95212p;
            u4.b(k5Var2);
            k5Var2.R();
            u5Var.onActivityPaused((Activity) b.E(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void onActivityResumed(@NonNull a aVar, long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        u5 u5Var = k5Var.f94906c;
        if (u5Var != null) {
            k5 k5Var2 = this.f32015a.f95212p;
            u4.b(k5Var2);
            k5Var2.R();
            u5Var.onActivityResumed((Activity) b.E(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void onActivitySaveInstanceState(a aVar, u0 u0Var, long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        u5 u5Var = k5Var.f94906c;
        Bundle bundle = new Bundle();
        if (u5Var != null) {
            k5 k5Var2 = this.f32015a.f95212p;
            u4.b(k5Var2);
            k5Var2.R();
            u5Var.onActivitySaveInstanceState((Activity) b.E(aVar), bundle);
        }
        try {
            u0Var.f(bundle);
        } catch (RemoteException e13) {
            y3 y3Var = this.f32015a.f95205i;
            u4.d(y3Var);
            y3Var.f95271i.b(e13, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void onActivityStarted(@NonNull a aVar, long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        if (k5Var.f94906c != null) {
            k5 k5Var2 = this.f32015a.f95212p;
            u4.b(k5Var2);
            k5Var2.R();
        }
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void onActivityStopped(@NonNull a aVar, long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        if (k5Var.f94906c != null) {
            k5 k5Var2 = this.f32015a.f95212p;
            u4.b(k5Var2);
            k5Var2.R();
        }
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void performAction(Bundle bundle, u0 u0Var, long j13) {
        B();
        u0Var.f(null);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void registerOnMeasurementEventListener(x0 x0Var) {
        oi.a aVar;
        B();
        synchronized (this.f32016b) {
            try {
                g gVar = this.f32016b;
                z0 z0Var = (z0) x0Var;
                Parcel G = z0Var.G(z0Var.j(), 2);
                int readInt = G.readInt();
                G.recycle();
                aVar = (oi.a) gVar.get(Integer.valueOf(readInt));
                if (aVar == null) {
                    aVar = new oi.a(this, z0Var);
                    g gVar2 = this.f32016b;
                    Parcel G2 = z0Var.G(z0Var.j(), 2);
                    int readInt2 = G2.readInt();
                    G2.recycle();
                    gVar2.put(Integer.valueOf(readInt2), aVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.w();
        if (k5Var.f94908e.add(aVar)) {
            return;
        }
        k5Var.zzj().f95271i.c("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void resetAnalyticsData(long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.E(null);
        k5Var.zzl().y(new p5(k5Var, j13, 1));
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j13) {
        B();
        if (bundle == null) {
            y3 y3Var = this.f32015a.f95205i;
            u4.d(y3Var);
            y3Var.f95268f.c("Conditional user property must not be null");
        } else {
            k5 k5Var = this.f32015a.f95212p;
            u4.b(k5Var);
            k5Var.C(bundle, j13);
        }
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void setConsent(@NonNull Bundle bundle, long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.zzl().z(new o5(k5Var, bundle, j13, 0));
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void setConsentThirdParty(@NonNull Bundle bundle, long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.B(bundle, -20, j13);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void setCurrentScreen(@NonNull a aVar, @NonNull String str, @NonNull String str2, long j13) {
        B();
        a6 a6Var = this.f32015a.f95211o;
        u4.b(a6Var);
        Activity activity = (Activity) b.E(aVar);
        if (!a6Var.l().B()) {
            a6Var.zzj().f95273k.c("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        b6 b6Var = a6Var.f94645c;
        if (b6Var == null) {
            a6Var.zzj().f95273k.c("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (a6Var.f94648f.get(activity) == null) {
            a6Var.zzj().f95273k.c("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = a6Var.z(activity.getClass());
        }
        boolean N1 = j1.N1(b6Var.f94698b, str2);
        boolean N12 = j1.N1(b6Var.f94697a, str);
        if (N1 && N12) {
            a6Var.zzj().f95273k.c("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > a6Var.l().t(null))) {
            a6Var.zzj().f95273k.b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > a6Var.l().t(null))) {
            a6Var.zzj().f95273k.b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
            return;
        }
        a6Var.zzj().f95276n.a(str == null ? "null" : str, str2, "Setting current screen to name, class");
        b6 b6Var2 = new b6(a6Var.o().x0(), str, str2);
        a6Var.f94648f.put(activity, b6Var2);
        a6Var.C(activity, b6Var2, true);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void setDataCollectionEnabled(boolean z13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.w();
        k5Var.zzl().y(new r(k5Var, z13, 3));
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.zzl().y(new n5(k5Var, bundle == null ? null : new Bundle(bundle), 0));
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void setEventInterceptor(x0 x0Var) {
        B();
        x xVar = new x(this, x0Var, 4);
        o4 o4Var = this.f32015a.f95206j;
        u4.d(o4Var);
        boolean z13 = true;
        if (!o4Var.A()) {
            o4 o4Var2 = this.f32015a.f95206j;
            u4.d(o4Var2);
            o4Var2.y(new o6((int) (z13 ? 1 : 0), (Object) this, (Object) xVar));
            return;
        }
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.p();
        k5Var.w();
        x xVar2 = k5Var.f94907d;
        if (xVar != xVar2) {
            d.w("EventInterceptor already set.", xVar2 == null);
        }
        k5Var.f94907d = xVar;
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void setInstanceIdProvider(y0 y0Var) {
        B();
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void setMeasurementEnabled(boolean z13, long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        Boolean valueOf = Boolean.valueOf(z13);
        k5Var.w();
        k5Var.zzl().y(new j(26, k5Var, valueOf));
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void setMinimumSessionDuration(long j13) {
        B();
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void setSessionTimeoutDuration(long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.zzl().y(new p5(k5Var, j13, 0));
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void setUserId(@NonNull String str, long j13) {
        B();
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        if (str == null || !TextUtils.isEmpty(str)) {
            k5Var.zzl().y(new j(k5Var, str, 24));
            k5Var.J(null, "_id", str, true, j13);
        } else {
            y3 y3Var = ((u4) k5Var.f24333a).f95205i;
            u4.d(y3Var);
            y3Var.f95271i.c("User ID must be non-empty or null");
        }
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull a aVar, boolean z13, long j13) {
        B();
        Object E = b.E(aVar);
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.J(str, str2, E, z13, j13);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public void unregisterOnMeasurementEventListener(x0 x0Var) {
        z0 z0Var;
        oi.a aVar;
        B();
        synchronized (this.f32016b) {
            g gVar = this.f32016b;
            z0Var = (z0) x0Var;
            Parcel G = z0Var.G(z0Var.j(), 2);
            int readInt = G.readInt();
            G.recycle();
            aVar = (oi.a) gVar.remove(Integer.valueOf(readInt));
        }
        if (aVar == null) {
            aVar = new oi.a(this, z0Var);
        }
        k5 k5Var = this.f32015a.f95212p;
        u4.b(k5Var);
        k5Var.w();
        if (k5Var.f94908e.remove(aVar)) {
            return;
        }
        k5Var.zzj().f95271i.c("OnEventListener had not been registered");
    }
}
