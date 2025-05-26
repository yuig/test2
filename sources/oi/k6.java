package oi;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes3.dex */
public final class k6 implements ServiceConnection, jh.b, jh.c {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f94921a;

    /* renamed from: b, reason: collision with root package name */
    public volatile z3 f94922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d6 f94923c;

    public k6(d6 d6Var) {
        this.f94923c = d6Var;
    }

    @Override // jh.b
    public final void onConnected(Bundle bundle) {
        com.bumptech.glide.d.n("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                com.bumptech.glide.d.t(this.f94922b);
                this.f94923c.zzl().y(new j6(this, (t3) this.f94922b.getService(), 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f94922b = null;
                this.f94921a = false;
            }
        }
    }

    @Override // jh.c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i13;
        com.bumptech.glide.d.n("MeasurementServiceConnection.onConnectionFailed");
        y3 y3Var = ((u4) this.f94923c.f24333a).f95205i;
        if (y3Var == null || !y3Var.f94712b) {
            y3Var = null;
        }
        if (y3Var != null) {
            y3Var.f95271i.b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            i13 = 0;
            this.f94921a = false;
            this.f94922b = null;
        }
        this.f94923c.zzl().y(new l6(this, i13));
    }

    @Override // jh.b
    public final void onConnectionSuspended(int i13) {
        com.bumptech.glide.d.n("MeasurementServiceConnection.onConnectionSuspended");
        d6 d6Var = this.f94923c;
        d6Var.zzj().f95275m.c("Service connection suspended");
        d6Var.zzl().y(new l6(this, 1));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.bumptech.glide.d.n("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            int i13 = 0;
            if (iBinder == null) {
                this.f94921a = false;
                this.f94923c.zzj().f95268f.c("Service connected with null binder");
                return;
            }
            t3 t3Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    t3Var = queryLocalInterface instanceof t3 ? (t3) queryLocalInterface : new v3(iBinder);
                    this.f94923c.zzj().f95276n.c("Bound to IMeasurementService interface");
                } else {
                    this.f94923c.zzj().f95268f.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                this.f94923c.zzj().f95268f.c("Service connect failed to get IMeasurementService");
            }
            if (t3Var == null) {
                this.f94921a = false;
                try {
                    nh.a.b().c(this.f94923c.zza(), this.f94923c.f94725c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f94923c.zzl().y(new j6(this, t3Var, i13));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.bumptech.glide.d.n("MeasurementServiceConnection.onServiceDisconnected");
        d6 d6Var = this.f94923c;
        d6Var.zzj().f95275m.c("Service disconnected");
        d6Var.zzl().y(new androidx.appcompat.widget.j(29, this, componentName));
    }
}
