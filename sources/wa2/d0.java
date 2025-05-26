package wa2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes4.dex */
public final class d0 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f128687a;

    /* renamed from: b, reason: collision with root package name */
    public List f128688b;

    /* renamed from: c, reason: collision with root package name */
    public final int f128689c;

    /* renamed from: d, reason: collision with root package name */
    public int f128690d;

    public d0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f128687a = context;
        this.f128688b = q0.f80391a;
        this.f128689c = context.getResources().getDimensionPixelSize(cz1.a.pin_reaction_inline_icon_size);
        this.f128690d = context.getResources().getDimensionPixelSize(r0.margin_quarter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f13 = getBounds().left;
        float f14 = getBounds().top;
        for (Drawable drawable : this.f128688b) {
            canvas.save();
            canvas.translate(f13, f14);
            int i13 = this.f128689c;
            drawable.setBounds(0, 0, i13, i13);
            drawable.draw(canvas);
            f13 += i13 + this.f128690d;
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f128689c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f128688b.size() * (this.f128689c + this.f128690d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
