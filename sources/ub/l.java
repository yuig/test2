package ub;

import android.content.Context;
import android.os.PowerManager;
import kb.b0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f121674a;

    static {
        String h10 = b0.h("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(h10, "tagWithPrefix(\"WakeLocks\")");
        f121674a = h10;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String j13 = a.a.j("WorkManager: ", tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, j13);
        synchronized (m.f121675a) {
        }
        Intrinsics.checkNotNullExpressionValue(wakeLock, "wakeLock");
        return wakeLock;
    }
}
