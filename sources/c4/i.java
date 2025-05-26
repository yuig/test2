package c4;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f25636a = new i();

    public final void a(@NotNull Canvas canvas, @NotNull int[] iArr, int i13, @NotNull float[] fArr, int i14, int i15, @NotNull Font font, @NotNull Paint paint) {
        canvas.drawGlyphs(iArr, i13, fArr, i14, i15, font, paint);
    }

    public final void b(@NotNull Canvas canvas, @NotNull NinePatch ninePatch, @NotNull Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public final void c(@NotNull Canvas canvas, @NotNull NinePatch ninePatch, @NotNull RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
