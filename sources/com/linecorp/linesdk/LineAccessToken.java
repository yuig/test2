package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import oi.e7;

/* loaded from: classes3.dex */
public class LineAccessToken implements Parcelable {
    public static final Parcelable.Creator<LineAccessToken> CREATOR = new e7(10);

    /* renamed from: a, reason: collision with root package name */
    public final String f34022a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34023b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34024c;

    public LineAccessToken(String str, long j13, long j14) {
        this.f34022a = str;
        this.f34023b = j13;
        this.f34024c = j14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAccessToken lineAccessToken = (LineAccessToken) obj;
        if (this.f34023b == lineAccessToken.f34023b && this.f34024c == lineAccessToken.f34024c) {
            return this.f34022a.equals(lineAccessToken.f34022a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f34022a.hashCode() * 31;
        long j13 = this.f34023b;
        int i13 = (hashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f34024c;
        return i13 + ((int) (j14 ^ (j14 >>> 32)));
    }

    public final String toString() {
        return "LineAccessToken{accessToken='#####', expiresInMillis=" + this.f34023b + ", issuedClientTimeMillis=" + this.f34024c + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f34022a);
        parcel.writeLong(this.f34023b);
        parcel.writeLong(this.f34024c);
    }

    public LineAccessToken(Parcel parcel) {
        this.f34022a = parcel.readString();
        this.f34023b = parcel.readLong();
        this.f34024c = parcel.readLong();
    }
}
