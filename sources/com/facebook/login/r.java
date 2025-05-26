package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f30036d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a, reason: collision with root package name */
    public final String f30037a;

    /* renamed from: b, reason: collision with root package name */
    public final me.r f30038b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30039c;

    public r(Context context, String applicationId) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f30037a = applicationId;
        this.f30038b = new me.r(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.f30039c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(String str) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Bundle b13 = wc.b.b(str);
            b13.putString("2_result", "failure");
            this.f30038b.c("fb_mobile_login_status_complete", b13);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void b(String str, String str2) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Bundle b13 = wc.b.b("");
            b13.putString("2_result", l.ERROR.getLoggingValue());
            b13.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            b13.putString("3_method", str2);
            this.f30038b.c(str, b13);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
