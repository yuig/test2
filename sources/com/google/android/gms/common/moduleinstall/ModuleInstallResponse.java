package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lh.a;

/* loaded from: classes3.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public final int f30995f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30996g;

    public ModuleInstallResponse(int i13, boolean z13) {
        this.f30995f = i13;
        this.f30996g = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30995f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30996g ? 1 : 0);
        c.N2(parcel, M2);
    }
}
