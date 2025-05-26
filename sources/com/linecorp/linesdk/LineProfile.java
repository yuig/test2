package com.linecorp.linesdk;

import a.cb;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import oi.e7;

/* loaded from: classes3.dex */
public class LineProfile implements Parcelable {
    public static final Parcelable.Creator<LineProfile> CREATOR = new e7(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f34061a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34062b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f34063c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34064d;

    public LineProfile(Uri uri, String str, String str2, String str3) {
        this.f34061a = str;
        this.f34062b = str2;
        this.f34063c = uri;
        this.f34064d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineProfile lineProfile = (LineProfile) obj;
        if (!this.f34061a.equals(lineProfile.f34061a) || !this.f34062b.equals(lineProfile.f34062b)) {
            return false;
        }
        Uri uri = lineProfile.f34063c;
        Uri uri2 = this.f34063c;
        if (uri2 == null ? uri != null : !uri2.equals(uri)) {
            return false;
        }
        String str = lineProfile.f34064d;
        String str2 = this.f34064d;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public int hashCode() {
        int d2 = cb.d(this.f34062b, this.f34061a.hashCode() * 31, 31);
        Uri uri = this.f34063c;
        int hashCode = (d2 + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f34064d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("LineProfile{userId='");
        sb3.append(this.f34061a);
        sb3.append("', displayName='");
        sb3.append(this.f34062b);
        sb3.append("', pictureUrl=");
        sb3.append(this.f34063c);
        sb3.append(", statusMessage='");
        return a.a.p(sb3, this.f34064d, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f34061a);
        parcel.writeString(this.f34062b);
        parcel.writeParcelable(this.f34063c, i13);
        parcel.writeString(this.f34064d);
    }

    public LineProfile(Parcel parcel) {
        this.f34061a = parcel.readString();
        this.f34062b = parcel.readString();
        this.f34063c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f34064d = parcel.readString();
    }
}
