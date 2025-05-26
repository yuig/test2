package com.linecorp.linesdk;

import a.cb;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import oi.e7;

/* loaded from: classes3.dex */
public class LineGroup implements Parcelable {
    public static final Parcelable.Creator<LineGroup> CREATOR = new e7(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f34032a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34033b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f34034c;

    public LineGroup(Uri uri, String str, String str2) {
        this.f34032a = str;
        this.f34033b = str2;
        this.f34034c = uri;
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
        LineGroup lineGroup = (LineGroup) obj;
        if (!this.f34032a.equals(lineGroup.f34032a) || !this.f34033b.equals(lineGroup.f34033b)) {
            return false;
        }
        Uri uri = lineGroup.f34034c;
        Uri uri2 = this.f34034c;
        return uri2 == null ? uri == null : uri2.equals(uri);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f34033b, this.f34032a.hashCode() * 31, 31);
        Uri uri = this.f34034c;
        return d2 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "LineProfile{groupName='" + this.f34033b + "', groupId='" + this.f34032a + "', pictureUrl='" + this.f34034c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f34032a);
        parcel.writeString(this.f34033b);
        parcel.writeParcelable(this.f34034c, i13);
    }

    public LineGroup(Parcel parcel) {
        this.f34032a = parcel.readString();
        this.f34033b = parcel.readString();
        this.f34034c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
