package zh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141966a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f141967b;

    /* renamed from: c, reason: collision with root package name */
    public final String f141968c;

    public /* synthetic */ a(IBinder iBinder, String str, int i13) {
        this.f141966a = i13;
        this.f141967b = iBinder;
        this.f141968c = str;
    }

    public final Parcel B() {
        int i13 = this.f141966a;
        String str = this.f141968c;
        switch (i13) {
            case 0:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(str);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(str);
                return obtain2;
        }
    }

    public final void C(Parcel parcel, int i13) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f141967b.transact(i13, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f141967b;
    }

    public final void j(Parcel parcel, int i13) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f141967b.transact(i13, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
