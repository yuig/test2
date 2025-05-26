package a;

import ads_mobile_sdk.dj;
import ads_mobile_sdk.h70;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class v5 extends dj implements c7 {
    /* JADX WARN: Multi-variable type inference failed */
    public final void j(h70 h70Var, gd gdVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4297b);
        int i13 = i2.f57a;
        obtain.writeInt(1);
        h70Var.writeToParcel(obtain, 0);
        if (gdVar == 0) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(((e3) gdVar).asBinder());
        }
        Parcel obtain2 = Parcel.obtain();
        try {
            this.f4296a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
