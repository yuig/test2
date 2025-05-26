package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class o0 {
    public static final void a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
