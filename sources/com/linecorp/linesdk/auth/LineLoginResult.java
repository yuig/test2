package com.linecorp.linesdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.LineProfile;
import java.util.Objects;
import oi.e7;
import rn.c;

/* loaded from: classes3.dex */
public class LineLoginResult implements Parcelable {
    public static final Parcelable.Creator<LineLoginResult> CREATOR = new e7(19);

    /* renamed from: a, reason: collision with root package name */
    public final c f34075a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34076b;

    /* renamed from: c, reason: collision with root package name */
    public final LineProfile f34077c;

    /* renamed from: d, reason: collision with root package name */
    public final LineIdToken f34078d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f34079e;

    /* renamed from: f, reason: collision with root package name */
    public final LineCredential f34080f;

    /* renamed from: g, reason: collision with root package name */
    public final LineApiError f34081g;

    public LineLoginResult(jf2.c cVar) {
        this.f34075a = (c) cVar.f75872a;
        this.f34076b = (String) cVar.f75873b;
        this.f34077c = (LineProfile) cVar.f75874c;
        this.f34078d = (LineIdToken) cVar.f75875d;
        this.f34079e = (Boolean) cVar.f75876e;
        this.f34080f = (LineCredential) cVar.f75877f;
        this.f34081g = (LineApiError) cVar.f75878g;
    }

    public static LineLoginResult a(c cVar, LineApiError lineApiError) {
        jf2.c cVar2 = new jf2.c(7);
        cVar2.f75872a = cVar;
        cVar2.f75878g = lineApiError;
        return new LineLoginResult(cVar2);
    }

    public static LineLoginResult b(String str) {
        return a(c.INTERNAL_ERROR, new LineApiError(str));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineLoginResult)) {
            return false;
        }
        LineLoginResult lineLoginResult = (LineLoginResult) obj;
        if (this.f34075a == lineLoginResult.f34075a && Objects.equals(this.f34076b, lineLoginResult.f34076b) && Objects.equals(this.f34077c, lineLoginResult.f34077c) && Objects.equals(this.f34078d, lineLoginResult.f34078d)) {
            Boolean bool = this.f34079e;
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            Boolean bool2 = lineLoginResult.f34079e;
            if (bool2 == null) {
                bool2 = Boolean.FALSE;
            }
            if (bool.equals(bool2) && Objects.equals(this.f34080f, lineLoginResult.f34080f) && this.f34081g.equals(lineLoginResult.f34081g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f34079e;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        LineCredential lineCredential = this.f34080f;
        LineApiError lineApiError = this.f34081g;
        return Objects.hash(this.f34075a, this.f34076b, this.f34077c, this.f34078d, bool, lineCredential, lineApiError);
    }

    public final String toString() {
        return "LineLoginResult{responseCode=" + this.f34075a + ", nonce='" + this.f34076b + "', lineProfile=" + this.f34077c + ", lineIdToken=" + this.f34078d + ", friendshipStatusChanged=" + this.f34079e + ", lineCredential=" + this.f34080f + ", errorData=" + this.f34081g + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        c cVar = this.f34075a;
        parcel.writeString(cVar != null ? cVar.name() : null);
        parcel.writeString(this.f34076b);
        parcel.writeParcelable(this.f34077c, i13);
        parcel.writeParcelable(this.f34078d, i13);
        parcel.writeValue(this.f34079e);
        parcel.writeParcelable(this.f34080f, i13);
        parcel.writeParcelable(this.f34081g, i13);
    }

    public LineLoginResult(Parcel parcel) {
        String readString = parcel.readString();
        this.f34075a = (c) (readString != null ? Enum.valueOf(c.class, readString) : null);
        this.f34076b = parcel.readString();
        this.f34077c = (LineProfile) parcel.readParcelable(LineProfile.class.getClassLoader());
        this.f34078d = (LineIdToken) parcel.readParcelable(LineIdToken.class.getClassLoader());
        this.f34079e = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.f34080f = (LineCredential) parcel.readParcelable(LineCredential.class.getClassLoader());
        this.f34081g = (LineApiError) parcel.readParcelable(LineApiError.class.getClassLoader());
    }
}
