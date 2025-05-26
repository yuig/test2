package t3;

import android.view.ViewConfiguration;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final v1 f116234a = new v1();

    public final float a(@NotNull ViewConfiguration viewConfiguration) {
        int scaledHandwritingGestureLineMargin;
        scaledHandwritingGestureLineMargin = viewConfiguration.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }

    public final float b(@NotNull ViewConfiguration viewConfiguration) {
        int scaledHandwritingSlop;
        scaledHandwritingSlop = viewConfiguration.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }
}
