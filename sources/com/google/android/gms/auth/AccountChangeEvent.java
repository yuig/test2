package com.google.android.gms.auth;

import a.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new b(11);

    /* renamed from: f, reason: collision with root package name */
    public final int f30549f;

    /* renamed from: g, reason: collision with root package name */
    public final long f30550g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30551h;

    /* renamed from: i, reason: collision with root package name */
    public final int f30552i;

    /* renamed from: j, reason: collision with root package name */
    public final int f30553j;

    /* renamed from: k, reason: collision with root package name */
    public final String f30554k;

    public AccountChangeEvent(int i13, long j13, String str, int i14, int i15, String str2) {
        this.f30549f = i13;
        this.f30550g = j13;
        d.t(str);
        this.f30551h = str;
        this.f30552i = i14;
        this.f30553j = i15;
        this.f30554k = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f30549f == accountChangeEvent.f30549f && this.f30550g == accountChangeEvent.f30550g && c.x(this.f30551h, accountChangeEvent.f30551h) && this.f30552i == accountChangeEvent.f30552i && this.f30553j == accountChangeEvent.f30553j && c.x(this.f30554k, accountChangeEvent.f30554k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30549f), Long.valueOf(this.f30550g), this.f30551h, Integer.valueOf(this.f30552i), Integer.valueOf(this.f30553j), this.f30554k});
    }

    public final String toString() {
        int i13 = this.f30552i;
        String str = i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        StringBuilder sb3 = new StringBuilder("AccountChangeEvent {accountName = ");
        a.B(sb3, this.f30551h, ", changeType = ", str, ", changeData = ");
        sb3.append(this.f30554k);
        sb3.append(", eventIndex = ");
        return a.n(sb3, this.f30553j, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30549f);
        bs1.c.O2(parcel, 2, 8);
        parcel.writeLong(this.f30550g);
        bs1.c.I2(parcel, 3, this.f30551h, false);
        bs1.c.O2(parcel, 4, 4);
        parcel.writeInt(this.f30552i);
        bs1.c.O2(parcel, 5, 4);
        parcel.writeInt(this.f30553j);
        bs1.c.I2(parcel, 6, this.f30554k, false);
        bs1.c.N2(parcel, M2);
    }
}
