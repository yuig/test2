package sh;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class j extends ai.a {
    public final rh.a I(rh.b bVar, String str, int i13, rh.b bVar2) {
        Parcel F = F();
        di.a.c(F, bVar);
        F.writeString(str);
        F.writeInt(i13);
        di.a.c(F, bVar2);
        Parcel E = E(F, 2);
        rh.a D = rh.b.D(E.readStrongBinder());
        E.recycle();
        return D;
    }

    public final rh.a J(rh.b bVar, String str, int i13, rh.b bVar2) {
        Parcel F = F();
        di.a.c(F, bVar);
        F.writeString(str);
        F.writeInt(i13);
        di.a.c(F, bVar2);
        Parcel E = E(F, 3);
        rh.a D = rh.b.D(E.readStrongBinder());
        E.recycle();
        return D;
    }
}
