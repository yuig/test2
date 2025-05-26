package com.pinterest.ui.blurView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ba2.a;
import ba2.b;
import ba2.d;
import ba2.e;
import ba2.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/ui/blurView/BlurView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BlurView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public d f52210a;

    /* renamed from: b, reason: collision with root package name */
    public int f52211b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlurView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static d b(BlurView blurView, ViewGroup rootView, float f13, boolean z13, Shader.TileMode tileMode, int i13) {
        a fVar;
        if (Build.VERSION.SDK_INT >= 31) {
            blurView.getClass();
            fVar = new e();
        } else {
            Context context = blurView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fVar = new f(context);
        }
        a blurAlgorithm = fVar;
        float f14 = (i13 & 4) != 0 ? 0.0f : f13;
        boolean z14 = (i13 & 16) != 0 ? false : z13;
        Shader.TileMode edgeTreatment = (i13 & 32) != 0 ? Shader.TileMode.CLAMP : tileMode;
        blurView.getClass();
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(blurAlgorithm, "blurAlgorithm");
        Intrinsics.checkNotNullParameter(edgeTreatment, "edgeTreatment");
        d dVar = blurView.f52210a;
        if (dVar != null) {
            dVar.b(false);
            dVar.f22416d.destroy();
            dVar.f22424l = false;
        }
        d dVar2 = new d(blurView, rootView, blurView.f52211b, blurAlgorithm, f14, false, z14, edgeTreatment);
        blurView.f52210a = dVar2;
        return dVar2;
    }

    public final void a(int i13) {
        this.f52211b = i13;
        d dVar = this.f52210a;
        if (dVar == null || dVar.f22415c == i13) {
            return;
        }
        dVar.f22415c = i13;
        dVar.f22413a.invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Path path;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        d dVar = this.f52210a;
        if (dVar != null) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            if (dVar.f22425m && dVar.f22424l) {
                if (canvas instanceof b) {
                    return;
                }
                float f13 = dVar.f22417e;
                if (f13 > 0.0f) {
                    path = new Path();
                    if (dVar.f22418f) {
                        f13 = 0.0f;
                    }
                    float width = canvas.getWidth();
                    float height = canvas.getHeight();
                    float f14 = dVar.f22417e;
                    path.addRoundRect(0.0f, 0.0f, width, height, new float[]{f14, f14, f14, f14, f13, f13, f13, f13}, Path.Direction.CW);
                    canvas.clipPath(path);
                } else {
                    path = null;
                }
                View view = dVar.f22413a;
                float height2 = view.getHeight() / (dVar.f22422j != null ? r8.getHeight() : 1);
                float width2 = view.getWidth();
                Bitmap bitmap = dVar.f22422j;
                int width3 = bitmap != null ? bitmap.getWidth() : 1;
                canvas.save();
                canvas.scale(width2 / width3, height2);
                Bitmap bitmap2 = dVar.f22422j;
                if (bitmap2 != null) {
                    dVar.f22416d.c(canvas, bitmap2);
                }
                canvas.restore();
                canvas.drawColor(dVar.f22415c);
                if (dVar.f22419g) {
                    Paint paint = new Paint(1);
                    int i13 = dVar.f22428p;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, dVar.f22417e, new int[]{i13, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                    canvas.save();
                    if (path != null) {
                        canvas.clipPath(path);
                    }
                    canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), dVar.f22417e, paint);
                    canvas.restore();
                }
            }
            super.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        d dVar;
        super.onAttachedToWindow();
        if (isHardwareAccelerated() && (dVar = this.f52210a) != null) {
            dVar.b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d dVar = this.f52210a;
        if (dVar != null) {
            dVar.b(false);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        d dVar = this.f52210a;
        if (dVar != null) {
            dVar.a();
        }
    }

    public /* synthetic */ BlurView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = eo1.b.color_themed_transparent;
        Object obj = d5.a.f53679a;
        this.f52211b = context.getColor(i14);
    }
}
