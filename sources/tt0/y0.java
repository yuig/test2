package tt0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraVideoSegmentsView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final rt0.b f119232a;

    /* renamed from: b, reason: collision with root package name */
    public final int f119233b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f119234c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f119235d;

    public y0(Context context, rt0.b model) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f119232a = model;
        this.f119233b = dl2.b.x0(context, eo1.a.color_yellow_caramellow_300);
        this.f119234c = xk2.m.b(new yq0.k(this, 28));
        this.f119235d = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f119232a.f109952d) {
            return;
        }
        RectF rectF = this.f119235d;
        float f13 = IdeaPinCreationCameraVideoSegmentsView.f45925g;
        canvas.drawRoundRect(rectF, f13, f13, (Paint) this.f119234c.getValue());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ml2.c.c(32.0f * hf0.b.f69001a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ml2.c.c(32.0f * hf0.b.f69001a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return ((Paint) this.f119234c.getValue()).getAlpha() == 255 ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        ((Paint) this.f119234c.getValue()).setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i13, int i14, int i15, int i16) {
        super.setBounds(i13, i14, i15, i16);
        RectF rectF = this.f119235d;
        int width = getBounds().width();
        int height = getBounds().height();
        float f13 = getBounds().left;
        float f14 = IdeaPinCreationCameraVideoSegmentsView.f45925g;
        float f15 = IdeaPinCreationCameraVideoSegmentsView.f45927i;
        float f16 = ((width / 2.0f) - (f15 / 2.0f)) + f13;
        float f17 = getBounds().top;
        float f18 = IdeaPinCreationCameraVideoSegmentsView.f45928j;
        float f19 = ((height / 2.0f) - (f18 / 2.0f)) + f17;
        rectF.set(f16, f19, f15 + f16, f18 + f19);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
