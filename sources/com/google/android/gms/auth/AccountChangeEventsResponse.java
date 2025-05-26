package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new b(13);

    /* renamed from: f, reason: collision with root package name */
    public final int f30559f;

    /* renamed from: g, reason: collision with root package name */
    public final List f30560g;

    public AccountChangeEventsResponse(int i13, ArrayList arrayList) {
        this.f30559f = i13;
        d.t(arrayList);
        this.f30560g = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30559f);
        c.L2(parcel, 2, this.f30560g, false);
        c.N2(parcel, M2);
    }
}
