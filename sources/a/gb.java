package a;

import ads_mobile_sdk.ef2;
import ads_mobile_sdk.jf2;
import ads_mobile_sdk.p02;
import ads_mobile_sdk.q02;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public abstract class gb extends e3 {
    @Override // a.e3
    public final boolean a(int i13, Parcel parcel, Parcel parcel2) {
        if (i13 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i14 = i2.f57a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(kh2.n.j(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
        q02 q02Var = ((p02) this).f9512a;
        if (q02Var.f9893a != null) {
            q02.f9891c.a("detach", new Object[0]);
            jf2 jf2Var = q02Var.f9893a;
            jf2Var.getClass();
            jf2Var.b(new ef2(jf2Var));
        }
        return true;
    }
}
