package com.google.android.gms.location;

import a.a;
import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import li.d;

/* loaded from: classes3.dex */
public class DetectedActivity extends AbstractSafeParcelable {

    /* renamed from: f, reason: collision with root package name */
    public int f31833f;

    /* renamed from: g, reason: collision with root package name */
    public int f31834g;

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f31832h = {0, 1, 2, 3, 7, 8, 16, 17};
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new d(0);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f31833f == detectedActivity.f31833f && this.f31834g == detectedActivity.f31834g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31833f), Integer.valueOf(this.f31834g)});
    }

    public final String toString() {
        String str;
        int i13 = this.f31833f;
        if (i13 > 19 || i13 < 0) {
            i13 = 4;
        }
        if (i13 == 0) {
            str = "IN_VEHICLE";
        } else if (i13 == 1) {
            str = "ON_BICYCLE";
        } else if (i13 == 2) {
            str = "ON_FOOT";
        } else if (i13 == 3) {
            str = "STILL";
        } else if (i13 == 4) {
            str = "UNKNOWN";
        } else if (i13 == 5) {
            str = "TILTING";
        } else if (i13 == 7) {
            str = "WALKING";
        } else if (i13 != 8) {
            switch (i13) {
                case 16:
                    str = "IN_ROAD_VEHICLE";
                    break;
                case 17:
                    str = "IN_RAIL_VEHICLE";
                    break;
                case 18:
                    str = "IN_TWO_WHEELER_VEHICLE";
                    break;
                case 19:
                    str = "IN_FOUR_WHEELER_VEHICLE";
                    break;
                default:
                    str = Integer.toString(i13);
                    break;
            }
        } else {
            str = "RUNNING";
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 48);
        sb3.append("DetectedActivity [type=");
        sb3.append(str);
        sb3.append(", confidence=");
        return a.n(sb3, this.f31834g, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31833f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31834g);
        c.N2(parcel, M2);
    }
}
