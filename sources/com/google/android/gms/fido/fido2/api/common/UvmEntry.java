package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class UvmEntry extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntry> CREATOR = new vh.f(6);

    /* renamed from: f, reason: collision with root package name */
    public final int f31173f;

    /* renamed from: g, reason: collision with root package name */
    public final short f31174g;

    /* renamed from: h, reason: collision with root package name */
    public final short f31175h;

    public UvmEntry(int i13, short s13, short s14) {
        this.f31173f = i13;
        this.f31174g = s13;
        this.f31175h = s14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f31173f == uvmEntry.f31173f && this.f31174g == uvmEntry.f31174g && this.f31175h == uvmEntry.f31175h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31173f), Short.valueOf(this.f31174g), Short.valueOf(this.f31175h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31173f);
        bs1.c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31174g);
        bs1.c.O2(parcel, 3, 4);
        parcel.writeInt(this.f31175h);
        bs1.c.N2(parcel, M2);
    }
}
