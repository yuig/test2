package com.google.android.gms.location;

import a.a;
import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import li.d;

/* loaded from: classes3.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new d(2);

    /* renamed from: f, reason: collision with root package name */
    public final List f31835f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31836g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31837h;

    public GeofencingRequest(int i13, String str, ArrayList arrayList) {
        this.f31835f = arrayList;
        this.f31836g = i13;
        this.f31837h = str;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GeofencingRequest[geofences=");
        sb3.append(this.f31835f);
        StringBuilder sb4 = new StringBuilder(30);
        sb4.append(", initialTrigger=");
        sb4.append(this.f31836g);
        sb4.append(", ");
        sb3.append(sb4.toString());
        String valueOf = String.valueOf(this.f31837h);
        return a.p(sb3, valueOf.length() != 0 ? "tag=".concat(valueOf) : new String("tag="), "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.L2(parcel, 1, this.f31835f, false);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31836g);
        c.I2(parcel, 3, this.f31837h, false);
        c.N2(parcel, M2);
    }
}
