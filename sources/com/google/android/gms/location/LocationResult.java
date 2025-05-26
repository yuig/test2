package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import wh.a;

/* loaded from: classes3.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: f, reason: collision with root package name */
    public final List f31852f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f31851g = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new a(18);

    public LocationResult(List list) {
        this.f31852f = list;
    }

    public final Location e() {
        List list = this.f31852f;
        int size = list.size();
        if (size == 0) {
            return null;
        }
        return (Location) list.get(size - 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int size = locationResult.f31852f.size();
        List list = this.f31852f;
        if (size != list.size()) {
            return false;
        }
        Iterator it = locationResult.f31852f.iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f31852f.iterator();
        int i13 = 17;
        while (it.hasNext()) {
            long time = ((Location) it.next()).getTime();
            i13 = (i13 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i13;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31852f);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 27);
        sb3.append("LocationResult[locations: ");
        sb3.append(valueOf);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.L2(parcel, 1, this.f31852f, false);
        c.N2(parcel, M2);
    }
}
