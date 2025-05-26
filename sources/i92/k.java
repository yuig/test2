package i92;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import le.u;
import m60.w;

/* loaded from: classes2.dex */
public final class k implements a {

    /* renamed from: a, reason: collision with root package name */
    public final m60.e f71937a;

    /* renamed from: b, reason: collision with root package name */
    public final w f71938b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f71939c;

    public k(m60.e applicationInfo, w eventManager, Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f71937a = applicationInfo;
        this.f71938b = eventManager;
        this.f71939c = applicationContext;
        new LinkedHashSet();
    }

    public static void d(k kVar, we0.a aVar) {
        kVar.getClass();
        Intrinsics.f(aVar);
        kVar.f71938b.g(1000L, new h(aVar));
    }

    public static void f(k kVar, String str, int i13, boolean z13, boolean z14, int i14) {
        if ((i14 & 2) != 0) {
            i13 = 7000;
        }
        int i15 = i13;
        boolean z15 = (i14 & 4) != 0 ? false : z13;
        boolean z16 = (i14 & 8) != 0 ? false : z14;
        kVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        j block = new j(str, z15, i15, z16, kVar);
        m60.e eVar = kVar.f71937a;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ((m60.d) eVar).g();
    }

    public static void g(Activity context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null || str.length() == 0) {
            return;
        }
        u uVar = new u(1, context, str);
        if (Intrinsics.d(Looper.getMainLooper(), Looper.myLooper())) {
            uVar.run();
        } else {
            new Handler(Looper.getMainLooper()).post(uVar);
        }
    }

    public final void b(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        f fVar = new f(str, 7000);
        fVar.f129242b = true;
        this.f71938b.d(new i(fVar));
    }

    public final void c(we0.a toast) {
        Intrinsics.checkNotNullParameter(toast, "toast");
        this.f71938b.d(new i(toast));
    }

    public final void e(String str) {
        f(this, str, 0, true, false, 10);
    }

    public final void h(int i13) {
        i(this.f71939c.getResources().getString(i13));
    }

    public final void i(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f71938b.d(new i(new f(str, 7000)));
    }

    public final void j(int i13) {
        String string = this.f71939c.getResources().getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f71938b.f(new i(new f(string, 7000)));
    }

    public final void k(int i13) {
        m(this.f71939c.getResources().getString(i13));
    }

    public final void l(int i13, String substitution) {
        Intrinsics.checkNotNullParameter(substitution, "substitution");
        m(this.f71939c.getResources().getString(i13, substitution));
    }

    public final void m(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f71938b.d(new i(new g(str, 7000)));
    }

    public final void n(int i13) {
        o(this.f71939c.getResources().getString(i13));
    }

    public final void o(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f71938b.d(new i(new g(str, 1500)));
    }
}
