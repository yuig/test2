package o;

import android.app.Application;
import android.app.job.JobParameters;
import android.content.pm.PackageInfo;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static long c(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Network d(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }

    public static String e() {
        String processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
        return processName;
    }

    public static boolean f(Handler handler, Runnable runnable, String str, long j13) {
        return handler.postDelayed(runnable, str, j13);
    }
}
