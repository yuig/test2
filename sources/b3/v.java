package b3;

import android.graphics.Canvas;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f21375a = new v();

    public final void a(@NotNull Canvas canvas, boolean z13) {
        if (z13) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
