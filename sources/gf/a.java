package gf;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kh2.g0;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import v.h;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f64858a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f64859b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c, reason: collision with root package name */
    public static String f64860c = "";

    /* renamed from: d, reason: collision with root package name */
    public static final h f64861d = new h(14);

    public static final void a(ActivityManager activityManager) {
        if (p001if.a.b(a.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState == null) {
                return;
            }
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f64858a) {
                    Thread thread = Looper.getMainLooper().getThread();
                    Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
                    Intrinsics.checkNotNullParameter(thread, "thread");
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    JSONArray jSONArray = new JSONArray();
                    Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
                    int length = stackTrace.length;
                    int i13 = 0;
                    while (i13 < length) {
                        StackTraceElement stackTraceElement = stackTrace[i13];
                        i13++;
                        jSONArray.put(stackTraceElement.toString());
                    }
                    String jSONArray2 = jSONArray.toString();
                    if (!Intrinsics.d(jSONArray2, f64860c) && m0.I0(thread)) {
                        f64860c = jSONArray2;
                        g0.f(processErrorStateInfo.shortMsg, jSONArray2).b();
                    }
                }
            }
        } catch (Throwable th3) {
            p001if.a.a(a.class, th3);
        }
    }
}
