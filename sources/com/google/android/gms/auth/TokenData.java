package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenData> CREATOR = new b(14);

    /* renamed from: f, reason: collision with root package name */
    public final int f30561f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30562g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f30563h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f30564i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f30565j;

    /* renamed from: k, reason: collision with root package name */
    public final List f30566k;

    /* renamed from: l, reason: collision with root package name */
    public final String f30567l;

    public TokenData(int i13, String str, Long l13, boolean z13, boolean z14, ArrayList arrayList, String str2) {
        this.f30561f = i13;
        d.o(str);
        this.f30562g = str;
        this.f30563h = l13;
        this.f30564i = z13;
        this.f30565j = z14;
        this.f30566k = arrayList;
        this.f30567l = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f30562g, tokenData.f30562g) && c.x(this.f30563h, tokenData.f30563h) && this.f30564i == tokenData.f30564i && this.f30565j == tokenData.f30565j && c.x(this.f30566k, tokenData.f30566k) && c.x(this.f30567l, tokenData.f30567l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30562g, this.f30563h, Boolean.valueOf(this.f30564i), Boolean.valueOf(this.f30565j), this.f30566k, this.f30567l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30561f);
        bs1.c.I2(parcel, 2, this.f30562g, false);
        bs1.c.G2(parcel, 3, this.f30563h);
        bs1.c.O2(parcel, 4, 4);
        parcel.writeInt(this.f30564i ? 1 : 0);
        bs1.c.O2(parcel, 5, 4);
        parcel.writeInt(this.f30565j ? 1 : 0);
        bs1.c.J2(parcel, 6, this.f30566k);
        bs1.c.I2(parcel, 7, this.f30567l, false);
        bs1.c.N2(parcel, M2);
    }
}
