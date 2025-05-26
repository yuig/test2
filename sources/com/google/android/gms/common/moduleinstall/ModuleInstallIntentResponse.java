package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lh.a;

/* loaded from: classes3.dex */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new a(2);

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f30994f;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.f30994f = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.H2(parcel, 1, this.f30994f, i13, false);
        c.N2(parcel, M2);
    }
}
