package ja;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f75245a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f75245a;
    }

    @Override // ja.k
    public final void e(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(k.Bo);
            obtain.writeStringArray(strArr);
            this.f75245a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
