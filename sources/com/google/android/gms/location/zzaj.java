package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import wh.a;

/* loaded from: classes3.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new a(23);

    /* renamed from: f, reason: collision with root package name */
    public final int f31872f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31873g;

    /* renamed from: h, reason: collision with root package name */
    public final long f31874h;

    /* renamed from: i, reason: collision with root package name */
    public final long f31875i;

    public zzaj(int i13, int i14, long j13, long j14) {
        this.f31872f = i13;
        this.f31873g = i14;
        this.f31874h = j13;
        this.f31875i = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaj.class == obj.getClass()) {
            zzaj zzajVar = (zzaj) obj;
            if (this.f31872f == zzajVar.f31872f && this.f31873g == zzajVar.f31873g && this.f31874h == zzajVar.f31874h && this.f31875i == zzajVar.f31875i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31873g), Integer.valueOf(this.f31872f), Long.valueOf(this.f31875i), Long.valueOf(this.f31874h)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f31872f + " Cell status: " + this.f31873g + " elapsed time NS: " + this.f31875i + " system time ms: " + this.f31874h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31872f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31873g);
        c.O2(parcel, 3, 8);
        parcel.writeLong(this.f31874h);
        c.O2(parcel, 4, 8);
        parcel.writeLong(this.f31875i);
        c.N2(parcel, M2);
    }
}
