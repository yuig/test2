package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lh.a;

/* loaded from: classes3.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new a(4);

    /* renamed from: f, reason: collision with root package name */
    public final int f30997f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30998g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f30999h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f31000i;

    /* renamed from: j, reason: collision with root package name */
    public final int f31001j;

    public ModuleInstallStatusUpdate(int i13, int i14, Long l13, Long l14, int i15) {
        this.f30997f = i13;
        this.f30998g = i14;
        this.f30999h = l13;
        this.f31000i = l14;
        this.f31001j = i15;
        if (l13 != null && l14 != null && l14.longValue() != 0 && l14.longValue() == 0) {
            throw new IllegalArgumentException("Given Long is zero");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30997f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30998g);
        c.G2(parcel, 3, this.f30999h);
        c.G2(parcel, 4, this.f31000i);
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f31001j);
        c.N2(parcel, M2);
    }
}
