package com.pinterest.shuffles.cutout.editor.ui.select;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q5.b1;
import r72.i1;
import v62.b;
import y62.e;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/shuffles/cutout/editor/ui/select/MaskedImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "shuffles-cutout-editor_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class MaskedImageView extends AppCompatImageView {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f51978g = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f51979a;

    /* renamed from: b, reason: collision with root package name */
    public e f51980b;

    /* renamed from: c, reason: collision with root package name */
    public float f51981c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f51982d;

    /* renamed from: e, reason: collision with root package name */
    public float f51983e;

    /* renamed from: f, reason: collision with root package name */
    public int f51984f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedImageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51982d = new float[0];
        this.f51984f = -16777216;
    }

    public final void f2(i1 i1Var, boolean z13, List list) {
        if (list == null) {
            list = q0.f80391a;
        }
        e eVar = null;
        if (i1Var != null) {
            e eVar2 = this.f51980b;
            if (Intrinsics.d(i1Var, eVar2 != null ? eVar2.f137919a : null)) {
                eVar = this.f51980b;
            } else {
                e eVar3 = this.f51980b;
                if (eVar3 != null) {
                    eVar3.stop();
                }
                eVar = new e(i1Var, list);
                eVar.d(new b(this.f51981c, this.f51983e, this.f51982d));
                eVar.f137921c = this.f51979a;
                eVar.c(this.f51984f);
                Drawable drawable = getDrawable();
                if (drawable != null) {
                    eVar.setBounds(drawable.getBounds());
                }
                eVar.setCallback(this);
                eVar.start();
                if (z13) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.setDuration(getContext().getResources().getInteger(R.integer.config_shortAnimTime));
                    ofInt.setInterpolator(new AccelerateInterpolator());
                    ofInt.addUpdateListener(new b1(5, eVar, this));
                    ofInt.start();
                }
            }
        }
        this.f51980b = eVar;
        invalidate();
    }

    public final void g2(int i13) {
        this.f51984f = i13;
        e eVar = this.f51980b;
        if (eVar != null) {
            eVar.c(i13);
        }
    }

    public final void i2(b params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f51981c = params.f124228a;
        this.f51982d = params.f124229b;
        this.f51983e = params.f124230c;
        e eVar = this.f51980b;
        if (eVar != null) {
            eVar.d(params);
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable dr2) {
        Intrinsics.checkNotNullParameter(dr2, "dr");
        if (Intrinsics.d(dr2, this.f51980b)) {
            invalidate();
        } else {
            super.invalidateDrawable(dr2);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.f51980b;
        if (eVar != null) {
            eVar.start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.f51980b;
        if (eVar != null) {
            eVar.stop();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        e eVar = this.f51980b;
        if (eVar != null) {
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            int save = canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            try {
                Matrix imageMatrix = getImageMatrix();
                Intrinsics.checkNotNullExpressionValue(imageMatrix, "getImageMatrix(...)");
                save = canvas.save();
                canvas.concat(imageMatrix);
                eVar.draw(canvas);
                canvas.restoreToCount(save);
            } catch (Throwable th3) {
                throw th3;
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            e eVar = this.f51980b;
            if (eVar != null) {
                eVar.setBounds(drawable.getBounds());
            }
            invalidate();
        }
    }
}
