package ez0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import i91.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final float f60691a;

    /* renamed from: b, reason: collision with root package name */
    public final float f60692b;

    /* renamed from: c, reason: collision with root package name */
    public final ShapeDrawable f60693c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f60694d;

    public k(Context context, u style) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(style, "style");
        int preferredSize = style.getPreferredSize(context);
        int i13 = preferredSize / 2;
        float f13 = (preferredSize - i13) / 2.0f;
        this.f60691a = f13;
        this.f60692b = f13 - context.getResources().getDimensionPixelSize(eo1.c.margin_extra_small);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(dl2.b.x0(context, eo1.a.color_white_mochimalist_0_opacity_80));
        shapeDrawable.setBounds(0, 0, preferredSize, preferredSize);
        this.f60693c = shapeDrawable;
        int i14 = sm1.b.ic_share_android_gestalt;
        Object obj = d5.a.f53679a;
        Drawable drawable = context.getDrawable(i14);
        if (drawable != null) {
            int i15 = eo1.b.color_black_900;
            Intrinsics.checkNotNullParameter(context, "context");
            d7.b.A0(drawable, bs1.c.A(context, i15));
            drawable.setBounds(0, 0, i13, i13);
        } else {
            drawable = null;
        }
        this.f60694d = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f60693c.draw(canvas);
        Drawable drawable = this.f60694d;
        if (drawable != null) {
            canvas.save();
            canvas.translate(this.f60692b, this.f60691a);
            drawable.draw(canvas);
            canvas.restore();
        }
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
