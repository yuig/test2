package t3;

import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public static final z2 f116289a = new z2();

    public final boolean a(@NotNull MotionEvent motionEvent, int i13) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i13);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            rawY = motionEvent.getRawY(i13);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
