package n3;

import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f89055a = new g();

    public final long a(@NotNull MotionEvent motionEvent, int i13) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i13);
        rawY = motionEvent.getRawY(i13);
        return com.bumptech.glide.c.d(rawX, rawY);
    }
}
