package ue;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import df.u0;
import jk.v;
import kotlin.jvm.internal.Intrinsics;
import le.g0;
import me.p;
import me.r;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f121969a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f121970b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static final void b(String activityName, String str, Context context) {
        me.k u13;
        if (p001if.a.b(m.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            bundle.putString("fb_mobile_pckg_fp", f121969a.a(context));
            bundle.putString("fb_mobile_app_cert_hash", v.m(context));
            wc.b bVar = r.f87019b;
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            me.m mVar = new me.m(activityName, str);
            new r(mVar).b("fb_mobile_activate_app", bundle);
            switch (bVar.f129077a) {
                case 23:
                    u13 = me.m.f86996c.u();
                    break;
                default:
                    u13 = me.m.f86996c.u();
                    break;
            }
            if (u13 == me.k.EXPLICIT_ONLY || p001if.a.b(mVar)) {
                return;
            }
            try {
                String str2 = me.i.f86987a;
                me.i.c(p.EXPLICIT);
            } catch (Throwable th3) {
                p001if.a.a(mVar, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(m.class, th4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:6:0x000f, B:9:0x0015, B:11:0x001b, B:12:0x001f, B:15:0x0029, B:16:0x0031, B:18:0x0035, B:21:0x003a, B:24:0x0049, B:25:0x004d, B:29:0x0081, B:32:0x009f, B:36:0x00a7, B:39:0x00b9, B:42:0x00b5, B:55:0x007d, B:45:0x006c, B:47:0x0072), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #1 {all -> 0x002e, blocks: (B:6:0x000f, B:9:0x0015, B:11:0x001b, B:12:0x001f, B:15:0x0029, B:16:0x0031, B:18:0x0035, B:21:0x003a, B:24:0x0049, B:25:0x004d, B:29:0x0081, B:32:0x009f, B:36:0x00a7, B:39:0x00b9, B:42:0x00b5, B:55:0x007d, B:45:0x006c, B:47:0x0072), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:6:0x000f, B:9:0x0015, B:11:0x001b, B:12:0x001f, B:15:0x0029, B:16:0x0031, B:18:0x0035, B:21:0x003a, B:24:0x0049, B:25:0x004d, B:29:0x0081, B:32:0x009f, B:36:0x00a7, B:39:0x00b9, B:42:0x00b5, B:55:0x007d, B:45:0x006c, B:47:0x0072), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(java.lang.String r19, ue.l r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.m.d(java.lang.String, ue.l, java.lang.String):void");
    }

    public final String a(Context context) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String n13 = Intrinsics.n(packageManager.getPackageInfo(context.getPackageName(), 0).versionName, "PCKGCHKSUM;");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(n13, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String b13 = k.b(context);
            if (b13 == null) {
                b13 = k.a(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
            }
            sharedPreferences.edit().putString(n13, b13).apply();
            return b13;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final void c() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            wc.b bVar = u0.f54860d;
            wc.b.x(g0.APP_EVENTS, "ue.m", "Clock skew detected");
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
