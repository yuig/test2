package sh;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class i extends ai.a {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
    }

    public final int I() {
        Parcel E = E(F(), 6);
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    public final int J(rh.b bVar, String str, boolean z13) {
        Parcel F = F();
        di.a.c(F, bVar);
        F.writeString(str);
        F.writeInt(z13 ? 1 : 0);
        Parcel E = E(F, 3);
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    public final int K(rh.b bVar, String str, boolean z13) {
        Parcel F = F();
        di.a.c(F, bVar);
        F.writeString(str);
        F.writeInt(z13 ? 1 : 0);
        Parcel E = E(F, 5);
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    public final rh.a L(rh.b bVar, String str, int i13) {
        Parcel F = F();
        di.a.c(F, bVar);
        F.writeString(str);
        F.writeInt(i13);
        Parcel E = E(F, 2);
        rh.a D = rh.b.D(E.readStrongBinder());
        E.recycle();
        return D;
    }

    public final rh.a M(rh.b bVar, String str, int i13, rh.b bVar2) {
        Parcel F = F();
        di.a.c(F, bVar);
        F.writeString(str);
        F.writeInt(i13);
        di.a.c(F, bVar2);
        Parcel E = E(F, 8);
        rh.a D = rh.b.D(E.readStrongBinder());
        E.recycle();
        return D;
    }

    public final rh.a N(rh.b bVar, String str, int i13) {
        Parcel F = F();
        di.a.c(F, bVar);
        F.writeString(str);
        F.writeInt(i13);
        Parcel E = E(F, 4);
        rh.a D = rh.b.D(E.readStrongBinder());
        E.recycle();
        return D;
    }

    public final rh.a O(rh.b bVar, String str, boolean z13, long j13) {
        Parcel F = F();
        di.a.c(F, bVar);
        F.writeString(str);
        F.writeInt(z13 ? 1 : 0);
        F.writeLong(j13);
        Parcel E = E(F, 7);
        rh.a D = rh.b.D(E.readStrongBinder());
        E.recycle();
        return D;
    }
}
