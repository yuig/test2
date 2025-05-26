package jh;

import android.os.Parcel;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;

/* loaded from: classes3.dex */
public final class z extends ai.a implements b0 {
    public final zzq I(zzo zzoVar) {
        Parcel F = F();
        int i13 = di.a.f55028a;
        F.writeInt(1);
        zzoVar.writeToParcel(F, 0);
        Parcel E = E(F, 6);
        zzq zzqVar = (zzq) di.a.a(E, zzq.CREATOR);
        E.recycle();
        return zzqVar;
    }

    public final boolean J(zzs zzsVar, rh.b bVar) {
        Parcel F = F();
        int i13 = di.a.f55028a;
        F.writeInt(1);
        zzsVar.writeToParcel(F, 0);
        di.a.c(F, bVar);
        Parcel E = E(F, 5);
        boolean z13 = E.readInt() != 0;
        E.recycle();
        return z13;
    }

    public final boolean K() {
        Parcel E = E(F(), 7);
        int i13 = di.a.f55028a;
        boolean z13 = E.readInt() != 0;
        E.recycle();
        return z13;
    }
}
