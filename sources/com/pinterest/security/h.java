package com.pinterest.security;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import ao2.v0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.recaptcha.r1;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.messaging.a0;
import com.pinterest.security.RecaptchaException;
import dl1.b0;
import fk2.f0;
import fn1.k;
import jk.v;
import kk2.m;
import kl2.l;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.k3;
import lh0.x2;
import lh0.z3;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final RecaptchaAction f51752a = RecaptchaAction.LOGIN;

    /* renamed from: b, reason: collision with root package name */
    public static final RecaptchaAction f51753b = RecaptchaAction.SIGNUP;

    /* renamed from: c, reason: collision with root package name */
    public static final RecaptchaAction f51754c;

    /* renamed from: d, reason: collision with root package name */
    public static final RecaptchaAction f51755d;

    /* renamed from: e, reason: collision with root package name */
    public static final RecaptchaAction f51756e;

    static {
        RecaptchaAction.Companion companion = RecaptchaAction.INSTANCE;
        f51754c = companion.custom("auth");
        f51755d = companion.custom("android_change_password");
        f51756e = companion.custom("android_reset_password");
    }

    public static final void a(qi.a aVar, RecaptchaHandle recaptchaHandle, String str, l lVar) {
        r1 r1Var = (r1) aVar;
        r1Var.getClass();
        q a13 = r.a();
        a13.f30859c = new ck2.a(r1Var, recaptchaHandle, 1);
        a13.f30860d = new Feature[]{qi.b.f103967c};
        r1Var.d(0, a13.a()).addOnFailureListener(new androidx.fragment.app.c(15, lVar, str));
    }

    public static kk2.b b(Context context) {
        ko2.f fVar = v0.f20219a;
        return v.c0(ko2.e.f80326c, new d(context, null));
    }

    public static f0 c(Context context, RecaptchaAction action, ox.b bVar, String userId, l fnLogEvent) {
        m mVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(fnLogEvent, "fnLogEvent");
        fnLogEvent.invoke("recaptcha_verify", action.getAction(), "attempt");
        vb0.e eVar = k3.f83404b;
        if (k3.f83405c == null) {
            eVar.f().invoke();
            eVar.g(x2.f83506k);
        }
        k3 k3Var = k3.f83405c;
        if (k3Var == null) {
            Intrinsics.r("INSTANCE");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) k3Var.f83407a;
        int i13 = 1;
        if (g1Var.o("android_recaptcha_library_migration", "enabled", z3Var) || g1Var.l("android_recaptcha_library_migration")) {
            mVar = new m(d(context).c(b(context)), new b0(29, new k(action, bVar, userId, 12)), 0);
        } else {
            uj2.b d2 = d(context);
            kk2.b bVar2 = new kk2.b(new a0(context, 25), 0);
            Intrinsics.checkNotNullExpressionValue(bVar2, "create(...)");
            mVar = new m(new m(d2.c(bVar2), new r42.k(0, new br1.a0(4, bVar, userId)), 0), new r42.k(1, new j1.a(action, bVar, fnLogEvent, userId, 5)), 0);
        }
        f0 f0Var = new f0(mVar, new androidx.fragment.app.c(i13, fnLogEvent, action), null, 2);
        Intrinsics.checkNotNullExpressionValue(f0Var, "onErrorReturn(...)");
        return f0Var;
    }

    public static uj2.b d(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return uj2.b.g(new RecaptchaException.PlayServicesNotAvailable(null));
        }
        return (Build.VERSION.SDK_INT >= 28 ? o.d.c(packageInfo) : (long) packageInfo.versionCode) >= 19629030 ? fk2.m.f62459a : uj2.b.g(new RecaptchaException.UnsupportedPlayServicesVersion(null));
    }
}
