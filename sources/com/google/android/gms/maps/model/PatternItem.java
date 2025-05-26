package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import li.d;

/* loaded from: classes3.dex */
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new d(11);

    /* renamed from: f, reason: collision with root package name */
    public final int f31958f;

    /* renamed from: g, reason: collision with root package name */
    public final Float f31959g;

    public PatternItem(int i13, Float f13) {
        boolean z13 = true;
        if (i13 != 1 && (f13 == null || f13.floatValue() < 0.0f)) {
            z13 = false;
        }
        String valueOf = String.valueOf(f13);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 45);
        sb3.append("Invalid PatternItem: type=");
        sb3.append(i13);
        sb3.append(" length=");
        sb3.append(valueOf);
        com.bumptech.glide.d.i(sb3.toString(), z13);
        this.f31958f = i13;
        this.f31959g = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.f31958f == patternItem.f31958f && c.x(this.f31959g, patternItem.f31959g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31958f), this.f31959g});
    }

    public String toString() {
        String valueOf = String.valueOf(this.f31959g);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 39);
        sb3.append("[PatternItem: type=");
        sb3.append(this.f31958f);
        sb3.append(" length=");
        sb3.append(valueOf);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31958f);
        bs1.c.D2(parcel, 3, this.f31959g);
        bs1.c.N2(parcel, M2);
    }
}
