package oc2;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k {
    public static void a(View animatingView, int i13, Function1 visibilitySuperCall) {
        Intrinsics.checkNotNullParameter(animatingView, "animatingView");
        Intrinsics.checkNotNullParameter(visibilitySuperCall, "visibilitySuperCall");
        int visibility = animatingView.getVisibility();
        if (visibility == 4 || visibility == 8) {
            visibilitySuperCall.invoke(Integer.valueOf(i13));
        }
        boolean z13 = i13 == 4 || i13 == 8;
        float f13 = z13 ? 0.0f : 1.0f;
        animatingView.animate().alpha(f13).setDuration(z13 ? 350L : 200L).setListener(new gq.d(animatingView, f13, visibilitySuperCall, i13)).start();
    }
}
