package com.facebook;

import a.cb;
import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import df.k1;
import io.jsonwebtoken.Claims;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable;", "com/bugsnag/android/a0", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class AuthenticationTokenClaims implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new a(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f29863a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29864b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29865c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29866d;

    /* renamed from: e, reason: collision with root package name */
    public final long f29867e;

    /* renamed from: f, reason: collision with root package name */
    public final long f29868f;

    /* renamed from: g, reason: collision with root package name */
    public final String f29869g;

    /* renamed from: h, reason: collision with root package name */
    public final String f29870h;

    /* renamed from: i, reason: collision with root package name */
    public final String f29871i;

    /* renamed from: j, reason: collision with root package name */
    public final String f29872j;

    /* renamed from: k, reason: collision with root package name */
    public final String f29873k;

    /* renamed from: l, reason: collision with root package name */
    public final String f29874l;

    /* renamed from: m, reason: collision with root package name */
    public final String f29875m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f29876n;

    /* renamed from: o, reason: collision with root package name */
    public final String f29877o;

    /* renamed from: p, reason: collision with root package name */
    public final Map f29878p;

    /* renamed from: q, reason: collision with root package name */
    public final Map f29879q;

    /* renamed from: r, reason: collision with root package name */
    public final Map f29880r;

    /* renamed from: s, reason: collision with root package name */
    public final String f29881s;

    /* renamed from: t, reason: collision with root package name */
    public final String f29882t;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(new java.net.URL(r1).getHost(), "www.facebook.com") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AuthenticationTokenClaims(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.<init>(java.lang.String, java.lang.String):void");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Claims.ID, this.f29863a);
        jSONObject.put(Claims.ISSUER, this.f29864b);
        jSONObject.put(Claims.AUDIENCE, this.f29865c);
        jSONObject.put("nonce", this.f29866d);
        jSONObject.put(Claims.EXPIRATION, this.f29867e);
        jSONObject.put(Claims.ISSUED_AT, this.f29868f);
        String str = this.f29869g;
        if (str != null) {
            jSONObject.put(Claims.SUBJECT, str);
        }
        String str2 = this.f29870h;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f29871i;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f29872j;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f29873k;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f29874l;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f29875m;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set set = this.f29876n;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.f29877o;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map map = this.f29878p;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map map2 = this.f29879q;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map map3 = this.f29880r;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.f29881s;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f29882t;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        return Intrinsics.d(this.f29863a, authenticationTokenClaims.f29863a) && Intrinsics.d(this.f29864b, authenticationTokenClaims.f29864b) && Intrinsics.d(this.f29865c, authenticationTokenClaims.f29865c) && Intrinsics.d(this.f29866d, authenticationTokenClaims.f29866d) && this.f29867e == authenticationTokenClaims.f29867e && this.f29868f == authenticationTokenClaims.f29868f && Intrinsics.d(this.f29869g, authenticationTokenClaims.f29869g) && Intrinsics.d(this.f29870h, authenticationTokenClaims.f29870h) && Intrinsics.d(this.f29871i, authenticationTokenClaims.f29871i) && Intrinsics.d(this.f29872j, authenticationTokenClaims.f29872j) && Intrinsics.d(this.f29873k, authenticationTokenClaims.f29873k) && Intrinsics.d(this.f29874l, authenticationTokenClaims.f29874l) && Intrinsics.d(this.f29875m, authenticationTokenClaims.f29875m) && Intrinsics.d(this.f29876n, authenticationTokenClaims.f29876n) && Intrinsics.d(this.f29877o, authenticationTokenClaims.f29877o) && Intrinsics.d(this.f29878p, authenticationTokenClaims.f29878p) && Intrinsics.d(this.f29879q, authenticationTokenClaims.f29879q) && Intrinsics.d(this.f29880r, authenticationTokenClaims.f29880r) && Intrinsics.d(this.f29881s, authenticationTokenClaims.f29881s) && Intrinsics.d(this.f29882t, authenticationTokenClaims.f29882t);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f29869g, a.a.c(this.f29868f, a.a.c(this.f29867e, cb.d(this.f29866d, cb.d(this.f29865c, cb.d(this.f29864b, cb.d(this.f29863a, 527, 31), 31), 31), 31), 31), 31), 31);
        String str = this.f29870h;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f29871i;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f29872j;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f29873k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f29874l;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f29875m;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set set = this.f29876n;
        int hashCode7 = (hashCode6 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.f29877o;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map map = this.f29878p;
        int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f29879q;
        int hashCode10 = (hashCode9 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f29880r;
        int hashCode11 = (hashCode10 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.f29881s;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f29882t;
        return hashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String jSONObject = a().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f29863a);
        dest.writeString(this.f29864b);
        dest.writeString(this.f29865c);
        dest.writeString(this.f29866d);
        dest.writeLong(this.f29867e);
        dest.writeLong(this.f29868f);
        dest.writeString(this.f29869g);
        dest.writeString(this.f29870h);
        dest.writeString(this.f29871i);
        dest.writeString(this.f29872j);
        dest.writeString(this.f29873k);
        dest.writeString(this.f29874l);
        dest.writeString(this.f29875m);
        Set set = this.f29876n;
        if (set == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(set));
        }
        dest.writeString(this.f29877o);
        dest.writeMap(this.f29878p);
        dest.writeMap(this.f29879q);
        dest.writeMap(this.f29880r);
        dest.writeString(this.f29881s);
        dest.writeString(this.f29882t);
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        k1.e(readString, Claims.ID);
        this.f29863a = readString;
        String readString2 = parcel.readString();
        k1.e(readString2, Claims.ISSUER);
        this.f29864b = readString2;
        String readString3 = parcel.readString();
        k1.e(readString3, Claims.AUDIENCE);
        this.f29865c = readString3;
        String readString4 = parcel.readString();
        k1.e(readString4, "nonce");
        this.f29866d = readString4;
        this.f29867e = parcel.readLong();
        this.f29868f = parcel.readLong();
        String readString5 = parcel.readString();
        k1.e(readString5, Claims.SUBJECT);
        this.f29869g = readString5;
        this.f29870h = parcel.readString();
        this.f29871i = parcel.readString();
        this.f29872j = parcel.readString();
        this.f29873k = parcel.readString();
        this.f29874l = parcel.readString();
        this.f29875m = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.f29876n = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f29877o = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(q.f80441a.getClass().getClassLoader());
        readHashMap = readHashMap instanceof HashMap ? readHashMap : null;
        this.f29878p = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        HashMap readHashMap2 = parcel.readHashMap(o0.f80439a.getClass().getClassLoader());
        readHashMap2 = readHashMap2 instanceof HashMap ? readHashMap2 : null;
        this.f29879q = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(o0.class.getClassLoader());
        readHashMap3 = readHashMap3 instanceof HashMap ? readHashMap3 : null;
        this.f29880r = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.f29881s = parcel.readString();
        this.f29882t = parcel.readString();
    }
}
