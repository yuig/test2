package com.pinterest.feature.ideaPinCreation.canvas.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import aq1.b;
import bs1.c;
import com.pinterest.api.model.so;
import eo1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l7.r0;
import org.jetbrains.annotations.NotNull;
import xt0.f;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/canvas/view/IdeaPinCreationCanvasCropperContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinCreationCanvasCropperContainer extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f45968l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final f f45969a;

    /* renamed from: b, reason: collision with root package name */
    public final float f45970b;

    /* renamed from: c, reason: collision with root package name */
    public final float f45971c;

    /* renamed from: d, reason: collision with root package name */
    public final float f45972d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f45973e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f45974f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f45975g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f45976h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f45977i;

    /* renamed from: j, reason: collision with root package name */
    public so f45978j;

    /* renamed from: k, reason: collision with root package name */
    public float f45979k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationCanvasCropperContainer(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        f fVar = new f(context2);
        this.f45969a = fVar;
        this.f45970b = c.W(this, eo1.c.lego_corner_radius_large);
        float W = c.W(this, b.idea_pin_canvas_cropper_stroke_width);
        this.f45971c = W;
        this.f45972d = W / 2;
        Paint paint = new Paint(1);
        paint.setColor(dl2.b.y0(this, a.color_background_dark_opacity_300));
        this.f45973e = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint2.setStrokeWidth(W);
        this.f45974f = paint2;
        this.f45975g = new RectF();
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f45976h = path;
        addView(fVar);
    }

    public final float a() {
        ViewGroup.LayoutParams layoutParams = this.f45969a.getLayoutParams();
        return ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r0.topMargin : 0) / this.f45975g.height();
    }

    public final void b(so canvasAspectRatio, float f13) {
        Intrinsics.checkNotNullParameter(canvasAspectRatio, "canvasAspectRatio");
        this.f45978j = canvasAspectRatio;
        this.f45979k = f13;
    }

    public final void c(so aspectRatio) {
        Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
        RectF rectF = this.f45975g;
        if (rectF.isEmpty()) {
            return;
        }
        float width = rectF.width() / ((float) aspectRatio.d());
        float height = rectF.height() - width;
        float f13 = 2;
        float f14 = height / f13;
        f fVar = this.f45969a;
        ViewGroup.LayoutParams layoutParams = fVar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = ml2.c.c((f13 * this.f45971c) + width);
        int i13 = (int) f14;
        marginLayoutParams.topMargin = i13;
        marginLayoutParams.bottomMargin = i13;
        fVar.setLayoutParams(marginLayoutParams);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        Path path = this.f45976h;
        path.reset();
        Path.Direction direction = Path.Direction.CW;
        path.addRect(this.f45975g, direction);
        RectF rectF = this.f45969a.f135912a;
        float f13 = this.f45970b;
        path.addRoundRect(rectF, f13, f13, direction);
        path.close();
        canvas.drawPath(path, this.f45973e);
        float f14 = rectF.left;
        float f15 = this.f45972d;
        canvas.drawRoundRect(new RectF(f14 + f15, rectF.top + f15, rectF.right - f15, rectF.bottom - f15), f13, f13, this.f45974f);
        if (this.f45977i) {
            float f16 = 3;
            float height = (rectF.height() / f16) + rectF.top;
            float f17 = 2;
            float height2 = ((rectF.height() * f17) / f16) + rectF.top;
            canvas.drawLine(rectF.left, height, rectF.right, height, this.f45974f);
            canvas.drawLine(rectF.left, height2, rectF.right, height2, this.f45974f);
            float width = (rectF.width() / f16) + rectF.left;
            float width2 = ((rectF.width() * f17) / f16) + rectF.left;
            canvas.drawLine(width, rectF.top, width, rectF.bottom, this.f45974f);
            canvas.drawLine(width2, rectF.top, width2, rectF.bottom, this.f45974f);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        RectF rectF = this.f45975g;
        boolean isEmpty = rectF.isEmpty();
        float f13 = this.f45971c;
        rectF.set(f13, f13, i13 - f13, i14 - f13);
        this.f45969a.f135916e = i14;
        if (!isEmpty || this.f45978j == null) {
            return;
        }
        float width = rectF.width();
        so soVar = this.f45978j;
        if (soVar != null) {
            post(new r0(this, width / ((float) soVar.d()), 1));
        } else {
            Intrinsics.r("initialCanvasAspectRatio");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationCanvasCropperContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        f fVar = new f(context2);
        this.f45969a = fVar;
        this.f45970b = c.W(this, eo1.c.lego_corner_radius_large);
        float W = c.W(this, b.idea_pin_canvas_cropper_stroke_width);
        this.f45971c = W;
        this.f45972d = W / 2;
        Paint paint = new Paint(1);
        paint.setColor(dl2.b.y0(this, a.color_background_dark_opacity_300));
        this.f45973e = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint2.setStrokeWidth(W);
        this.f45974f = paint2;
        this.f45975g = new RectF();
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f45976h = path;
        addView(fVar);
    }
}
