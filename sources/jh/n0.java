package jh;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class n0 extends ai.a implements x {
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData", 1);
    }

    @Override // jh.x
    public final int zzc() {
        Parcel E = E(F(), 2);
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    @Override // jh.x
    public final rh.a zzd() {
        Parcel E = E(F(), 1);
        rh.a D = rh.b.D(E.readStrongBinder());
        E.recycle();
        return D;
    }
}
