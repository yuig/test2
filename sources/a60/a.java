package a60;

import a.cb;
import android.content.Context;
import android.content.SharedPreferences;
import df.j1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import nm.u;
import vd0.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f905a = new a();

    public static SharedPreferences a(Context context) {
        if (context == null) {
            Context context2 = kb0.a.f79058b;
            context = f0.W();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("PREF_MY_USER_USER_ACCOUNTS_4", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public static String b() {
        Context context = kb0.a.f79058b;
        SharedPreferences sharedPreferences = f0.W().getSharedPreferences("PREF_ACCUNT_SWITCHER_GROUP_ID", 0);
        if (sharedPreferences.contains("PREF_ACCUNT_SWITCHER_GROUP_ID")) {
            String string = sharedPreferences.getString("PREF_ACCUNT_SWITCHER_GROUP_ID", "");
            return string == null ? "" : string;
        }
        String g13 = cb.g("toString(...)");
        sharedPreferences.edit().putString("PREF_ACCUNT_SWITCHER_GROUP_ID", g13).apply();
        return g13;
    }

    public final void c(String userUid, c60.a authToken) {
        Intrinsics.checkNotNullParameter(userUid, "userUid");
        Intrinsics.checkNotNullParameter(authToken, "authToken");
        SharedPreferences a13 = a(null);
        String string = a13.getString(userUid, null);
        if (string != null) {
            u i13 = j1.p1(string).i();
            i13.u("PREF_ACCESSTOKEN", authToken.f26507a);
            i13.u("PREF_V5_ACCESS_TOKEN", authToken.f26508b);
            i13.u("PREF_V5_REFRESH_TOKEN", authToken.f26509c);
            a13.edit().putString(userUid, i13.toString()).apply();
        }
    }

    public final void d(String userUid) {
        Intrinsics.checkNotNullParameter(userUid, "userUid");
        a(null).edit().remove(userUid).commit();
    }

    public final void e(c60.a authToken, String userUid, c userJson) {
        Intrinsics.checkNotNullParameter(authToken, "authToken");
        Intrinsics.checkNotNullParameter(userUid, "userUid");
        Intrinsics.checkNotNullParameter(userJson, "userJson");
        SharedPreferences.Editor edit = a(null).edit();
        u uVar = new u();
        uVar.u("PREF_ACCESSTOKEN", authToken.f26507a);
        uVar.u("PREF_V5_ACCESS_TOKEN", authToken.f26508b);
        uVar.u("PREF_V5_REFRESH_TOKEN", authToken.f26509c);
        uVar.r("PREF_MY_USER_OBJECT", userJson.f125623a);
        uVar.u("PREF_ACCUNT_SWITCHER_GROUP_ID", b());
        Unit unit = Unit.f80348a;
        edit.putString(userUid, uVar.toString()).apply();
    }
}
