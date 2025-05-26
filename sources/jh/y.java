package jh;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
import i2.u1;

/* loaded from: classes.dex */
public final class y implements k {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f76205a;

    public y(IBinder iBinder) {
        this.f76205a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f76205a;
    }

    public final void j(e0 e0Var, GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(e0Var);
            obtain.writeInt(1);
            u1.a(getServiceRequest, obtain, 0);
            this.f76205a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
