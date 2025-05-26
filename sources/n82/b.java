package n82;

import android.app.Activity;
import android.os.Looper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Activity f89936a;

    public final void a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("Must be called on the main thread");
        }
        Activity activity = this.f89936a;
        if (activity == null) {
            throw new IllegalStateException("No activity available".toString());
        }
        block.invoke(activity);
    }
}
