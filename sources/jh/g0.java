package jh;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class g0 extends w {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f76152g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f76153h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f fVar, int i13, IBinder iBinder, Bundle bundle) {
        super(fVar, i13, bundle);
        this.f76153h = fVar;
        this.f76152g = iBinder;
    }

    @Override // jh.w
    public final void b(ConnectionResult connectionResult) {
        c cVar;
        c cVar2;
        f fVar = this.f76153h;
        cVar = fVar.zzx;
        if (cVar != null) {
            cVar2 = fVar.zzx;
            cVar2.onConnectionFailed(connectionResult);
        }
        fVar.onConnectionFailed(connectionResult);
    }

    @Override // jh.w
    public final boolean c() {
        b bVar;
        b bVar2;
        IBinder iBinder = this.f76152g;
        try {
            com.bumptech.glide.d.t(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f fVar = this.f76153h;
            if (!fVar.getServiceDescriptor().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + fVar.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface createServiceInterface = fVar.createServiceInterface(iBinder);
            if (createServiceInterface == null || !(f.zzn(fVar, 2, 4, createServiceInterface) || f.zzn(fVar, 3, 4, createServiceInterface))) {
                return false;
            }
            fVar.zzB = null;
            Bundle connectionHint = fVar.getConnectionHint();
            bVar = fVar.zzw;
            if (bVar == null) {
                return true;
            }
            bVar2 = fVar.zzw;
            bVar2.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
