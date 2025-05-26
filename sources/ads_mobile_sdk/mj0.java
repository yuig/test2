package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class mj0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<mj0> CREATOR = new a.d(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f8252a;

    /* renamed from: b, reason: collision with root package name */
    public wb f8253b = null;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8254c;

    public mj0(int i13, byte[] bArr) {
        this.f8252a = i13;
        this.f8254c = bArr;
        a();
    }

    public final void a() {
        wb wbVar = this.f8253b;
        if (wbVar != null || this.f8254c == null) {
            if (wbVar == null || this.f8254c != null) {
                if (wbVar != null && this.f8254c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (wbVar != null || this.f8254c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        int i14 = this.f8252a;
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(i14);
        byte[] bArr = this.f8254c;
        if (bArr == null) {
            bArr = this.f8253b.a();
        }
        bs1.c.B2(parcel, 2, bArr, false);
        bs1.c.N2(parcel, M2);
    }
}
