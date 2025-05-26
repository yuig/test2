package hi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import bb.p;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.internal.location.zzbf;

/* loaded from: classes3.dex */
public final class i extends jh.h {

    /* renamed from: e, reason: collision with root package name */
    public final String f69234e;

    /* renamed from: f, reason: collision with root package name */
    public final e f69235f;

    public i(Context context, Looper looper, com.google.android.gms.common.api.g gVar, com.google.android.gms.common.api.h hVar, jh.g gVar2) {
        super(context, looper, 23, gVar2, gVar, hVar);
        p pVar = new p(this, 19);
        this.f69234e = "locationServices";
        this.f69235f = new e(pVar);
    }

    @Override // jh.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 3);
    }

    @Override // jh.f, com.google.android.gms.common.api.c
    public final void disconnect() {
        synchronized (this.f69235f) {
            if (isConnected()) {
                try {
                    this.f69235f.a();
                    this.f69235f.c();
                } catch (Exception e13) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e13);
                }
            }
            super.disconnect();
        }
    }

    public final void e(com.google.android.gms.common.api.internal.j jVar, li.a aVar) {
        e eVar = this.f69235f;
        ((i) eVar.f69226a.f22464b).checkConnected();
        com.bumptech.glide.d.u(jVar, "Invalid null listener key");
        synchronized (eVar.f69230e) {
            f fVar = (f) eVar.f69230e.remove(jVar);
            if (fVar != null) {
                synchronized (fVar) {
                    l lVar = fVar.f69231b;
                    lVar.f30842b = null;
                    lVar.f30843c = null;
                }
                d dVar = (d) ((i) eVar.f69226a.f22464b).getService();
                zzbf zzbfVar = new zzbf(2, null, null, null, fVar, aVar);
                dVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(dVar.f141968c);
                int i13 = k.f69236a;
                obtain.writeInt(1);
                zzbfVar.writeToParcel(obtain, 0);
                dVar.j(obtain, 59);
            }
        }
    }

    @Override // jh.f
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f69234e);
        return bundle;
    }

    @Override // jh.f
    public final /* bridge */ /* synthetic */ int getMinApkVersion() {
        return 11925000;
    }

    @Override // jh.f
    public final /* bridge */ /* synthetic */ String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // jh.f
    public final /* bridge */ /* synthetic */ String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
