package ja;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f75247a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f75247a;
    }

    @Override // ja.m
    public final void x(String[] strArr, int i13) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(m.Co);
            obtain.writeInt(i13);
            obtain.writeStringArray(strArr);
            this.f75247a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
