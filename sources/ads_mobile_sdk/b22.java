package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b22 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<b22> CREATOR = new a.d(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f2642a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2643b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2644c;

    public b22(byte[] bArr, int i13, int i14) {
        this.f2642a = i13;
        this.f2643b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f2644c = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        int i14 = this.f2642a;
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(i14);
        bs1.c.B2(parcel, 2, this.f2643b, false);
        int i15 = this.f2644c;
        bs1.c.O2(parcel, 3, 4);
        parcel.writeInt(i15);
        bs1.c.N2(parcel, M2);
    }
}
