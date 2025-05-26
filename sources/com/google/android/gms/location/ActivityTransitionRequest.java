package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import b4.f;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import wh.a;

/* loaded from: classes3.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new a(28);

    /* renamed from: i, reason: collision with root package name */
    public static final f f31827i = new f(4);

    /* renamed from: f, reason: collision with root package name */
    public final List f31828f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31829g;

    /* renamed from: h, reason: collision with root package name */
    public final List f31830h;

    public ActivityTransitionRequest(String str, ArrayList arrayList, ArrayList arrayList2) {
        d.u(arrayList, "transitions can't be null");
        d.i("transitions can't be empty.", arrayList.size() > 0);
        TreeSet treeSet = new TreeSet(f31827i);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            d.i(String.format("Found duplicated transition: %s.", activityTransition), treeSet.add(activityTransition));
        }
        this.f31828f = Collections.unmodifiableList(arrayList);
        this.f31829g = str;
        this.f31830h = arrayList2 == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (c.x(this.f31828f, activityTransitionRequest.f31828f) && c.x(this.f31829g, activityTransitionRequest.f31829g) && c.x(this.f31830h, activityTransitionRequest.f31830h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f31828f.hashCode() * 31;
        String str = this.f31829g;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f31830h;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31828f);
        String valueOf2 = String.valueOf(this.f31830h);
        int length = valueOf.length() + 61;
        String str = this.f31829g;
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + String.valueOf(str).length() + length);
        sb3.append("ActivityTransitionRequest [mTransitions=");
        sb3.append(valueOf);
        sb3.append(", mTag='");
        sb3.append(str);
        sb3.append("', mClients=");
        sb3.append(valueOf2);
        sb3.append(']');
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.L2(parcel, 1, this.f31828f, false);
        bs1.c.I2(parcel, 2, this.f31829g, false);
        bs1.c.L2(parcel, 3, this.f31830h, false);
        bs1.c.N2(parcel, M2);
    }
}
