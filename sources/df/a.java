package df;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f54696a;

    public a(IBinder binder) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        this.f54696a = binder;
    }

    public final boolean B() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            obtain.writeInt(1);
            this.f54696a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f54696a;
    }

    public final String j() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f54696a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
