package oi;

import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.measurement.internal.zzo;

/* loaded from: classes3.dex */
public final class g6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzo f94793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f94794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zznc f94795c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d6 f94796d;

    public g6(d6 d6Var, zzo zzoVar, boolean z13, zznc zzncVar) {
        this.f94796d = d6Var;
        this.f94793a = zzoVar;
        this.f94794b = z13;
        this.f94795c = zzncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d6 d6Var = this.f94796d;
        t3 t3Var = d6Var.f94726d;
        if (t3Var == null) {
            d6Var.zzj().f95268f.c("Discarding data. Failed to set user property");
            return;
        }
        zzo zzoVar = this.f94793a;
        com.bumptech.glide.d.t(zzoVar);
        d6Var.C(t3Var, this.f94794b ? null : this.f94795c, zzoVar);
        d6Var.J();
    }
}
