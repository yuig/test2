package s50;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.Objects;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import t50.b;
import t50.c;
import t50.d;
import t50.e;
import t50.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q f111148a;

    public a(q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f111148a = prefsManagerPersisted;
    }

    public static boolean a(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (Intrinsics.d(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static k3 b(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null) {
            return null;
        }
        String str = resolveActivity.activityInfo.packageName;
        String[] strArr = e.f116434a;
        Intrinsics.f(str);
        if (a(str, strArr)) {
            return new e();
        }
        if (a(str, f.f116435a)) {
            return new f();
        }
        if (a(str, c.f116432a)) {
            return new c();
        }
        if (a(str, d.f116433a)) {
            return new d();
        }
        if (a(str, t50.a.f116430a)) {
            return new t50.a();
        }
        if (a(str, b.f116431a)) {
            return new b();
        }
        return null;
    }

    public final void c(Context context, int i13) {
        if (context == null || i13 < 0) {
            Objects.toString(context);
            return;
        }
        q qVar = this.f111148a;
        int g13 = qVar.g("PREF_APP_BADGE_SUPPORTED_V2", -1);
        if (g13 == -1) {
            k3 b13 = b(context);
            if (b13 == null) {
                qVar.i("PREF_APP_BADGE_SUPPORTED_V2", 0);
                return;
            } else {
                b13.t1(context);
                qVar.i("PREF_APP_BADGE_SUPPORTED_V2", 1);
            }
        } else if (g13 != 1) {
            return;
        }
        k3 b14 = b(context);
        if (b14 != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                b14.Y1(applicationContext, i13);
            } catch (SecurityException e13) {
                e13.getMessage();
            } catch (Exception e14) {
                e14.getMessage();
            }
        }
    }
}
