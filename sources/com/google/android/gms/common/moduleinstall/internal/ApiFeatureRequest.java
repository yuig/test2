package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lh.a;

/* loaded from: classes3.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new a(0);

    /* renamed from: f, reason: collision with root package name */
    public final List f31002f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31003g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31004h;

    /* renamed from: i, reason: collision with root package name */
    public final String f31005i;

    public ApiFeatureRequest(ArrayList arrayList, boolean z13, String str, String str2) {
        d.t(arrayList);
        this.f31002f = arrayList;
        this.f31003g = z13;
        this.f31004h = str;
        this.f31005i = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f31003g == apiFeatureRequest.f31003g && c.x(this.f31002f, apiFeatureRequest.f31002f) && c.x(this.f31004h, apiFeatureRequest.f31004h) && c.x(this.f31005i, apiFeatureRequest.f31005i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31003g), this.f31002f, this.f31004h, this.f31005i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.L2(parcel, 1, this.f31002f, false);
        bs1.c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31003g ? 1 : 0);
        bs1.c.I2(parcel, 3, this.f31004h, false);
        bs1.c.I2(parcel, 4, this.f31005i, false);
        bs1.c.N2(parcel, M2);
    }
}
