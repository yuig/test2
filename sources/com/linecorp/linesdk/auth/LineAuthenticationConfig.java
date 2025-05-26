package com.linecorp.linesdk.auth;

import a.cb;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import oi.e7;
import un.a;

/* loaded from: classes3.dex */
public class LineAuthenticationConfig implements Parcelable {
    public static final Parcelable.Creator<LineAuthenticationConfig> CREATOR = new e7(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f34065a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f34066b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f34067c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f34068d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34069e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34070f;

    public LineAuthenticationConfig(a aVar) {
        this.f34065a = aVar.f122813a;
        this.f34066b = aVar.f122814b;
        this.f34067c = aVar.f122815c;
        this.f34068d = aVar.f122816d;
        this.f34069e = aVar.f122817e;
        this.f34070f = false;
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
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) obj;
        if (this.f34069e == lineAuthenticationConfig.f34069e && this.f34070f == lineAuthenticationConfig.f34070f && this.f34065a.equals(lineAuthenticationConfig.f34065a) && this.f34066b.equals(lineAuthenticationConfig.f34066b) && this.f34067c.equals(lineAuthenticationConfig.f34067c)) {
            return this.f34068d.equals(lineAuthenticationConfig.f34068d);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f34068d.hashCode() + ((this.f34067c.hashCode() + ((this.f34066b.hashCode() + (this.f34065a.hashCode() * 31)) * 31)) * 31)) * 31) + (this.f34069e ? 1 : 0)) * 31) + (this.f34070f ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LineAuthenticationConfig{channelId='");
        sb3.append(this.f34065a);
        sb3.append("', openidDiscoveryDocumentUrl=");
        sb3.append(this.f34066b);
        sb3.append(", apiBaseUrl=");
        sb3.append(this.f34067c);
        sb3.append(", webLoginPageUrl=");
        sb3.append(this.f34068d);
        sb3.append(", isLineAppAuthenticationDisabled=");
        sb3.append(this.f34069e);
        sb3.append(", isEncryptorPreparationDisabled=");
        return cb.m(sb3, this.f34070f, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f34065a);
        parcel.writeParcelable(this.f34066b, i13);
        parcel.writeParcelable(this.f34067c, i13);
        parcel.writeParcelable(this.f34068d, i13);
        parcel.writeInt((this.f34070f ? 2 : 0) | (this.f34069e ? 1 : 0));
    }

    public LineAuthenticationConfig(Parcel parcel) {
        this.f34065a = parcel.readString();
        this.f34066b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f34067c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f34068d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        int readInt = parcel.readInt();
        this.f34069e = (readInt & 1) > 0;
        this.f34070f = (readInt & 2) > 0;
    }
}
