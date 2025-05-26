package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import wh.a;

/* loaded from: classes3.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new a(26);

    /* renamed from: f, reason: collision with root package name */
    public final int f31822f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31823g;

    public ActivityTransition(int i13, int i14) {
        this.f31822f = i13;
        this.f31823g = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f31822f == activityTransition.f31822f && this.f31823g == activityTransition.f31823g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31822f), Integer.valueOf(this.f31823g)});
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(75);
        sb3.append("ActivityTransition [mActivityType=");
        sb3.append(this.f31822f);
        sb3.append(", mTransitionType=");
        sb3.append(this.f31823g);
        sb3.append(']');
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31822f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31823g);
        c.N2(parcel, M2);
    }
}
