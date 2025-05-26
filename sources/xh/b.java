package xh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class b implements d, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f134959a;

    public b(IBinder iBinder) {
        this.f134959a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f134959a;
    }

    public final Parcel j(Parcel parcel, int i13) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f134959a.transact(i13, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e13) {
                obtain.recycle();
                throw e13;
            }
        } finally {
            parcel.recycle();
        }
    }
}
