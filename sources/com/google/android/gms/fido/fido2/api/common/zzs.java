package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new vh.f(19);

    /* renamed from: f, reason: collision with root package name */
    public final List f31194f;

    public zzs(ArrayList arrayList) {
        com.bumptech.glide.d.t(arrayList);
        this.f31194f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        List list = zzsVar.f31194f;
        List list2 = this.f31194f;
        return list2.containsAll(list) && zzsVar.f31194f.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f31194f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.L2(parcel, 1, this.f31194f, false);
        bs1.c.N2(parcel, M2);
    }
}
