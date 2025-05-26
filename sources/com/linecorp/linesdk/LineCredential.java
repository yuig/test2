package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import d7.g;
import java.util.ArrayList;
import java.util.List;
import oi.e7;
import rn.j;

/* loaded from: classes3.dex */
public class LineCredential implements Parcelable {
    public static final Parcelable.Creator<LineCredential> CREATOR = new e7(12);

    /* renamed from: a, reason: collision with root package name */
    public final LineAccessToken f34029a;

    /* renamed from: b, reason: collision with root package name */
    public final List f34030b;

    public LineCredential(LineAccessToken lineAccessToken, List list) {
        this.f34029a = lineAccessToken;
        this.f34030b = list;
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
        LineCredential lineCredential = (LineCredential) obj;
        if (this.f34029a.equals(lineCredential.f34029a)) {
            return this.f34030b.equals(lineCredential.f34030b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34030b.hashCode() + (this.f34029a.hashCode() * 31);
    }

    public final String toString() {
        return g.k(new StringBuilder("LineCredential{accessToken=#####, scopes="), this.f34030b, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable(this.f34029a, i13);
        parcel.writeStringList(j.a(this.f34030b));
    }

    public LineCredential(Parcel parcel) {
        this.f34029a = (LineAccessToken) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        ArrayList arrayList = new ArrayList(8);
        parcel.readStringList(arrayList);
        this.f34030b = j.b(arrayList);
    }
}
