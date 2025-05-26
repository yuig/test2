package f91;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import com.pinterest.api.model.f30;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.view.MaskedWebImageView;
import df.j1;
import i81.e;
import kotlin.jvm.internal.Intrinsics;
import o80.c;
import o80.d;
import o80.f;
import o80.g;
import o80.h;
import o80.j;
import o80.l;
import oq.c0;
import ye2.m;

/* loaded from: classes5.dex */
public final class b extends c0 implements g, h, f {

    /* renamed from: a0, reason: collision with root package name */
    public int f61450a0;

    /* renamed from: b0, reason: collision with root package name */
    public final float f61451b0;

    /* renamed from: c0, reason: collision with root package name */
    public final d f61452c0;

    /* renamed from: d0, reason: collision with root package name */
    public final l f61453d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Float f61454e0;

    /* renamed from: f0, reason: collision with root package name */
    public final int f61455f0;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean f61456g0;

    /* renamed from: h0, reason: collision with root package name */
    public final boolean f61457h0;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f61458i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f61459j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f61460k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f61461l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f61462m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f61463n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f61464o0;

    /* renamed from: p0, reason: collision with root package name */
    public j f61465p0;

    /* renamed from: q0, reason: collision with root package name */
    public final EdgeEffect f61466q0;

    /* renamed from: r0, reason: collision with root package name */
    public final EdgeEffect f61467r0;

    /* renamed from: s0, reason: collision with root package name */
    public final EdgeEffect f61468s0;

