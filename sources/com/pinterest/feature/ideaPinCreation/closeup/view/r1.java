package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.api.model.nq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.uq;
import com.pinterest.api.model.zq;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.jb;

/* loaded from: classes5.dex */
public final class r1 extends WebImageView implements fu0.i, g1, m1, l1 {

    /* renamed from: J, reason: collision with root package name */
    public boolean f46292J;
    public final nq K;
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
    public final String f46293a0;

    /* renamed from: b0, reason: collision with root package name */
    public final xk2.v f46294b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(Context context, nq overlayBlock, float f13, float f14, Function0 function0, Function0 function02, v1 v1Var, yt0.e eVar, yt0.f fVar, o1 o1Var) {
        super(context);
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
        this.U = xk2.m.b(new q1(this, 1));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setTag(aq1.d.idea_pin_tag_id, overlayBlock.getConfig().getId());
        setScaleType(ImageView.ScaleType.MATRIX);
        rq config = overlayBlock.getConfig();
        zq stickerDetails = overlayBlock.getStickerDetails();
        this.f52564p = new oq.h(1, config, this);
        V1(stickerDetails.q(), (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
        if (!Intrinsics.d(config.getColorHex(), "#00000000")) {
            setColorFilter(Color.parseColor(config.getColorHex()));
        }
        this.V = overlayBlock.getConfig().getId();
        this.W = uq.STICKER;
        String s13 = overlayBlock.getStickerDetails().s();
        Intrinsics.checkNotNullExpressionValue(s13, "getDisplayName(...)");
        this.f46293a0 = s13;
        this.f46294b0 = xk2.m.b(new q1(this, 0));
    }

    public final n1 A2() {
        return (n1) this.U.getValue();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final Path I0() {
        return (Path) this.f46294b0.getValue();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final String L0() {
        return this.f46293a0;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.m1
    public final float S0(float f13, Matrix viewMatrix) {
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        float b03 = ig1.b.b0(viewMatrix);
        return ql2.s.f(f13 * b03, 0.33f, 6.0f) / b03;
    }

    @Override // fu0.i
    public final boolean T0() {
        o1 o1Var = this.S;
        if (o1Var != null && bs1.c.o1(((f0) o1Var).D())) {
            Boolean v13 = this.K.getStickerDetails().v();
            Intrinsics.checkNotNullExpressionValue(v13, "getIsColorEditable(...)");
            if (!v13.booleanValue()) {
                return false;
            }
        }
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
        float f17 = S.left;
        float f18 = 0.0f;
        if (f17 > f16) {
            f15 = f16 - f17;
        } else {
            float f19 = S.right;
            f15 = f19 < W ? W - f19 : 0.0f;
        }
        float f23 = S.top;
        float f24 = 0;
        if (f23 < f24) {
            f18 = f24 - f23;
        } else {
            float f25 = S.bottom;
            float f26 = this.M;
            if (f25 > f26) {
                f18 = f26 - f25;
            }
        }
        return new PointF(f13 + f15, f14 + f18);
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView
    public final void s2() {
        if (this.f46292J) {
            return;
        }
        this.f46292J = true;
        this.f52566r = (hs1.q) ((jb) ((s1) generatedComponent())).f113483a.f113875q7.get();
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
