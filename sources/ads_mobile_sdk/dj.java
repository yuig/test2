package ads_mobile_sdk;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class dj implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f4296a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4297b;

    public dj(IBinder iBinder, String str) {
        this.f4296a = iBinder;
        this.f4297b = str;
    }

    public final Parcel a(Parcel parcel, int i13) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f4296a.transact(i13, parcel, obtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4296a;
    }
}
