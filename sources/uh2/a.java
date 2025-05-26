package uh2;

import android.content.SharedPreferences;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import xh2.d;

/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f122252a;

    /* renamed from: b, reason: collision with root package name */
    public final og2.a f122253b;

    /* renamed from: c, reason: collision with root package name */
    public final d f122254c;

    public a(SharedPreferences prefs, og2.a clock, d serializer) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f122252a = prefs;
        this.f122253b = clock;
        this.f122254c = serializer;
    }

    public static void d(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public final String a() {
        SharedPreferences sharedPreferences = this.f122252a;
        String string = sharedPreferences.getString("io.embrace.deviceid", null);
        if (string != null) {
            return string;
        }
        String value = kh2.d.x();
        Intrinsics.checkNotNullParameter(value, "value");
        d(sharedPreferences, "io.embrace.deviceid", value);
        return value;
    }

    public final int b(String str) {
        SharedPreferences sharedPreferences = this.f122252a;
        try {
            int i13 = sharedPreferences.getInt(str, -1);
            Integer valueOf = i13 == -1 ? null : Integer.valueOf(i13);
            int intValue = (valueOf != null ? valueOf.intValue() : 0) + 1;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, intValue);
            edit.apply();
            return intValue;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final void c(Map map) {
        SharedPreferences.Editor edit = this.f122252a.edit();
        edit.putString("io.embrace.session.properties", map != null ? this.f122254c.c(Map.class, map) : null);
        edit.apply();
    }
}
