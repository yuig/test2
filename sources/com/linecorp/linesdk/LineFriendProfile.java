package com.linecorp.linesdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import oi.e7;

/* loaded from: classes3.dex */
public class LineFriendProfile extends LineProfile {
    public static final Parcelable.Creator<LineFriendProfile> CREATOR = new e7(13);

    /* renamed from: e, reason: collision with root package name */
    public final String f34031e;

    public LineFriendProfile(String str, String str2, Uri uri, String str3, String str4) {
        super(uri, str, str2, str3);
        this.f34031e = str4;
    }

    @Override // com.linecorp.linesdk.LineProfile
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineFriendProfile) || !super.equals(obj)) {
            return false;
        }
        String str = this.f34031e;
        String str2 = ((LineFriendProfile) obj).f34031e;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // com.linecorp.linesdk.LineProfile
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f34031e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.linecorp.linesdk.LineProfile
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LineFriendProfile{userId='");
        sb3.append(this.f34061a);
        sb3.append("', displayName='");
        sb3.append(this.f34062b);
        sb3.append("', pictureUrl=");
        sb3.append(this.f34063c);
        sb3.append(", statusMessage='");
        sb3.append(this.f34064d);
        sb3.append("', overriddenDisplayName='");
        return a.a.p(sb3, this.f34031e, "'}");
    }

    @Override // com.linecorp.linesdk.LineProfile, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeString(this.f34031e);
    }

    public LineFriendProfile(Parcel parcel) {
        super(parcel);
        this.f34031e = parcel.readString();
    }
}
