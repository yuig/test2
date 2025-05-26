package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lh.a;

/* loaded from: classes3.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new a(1);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30992f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30993g;

    public ModuleAvailabilityResponse(boolean z13, int i13) {
        this.f30992f = z13;
        this.f30993g = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30992f ? 1 : 0);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30993g);
        c.N2(parcel, M2);
    }
}
