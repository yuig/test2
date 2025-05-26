package ub;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kb.b0;
import kb.w0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f121664a;

    static {
        String h10 = b0.h("ProcessUtils");
        Intrinsics.checkNotNullExpressionValue(h10, "tagWithPrefix(\"ProcessUtils\")");
        f121664a = h10;
    }

    public static final boolean a(Context context, kb.d configuration) {
        String str;
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            str = o.d.e();
        } else {
            str = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, w0.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                Intrinsics.f(invoke);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th3) {
                b0.e().b(f121664a, "Unable to check ActivityThread for processName", th3);
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
        }
        configuration.getClass();
        return Intrinsics.d(str, context.getApplicationInfo().processName);
    }
}
