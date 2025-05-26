package wa;

import android.os.Parcel;
import android.util.SparseIntArray;
import g1.g;

/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f128610d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f128611e;

    /* renamed from: f, reason: collision with root package name */
    public final int f128612f;

    /* renamed from: g, reason: collision with root package name */
    public final int f128613g;

    /* renamed from: h, reason: collision with root package name */
    public final String f128614h;

    /* renamed from: i, reason: collision with root package name */
    public int f128615i;

    /* renamed from: j, reason: collision with root package name */
    public int f128616j;

    /* renamed from: k, reason: collision with root package name */
    public int f128617k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new g(), new g(), new g());
    }

    @Override // wa.a
    public final b a() {
        Parcel parcel = this.f128611e;
        int dataPosition = parcel.dataPosition();
        int i13 = this.f128616j;
        if (i13 == this.f128612f) {
            i13 = this.f128613g;
        }
        return new b(parcel, dataPosition, i13, a.a.p(new StringBuilder(), this.f128614h, "  "), this.f128607a, this.f128608b, this.f128609c);
    }

    @Override // wa.a
    public final boolean e(int i13) {
        while (this.f128616j < this.f128613g) {
            int i14 = this.f128617k;
            if (i14 == i13) {
                return true;
            }
            if (String.valueOf(i14).compareTo(String.valueOf(i13)) > 0) {
                return false;
            }
            int i15 = this.f128616j;
            Parcel parcel = this.f128611e;
            parcel.setDataPosition(i15);
            int readInt = parcel.readInt();
            this.f128617k = parcel.readInt();
            this.f128616j += readInt;
        }
        return this.f128617k == i13;
    }

    @Override // wa.a
    public final void i(int i13) {
        int i14 = this.f128615i;
        SparseIntArray sparseIntArray = this.f128610d;
        Parcel parcel = this.f128611e;
        if (i14 >= 0) {
            int i15 = sparseIntArray.get(i14);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i15);
            parcel.writeInt(dataPosition - i15);
            parcel.setDataPosition(dataPosition);
        }
        this.f128615i = i13;
        sparseIntArray.put(i13, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i13);
    }

    public b(Parcel parcel, int i13, int i14, String str, g gVar, g gVar2, g gVar3) {
        super(gVar, gVar2, gVar3);
        this.f128610d = new SparseIntArray();
        this.f128615i = -1;
        this.f128617k = -1;
        this.f128611e = parcel;
        this.f128612f = i13;
        this.f128613g = i14;
        this.f128616j = i13;
        this.f128614h = str;
    }
}
