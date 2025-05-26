package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;
import java.util.List;
import wh.a;

/* loaded from: classes3.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new a(25);

    /* renamed from: f, reason: collision with root package name */
    public List f31817f;

    /* renamed from: g, reason: collision with root package name */
    public long f31818g;

    /* renamed from: h, reason: collision with root package name */
    public long f31819h;

    /* renamed from: i, reason: collision with root package name */
    public int f31820i;

    /* renamed from: j, reason: collision with root package name */
    public Bundle f31821j;

    public static boolean e(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!e(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.f31818g == activityRecognitionResult.f31818g && this.f31819h == activityRecognitionResult.f31819h && this.f31820i == activityRecognitionResult.f31820i && c.x(this.f31817f, activityRecognitionResult.f31817f) && e(this.f31821j, activityRecognitionResult.f31821j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f31818g), Long.valueOf(this.f31819h), Integer.valueOf(this.f31820i), this.f31817f, this.f31821j});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31817f);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
        sb3.append("ActivityRecognitionResult [probableActivities=");
        sb3.append(valueOf);
        sb3.append(", timeMillis=");
        sb3.append(this.f31818g);
        sb3.append(", elapsedRealtimeMillis=");
        sb3.append(this.f31819h);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.L2(parcel, 1, this.f31817f, false);
        bs1.c.O2(parcel, 2, 8);
        parcel.writeLong(this.f31818g);
        bs1.c.O2(parcel, 3, 8);
        parcel.writeLong(this.f31819h);
        bs1.c.O2(parcel, 4, 4);
        parcel.writeInt(this.f31820i);
        bs1.c.A2(parcel, 5, this.f31821j);
        bs1.c.N2(parcel, M2);
    }
}
