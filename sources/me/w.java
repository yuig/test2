package me;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import df.j1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f87032a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static final String f87033b;

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f87034c;

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f87035d;

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f87036e;

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap f87037f;

    static {
        String simpleName = w.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "UserDataStore::class.java.simpleName");
        f87033b = simpleName;
        f87035d = new AtomicBoolean(false);
        f87036e = new ConcurrentHashMap();
        f87037f = new ConcurrentHashMap();
    }

    public final HashMap a() {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = ne.c.f90435d;
            HashSet hashSet = new HashSet();
            Iterator it = ne.c.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((ne.c) it.next()).c());
            }
            ConcurrentHashMap concurrentHashMap = f87037f;
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    hashMap.put(str, concurrentHashMap.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final synchronized void b() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f87035d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(le.v.a());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            f87034c = defaultSharedPreferences;
            if (defaultSharedPreferences == null) {
                Intrinsics.r("sharedPreferences");
                throw null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = f87034c;
            if (sharedPreferences == null) {
                Intrinsics.r("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f87036e.putAll(j1.i1(string));
            f87037f.putAll(j1.i1(string2));
            atomicBoolean.set(true);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final String c(String str, String str2) {
        String str3;
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i13 = 0;
            boolean z13 = false;
            while (i13 <= length) {
                boolean z14 = Intrinsics.i(str2.charAt(!z13 ? i13 : length), 32) <= 0;
                if (z13) {
                    if (!z14) {
                        break;
                    }
                    length--;
                } else if (z14) {
                    i13++;
                } else {
                    z13 = true;
                }
            }
            String obj = str2.subSequence(i13, length + 1).toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            boolean d2 = Intrinsics.d("em", str);
            String str4 = f87033b;
            if (d2) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(str4, "Setting email failure: this is not a valid email address");
                return "";
            }
            if (Intrinsics.d("ph", str)) {
                return new Regex("[^0-9]").replace(lowerCase, "");
            }
            if (!Intrinsics.d("ge", str)) {
                return lowerCase;
            }
            if (lowerCase.length() <= 0) {
                str3 = "";
            } else {
                if (lowerCase == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                str3 = lowerCase.substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            if (!Intrinsics.d("f", str3) && !Intrinsics.d("m", str3)) {
                Log.e(str4, "Setting gender failure: the supported value for gender is f or m");
                return "";
            }
            return str3;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }
}
