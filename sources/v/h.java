package v;

import J.N;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Log;
import com.pinterest.education.view.EducationPromptView;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.base.ThreadUtils;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123488a;

    public /* synthetic */ h(int i13) {
        this.f123488a = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        se.h hVar;
        Class c13;
        int i13 = this.f123488a;
        se.d dVar = se.d.f112329a;
        ArrayList arrayList = null;
        arrayList = null;
        r5 = null;
        r5 = null;
        r5 = null;
        ue.l lVar = null;
        ArrayList b13 = null;
        switch (i13) {
            case 0:
            case 1:
                return;
            case 2:
                int i14 = z0.f123750g;
                Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                return;
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                me.c.a();
                return;
            case 7:
                String str = me.i.f86987a;
                if (p001if.a.b(me.i.class)) {
                    return;
                }
                try {
                    int i15 = me.j.f86993a;
                    me.j.b(me.i.f86989c);
                    me.i.f86989c = new rd.j(6);
                    return;
                } catch (Throwable th3) {
                    p001if.a.a(me.i.class, th3);
                    return;
                }
            case 8:
                Context context = le.v.a();
                se.h hVar2 = se.h.f112358a;
                ArrayList g13 = se.h.g(context, se.c.f112328g);
                if (g13.isEmpty()) {
                    Object obj = se.c.f112328g;
                    if (!p001if.a.b(se.h.class)) {
                        try {
                            Intrinsics.checkNotNullParameter(context, "context");
                            ArrayList arrayList2 = new ArrayList();
                            if (obj != null && (c13 = (hVar = se.h.f112358a).c(context, "com.android.vending.billing.IInAppBillingService")) != null && hVar.d(c13, "getPurchaseHistory") != null) {
                                arrayList = hVar.b(hVar.e(context, obj));
                            }
                            arrayList = arrayList2;
                        } catch (Throwable th4) {
                            p001if.a.a(se.h.class, th4);
                        }
                    }
                    g13 = arrayList;
                }
                se.c.a(context, g13, false);
                return;
            case 9:
                Context context2 = le.v.a();
                se.h hVar3 = se.h.f112358a;
                se.c.a(context2, se.h.g(context2, se.c.f112328g), false);
                Object obj2 = se.c.f112328g;
                if (!p001if.a.b(se.h.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(context2, "context");
                        se.h hVar4 = se.h.f112358a;
                        b13 = hVar4.b(hVar4.f(context2, obj2, "subs"));
                    } catch (Throwable th5) {
                        p001if.a.a(se.h.class, th5);
                    }
                }
                se.c.a(context2, b13, true);
                return;
            case 10:
                if (p001if.a.b(se.d.class)) {
                    return;
                }
                try {
                    dVar.a();
                    return;
                } catch (Throwable th6) {
                    p001if.a.a(se.d.class, th6);
                    return;
                }
            case 11:
                if (p001if.a.b(se.d.class)) {
                    return;
                }
                try {
                    dVar.a();
                    return;
                } catch (Throwable th7) {
                    p001if.a.a(se.d.class, th7);
                    return;
                }
            case 12:
                if (ue.b.f121943f == null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(le.v.a());
                    long j13 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
                    long j14 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                    if (j13 != 0 && j14 != 0 && string != null) {
                        ue.l lVar2 = new ue.l(Long.valueOf(j13), Long.valueOf(j14));
                        lVar2.f121966d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(le.v.a());
                        lVar2.f121968f = defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage") ? new ue.n(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false)) : null;
                        lVar2.f121967e = Long.valueOf(System.currentTimeMillis());
                        UUID fromString = UUID.fromString(string);
                        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(sessionIDStr)");
                        Intrinsics.checkNotNullParameter(fromString, "<set-?>");
                        lVar2.f121965c = fromString;
                        lVar = lVar2;
                    }
                    ue.b.f121943f = lVar;
                    return;
                }
                return;
            case 13:
                ye.d dVar2 = ye.d.f138825a;
                if (p001if.a.b(ye.d.class)) {
                    return;
                }
                try {
                    AtomicBoolean atomicBoolean = ye.d.f138826b;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    atomicBoolean.set(true);
                    ye.d.f138825a.b();
                    return;
                } catch (Throwable th8) {
                    p001if.a.a(ye.d.class, th8);
                    return;
                }
            case 14:
                int i16 = gf.a.f64858a;
                if (p001if.a.b(gf.a.class)) {
                    return;
                }
                try {
                    Object systemService = le.v.a().getSystemService("activity");
                    if (systemService == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                    }
                    gf.a.a((ActivityManager) systemService);
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th9) {
                    p001if.a.a(gf.a.class, th9);
                    return;
                }
            case 15:
                ig1.b.W0();
                return;
            case 16:
                int i17 = EducationPromptView.f45011f;
                m60.u.f85943a.d(new dg0.c(dg0.b.DISMISS));
                return;
            default:
                if (N.MnfJQqTB()) {
                    if (dp2.l.f56059c == null) {
                        dp2.l.f56059c = new dp2.l();
                    }
                    Object obj3 = ThreadUtils.f97317a;
                    if (dp2.l.f56058b) {
                        return;
                    }
                    Looper.myQueue().addIdleHandler(dp2.l.f56059c);
                    dp2.l.f56058b = true;
                    return;
                }
                if (dp2.l.f56059c != null) {
                    Object obj4 = ThreadUtils.f97317a;
                    if (dp2.l.f56058b) {
                        Looper.myQueue().removeIdleHandler(dp2.l.f56059c);
                        dp2.l.f56058b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
