package jh;

import android.os.Parcel;
import com.google.android.gms.common.internal.zax;

/* loaded from: classes3.dex */
public final class t extends zh.a {
    public final rh.a D(rh.b bVar, zax zaxVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f141968c);
        int i13 = bi.b.f22820a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        zaxVar.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.f141967b.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return rh.b.D(obtain.readStrongBinder());
        } catch (RuntimeException e13) {
            throw e13;
        } finally {
            obtain.recycle();
        }
    }
}
