package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Bitmap;
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
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends c implements fu0.i, g1, m1, l1 {

    /* renamed from: c, reason: collision with root package name */
    public final nq f46133c;

    /* renamed from: d, reason: collision with root package name */
    public final float f46134d;

    /* renamed from: e, reason: collision with root package name */
    public final float f46135e;

    /* renamed from: f, reason: collision with root package name */
    public final v1 f46136f;

    /* renamed from: g, reason: collision with root package name */
    public final yt0.e f46137g;

    /* renamed from: h, reason: collision with root package name */
    public final yt0.f f46138h;

    /* renamed from: i, reason: collision with root package name */
    public final o1 f46139i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f46140j;

    /* renamed from: k, reason: collision with root package name */
    public final ll.j f46141k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f46142l;

    /* renamed from: m, reason: collision with root package name */
    public final String f46143m;

    /* renamed from: n, reason: collision with root package name */
    public final uq f46144n;

    /* renamed from: o, reason: collision with root package name */
    public final String f46145o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f46146p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, nt0.d animatedStickerRepository, nq overlayBlock, float f13, float f14, Function0 function0, v1 v1Var, yt0.e eVar, yt0.f fVar, o1 o1Var, long j13) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(animatedStickerRepository, "animatedStickerRepository");
        Intrinsics.checkNotNullParameter(overlayBlock, "overlayBlock");
        if (!this.f46093b) {
            this.f46093b = true;
            ((g) generatedComponent()).getClass();
        }
        this.f46133c = overlayBlock;
        this.f46134d = f13;
        this.f46135e = f14;
        this.f46136f = v1Var;
        this.f46137g = eVar;
        this.f46138h = fVar;
        this.f46139i = o1Var;
        float f15 = ((180.0f * hf0.b.f69001a) * f13) / hf0.b.f69002b;
        this.f46142l = xk2.m.b(new e(this, 1));
        ll.j jVar = new ll.j(overlayBlock);
        this.f46141k = jVar;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setTag(aq1.d.idea_pin_tag_id, overlayBlock.getConfig().getId());
        setScaleType(ImageView.ScaleType.MATRIX);
        rq config = overlayBlock.getConfig();
        ArrayList c13 = nt0.d.c(animatedStickerRepository.b(overlayBlock.getStickerDetails()));
        this.f46140j = c13;
        if (true ^ c13.isEmpty()) {
            Bitmap bitmap = ((dw0.a) c13.get(jVar.q(j13, c13))).f56409a;
            setImageBitmap(bitmap);
            kotlin.jvm.internal.r.m0(config, this, bitmap, f13, f14, f15, o1Var, function0, bitmap.getWidth(), bitmap.getHeight());
        }
        if (!Intrinsics.d(config.getColorHex(), "#00000000")) {
            setColorFilter(Color.parseColor(config.getColorHex()));
        }
        this.f46143m = overlayBlock.getConfig().getId();
        this.f46144n = uq.STICKER;
        String s13 = overlayBlock.getStickerDetails().s();
        Intrinsics.checkNotNullExpressionValue(s13, "getDisplayName(...)");
        this.f46145o = s13;
        this.f46146p = xk2.m.b(new e(this, 0));
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final Path I0() {
        return (Path) this.f46146p.getValue();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final String L0() {
        return this.f46145o;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.m1
    public final float S0(float f13, Matrix viewMatrix) {
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        float b03 = ig1.b.b0(viewMatrix);
        return ql2.s.f(f13 * b03, 0.33f, 6.0f) / b03;
    }

    @Override // fu0.i
    public final boolean T0() {
        o1 o1Var = this.f46139i;
        if (o1Var != null && bs1.c.o1(((f0) o1Var).D())) {
            Boolean v13 = this.f46133c.getStickerDetails().v();
            Intrinsics.checkNotNullExpressionValue(v13, "getIsColorEditable(...)");
            if (!v13.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final String X1() {
        return this.f46143m;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final uq a0() {
        return this.f46144n;
    }

    @Override // fu0.i
    public final void d0() {
        f2().g();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.l1
    public final void d2(Matrix viewMatrix) {
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
    }

    @Override // fu0.i
    public final void e(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        f2().b(ev2);
    }

    public final n1 f2() {
        return (n1) this.f46142l.getValue();
    }

    @Override // fu0.i
    public final void i(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        f2().c(ev2);
    }

    @Override // fu0.i
    public final void l(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        f2().d(ev2);
    }

    @Override // fu0.i
    public final boolean n(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        return getVisibility() == 0 && f2().j(ev2);
    }

    @Override // fu0.i
    public final void o(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        f2().e(ev2);
    }

    @Override // fu0.i
    public final void q(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        f2().f(ev2);
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final qq r0() {
        return this.f46133c;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.m1
    public final PointF r1(float f13, float f14, Matrix viewMatrix) {
        float f15;
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        Matrix matrix = new Matrix(viewMatrix);
        matrix.postTranslate(f13, f14);
        RectF S = kh2.p2.S(matrix, I0());
        float W = bs1.c.W(this, eo1.c.space_400);
        float f16 = this.f46134d - W;
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
            float f26 = this.f46135e;
            if (f25 > f26) {
                f18 = f26 - f25;
            }
        }
        return new PointF(f13 + f15, f14 + f18);
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
