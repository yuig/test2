package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import b4.f;
import bs1.c;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements b, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: q, reason: collision with root package name */
    public static final GoogleSignInOptions f30698q;

    /* renamed from: r, reason: collision with root package name */
    public static final Scope f30699r;

    /* renamed from: s, reason: collision with root package name */
    public static final Scope f30700s;

    /* renamed from: t, reason: collision with root package name */
    public static final Scope f30701t;

    /* renamed from: u, reason: collision with root package name */
    public static final f f30702u;

    /* renamed from: f, reason: collision with root package name */
    public final int f30703f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f30704g;

    /* renamed from: h, reason: collision with root package name */
    public final Account f30705h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f30706i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f30707j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f30708k;

    /* renamed from: l, reason: collision with root package name */
    public final String f30709l;

    /* renamed from: m, reason: collision with root package name */
    public final String f30710m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f30711n;

    /* renamed from: o, reason: collision with root package name */
    public final String f30712o;

    /* renamed from: p, reason: collision with root package name */
    public final Map f30713p;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f30699r = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f30700s = scope3;
        f30701t = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f30701t)) {
            Scope scope4 = f30700s;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f30698q = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f30701t)) {
            Scope scope5 = f30700s;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new dh.b(9);
        f30702u = new f(3);
    }

    public GoogleSignInOptions(int i13, ArrayList arrayList, Account account, boolean z13, boolean z14, boolean z15, String str, String str2, Map map, String str3) {
        this.f30703f = i13;
        this.f30704g = arrayList;
        this.f30705h = account;
        this.f30706i = z13;
        this.f30707j = z14;
        this.f30708k = z15;
        this.f30709l = str;
        this.f30710m = str2;
        this.f30711n = new ArrayList(map.values());
        this.f30713p = map;
        this.f30712o = str3;
    }

    public static GoogleSignInOptions e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i13 = 0; i13 < length; i13++) {
            hashSet.add(new Scope(1, jSONArray.getString(i13)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap f(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f30718g), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0047, code lost:
    
        if (r1.equals(r5) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f30709l
            java.util.ArrayList r1 = r8.f30704g
            r2 = 0
            if (r9 != 0) goto L8
            return r2
        L8:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r9 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r9     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r3 = r9.f30704g     // Catch: java.lang.ClassCastException -> L7b
            java.lang.String r4 = r9.f30709l     // Catch: java.lang.ClassCastException -> L7b
            android.accounts.Account r5 = r9.f30705h     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r6 = r8.f30711n     // Catch: java.lang.ClassCastException -> L7b
            boolean r6 = r6.isEmpty()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 == 0) goto L7b
            java.util.ArrayList r6 = r9.f30711n     // Catch: java.lang.ClassCastException -> L7b
            boolean r6 = r6.isEmpty()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 != 0) goto L21
            goto L7b
        L21:
            int r6 = r1.size()     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L7b
            r7.<init>(r3)     // Catch: java.lang.ClassCastException -> L7b
            int r7 = r7.size()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 != r7) goto L7b
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L7b
            r6.<init>(r3)     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.containsAll(r6)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L3c
            goto L7b
        L3c:
            android.accounts.Account r1 = r8.f30705h     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L43
            if (r5 != 0) goto L7b
            goto L49
        L43:
            boolean r1 = r1.equals(r5)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L7b
        L49:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L56
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.ClassCastException -> L7b
            if (r0 == 0) goto L7b
            goto L5d
        L56:
            boolean r0 = r0.equals(r4)     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != 0) goto L5d
            goto L7b
        L5d:
            boolean r0 = r8.f30708k     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.f30708k     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            boolean r0 = r8.f30706i     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.f30706i     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            boolean r0 = r8.f30707j     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.f30707j     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            java.lang.String r0 = r8.f30712o     // Catch: java.lang.ClassCastException -> L7b
            java.lang.String r9 = r9.f30712o     // Catch: java.lang.ClassCastException -> L7b
            boolean r9 = android.text.TextUtils.equals(r0, r9)     // Catch: java.lang.ClassCastException -> L7b
            if (r9 == 0) goto L7b
            r9 = 1
            return r9
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f30704g;
        int size = arrayList2.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(((Scope) arrayList2.get(i13)).f30745g);
        }
        Collections.sort(arrayList);
        int hashCode = arrayList.hashCode() + (1 * 31);
        Account account = this.f30705h;
        int hashCode2 = (hashCode * 31) + (account == null ? 0 : account.hashCode());
        String str = this.f30709l;
        int hashCode3 = (((((((hashCode2 * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.f30708k ? 1 : 0)) * 31) + (this.f30706i ? 1 : 0)) * 31) + (this.f30707j ? 1 : 0);
        String str2 = this.f30712o;
        return (hashCode3 * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30703f);
        c.L2(parcel, 2, new ArrayList(this.f30704g), false);
        c.H2(parcel, 3, this.f30705h, i13, false);
        c.O2(parcel, 4, 4);
        parcel.writeInt(this.f30706i ? 1 : 0);
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f30707j ? 1 : 0);
        c.O2(parcel, 6, 4);
        parcel.writeInt(this.f30708k ? 1 : 0);
        c.I2(parcel, 7, this.f30709l, false);
        c.I2(parcel, 8, this.f30710m, false);
        c.L2(parcel, 9, this.f30711n, false);
        c.I2(parcel, 10, this.f30712o, false);
        c.N2(parcel, M2);
    }
}
