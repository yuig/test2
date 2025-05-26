package ja;

import android.app.ActivityManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public enum b0 {
    AUTOMATIC,
    TRUNCATE,
    WRITE_AHEAD_LOGGING;

    private final boolean isLowRamDevice(ActivityManager activityManager) {
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }

    @NotNull
    public final b0 resolve$room_runtime_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this != AUTOMATIC) {
            return this;
        }
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
    }
}
