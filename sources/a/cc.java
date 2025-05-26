package a;

import ads_mobile_sdk.au2;
import ads_mobile_sdk.h70;
import ads_mobile_sdk.pk0;
import ads_mobile_sdk.zb0;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class cc extends e3 implements gd {
    @Override // a.e3
    public final boolean a(int i13, Parcel parcel, Parcel parcel2) {
        if (i13 == 1) {
            String trustlessToken = parcel.readString();
            Parcelable.Creator<h70> creator = h70.CREATOR;
            int i14 = i2.f57a;
            h70 decagonRequestParcel = (h70) (parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw new BadParcelableException(kh2.n.j(dataAvail, "Parcel data not fully consumed, unread size: "));
            }
            au2 au2Var = (au2) this;
            Intrinsics.checkNotNullParameter(trustlessToken, "trustlessToken");
            Intrinsics.checkNotNullParameter(decagonRequestParcel, "decagonRequestParcel");
            pk0 pk0Var = new pk0(trustlessToken);
            if (!au2Var.f2554f.getAndSet(true)) {
                ((ao2.w) au2Var.f2556h).Q(pk0Var);
            }
        } else {
            if (i13 != 2) {
                return false;
            }
            Parcelable.Creator<zb0> creator2 = zb0.CREATOR;
            int i15 = i2.f57a;
            zb0 zb0Var = (zb0) (parcel.readInt() != 0 ? creator2.createFromParcel(parcel) : null);
            int dataAvail2 = parcel.dataAvail();
            if (dataAvail2 > 0) {
                throw new BadParcelableException(kh2.n.j(dataAvail2, "Parcel data not fully consumed, unread size: "));
            }
            ((au2) this).a(zb0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
