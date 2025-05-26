package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import wh.a;

/* loaded from: classes3.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new a(29);

    /* renamed from: f, reason: collision with root package name */
    public final List f31831f;

    public ActivityTransitionResult(ArrayList arrayList) {
        d.u(arrayList, "transitionEvents list can't be null.");
        if (!arrayList.isEmpty()) {
            for (int i13 = 1; i13 < arrayList.size(); i13++) {
                d.j(((ActivityTransitionEvent) arrayList.get(i13)).f31826h >= ((ActivityTransitionEvent) arrayList.get(i13 + (-1))).f31826h);
            }
        }
        this.f31831f = Collections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f31831f.equals(((ActivityTransitionResult) obj).f31831f);
    }

    public final int hashCode() {
        return this.f31831f.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.L2(parcel, 1, this.f31831f, false);
        c.N2(parcel, M2);
    }
}
