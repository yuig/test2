package t3;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements h {
    public i(Context context) {
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
    }
}
