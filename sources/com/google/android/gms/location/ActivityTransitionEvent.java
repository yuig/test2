package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import wh.a;

/* loaded from: classes3.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new a(27);

    /* renamed from: f, reason: collision with root package name */
    public final int f31824f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31825g;

    /* renamed from: h, reason: collision with root package name */
    public final long f31826h;

    public ActivityTransitionEvent(int i13, int i14, long j13) {
        int[] iArr = DetectedActivity.f31832h;
        boolean z13 = false;
        boolean z14 = false;
        for (int i15 = 0; i15 < 8; i15++) {
            if (iArr[i15] == i13) {
                z14 = true;
            }
        }
        if (!z14) {
            StringBuilder sb3 = new StringBuilder(81);
            sb3.append(i13);
            sb3.append(" is not a valid DetectedActivity supported by Activity Transition API.");
            Log.w("DetectedActivity", sb3.toString());
        }
        if (i14 >= 0 && i14 <= 1) {
            z13 = true;
        }
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("Transition type ");
        sb4.append(i14);
        sb4.append(" is not valid.");
        d.i(sb4.toString(), z13);
        this.f31824f = i13;
        this.f31825g = i14;
        this.f31826h = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f31824f == activityTransitionEvent.f31824f && this.f31825g == activityTransitionEvent.f31825g && this.f31826h == activityTransitionEvent.f31826h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31824f), Integer.valueOf(this.f31825g), Long.valueOf(this.f31826h)});
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder(24);
        sb4.append("ActivityType ");
        sb4.append(this.f31824f);
        sb3.append(sb4.toString());
        sb3.append(" ");
        StringBuilder sb5 = new StringBuilder(26);
        sb5.append("TransitionType ");
        sb5.append(this.f31825g);
        sb3.append(sb5.toString());
        sb3.append(" ");
        StringBuilder sb6 = new StringBuilder(41);
        sb6.append("ElapsedRealTimeNanos ");
        sb6.append(this.f31826h);
        sb3.append(sb6.toString());
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31824f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31825g);
        c.O2(parcel, 3, 8);
        parcel.writeLong(this.f31826h);
        c.N2(parcel, M2);
    }
}
