package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class TelemetryData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new b(22);

    /* renamed from: f, reason: collision with root package name */
    public final int f30972f;

    /* renamed from: g, reason: collision with root package name */
    public List f30973g;

    public TelemetryData(int i13, List list) {
        this.f30972f = i13;
        this.f30973g = list;
    }

    public final int e() {
        return this.f30972f;
    }

    public final List f() {
        return this.f30973g;
    }

    public final void k1(MethodInvocation methodInvocation) {
        if (this.f30973g == null) {
            this.f30973g = new ArrayList();
        }
        this.f30973g.add(methodInvocation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30972f);
        c.L2(parcel, 2, this.f30973g, false);
        c.N2(parcel, M2);
    }
}
