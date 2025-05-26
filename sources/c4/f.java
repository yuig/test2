package c4;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f25633a = new f();

    public final boolean a(@NotNull Canvas canvas, @NotNull Path path) {
        return canvas.clipOutPath(path);
    }

    public final boolean b(@NotNull Canvas canvas, float f13, float f14, float f15, float f16) {
        return canvas.clipOutRect(f13, f14, f15, f16);
    }

    public final boolean c(@NotNull Canvas canvas, int i13, int i14, int i15, int i16) {
        return canvas.clipOutRect(i13, i14, i15, i16);
    }

    public final boolean d(@NotNull Canvas canvas, @NotNull Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public final boolean e(@NotNull Canvas canvas, @NotNull RectF rectF) {
        return canvas.clipOutRect(rectF);
    }
}
