package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import wh.a;

/* loaded from: classes3.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new a(24);

    /* renamed from: f, reason: collision with root package name */
    public final List f31876f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f31877g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31878h;

    public zzal(ArrayList arrayList, PendingIntent pendingIntent, String str) {
        this.f31876f = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f31877g = pendingIntent;
        this.f31878h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.J2(parcel, 1, this.f31876f);
        c.H2(parcel, 2, this.f31877g, i13, false);
        c.I2(parcel, 3, this.f31878h, false);
        c.N2(parcel, M2);
    }
}
