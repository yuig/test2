package c4;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f25635a = new h();

    public final boolean a(@NotNull Canvas canvas, float f13, float f14, float f15, float f16) {
        boolean quickReject;
        quickReject = canvas.quickReject(f13, f14, f15, f16);
        return quickReject;
    }

    public final boolean b(@NotNull Canvas canvas, @NotNull Path path) {
        boolean quickReject;
        quickReject = canvas.quickReject(path);
        return quickReject;
    }

    public final boolean c(@NotNull Canvas canvas, @NotNull RectF rectF) {
        boolean quickReject;
        quickReject = canvas.quickReject(rectF);
        return quickReject;
    }
}
