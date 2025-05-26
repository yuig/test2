package oi;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes3.dex */
public final class b5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.u0 f94695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f94696c;

    public /* synthetic */ b5(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.u0 u0Var, int i13) {
        this.f94694a = i13;
        this.f94696c = appMeasurementDynamiteService;
        this.f94695b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f94694a;
        com.google.android.gms.internal.measurement.u0 u0Var = this.f94695b;
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f94696c;
        boolean z13 = false;
        switch (i13) {
            case 0:
                d6 m13 = appMeasurementDynamiteService.f32015a.m();
                m13.p();
                m13.w();
                m13.A(new s.f(m13, m13.L(false), u0Var, 14));
                break;
            default:
                f7 f7Var = appMeasurementDynamiteService.f32015a.f95208l;
                u4.c(f7Var);
                u4 u4Var = appMeasurementDynamiteService.f32015a;
                if (u4Var.A != null && u4Var.A.booleanValue()) {
                    z13 = true;
                }
                f7Var.M(u0Var, z13);
                break;
        }
    }
}
