package c4;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f25632a = new e();

    public final void a(@NotNull Canvas canvas, @NotNull CharSequence charSequence, int i13, int i14, int i15, int i16, float f13, float f14, boolean z13, @NotNull Paint paint) {
        canvas.drawTextRun(charSequence, i13, i14, i15, i16, f13, f14, z13, paint);
    }

    public final void b(@NotNull Canvas canvas, @NotNull char[] cArr, int i13, int i14, int i15, int i16, float f13, float f14, boolean z13, @NotNull Paint paint) {
        canvas.drawTextRun(cArr, i13, i14, i15, i16, f13, f14, z13, paint);
    }
}
