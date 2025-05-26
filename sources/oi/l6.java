package oi;

import android.content.ComponentName;

/* loaded from: classes3.dex */
public final class l6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k6 f94940b;

    public /* synthetic */ l6(k6 k6Var, int i13) {
        this.f94939a = i13;
        this.f94940b = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f94939a;
        k6 k6Var = this.f94940b;
        switch (i13) {
            case 0:
                d6 d6Var = k6Var.f94923c;
                d6Var.f94726d = null;
                d6Var.I();
                break;
            default:
                d6 d6Var2 = k6Var.f94923c;
                ComponentName componentName = new ComponentName(k6Var.f94923c.zza(), "com.google.android.gms.measurement.AppMeasurementService");
                d6Var2.p();
                if (d6Var2.f94726d != null) {
                    d6Var2.f94726d = null;
                    d6Var2.zzj().f95276n.b(componentName, "Disconnected from device MeasurementService");
                    d6Var2.p();
                    d6Var2.E();
                    break;
                }
                break;
        }
    }
}
