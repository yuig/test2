package zg;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements c, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f141950a;

    public a(IBinder iBinder) {
        this.f141950a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f141950a;
    }

    public final Bundle j(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i13 = hg.a.f69060a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.f141950a.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
        } catch (RuntimeException e13) {
            throw e13;
        } finally {
            obtain.recycle();
        }
    }
}
