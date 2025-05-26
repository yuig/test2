package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class WebImage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WebImage> CREATOR = new b(20);

    /* renamed from: f, reason: collision with root package name */
    public final int f30928f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f30929g;

    /* renamed from: h, reason: collision with root package name */
    public final int f30930h;

    /* renamed from: i, reason: collision with root package name */
    public final int f30931i;

    public WebImage(int i13, Uri uri, int i14, int i15) {
        this.f30928f = i13;
        this.f30929g = uri;
        this.f30930h = i14;
        this.f30931i = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (c.x(this.f30929g, webImage.f30929g) && this.f30930h == webImage.f30930h && this.f30931i == webImage.f30931i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30929g, Integer.valueOf(this.f30930h), Integer.valueOf(this.f30931i)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "Image " + this.f30930h + "x" + this.f30931i + " " + this.f30929g.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30928f);
        bs1.c.H2(parcel, 2, this.f30929g, i13, false);
        bs1.c.O2(parcel, 3, 4);
        parcel.writeInt(this.f30930h);
        bs1.c.O2(parcel, 4, 4);
        parcel.writeInt(this.f30931i);
        bs1.c.N2(parcel, M2);
    }
}
