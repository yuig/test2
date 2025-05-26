package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f15214a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15215b;

    public /* synthetic */ a(IBinder iBinder, String str, int i13) {
        this.f15214a = iBinder;
        this.f15215b = str;
    }

    public final void B(Parcel parcel, int i13) {
        try {
            this.f15214a.transact(i13, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel C() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15215b);
        return obtain;
    }

    public final void D(Parcel parcel, int i13) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15214a.transact(i13, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final Parcel E(Parcel parcel, int i13) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f15214a.transact(i13, parcel, obtain, 0);
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

    public final Parcel F() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15215b);
        return obtain;
    }

    public final Parcel G(Parcel parcel, int i13) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f15214a.transact(i13, parcel, obtain, 0);
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

    public final void H(Parcel parcel, int i13) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15214a.transact(i13, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15214a;
    }

    public final Parcel j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15215b);
        return obtain;
    }
}
