package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.pinterest.api.model.tp;
import com.pinterest.ui.imageview.WebImageView;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/IdeaPinInteractiveImageView;", "Lcom/pinterest/ui/imageview/WebImageView;", "Lfu0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/pinterest/feature/ideaPinCreation/closeup/view/w0", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class IdeaPinInteractiveImageView extends WebImageView implements fu0.i {

    /* renamed from: J, reason: collision with root package name */
    public final nx.d0 f46007J;
    public yt0.f K;
    public w0 L;
    public v1 M;
    public boolean N;
    public final float O;
    public final Matrix P;
    public final Matrix Q;
    public float R;
    public PointF S;
    public float T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinInteractiveImageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46007J = sh.f.a();
        this.N = true;
        new RectF(0.0f, 0.0f, hf0.b.f69002b, hf0.b.f69003c);
        this.O = 0.2f;
        this.P = new Matrix();
        this.Q = new Matrix();
        this.S = new PointF();
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // fu0.i
    public final boolean T0() {
        return false;
    }

    @Override // fu0.i
    public final void d0() {
    }

    @Override // fu0.i
    public final void e(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
    }

    @Override // fu0.i
    public final void i(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (ev2.getPointerCount() >= 2) {
            PointF C0 = ph.a.C0(ev2);
            float f13 = C0.x;
            PointF pointF = this.S;
            float f14 = f13 - pointF.x;
            float f15 = C0.y - pointF.y;
            float y13 = ph.a.y(ev2) / this.R;
            Matrix matrix = new Matrix(this.Q);
            float b03 = ig1.b.b0(matrix);
            float f16 = b03 * y13;
            float f17 = this.O;
            if (f16 > 6.0f || f16 < f17) {
                float f18 = ql2.s.f(f16, f17, 6.0f) / b03;
                PointF pointF2 = this.S;
                matrix.postScale(f18, f18, pointF2.x, pointF2.y);
            } else {
                PointF pointF3 = this.S;
                matrix.postScale(y13, y13, pointF3.x, pointF3.y);
            }
            matrix.postTranslate(f14, f15);
            matrix.postRotate(ph.a.U(ph.a.k(ev2) - this.T), C0.x, C0.y);
            float f19 = 0;
            RectF d03 = g3.d0(f19, f19, matrix);
            int c13 = ml2.c.c(ig1.b.a0(matrix));
            v1 v1Var = this.M;
            if (v1Var != null) {
                w1 c14 = v1Var.c(d03, c13);
                matrix.postRotate(c14.f46356c, C0.x, C0.y);
                matrix.postTranslate(c14.f46354a, c14.f46355b);
                PointF pointF4 = this.S;
                float f23 = pointF4.x;
                Float f24 = c14.f46357d;
                pointF4.x = f23 + (f24 != null ? f24.floatValue() : 0.0f);
                PointF pointF5 = this.S;
                float f25 = pointF5.y;
                Float f26 = c14.f46358e;
                pointF5.y = f25 + (f26 != null ? f26.floatValue() : 0.0f);
                float f27 = this.T;
                Float f28 = c14.f46359f;
                this.T = f27 + (f28 != null ? f28.floatValue() : 0.0f);
            }
            setImageMatrix(matrix);
        }
    }

    @Override // fu0.i
    public final void l(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        this.R = ph.a.y(ev2);
        this.S = ph.a.C0(ev2);
        this.T = ph.a.k(ev2);
        this.Q.set(getImageMatrix());
        yt0.f fVar = this.K;
        if (fVar != null) {
            f0 f0Var = (f0) fVar;
            bs1.c.X0(f0Var.q());
            f0Var.F0();
        }
    }

    @Override // fu0.i
    public final boolean n(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        return getVisibility() == 0 && this.N;
    }

    @Override // fu0.i
    public final void o(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
    }

    @Override // fu0.i
    public final void q(MotionEvent ev2) {
        tp u33;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        float f13 = 0;
        Matrix imageMatrix = this.P;
        RectF imageRect = g3.d0(f13, f13, imageMatrix);
        w0 w0Var = this.L;
        if (w0Var != null) {
            Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
            Intrinsics.checkNotNullParameter(imageRect, "imageRect");
            au0.d dVar = ((f0) w0Var).f46164h0;
            if (dVar != null && (u33 = dVar.u3()) != null) {
                dVar.x3(u33.b0(0, new lq0.f1(imageMatrix, 28)));
            }
        }
        nx.d0 pinalytics = this.f46007J;
        Intrinsics.checkNotNullExpressionValue(pinalytics, "pinalytics");
        ig1.b.H0(pinalytics, imageMatrix, h32.u0.STORY_PIN_IMAGE);
        yt0.f fVar = this.K;
        if (fVar != null) {
            ((f0) fVar).o(true);
        }
        this.Q.reset();
        this.R = 0.0f;
        this.S = new PointF();
        this.T = 0.0f;
    }

    @Override // android.widget.ImageView
    public final void setImageMatrix(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        super.setImageMatrix(matrix);
        this.P.set(matrix);
    }

    @Override // fu0.i
    public final boolean t() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinInteractiveImageView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46007J = sh.f.a();
        this.N = true;
        new RectF(0.0f, 0.0f, hf0.b.f69002b, hf0.b.f69003c);
        this.O = 0.2f;
        this.P = new Matrix();
        this.Q = new Matrix();
        this.S = new PointF();
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
