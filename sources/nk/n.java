package nk;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class n extends h implements o {
    @Override // nk.h
    public final boolean a(int i13, Parcel parcel, Parcel parcel2, int i14) {
        if (i13 == 2) {
            Bundle bundle = (Bundle) i.a(parcel, Bundle.CREATOR);
            i.b(parcel);
            e(bundle);
            return true;
        }
        if (i13 == 3) {
            Bundle bundle2 = (Bundle) i.a(parcel, Bundle.CREATOR);
            i.b(parcel);
            c(bundle2);
            return true;
        }
        if (i13 == 4) {
            Bundle bundle3 = (Bundle) i.a(parcel, Bundle.CREATOR);
            i.b(parcel);
            d(bundle3);
            return true;
        }
        if (i13 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) i.a(parcel, Bundle.CREATOR);
        i.b(parcel);
        b(bundle4);
        return true;
    }
}
