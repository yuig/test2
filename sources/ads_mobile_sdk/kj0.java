package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class kj0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<kj0> CREATOR = new a.d(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f7335a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7336b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7337c;

    public kj0(int i13, String str, String str2) {
        this.f7335a = i13;
        this.f7336b = str;
        this.f7337c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        int i14 = this.f7335a;
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(i14);
        bs1.c.I2(parcel, 2, this.f7336b, false);
        bs1.c.I2(parcel, 3, this.f7337c, false);
        bs1.c.N2(parcel, M2);
    }
}
