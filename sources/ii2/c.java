package ii2;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Looper f72333a;

    /* renamed from: b, reason: collision with root package name */
    public static final Thread f72334b;

    static {
        Looper mainLooper = Looper.getMainLooper();
        f72333a = mainLooper;
        Thread thread = mainLooper.getThread();
        Intrinsics.checkNotNullExpressionValue(thread, "mainLooper.thread");
        f72334b = thread;
    }
}
