package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import df.k1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", "com/bugsnag/android/a0", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class Profile implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Profile> CREATOR;

    /* renamed from: h, reason: collision with root package name */
    public static final String f29917h;

    /* renamed from: a, reason: collision with root package name */
    public final String f29918a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29919b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29920c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29921d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29922e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f29923f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f29924g;

    static {
        Intrinsics.checkNotNullExpressionValue("Profile", "Profile::class.java.simpleName");
        f29917h = "Profile";
        CREATOR = new a(7);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        k1.e(str, "id");
        this.f29918a = str;
        this.f29919b = str2;
        this.f29920c = str3;
        this.f29921d = str4;
        this.f29922e = str5;
        this.f29923f = uri;
        this.f29924g = uri2;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f29918a);
            jSONObject.put("first_name", this.f29919b);
            jSONObject.put("middle_name", this.f29920c);
            jSONObject.put("last_name", this.f29921d);
            jSONObject.put("name", this.f29922e);
            Uri uri = this.f29923f;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.f29924g;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.f29918a;
        return ((str5 == null && ((Profile) obj).f29918a == null) || Intrinsics.d(str5, ((Profile) obj).f29918a)) && (((str = this.f29919b) == null && ((Profile) obj).f29919b == null) || Intrinsics.d(str, ((Profile) obj).f29919b)) && ((((str2 = this.f29920c) == null && ((Profile) obj).f29920c == null) || Intrinsics.d(str2, ((Profile) obj).f29920c)) && ((((str3 = this.f29921d) == null && ((Profile) obj).f29921d == null) || Intrinsics.d(str3, ((Profile) obj).f29921d)) && ((((str4 = this.f29922e) == null && ((Profile) obj).f29922e == null) || Intrinsics.d(str4, ((Profile) obj).f29922e)) && ((((uri = this.f29923f) == null && ((Profile) obj).f29923f == null) || Intrinsics.d(uri, ((Profile) obj).f29923f)) && (((uri2 = this.f29924g) == null && ((Profile) obj).f29924g == null) || Intrinsics.d(uri2, ((Profile) obj).f29924g))))));
    }

    public final int hashCode() {
        String str = this.f29918a;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f29919b;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f29920c;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f29921d;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.f29922e;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f29923f;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f29924g;
        return uri2 != null ? (hashCode * 31) + uri2.hashCode() : hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f29918a);
        dest.writeString(this.f29919b);
        dest.writeString(this.f29920c);
        dest.writeString(this.f29921d);
        dest.writeString(this.f29922e);
        Uri uri = this.f29923f;
        dest.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.f29924g;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    public Profile(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f29918a = jsonObject.optString("id", null);
        this.f29919b = jsonObject.optString("first_name", null);
        this.f29920c = jsonObject.optString("middle_name", null);
        this.f29921d = jsonObject.optString("last_name", null);
        this.f29922e = jsonObject.optString("name", null);
        String optString = jsonObject.optString("link_uri", null);
        this.f29923f = optString == null ? null : Uri.parse(optString);
        String optString2 = jsonObject.optString("picture_uri", null);
        this.f29924g = optString2 != null ? Uri.parse(optString2) : null;
    }

    public Profile(Parcel parcel) {
        this.f29918a = parcel.readString();
        this.f29919b = parcel.readString();
        this.f29920c = parcel.readString();
        this.f29921d = parcel.readString();
        this.f29922e = parcel.readString();
        String readString = parcel.readString();
        this.f29923f = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.f29924g = readString2 != null ? Uri.parse(readString2) : null;
    }
}
