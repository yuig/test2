package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.kq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.uq;
import com.pinterest.ui.imageview.WebImageView;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.jb;

/* loaded from: classes5.dex */
public final class u0 extends WebImageView implements fu0.i, g1, m1, l1 {

    /* renamed from: J, reason: collision with root package name */
    public boolean f46326J;
    public final kq K;
    public final float L;
    public final float M;
    public final Function0 N;
    public final Function0 O;
    public final v1 P;
    public final yt0.e Q;
    public final yt0.f R;
    public final o1 S;
    public final float T;
    public final xk2.v U;
    public final String V;
    public final uq W;

    /* renamed from: a0, reason: collision with root package name */
    public final String f46327a0;

    /* renamed from: b0, reason: collision with root package name */
    public final xk2.v f46328b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Context context, kq overlayBlock, float f13, float f14, Function0 function0, Function0 function02, v1 v1Var, yt0.e eVar, yt0.f fVar, o1 o1Var) {
        super(context);
        Pair h10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overlayBlock, "overlayBlock");
        s2();
        this.K = overlayBlock;
        this.L = f13;
        this.M = f14;
        this.N = function0;
        this.O = function02;
        this.P = v1Var;
        this.Q = eVar;
        this.R = fVar;
        this.S = o1Var;
        this.T = ((180.0f * hf0.b.f69001a) * f13) / hf0.b.f69002b;
        this.U = xk2.m.b(new t0(this, 1));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setTag(aq1.d.idea_pin_tag_id, overlayBlock.getConfig().getId());
        setScaleType(ImageView.ScaleType.MATRIX);
        if (overlayBlock.getPhotoItem().a()) {
            rq config = overlayBlock.getConfig();
            d30 item = overlayBlock.getPhotoItem();
            this.f52564p = new oq.i(this, 4);
            try {
                Intrinsics.checkNotNullParameter(item, "item");
                int f15 = new k6.g(item.e()).f(1, "Orientation");
                h10 = (f15 == 6 || f15 == 8) ? new Pair(item.h().f80347b, item.h().f80346a) : item.h();
            } catch (FileNotFoundException unused) {
                h10 = item.h();
            }
            int intValue = ((Number) h10.f80346a).intValue();
            int intValue2 = ((Number) h10.f80347b).intValue();
            P0(new File(item.e()), intValue, intValue2);
            if (config.getMatrix() == null || config.getRotatedRect() == null) {
                float f16 = intValue;
                float f17 = intValue2;
                RectF rectF = new RectF(0.0f, 0.0f, f16, f17);
                float f18 = this.L;
                float f19 = this.T;
                float f23 = this.M;
                RectF rectF2 = new RectF((f18 - f19) / 2.0f, (f23 - f19) / 2.0f, (f18 + f19) / 2.0f, (f23 + f19) / 2.0f);
                Matrix matrix = config.getMatrix();
                if (matrix == null) {
                    matrix = new Matrix();
                    matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                }
                setImageMatrix(matrix);
                RectF rectF3 = new RectF(0.0f, 0.0f, f16, f17);
                o1 o1Var2 = this.S;
                if (o1Var2 != null) {
                    ((f0) o1Var2).L0(config.getId(), matrix, ig1.b.J0(matrix, rectF3));
                }
            } else {
                setImageMatrix(config.getMatrix());
            }
        } else if (function02 != null) {
            function02.invoke();
        }
        this.V = this.K.getConfig().getId();
        this.W = uq.IMAGE_STICKER;
        this.f46327a0 = bs1.c.f2(this, aq1.h.idea_pin_edit_image_sticker_item_name);
        this.f46328b0 = xk2.m.b(new t0(this, 0));
    }

    public final n1 A2() {
        return (n1) this.U.getValue();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final Path I0() {
        return (Path) this.f46328b0.getValue();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final String L0() {
        return this.f46327a0;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.m1
    public final float S0(float f13, Matrix viewMatrix) {
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        float b03 = ig1.b.b0(viewMatrix);
        return ql2.s.f(f13 * b03, 0.01f, 6.0f) / b03;
    }

    @Override // fu0.i
    public final boolean T0() {
        return true;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final String X1() {
        return this.V;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final uq a0() {
        return this.W;
    }

    @Override // fu0.i
    public final void d0() {
        A2().g();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.l1
    public final void d2(Matrix viewMatrix) {
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
    }

    @Override // fu0.i
    public final void e(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        A2().b(ev2);
    }

    @Override // fu0.i
    public final void i(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        A2().c(ev2);
    }

    @Override // fu0.i
    public final void l(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        A2().d(ev2);
    }

    @Override // fu0.i
    public final boolean n(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        return getVisibility() == 0 && A2().j(ev2);
    }

    @Override // fu0.i
    public final void o(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        A2().e(ev2);
    }

    @Override // fu0.i
    public final void q(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        A2().f(ev2);
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final qq r0() {
        return this.K;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.m1
    public final PointF r1(float f13, float f14, Matrix viewMatrix) {
        float f15;
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        Matrix matrix = new Matrix(viewMatrix);
        matrix.postTranslate(f13, f14);
        RectF S = kh2.p2.S(matrix, I0());
        float W = bs1.c.W(this, eo1.c.space_400);
        float f16 = this.L - W;
        float f17 = this.M - W;
        float f18 = S.left;
        float f19 = 0.0f;
        if (f18 > f16) {
            f15 = f16 - f18;
        } else {
            float f23 = S.right;
            f15 = f23 < W ? W - f23 : 0.0f;
        }
        float f24 = S.top;
        if (f24 > f17) {
            f19 = f17 - f24;
        } else {
            float f25 = S.bottom;
            if (f25 < W) {
                f19 = W - f25;
            }
        }
        return new PointF(f13 + f15, f14 + f19);
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView
    public final void s2() {
        if (this.f46326J) {
            return;
        }
        this.f46326J = true;
        this.f52566r = (hs1.q) ((jb) ((v0) generatedComponent())).f113483a.f113875q7.get();
    }

    @Override // fu0.i
    public final boolean t() {
        return true;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final void t1(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        setImageMatrix(matrix);
    }
}
