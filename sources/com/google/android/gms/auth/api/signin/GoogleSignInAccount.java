package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b(8);

    /* renamed from: f, reason: collision with root package name */
    public final int f30685f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30686g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30687h;

    /* renamed from: i, reason: collision with root package name */
    public final String f30688i;

    /* renamed from: j, reason: collision with root package name */
    public final String f30689j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f30690k;

    /* renamed from: l, reason: collision with root package name */
    public String f30691l;

    /* renamed from: m, reason: collision with root package name */
    public final long f30692m;

    /* renamed from: n, reason: collision with root package name */
    public final String f30693n;

    /* renamed from: o, reason: collision with root package name */
    public final List f30694o;

    /* renamed from: p, reason: collision with root package name */
    public final String f30695p;

    /* renamed from: q, reason: collision with root package name */
    public final String f30696q;

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f30697r = new HashSet();

    public GoogleSignInAccount(int i13, String str, String str2, String str3, String str4, Uri uri, String str5, long j13, String str6, ArrayList arrayList, String str7, String str8) {
        this.f30685f = i13;
        this.f30686g = str;
        this.f30687h = str2;
        this.f30688i = str3;
        this.f30689j = str4;
        this.f30690k = uri;
        this.f30691l = str5;
        this.f30692m = j13;
        this.f30693n = str6;
        this.f30694o = arrayList;
        this.f30695p = str7;
        this.f30696q = str8;
    }

    public static GoogleSignInAccount e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i13 = 0; i13 < length; i13++) {
            hashSet.add(new Scope(1, jSONArray.getString(i13)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        d.o(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f30691l = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f30693n.equals(this.f30693n)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f30694o);
            hashSet.addAll(googleSignInAccount.f30697r);
            HashSet hashSet2 = new HashSet(this.f30694o);
            hashSet2.addAll(this.f30697r);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f30693n.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f30694o);
        hashSet.addAll(this.f30697r);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30685f);
        c.I2(parcel, 2, this.f30686g, false);
        c.I2(parcel, 3, this.f30687h, false);
        c.I2(parcel, 4, this.f30688i, false);
        c.I2(parcel, 5, this.f30689j, false);
        c.H2(parcel, 6, this.f30690k, i13, false);
        c.I2(parcel, 7, this.f30691l, false);
        c.O2(parcel, 8, 8);
        parcel.writeLong(this.f30692m);
        c.I2(parcel, 9, this.f30693n, false);
        c.L2(parcel, 10, this.f30694o, false);
        c.I2(parcel, 11, this.f30695p, false);
        c.I2(parcel, 12, this.f30696q, false);
        c.N2(parcel, M2);
    }
}
