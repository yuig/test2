package nk;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class u extends h implements v {
    @Override // nk.h
    public final boolean a(int i13, Parcel parcel, Parcel parcel2, int i14) {
        if (i13 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) i.a(parcel, Bundle.CREATOR);
        i.b(parcel);
        b(bundle);
        return true;
    }
}
