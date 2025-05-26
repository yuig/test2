package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kh2.m2;

/* loaded from: classes.dex */
public final class g0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final f f30821a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30822b;

    /* renamed from: c, reason: collision with root package name */
    public final a f30823c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30824d;

    /* renamed from: e, reason: collision with root package name */
    public final long f30825e;

    public g0(f fVar, int i13, a aVar, long j13, long j14) {
        this.f30821a = fVar;
        this.f30822b = i13;
        this.f30823c = aVar;
        this.f30824d = j13;
        this.f30825e = j14;
    }

    public static ConnectionTelemetryConfiguration a(z zVar, jh.f fVar, int i13) {
        int[] f13;
        int[] k13;
        ConnectionTelemetryConfiguration telemetryConfiguration = fVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.x1() || ((f13 = telemetryConfiguration.f()) != null ? !m2.t0(f13, i13) : !((k13 = telemetryConfiguration.k1()) == null || !m2.t0(k13, i13))) || zVar.f30912l >= telemetryConfiguration.e()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        z k13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int e13;
        long j13;
        long j14;
        int i18;
        f fVar = this.f30821a;
        if (fVar.d()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = jh.m.a().f76184a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.f30968g) && (k13 = fVar.k(this.f30823c)) != null) {
                Object obj = k13.f30902b;
                if (obj instanceof jh.f) {
                    jh.f fVar2 = (jh.f) obj;
                    long j15 = this.f30824d;
                    boolean z13 = j15 > 0;
                    int gCoreServiceId = fVar2.getGCoreServiceId();
                    if (rootTelemetryConfiguration != null) {
                        z13 &= rootTelemetryConfiguration.k1();
                        int e14 = rootTelemetryConfiguration.e();
                        int f13 = rootTelemetryConfiguration.f();
                        i13 = rootTelemetryConfiguration.x1();
                        if (fVar2.hasConnectionInfo() && !fVar2.isConnecting()) {
                            ConnectionTelemetryConfiguration a13 = a(k13, fVar2, this.f30822b);
                            if (a13 == null) {
                                return;
                            }
                            boolean z14 = a13.l2() && j15 > 0;
                            f13 = a13.e();
                            z13 = z14;
                        }
                        i15 = e14;
                        i14 = f13;
                    } else {
                        i13 = 0;
                        i14 = 100;
                        i15 = 5000;
                    }
                    if (task.isSuccessful()) {
                        i17 = 0;
                        e13 = 0;
                    } else {
                        if (task.isCanceled()) {
                            i17 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ApiException) {
                                Status status = ((ApiException) exception).getStatus();
                                i16 = status.f30751f;
                                ConnectionResult e15 = status.e();
                                if (e15 != null) {
                                    e13 = e15.e();
                                    i17 = i16;
                                }
                            } else {
                                i16 = RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
                            }
                            i17 = i16;
                        }
                        e13 = -1;
                    }
                    if (z13) {
                        j13 = j15;
                        j14 = System.currentTimeMillis();
                        i18 = (int) (SystemClock.elapsedRealtime() - this.f30825e);
                    } else {
                        j13 = 0;
                        j14 = 0;
                        i18 = -1;
                    }
                    this.f30821a.m(new MethodInvocation(this.f30822b, i17, e13, j13, j14, null, null, gCoreServiceId, i18), i13, i15, i14);
                }
            }
        }
    }
}