    /* renamed from: t0, reason: collision with root package name */
    public final EdgeEffect f61469t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m context, int i13, float f13, l81.l imageUpdatedListener, l81.l imageTouchListener, Float f14, int i14, float f15, boolean z13, boolean z14, boolean z15, f30 pin) {
        super(context, pin, false, null, null, null, 504);
        int i15 = i14;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUpdatedListener, "imageUpdatedListener");
        Intrinsics.checkNotNullParameter(imageTouchListener, "imageTouchListener");
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f61450a0 = i13;
        this.f61451b0 = f13;
        this.f61452c0 = imageUpdatedListener;
        this.f61453d0 = imageTouchListener;
        this.f61454e0 = f14;
        this.f61455f0 = i15;
        this.f61456g0 = z13;
        this.f61457h0 = z14;
        this.f61458i0 = z15;
        this.f61463n0 = f13;
        this.f61466q0 = new EdgeEffect(context);
        this.f61467r0 = new EdgeEffect(context);
        this.f61468s0 = new EdgeEffect(context);
        this.f61469t0 = new EdgeEffect(context);
        this.A = false;
        this.f96999x = false;
        this.f97000y = false;
        this.B = false;
        WebImageView j13 = j();
        if (j13 != null) {
            j13.setScaleType(ImageView.ScaleType.FIT_XY);
            ViewGroup.LayoutParams layoutParams = j13.getLayoutParams();
            layoutParams.height = ((float) i15) <= f15 ? (int) f15 : i15;
            layoutParams.width = hf0.b.f69002b;
            if (j1.U0(pin.i4())) {
                int parseColor = Color.parseColor(pin.i4());
                j13.setBackgroundColor(parseColor);
                oq.j jVar = this.f96995t;
                if (jVar != null) {
                    jVar.setBackgroundColor(parseColor);
                }
            }
        }
    }

    public final j A() {
        return this.f61465p0;
    }

    public final float B() {
        return this.f61460k0;
    }

    public final void C(c edgeType, float f13) {
        Intrinsics.checkNotNullParameter(edgeType, "edgeType");
        int i13 = a.f61449a[edgeType.ordinal()];
        if (i13 == 1) {
            this.f61467r0.onPull(f13);
            invalidate();
            return;
        }
        if (i13 == 2) {
            this.f61466q0.onPull(f13);
            invalidate();
        } else if (i13 == 3) {
            this.f61469t0.onPull(f13);
            invalidate();
        } else {
            if (i13 != 4) {
                return;
            }
            this.f61468s0.onPull(f13);
            invalidate();
        }
    }

    public final void D(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rect");
        E(rectF, true);
        l81.l lVar = (l81.l) this.f61452c0;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        lVar.f82174n2 = rectF;
        lVar.C2 = rectF.left;
        lVar.D2 = rectF.top;
        i81.c cVar = lVar.f82177p1;
        if (cVar != null) {
            ((k81.l) cVar).Y3(rectF, lVar.f82189v1 == e.FLASHLIGHT);
        }
        this.f61464o0 = true;
    }

    public final void E(RectF rectF, boolean z13) {
        Intrinsics.checkNotNullParameter(rectF, "rect");
        l81.l lVar = (l81.l) this.f61452c0;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        i81.c cVar = lVar.f82177p1;
        if (cVar != null) {
            ((k81.l) cVar).d4(rectF, z13);
        }
        this.f61460k0 = rectF.top;
        this.f61462m0 = rectF.bottom;
        this.f61459j0 = rectF.left;
        this.f61461l0 = rectF.right;
    }

    public final void F(float f13, float f14, boolean z13) {
        l81.l lVar = (l81.l) this.f61452c0;
        i81.c cVar = lVar.f82177p1;
        if (cVar != null) {
            ((k81.l) cVar).a4(f13, z13);
        }
        if (lVar.x9()) {
            MaskedWebImageView t93 = lVar.t9();
            if (t93 != null) {
                t93.H2(f13);
            }
            lVar.J9();
            lVar.K9();
        }
        com.pinterest.feature.search.visual.cropper.m mVar = lVar.K1;
        if (mVar != null) {
            mVar.n(f13);
        }
        h81.c cVar2 = lVar.B2;
        if (cVar2 != null) {
            if (f14 == 1.0f && f13 != 1.0f) {
                cVar2.setVisibility(8);
            } else if (f13 == 1.0f && f14 != 1.0f) {
                cVar2.setVisibility(0);
                kg.a.A(0.0f, 1.0f, 50L, cVar2).start();
                cVar2.b();
            }
        }
        this.f61463n0 = f13;
    }

    public final void G(RectF cropperRect) {
        Intrinsics.checkNotNullParameter(cropperRect, "cropperRect");
        j jVar = this.f61465p0;
        if (jVar != null) {
            jVar.O = true;
            float f13 = cropperRect.left;
            jVar.K = f13;
            jVar.D = Math.min(f13, jVar.D);
            float f14 = cropperRect.top;
            jVar.I = f14;
            jVar.B = Math.min(f14, jVar.B);
            float f15 = cropperRect.right;
            jVar.L = f15;
            jVar.E = Math.max(f15, jVar.E);
            float f16 = cropperRect.bottom;
            jVar.f93493J = f16;
            jVar.C = Math.max(f16, jVar.C);
            jVar.M = jVar.L - jVar.K;
            jVar.N = jVar.f93493J - jVar.I;
        }
    }

    @Override // oq.c0, oq.e0
    public final void a() {
        WebImageView j13 = j();
        if (j13 != null) {
            float f13 = 0;
            j13.g2(f13, f13, f13, f13);
        }
        WebImageView j14 = j();
        if (j14 == null) {
            return;
        }
        Float f14 = this.f61454e0;
        float floatValue = f14 != null ? f14.floatValue() : 0.0f;
        float f15 = this.f61450a0;
        Context context = j14.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        j jVar = new j(j14, this.f61451b0, floatValue, this.f61455f0, f15, this.f61453d0, this, this.f61456g0, this.f61457h0, this.f61458i0, context);
        jVar.R = this;
        jVar.S = this;
        this.f61465p0 = jVar;
        oq.j jVar2 = this.f96995t;
        if ((jVar2 != null ? jVar2.f97066l : null) == null || this.f61464o0) {
            return;
        }
        D(new RectF(0.0f, 0.0f, hf0.b.f69002b, this.f61455f0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z13;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        EdgeEffect edgeEffect = this.f61466q0;
        if (edgeEffect.isFinished()) {
            z13 = false;
        } else {
            edgeEffect.setSize(getWidth(), getHeight());
            z13 = edgeEffect.draw(canvas);
        }
        EdgeEffect edgeEffect2 = this.f61467r0;
        if (!edgeEffect2.isFinished()) {
            int save = canvas.save();
            canvas.translate(0.0f, canvas.getHeight());
            canvas.rotate(270.0f);
            edgeEffect2.setSize(getHeight(), getWidth());
            z13 |= edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f61469t0;
        if (!edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            canvas.translate(canvas.getWidth(), 0.0f);
            canvas.rotate(90.0f);
            edgeEffect3.setSize(getHeight(), getWidth());
            z13 |= edgeEffect3.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect4 = this.f61468s0;
        if (!edgeEffect4.isFinished()) {
            int save3 = canvas.save();
            canvas.translate(-getWidth(), this.f61450a0);
            canvas.rotate(180.0f, getWidth(), 0.0f);
            edgeEffect4.setSize(getWidth(), getHeight());
            z13 |= edgeEffect4.draw(canvas);
            canvas.restoreToCount(save3);
        }
        if (z13) {
            postInvalidateOnAnimation();
        }
    }

    @Override // oq.c0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev2) {
        ImageView h10;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        j jVar = this.f61465p0;
        boolean dispatchTouchEvent = (jVar == null || (h10 = jVar.h()) == null) ? super.dispatchTouchEvent(ev2) : h10.dispatchTouchEvent(ev2);
        getParent().requestDisallowInterceptTouchEvent(true);
        j jVar2 = this.f61465p0;
        if (jVar2 != null) {
            ImageView imageView = jVar2.f93494a;
            imageView.setOnTouchListener(jVar2);
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(jVar2);
            }
            jVar2.R = this;
        }
        return dispatchTouchEvent;
    }

    @Override // oq.c0
    public final float l() {
        c();
        return hf0.b.f69002b;
    }

    @Override // oq.c0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        j jVar = this.f61465p0;
        if (jVar != null) {
            jVar.c();
        }
        super.onDetachedFromWindow();
    }

    @Override // oq.c0
    public final boolean p(f30 f30Var) {
        return false;
    }

    @Override // oq.c0
    public final boolean v() {
        return false;
    }

    public final float y() {
        return this.f61462m0;
    }

    public final float z() {
        return this.f61462m0 - this.f61460k0;
    }
}
