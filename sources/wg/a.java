package wg;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import xg.l;
import xg.m;
import xg.n;

/* loaded from: classes.dex */
public final class a implements c, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f129716a;

    public a(IBinder iBinder) {
        this.f129716a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f129716a;
    }

    public final void j(Parcel parcel, int i13) {
        try {
            this.f129716a.transact(i13, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // wg.c
    public final void l(Bundle bundle, m mVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.engage.protocol.IAppEngageService");
        fi.a.c(obtain, bundle);
        obtain.writeStrongBinder(mVar);
        j(obtain, 2);
    }

    @Override // wg.c
    public final void u(Bundle bundle, l lVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.engage.protocol.IAppEngageService");
        fi.a.c(obtain, bundle);
        obtain.writeStrongBinder(lVar);
        j(obtain, 3);
    }

    @Override // wg.c
    public final void v(Bundle bundle, n nVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.engage.protocol.IAppEngageService");
        fi.a.c(obtain, bundle);
        obtain.writeStrongBinder(nVar);
        j(obtain, 1);
    }

    @Override // wg.c
    public final void y(Bundle bundle, xg.c cVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.engage.protocol.IAppEngageService");
        fi.a.c(obtain, bundle);
        obtain.writeStrongBinder(cVar);
        j(obtain, 4);
    }
}
