package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new dh.b(17);

    /* renamed from: f, reason: collision with root package name */
    public final int f30744f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30745g;

    public Scope(int i13, String str) {
        com.bumptech.glide.d.p("scopeUri must not be null or empty", str);
        this.f30744f = i13;
        this.f30745g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f30745g.equals(((Scope) obj).f30745g);
    }

    public final int hashCode() {
        return this.f30745g.hashCode();
    }

    public final String toString() {
        return this.f30745g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30744f);
        bs1.c.I2(parcel, 2, this.f30745g, false);
        bs1.c.N2(parcel, M2);
    }
}
