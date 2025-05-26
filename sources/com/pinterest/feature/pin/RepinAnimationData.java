package com.pinterest.feature.pin;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/pin/RepinAnimationData;", "Landroid/os/Parcelable;", "CREATOR", "com/pinterest/feature/pin/q", "repinLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class RepinAnimationData implements Parcelable {

    @NotNull
    public static final q CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    public final int f46896a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46897b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46898c;

    /* renamed from: d, reason: collision with root package name */
    public final int f46899d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46900e;

    public RepinAnimationData(int i13, int i14, int i15, int i16, int i17) {
        this.f46896a = i13;
        this.f46897b = i14;
        this.f46898c = i15;
        this.f46899d = i16;
        this.f46900e = i17;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepinAnimationData)) {
            return false;
        }
        RepinAnimationData repinAnimationData = (RepinAnimationData) obj;
        return this.f46896a == repinAnimationData.f46896a && this.f46897b == repinAnimationData.f46897b && this.f46898c == repinAnimationData.f46898c && this.f46899d == repinAnimationData.f46899d && this.f46900e == repinAnimationData.f46900e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46900e) + ep.b.b(this.f46899d, ep.b.b(this.f46898c, ep.b.b(this.f46897b, Integer.hashCode(this.f46896a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RepinAnimationData(pinWidth=");
        sb3.append(this.f46896a);
        sb3.append(", pinHeight=");
        sb3.append(this.f46897b);
        sb3.append(", pinTop=");
        sb3.append(this.f46898c);
        sb3.append(", pinLeft=");
        sb3.append(this.f46899d);
        sb3.append(", pinCornerRadiusPx=");
        return a.a.n(sb3, this.f46900e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.f46896a);
        parcel.writeInt(this.f46897b);
        parcel.writeInt(this.f46898c);
        parcel.writeInt(this.f46899d);
        parcel.writeInt(this.f46900e);
    }
}
