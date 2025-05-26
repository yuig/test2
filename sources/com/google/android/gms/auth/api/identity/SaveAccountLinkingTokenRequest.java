package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new vg.a(28);

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f30644f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30645g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30646h;

    /* renamed from: i, reason: collision with root package name */
    public final List f30647i;

    /* renamed from: j, reason: collision with root package name */
    public final String f30648j;

    /* renamed from: k, reason: collision with root package name */
    public final int f30649k;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i13) {
        this.f30644f = pendingIntent;
        this.f30645g = str;
        this.f30646h = str2;
        this.f30647i = arrayList;
        this.f30648j = str3;
        this.f30649k = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = this.f30647i;
        return list.size() == saveAccountLinkingTokenRequest.f30647i.size() && list.containsAll(saveAccountLinkingTokenRequest.f30647i) && com.bumptech.glide.c.x(this.f30644f, saveAccountLinkingTokenRequest.f30644f) && com.bumptech.glide.c.x(this.f30645g, saveAccountLinkingTokenRequest.f30645g) && com.bumptech.glide.c.x(this.f30646h, saveAccountLinkingTokenRequest.f30646h) && com.bumptech.glide.c.x(this.f30648j, saveAccountLinkingTokenRequest.f30648j) && this.f30649k == saveAccountLinkingTokenRequest.f30649k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30644f, this.f30645g, this.f30646h, this.f30647i, this.f30648j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 1, this.f30644f, i13, false);
        bs1.c.I2(parcel, 2, this.f30645g, false);
        bs1.c.I2(parcel, 3, this.f30646h, false);
        bs1.c.J2(parcel, 4, this.f30647i);
        bs1.c.I2(parcel, 5, this.f30648j, false);
        bs1.c.O2(parcel, 6, 4);
        parcel.writeInt(this.f30649k);
        bs1.c.N2(parcel, M2);
    }
}
