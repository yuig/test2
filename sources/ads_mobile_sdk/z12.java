package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class z12 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<z12> CREATOR = new a.d(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f14525a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14526b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14527c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14528d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14529e;

    public z12(int i13, int i14, int i15, String str, String str2) {
        this.f14525a = i13;
        this.f14526b = i14;
        this.f14527c = str;
        this.f14528d = str2;
        this.f14529e = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        int i14 = this.f14525a;
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(i14);
        int i15 = this.f14526b;
        bs1.c.O2(parcel, 2, 4);
        parcel.writeInt(i15);
        bs1.c.I2(parcel, 3, this.f14527c, false);
        bs1.c.I2(parcel, 4, this.f14528d, false);
        int i16 = this.f14529e;
        bs1.c.O2(parcel, 5, 4);
        parcel.writeInt(i16);
        bs1.c.N2(parcel, M2);
    }
}
