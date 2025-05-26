package fh;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f62131c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f62132d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f62133a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f62134b;

    public a(Context context) {
        this.f62134b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        com.bumptech.glide.d.t(context);
        ReentrantLock reentrantLock = f62131c;
        reentrantLock.lock();
        try {
            if (f62132d == null) {
                f62132d = new a(context.getApplicationContext());
            }
            a aVar = f62132d;
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public static final String g(String str, String str2) {
        return a.a.D(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String e13;
        String e14 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e14) || (e13 = e(g("googleSignInAccount", e14))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.e(e13);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final GoogleSignInOptions c() {
        String e13;
        String e14 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e14) || (e13 = e(g("googleSignInOptions", e14))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.e(e13);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        com.bumptech.glide.d.t(googleSignInOptions);
        String str = googleSignInAccount.f30693n;
        f("defaultGoogleSignInAccount", str);
        String g13 = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f30686g;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f30687h;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f30688i;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f30689j;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f30695p;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f30696q;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f30690k;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f30691l;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f30692m);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f30694o;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, eh.c.f58912a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f30745g);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(g13, jSONObject.toString());
            String g14 = g("googleSignInOptions", str);
            String str9 = googleSignInOptions.f30710m;
            String str10 = googleSignInOptions.f30709l;
            ArrayList arrayList = googleSignInOptions.f30704g;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList, GoogleSignInOptions.f30702u);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f30745g);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f30705h;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f30706i);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f30708k);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f30707j);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                f(g14, jSONObject2.toString());
            } catch (JSONException e13) {
                throw new RuntimeException(e13);
            }
        } catch (JSONException e14) {
            throw new RuntimeException(e14);
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f62133a;
        reentrantLock.lock();
        try {
            return this.f62134b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str, String str2) {
        ReentrantLock reentrantLock = this.f62133a;
        reentrantLock.lock();
        try {
            this.f62134b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
