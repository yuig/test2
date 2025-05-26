package com.facebook;

import a.cb;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import df.k1;
import i2.u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import le.a;
import le.g;
import le.g0;
import le.v;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "wc/j", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class AccessToken implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Date f29847a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f29848b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f29849c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f29850d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29851e;

    /* renamed from: f, reason: collision with root package name */
    public final g f29852f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f29853g;

    /* renamed from: h, reason: collision with root package name */
    public final String f29854h;

    /* renamed from: i, reason: collision with root package name */
    public final String f29855i;

    /* renamed from: j, reason: collision with root package name */
    public final Date f29856j;

    /* renamed from: k, reason: collision with root package name */
    public final String f29857k;

    /* renamed from: l, reason: collision with root package name */
    public static final Date f29844l = new Date(Long.MAX_VALUE);

    /* renamed from: m, reason: collision with root package name */
    public static final Date f29845m = new Date();

    /* renamed from: n, reason: collision with root package name */
    public static final g f29846n = g.FACEBOOK_APPLICATION_WEB;

    @NotNull
    public static final Parcelable.Creator<AccessToken> CREATOR = new u1(5);

    public AccessToken(String accessToken, String applicationId, String userId, Collection collection, Collection collection2, Collection collection3, g gVar, Date date, Date date2, Date date3, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        k1.b(accessToken, "accessToken");
        k1.b(applicationId, "applicationId");
        k1.b(userId, "userId");
        Date date4 = f29844l;
        this.f29847a = date == null ? date4 : date;
        Set unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f29848b = unmodifiableSet;
        Set unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f29849c = unmodifiableSet2;
        Set unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f29850d = unmodifiableSet3;
        this.f29851e = accessToken;
        gVar = gVar == null ? f29846n : gVar;
        if (str != null && str.equals("instagram")) {
            int i13 = a.f83001a[gVar.ordinal()];
            if (i13 == 1) {
                gVar = g.INSTAGRAM_APPLICATION_WEB;
            } else if (i13 == 2) {
                gVar = g.INSTAGRAM_CUSTOM_CHROME_TAB;
            } else if (i13 == 3) {
                gVar = g.INSTAGRAM_WEB_VIEW;
            }
        }
        this.f29852f = gVar;
        this.f29853g = date2 == null ? f29845m : date2;
        this.f29854h = applicationId;
        this.f29855i = userId;
        this.f29856j = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.f29857k = str == null ? "facebook" : str;
    }

    /* renamed from: a, reason: from getter */
    public final String getF29857k() {
        return this.f29857k;
    }

    /* renamed from: b, reason: from getter */
    public final String getF29851e() {
        return this.f29851e;
    }

    public final boolean d() {
        return new Date().after(this.f29847a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f29851e);
        jSONObject.put("expires_at", this.f29847a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f29848b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f29849c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f29850d));
        jSONObject.put("last_refresh", this.f29853g.getTime());
        jSONObject.put("source", this.f29852f.name());
        jSONObject.put("application_id", this.f29854h);
        jSONObject.put("user_id", this.f29855i);
        jSONObject.put("data_access_expiration_time", this.f29856j.getTime());
        String str = this.f29857k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (Intrinsics.d(this.f29847a, accessToken.f29847a) && Intrinsics.d(this.f29848b, accessToken.f29848b) && Intrinsics.d(this.f29849c, accessToken.f29849c) && Intrinsics.d(this.f29850d, accessToken.f29850d) && Intrinsics.d(this.f29851e, accessToken.f29851e) && this.f29852f == accessToken.f29852f && Intrinsics.d(this.f29853g, accessToken.f29853g) && Intrinsics.d(this.f29854h, accessToken.f29854h) && Intrinsics.d(this.f29855i, accessToken.f29855i) && Intrinsics.d(this.f29856j, accessToken.f29856j)) {
            String str = this.f29857k;
            String str2 = accessToken.f29857k;
            if (str == null) {
                if (str2 == null) {
                    return true;
                }
            } else if (Intrinsics.d(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f29856j.hashCode() + cb.d(this.f29855i, cb.d(this.f29854h, (this.f29853g.hashCode() + ((this.f29852f.hashCode() + cb.d(this.f29851e, (this.f29850d.hashCode() + ((this.f29849c.hashCode() + ((this.f29848b.hashCode() + ((this.f29847a.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31, 31), 31)) * 31;
        String str = this.f29857k;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        v vVar = v.f83104a;
        v.i(g0.INCLUDE_ACCESS_TOKENS);
        sb3.append(TextUtils.join(", ", this.f29848b));
        sb3.append("]}");
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "builder.toString()");
        return sb4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f29847a.getTime());
        dest.writeStringList(new ArrayList(this.f29848b));
        dest.writeStringList(new ArrayList(this.f29849c));
        dest.writeStringList(new ArrayList(this.f29850d));
        dest.writeString(this.f29851e);
        dest.writeString(this.f29852f.name());
        dest.writeLong(this.f29853g.getTime());
        dest.writeString(this.f29854h);
        dest.writeString(this.f29855i);
        dest.writeLong(this.f29856j.getTime());
        dest.writeString(this.f29857k);
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, g gVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, gVar, date, date2, date3, "facebook");
    }

    public AccessToken(Parcel parcel) {
        g gVar;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f29847a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f29848b = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f29849c = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f29850d = unmodifiableSet3;
        String readString = parcel.readString();
        k1.e(readString, "token");
        this.f29851e = readString;
        String readString2 = parcel.readString();
        if (readString2 != null) {
            gVar = g.valueOf(readString2);
        } else {
            gVar = f29846n;
        }
        this.f29852f = gVar;
        this.f29853g = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        k1.e(readString3, "applicationId");
        this.f29854h = readString3;
        String readString4 = parcel.readString();
        k1.e(readString4, "userId");
        this.f29855i = readString4;
        this.f29856j = new Date(parcel.readLong());
        this.f29857k = parcel.readString();
    }
}
