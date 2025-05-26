package ib;

import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q5.a2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f72010a = new a();

    @NotNull
    public final a2 a(@NotNull Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        Intrinsics.checkNotNullParameter(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        Intrinsics.checkNotNullExpressionValue(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        a2 i13 = a2.i(null, windowInsets);
        Intrinsics.checkNotNullExpressionValue(i13, "toWindowInsetsCompat(platformInsets)");
        return i13;
    }
}
