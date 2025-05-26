package com.pinterest.feature.search.visual.collage.view;

import a81.g;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.pinterest.api.model.vq;
import com.pinterest.ui.imageview.WebImageView;
import e81.f;
import e81.h;
import h32.u0;
import hf0.b;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import ph.a;
import ql2.s;
import t71.d;
import t71.i;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/search/visual/collage/view/CollageInteractiveImageView;", "Lcom/pinterest/ui/imageview/WebImageView;", "Le81/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CollageInteractiveImageView extends WebImageView implements h {

    /* renamed from: J, reason: collision with root package name */
    public final d0 f47945J;
    public d K;
    public f L;
    public final boolean M;
    public RectF N;
    public float O;
    public int P;
    public int Q;
    public final Matrix R;
    public final Matrix S;
    public float T;
    public PointF U;
    public float V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollageInteractiveImageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47945J = sh.f.a();
        this.M = true;
        this.N = new RectF(0.0f, 0.0f, b.f69002b, b.f69003c);
        this.O = 0.2f;
        this.R = new Matrix();
        this.S = new Matrix();
        this.U = new PointF();
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void A2(RectF viewRect) {
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        this.N = viewRect;
    }

    public final void D2() {
        Matrix imageMatrix = this.R;
        RectF imageRect = g3.d0(this.P, this.Q, imageMatrix);
        vq J0 = ig1.b.J0(imageMatrix, imageRect);
        f fVar = this.L;
        if (fVar != null) {
            Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
            Intrinsics.checkNotNullParameter(imageRect, "imageRect");
            i iVar = ((e81.d) fVar).H0;
            if (iVar != null) {
                ((g) iVar).r3(imageMatrix, imageRect, J0);
            }
        }
    }

    public final void E2(z71.g item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f52564p = new e81.g(this, item);
        loadUrl(item.getBackgroundItem().getUrl());
    }

    @Override // e81.h
    public final boolean G0() {
        return false;
    }

    public final void G2(d touchSurfaceListener, f interactionListener) {
        Intrinsics.checkNotNullParameter(touchSurfaceListener, "touchSurfaceListener");
        Intrinsics.checkNotNullParameter(interactionListener, "interactionListener");
        this.K = touchSurfaceListener;
        this.L = interactionListener;
    }

    @Override // e81.h
    public final void i(MotionEvent ev2) {
        PointF pointF;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (ev2.getPointerCount() >= 2) {
            float f13 = a.C0(ev2).x - this.U.x;
            float f14 = a.C0(ev2).y - this.U.y;
            float y13 = a.y(ev2) / this.T;
            Matrix matrix = new Matrix(this.S);
            float b03 = ig1.b.b0(matrix);
            float f15 = b03 * y13;
            if (f15 > 6.0f || f15 < this.O) {
                float f16 = s.f(f15, this.O, 6.0f) / b03;
                PointF pointF2 = this.U;
                matrix.postScale(f16, f16, pointF2.x, pointF2.y);
            } else {
                PointF pointF3 = this.U;
                matrix.postScale(y13, y13, pointF3.x, pointF3.y);
            }
            matrix.postTranslate(f13, f14);
            float U = a.U(a.k(ev2) - this.V);
            PointF pointF4 = this.U;
            matrix.postRotate(U, pointF4.x, pointF4.y);
            RectF imageRect = g3.d0(this.P, this.Q, matrix);
            f fVar = this.L;
            if (fVar != null) {
                e81.d dVar = (e81.d) fVar;
                Intrinsics.checkNotNullParameter(imageRect, "imageRect");
                Float valueOf = Float.valueOf(0.0f);
                float f17 = 2;
                Float[] fArr = {valueOf, Float.valueOf(dVar.d8().width() / f17), Float.valueOf(dVar.d8().width())};
                pointF = dVar.f8(new Float[]{Float.valueOf(imageRect.left), Float.valueOf(imageRect.centerX()), Float.valueOf(imageRect.right)}, (View[]) dVar.C0.getValue(), fArr, new Float[]{Float.valueOf(imageRect.top), Float.valueOf(imageRect.centerY()), Float.valueOf(imageRect.bottom)}, (View[]) dVar.D0.getValue(), new Float[]{valueOf, Float.valueOf(dVar.d8().height() / f17), Float.valueOf(dVar.d8().height())});
            } else {
                pointF = null;
            }
            if (pointF != null) {
                matrix.postTranslate(pointF.x, pointF.y);
            }
            setImageMatrix(matrix);
        }
    }

    @Override // e81.h
    public final void l(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        this.T = a.y(ev2);
        this.U = a.C0(ev2);
        this.V = a.k(ev2);
        this.S.set(getImageMatrix());
    }

    @Override // e81.h
    public final boolean n(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        return getVisibility() == 0 && this.M;
    }

    @Override // e81.h
    public final void q(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        D2();
        d0 pinalytics = this.f47945J;
        Intrinsics.checkNotNullExpressionValue(pinalytics, "pinalytics");
        ig1.b.H0(pinalytics, this.R, u0.STORY_PIN_IMAGE);
        d dVar = this.K;
        if (dVar != null) {
            ((e81.d) dVar).b8(true);
        }
        this.S.reset();
        this.T = 0.0f;
        this.U = new PointF();
        this.V = 0.0f;
    }

    @Override // android.widget.ImageView
    public final void setImageMatrix(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        super.setImageMatrix(matrix);
        this.R.set(matrix);
    }

    @Override // e81.h
    public final boolean t() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollageInteractiveImageView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47945J = sh.f.a();
        this.M = true;
        this.N = new RectF(0.0f, 0.0f, b.f69002b, b.f69003c);
        this.O = 0.2f;
        this.R = new Matrix();
        this.S = new Matrix();
        this.U = new PointF();
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
