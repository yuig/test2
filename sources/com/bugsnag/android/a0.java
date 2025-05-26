package com.bugsnag.android;

import android.content.Intent;
import android.util.Log;
import com.bugsnag.android.ndk.OpaqueValue;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.io.File;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a0 implements u1, s, ie.a, rd.c {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f29139a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f29140b = new a0();

    public static final String m(String str) {
        HashSet hashSet = me.e.f86979f;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charsetName)");
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes, 0, bytes.length);
            byte[] digest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(digest, "digest.digest()");
            return ue.c.c(digest);
        } catch (UnsupportedEncodingException unused) {
            le.v vVar = le.v.f83104a;
            return SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE;
        } catch (NoSuchAlgorithmException unused2) {
            le.v vVar2 = le.v.f83104a;
            return "0";
        }
    }

    public static final void n(String str) {
        boolean contains;
        HashSet hashSet = me.e.f86979f;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new FacebookException(t3.s1.e(new Object[]{str, 40}, 2, Locale.ROOT, "Identifier '%s' must be less than %d characters", "java.lang.String.format(locale, format, *args)"));
        }
        HashSet hashSet2 = me.e.f86979f;
        synchronized (hashSet2) {
            contains = hashSet2.contains(str);
            Unit unit = Unit.f80348a;
        }
        if (contains) {
            return;
        }
        if (!new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").e(str)) {
            throw new FacebookException(t3.s1.d(new Object[]{str}, 1, "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", "java.lang.String.format(format, *args)"));
        }
        synchronized (hashSet2) {
            hashSet2.add(str);
        }
    }

    public static void o() {
        Date date = AccessToken.f29844l;
        AccessToken s13 = wc.j.s();
        if (s13 == null) {
            return;
        }
        if (wc.j.z()) {
            df.j1.m0(new g4.u(), s13.f29851e);
        } else {
            t(null);
        }
    }

    public static Profile p() {
        return le.j0.f83056d.u().f83060c;
    }

    public static String q(String name, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (jSONObject.has(name)) {
            return jSONObject.getString(name);
        }
        return null;
    }

    public static Object r(Object obj) {
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj;
        }
        boolean z13 = obj instanceof String;
        if (z13) {
            String str = (String) obj;
            if (str.length() < 64) {
                int i13 = 0;
                while (i13 < str.length()) {
                    char charAt = str.charAt(i13);
                    i13++;
                    if (charAt > 127) {
                        byte[] bytes = str.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                        if (bytes.length < 64) {
                            return obj;
                        }
                    }
                }
                return obj;
            }
        }
        if (!z13 && !(obj instanceof Map) && !(obj instanceof Collection) && !(obj instanceof Object[])) {
            return null;
        }
        StringWriter stringWriter = new StringWriter(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
        try {
            o1 o1Var = new o1(stringWriter);
            if (obj instanceof n1) {
                ((n1) obj).toStream(o1Var);
            } else {
                o1Var.f29397h.a(obj, o1Var, false);
            }
            Unit unit = Unit.f80348a;
            dl2.b.J(stringWriter, null);
            return new OpaqueValue(stringWriter.toString());
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                dl2.b.J(stringWriter, th3);
                throw th4;
            }
        }
    }

    public static void s(AuthenticationToken authenticationToken) {
        a0 a0Var = le.k.f83061d;
        le.k kVar = le.k.f83062e;
        if (kVar == null) {
            synchronized (a0Var) {
                kVar = le.k.f83062e;
                if (kVar == null) {
                    z6.c a13 = z6.c.a(le.v.a());
                    Intrinsics.checkNotNullExpressionValue(a13, "getInstance(applicationContext)");
                    le.k kVar2 = new le.k(a13, new le.i());
                    le.k.f83062e = kVar2;
                    kVar = kVar2;
                }
            }
        }
        AuthenticationToken authenticationToken2 = kVar.f83065c;
        kVar.f83065c = authenticationToken;
        le.i iVar = kVar.f83064b;
        if (authenticationToken != null) {
            iVar.getClass();
            Intrinsics.checkNotNullParameter(authenticationToken, "authenticationToken");
            try {
                iVar.f83053a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.a().toString()).apply();
            } catch (JSONException unused) {
            }
        } else {
            iVar.f83053a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
            df.j1.y(le.v.a());
        }
        if (df.j1.p(authenticationToken2, authenticationToken)) {
            return;
        }
        Intent intent = new Intent(le.v.a(), (Class<?>) le.j.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken);
        kVar.f83063a.c(intent);
    }

    public static void t(Profile profile) {
        le.j0.f83056d.u().a(profile, true);
    }

    @Override // com.bugsnag.android.u1
    public void a(String str, Throwable th3) {
        Log.w("Bugsnag", str, th3);
    }

    @Override // com.bugsnag.android.u1
    public void b(String str, Throwable th3) {
        Log.e("Bugsnag", str, th3);
    }

    @Override // com.bugsnag.android.u1
    public void c(String str) {
        Log.i("Bugsnag", str);
    }

    @Override // rd.c
    public void clear() {
    }

    @Override // ie.a
    public Object create() {
        return new pd.f0();
    }

    @Override // com.bugsnag.android.u1
    public void d(String str, Exception exc) {
        Log.d("Bugsnag", str, exc);
    }

    @Override // com.bugsnag.android.s
    public void e() {
    }

    @Override // com.bugsnag.android.u1
    public void f(String str) {
        Log.w("Bugsnag", str);
    }

    @Override // rd.c
    public void g(nd.h hVar, rd.b bVar) {
    }

    @Override // com.bugsnag.android.u1
    public void h(String str) {
        Log.e("Bugsnag", str);
    }

    @Override // com.bugsnag.android.u1
    public void i(String str) {
        Log.d("Bugsnag", str);
    }

    @Override // com.bugsnag.android.s
    public boolean j() {
        return true;
    }

    @Override // com.bugsnag.android.s
    public String k() {
        return "unknown";
    }

    @Override // rd.c
    public File l(nd.h hVar) {
        return null;
    }
}
