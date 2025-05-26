package oi;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzo;

/* loaded from: classes3.dex */
public final class f6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f94751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d6 f94752c;

    public /* synthetic */ f6(d6 d6Var, zzo zzoVar, int i13) {
        this.f94750a = i13;
        this.f94752c = d6Var;
        this.f94751b = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f94750a;
        d6 d6Var = this.f94752c;
        zzo zzoVar = this.f94751b;
        switch (i13) {
            case 0:
                t3 t3Var = d6Var.f94726d;
                if (t3Var != null) {
                    try {
                        com.bumptech.glide.d.t(zzoVar);
                        t3Var.n(zzoVar);
                    } catch (RemoteException e13) {
                        d6Var.zzj().f95268f.b(e13, "Failed to reset data on the service: remote exception");
                    }
                    d6Var.J();
                    break;
                } else {
                    d6Var.zzj().f95268f.c("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                t3 t3Var2 = d6Var.f94726d;
                if (t3Var2 == null) {
                    d6Var.zzj().f95268f.c("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        com.bumptech.glide.d.t(zzoVar);
                        t3Var2.t(zzoVar);
                        d6Var.r().C();
                        d6Var.C(t3Var2, null, zzoVar);
                        d6Var.J();
                        break;
                    } catch (RemoteException e14) {
                        d6Var.zzj().f95268f.b(e14, "Failed to send app launch to the service");
                        return;
                    }
                }
            case 2:
                t3 t3Var3 = d6Var.f94726d;
                if (t3Var3 == null) {
                    d6Var.zzj().f95268f.c("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        com.bumptech.glide.d.t(zzoVar);
                        t3Var3.p(zzoVar);
                        d6Var.J();
                        break;
                    } catch (RemoteException e15) {
                        d6Var.zzj().f95268f.b(e15, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
            default:
                t3 t3Var4 = d6Var.f94726d;
                if (t3Var4 == null) {
                    d6Var.zzj().f95268f.c("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        com.bumptech.glide.d.t(zzoVar);
                        t3Var4.o(zzoVar);
                        d6Var.J();
                        break;
                    } catch (RemoteException e16) {
                        d6Var.zzj().f95268f.b(e16, "Failed to send consent settings to the service");
                    }
                }
        }
    }
}
