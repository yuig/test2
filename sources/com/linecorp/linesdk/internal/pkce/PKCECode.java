package com.linecorp.linesdk.internal.pkce;

import a.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import oi.e7;

/* loaded from: classes3.dex */
public class PKCECode implements Parcelable {
    public static final Parcelable.Creator<PKCECode> CREATOR = new e7(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f34142a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34143b;

    public PKCECode(String str) {
        this.f34142a = str;
        this.f34143b = a(str);
    }

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PKCECode)) {
            return false;
        }
        PKCECode pKCECode = (PKCECode) obj;
        if (this.f34142a.equals(pKCECode.f34142a)) {
            return this.f34143b.equals(pKCECode.f34143b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34143b.hashCode() + (this.f34142a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PKCECode{verifier='");
        sb3.append(this.f34142a);
        sb3.append("', challenge='");
        return a.p(sb3, this.f34143b, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f34142a);
    }

    public PKCECode(Parcel parcel) {
        String readString = parcel.readString();
        this.f34142a = readString;
        this.f34143b = a(readString);
    }
}
