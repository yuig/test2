package androidx.media3.common;

import a.cb;
import a7.i;
import a7.o0;
import android.os.Parcel;
import android.os.Parcelable;
import d7.n0;
import i2.u1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new u1(3);

    /* renamed from: a */
    public final SchemeData[] f18734a;

    /* renamed from: b */
    public int f18735b;

    /* renamed from: c */
    public final String f18736c;

    /* renamed from: d */
    public final int f18737d;

    public DrmInitData(ArrayList arrayList) {
        this(null, false, (SchemeData[]) arrayList.toArray(new SchemeData[0]));
    }

    public static boolean a(ArrayList arrayList, int i13, UUID uuid) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (((SchemeData) arrayList.get(i14)).f18739b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public final DrmInitData b(String str) {
        return Objects.equals(this.f18736c, str) ? this : new DrmInitData(str, false, this.f18734a);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = i.f1066a;
        return uuid.equals(schemeData3.f18739b) ? uuid.equals(schemeData4.f18739b) ? 0 : 1 : schemeData3.f18739b.compareTo(schemeData4.f18739b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return Objects.equals(this.f18736c, drmInitData.f18736c) && Arrays.equals(this.f18734a, drmInitData.f18734a);
    }

    public final int hashCode() {
        if (this.f18735b == 0) {
            String str = this.f18736c;
            this.f18735b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f18734a);
        }
        return this.f18735b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f18736c);
        parcel.writeTypedArray(this.f18734a, 0);
    }

    public DrmInitData(String str, ArrayList arrayList) {
        this(str, false, (SchemeData[]) arrayList.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, true, schemeDataArr);
    }

    public DrmInitData(String str, boolean z13, SchemeData... schemeDataArr) {
        this.f18736c = str;
        schemeDataArr = z13 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f18734a = schemeDataArr;
        this.f18737d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    /* loaded from: classes3.dex */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* renamed from: a */
        public int f18738a;

        /* renamed from: b */
        public final UUID f18739b;

        /* renamed from: c */
        public final String f18740c;

        /* renamed from: d */
        public final String f18741d;

        /* renamed from: e */
        public final byte[] f18742e;

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f18739b = uuid;
            this.f18740c = str;
            str2.getClass();
            this.f18741d = o0.r(str2);
            this.f18742e = bArr;
        }

        public final boolean a(SchemeData schemeData) {
            return b() && !schemeData.b() && d(schemeData.f18739b);
        }

        public final boolean b() {
            return this.f18742e != null;
        }

        public final boolean d(UUID uuid) {
            UUID uuid2 = i.f1066a;
            UUID uuid3 = this.f18739b;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return Objects.equals(this.f18740c, schemeData.f18740c) && Objects.equals(this.f18741d, schemeData.f18741d) && Objects.equals(this.f18739b, schemeData.f18739b) && Arrays.equals(this.f18742e, schemeData.f18742e);
        }

        public final int hashCode() {
            if (this.f18738a == 0) {
                int hashCode = this.f18739b.hashCode() * 31;
                String str = this.f18740c;
                this.f18738a = Arrays.hashCode(this.f18742e) + cb.d(this.f18741d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f18738a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            UUID uuid = this.f18739b;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f18740c);
            parcel.writeString(this.f18741d);
            parcel.writeByteArray(this.f18742e);
        }

        public SchemeData(Parcel parcel) {
            this.f18739b = new UUID(parcel.readLong(), parcel.readLong());
            this.f18740c = parcel.readString();
            String readString = parcel.readString();
            int i13 = n0.f53866a;
            this.f18741d = readString;
            this.f18742e = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f18736c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i13 = n0.f53866a;
        this.f18734a = schemeDataArr;
        this.f18737d = schemeDataArr.length;
    }
}
