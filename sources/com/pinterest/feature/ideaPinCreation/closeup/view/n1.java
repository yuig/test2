package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.pinterest.api.model.vq;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f46258a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f46259b;

    /* renamed from: c, reason: collision with root package name */
    public final m1 f46260c;

    /* renamed from: d, reason: collision with root package name */
    public final l1 f46261d;

    /* renamed from: e, reason: collision with root package name */
    public final yt0.e f46262e;

    /* renamed from: f, reason: collision with root package name */
    public final yt0.f f46263f;

    /* renamed from: g, reason: collision with root package name */
    public final o1 f46264g;

    /* renamed from: h, reason: collision with root package name */
    public final v1 f46265h;

    /* renamed from: i, reason: collision with root package name */
    public final nx.d0 f46266i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f46267j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f46268k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f46269l;

    /* renamed from: m, reason: collision with root package name */
    public float f46270m;

    /* renamed from: n, reason: collision with root package name */
    public PointF f46271n;

    /* renamed from: o, reason: collision with root package name */
    public float f46272o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f46273p;

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f46274q;

    public n1(g1 view, ImageView overlayImageView, m1 constraintProvider, l1 matrixListener, yt0.e eVar, yt0.f fVar, o1 o1Var, v1 v1Var) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(overlayImageView, "overlayImageView");
        Intrinsics.checkNotNullParameter(constraintProvider, "constraintProvider");
        Intrinsics.checkNotNullParameter(matrixListener, "matrixListener");
        this.f46258a = view;
        this.f46259b = overlayImageView;
        this.f46260c = constraintProvider;
        this.f46261d = matrixListener;
        this.f46262e = eVar;
        this.f46263f = fVar;
        this.f46264g = o1Var;
        this.f46265h = v1Var;
        this.f46266i = sh.f.a();
        this.f46267j = true;
        this.f46271n = new PointF();
        this.f46273p = new PointF();
        this.f46274q = new Matrix();
    }

    public final RectF a() {
        ImageView imageView = this.f46259b;
        return imageView.getDrawable() != null ? new RectF(imageView.getDrawable().getBounds()) : new RectF();
    }

    public final void b(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        this.f46269l = true;
        this.f46273p = new PointF(ev2.getX(), ev2.getY());
        this.f46274q.set(this.f46259b.getImageMatrix());
        yt0.f fVar = this.f46263f;
        if (fVar != null) {
            f0 f0Var = (f0) fVar;
            bs1.c.X0(f0Var.q());
            f0Var.F0();
        }
    }

    public final void c(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        boolean z13 = this.f46269l;
        Matrix matrix = this.f46274q;
        l1 l1Var = this.f46261d;
        ImageView imageView = this.f46259b;
        v1 v1Var = this.f46265h;
        g1 g1Var = this.f46258a;
        m1 m1Var = this.f46260c;
        if (!z13) {
            if (ev2.getPointerCount() == 2) {
                PointF C0 = ph.a.C0(ev2);
                float f13 = C0.x;
                PointF pointF = this.f46271n;
                float f14 = f13 - pointF.x;
                float f15 = C0.y - pointF.y;
                float y13 = ph.a.y(ev2) / this.f46270m;
                Matrix matrix2 = new Matrix(matrix);
                float S0 = m1Var.S0(y13, matrix2);
                matrix2.postScale(S0, S0, C0.x, C0.y);
                PointF r13 = m1Var.r1(f14, f15, matrix2);
                matrix2.postTranslate(r13.x, r13.y);
                matrix2.postRotate(ph.a.U(ph.a.k(ev2) - this.f46272o), C0.x, C0.y);
                RectF S = kh2.p2.S(matrix2, g1Var.I0());
                int c13 = ml2.c.c(ig1.b.a0(matrix2));
                if (v1Var != null) {
                    w1 c14 = v1Var.c(S, c13);
                    PointF pointF2 = this.f46271n;
                    matrix2.postRotate(c14.f46356c, pointF2.x, pointF2.y);
                    matrix2.postTranslate(c14.f46354a, c14.f46355b);
                    PointF pointF3 = this.f46271n;
                    float f16 = pointF3.x;
                    Float f17 = c14.f46357d;
                    pointF3.x = f16 + (f17 != null ? f17.floatValue() : 0.0f);
                    PointF pointF4 = this.f46271n;
                    float f18 = pointF4.y;
                    Float f19 = c14.f46358e;
                    pointF4.y = f18 + (f19 != null ? f19.floatValue() : 0.0f);
                    float f23 = this.f46272o;
                    Float f24 = c14.f46359f;
                    this.f46272o = f23 + (f24 != null ? f24.floatValue() : 0.0f);
                }
                imageView.setImageMatrix(matrix2);
                l1Var.d2(matrix2);
                return;
            }
            return;
        }
        float x13 = ev2.getX() - this.f46273p.x;
        float y14 = ev2.getY() - this.f46273p.y;
        yt0.e eVar = this.f46262e;
        if (eVar != null) {
            f0 f0Var = (f0) eVar;
            Intrinsics.checkNotNullParameter(ev2, "ev");
            if (f0Var.x().contains(ev2.getX(), ev2.getY())) {
                if (!this.f46268k) {
                    f0Var.t().performHapticFeedback(1, 2);
                    nx.d0 pinalytics = this.f46266i;
                    Intrinsics.checkNotNullExpressionValue(pinalytics, "pinalytics");
                    pinalytics.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.STORY_PIN_ELEMENT_DELETE_ATTEMPT, (r18 & 2) != 0 ? null : kh2.p2.k0(g1Var.a0()), (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                this.f46268k = true;
                GestaltIconButton t13 = f0Var.t();
                t13.setScaleX(1.2f);
                t13.setScaleY(1.2f);
                RectF a13 = a();
                RectF x14 = f0Var.x();
                Matrix matrix3 = new Matrix();
                matrix3.setRectToRect(a13, x14, Matrix.ScaleToFit.CENTER);
                imageView.setImageMatrix(matrix3);
                return;
            }
        }
        if (this.f46268k) {
            this.f46268k = false;
            if (eVar != null) {
                GestaltIconButton t14 = ((f0) eVar).t();
                t14.setScaleX(1.0f);
                t14.setScaleY(1.0f);
            }
        }
        boolean z14 = System.currentTimeMillis() - ev2.getDownTime() > 120;
        if (!(x13 == 0.0f && y14 == 0.0f) && z14) {
            if (eVar != null) {
                com.bumptech.glide.c.u1(((f0) eVar).t());
            }
            Matrix matrix4 = new Matrix(matrix);
            PointF r14 = m1Var.r1(x13, y14, matrix4);
            matrix4.postTranslate(r14.x, r14.y);
            RectF S2 = kh2.p2.S(matrix4, g1Var.I0());
            if (v1Var != null) {
                w1 c15 = v1Var.c(S2, 0);
                matrix4.postTranslate(c15.f46354a, c15.f46355b);
                PointF pointF5 = this.f46273p;
                float f25 = pointF5.x;
                Float f26 = c15.f46357d;
                pointF5.x = f25 + (f26 != null ? f26.floatValue() : 0.0f);
                PointF pointF6 = this.f46273p;
                float f27 = pointF6.y;
                Float f28 = c15.f46358e;
                pointF6.y = f27 + (f28 != null ? f28.floatValue() : 0.0f);
            }
            imageView.setImageMatrix(matrix4);
            l1Var.d2(matrix4);
        }
    }

    public final void d(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        this.f46269l = false;
        this.f46270m = ph.a.y(ev2);
        this.f46271n = ph.a.C0(ev2);
        this.f46272o = ph.a.k(ev2);
        this.f46274q.set(this.f46259b.getImageMatrix());
        yt0.f fVar = this.f46263f;
        if (fVar != null) {
            f0 f0Var = (f0) fVar;
            bs1.c.X0(f0Var.q());
            f0Var.F0();
        }
        yt0.e eVar = this.f46262e;
        if (eVar != null) {
            com.bumptech.glide.c.d0(((f0) eVar).t());
        }
    }

    public final void e(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        h();
        yt0.f fVar = this.f46263f;
        if (fVar != null) {
            ((f0) fVar).o(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.view.MotionEvent r15) {
        /*
            r14 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            boolean r1 = r14.f46269l
            com.pinterest.feature.ideaPinCreation.closeup.view.g1 r2 = r14.f46258a
            java.lang.String r3 = "pinalytics"
            if (r1 == 0) goto L65
            yt0.e r1 = r14.f46262e
            if (r1 == 0) goto L65
            com.pinterest.feature.ideaPinCreation.closeup.view.f0 r1 = (com.pinterest.feature.ideaPinCreation.closeup.view.f0) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            android.graphics.RectF r0 = r1.x()
            float r1 = r15.getX()
            float r15 = r15.getY()
            boolean r15 = r0.contains(r1, r15)
            r0 = 1
            if (r15 != r0) goto L65
            com.pinterest.feature.ideaPinCreation.closeup.view.o1 r15 = r14.f46264g
            if (r15 == 0) goto L4a
            com.pinterest.feature.ideaPinCreation.closeup.view.l0 r0 = com.pinterest.feature.ideaPinCreation.closeup.view.l0.f46225p
            com.pinterest.feature.ideaPinCreation.closeup.view.f0 r15 = (com.pinterest.feature.ideaPinCreation.closeup.view.f0) r15
            java.lang.String r1 = "overlayView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.String r1 = "onCancel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            au0.d r15 = r15.f46164h0
            if (r15 == 0) goto L4a
            java.lang.String r0 = r2.X1()
            com.pinterest.api.model.uq r1 = r2.a0()
            r15.D3(r0, r1)
        L4a:
            nx.d0 r4 = r14.f46266i
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            h32.f1 r5 = h32.f1.STORY_PIN_ELEMENT_DELETED
            com.pinterest.api.model.uq r15 = r2.a0()
            h32.u0 r6 = kh2.p2.k0(r15)
            r11 = 0
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 508(0x1fc, float:7.12E-43)
            nx.d0.D(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L83
        L65:
            r14.h()
            nx.d0 r15 = r14.f46266i
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r3)
            android.widget.ImageView r0 = r14.f46259b
            android.graphics.Matrix r0 = r0.getImageMatrix()
            java.lang.String r1 = "getImageMatrix(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.pinterest.api.model.uq r1 = r2.a0()
            h32.u0 r1 = kh2.p2.k0(r1)
            ig1.b.H0(r15, r0, r1)
        L83:
            yt0.f r15 = r14.f46263f
            if (r15 == 0) goto L8a
            yt0.f.e(r15)
        L8a:
            r15 = 0
            r14.f46268k = r15
            r14.f46269l = r15
            r15 = 0
            r14.f46270m = r15
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r14.f46271n = r0
            android.graphics.Matrix r0 = r14.f46274q
            r0.reset()
            r14.f46272o = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.closeup.view.n1.f(android.view.MotionEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        this.f46268k = false;
        this.f46269l = false;
        this.f46270m = 0.0f;
        this.f46271n = new PointF();
        this.f46274q.reset();
        this.f46272o = 0.0f;
        yt0.f fVar = this.f46263f;
        if (fVar != null) {
            ((f0) fVar).o(false);
        }
        g1 overlayView = this.f46258a;
        o1 o1Var = this.f46264g;
        if (o1Var != null) {
            f0 f0Var = (f0) o1Var;
            Intrinsics.checkNotNullParameter(overlayView, "overlayView");
            if (!bs1.c.o1(f0Var.D())) {
                f0Var.d0().M(false);
                f0Var.m(overlayView, true);
            } else if (overlayView instanceof c1) {
                f0Var.n((c1) overlayView);
            } else if (overlayView instanceof u0) {
                f0Var.m(overlayView, false);
            } else if (overlayView instanceof s0) {
                f0Var.H0((View) overlayView);
            } else if (overlayView instanceof View) {
                f0Var.H0((View) overlayView);
            }
        }
        this.f46266i.X(kh2.p2.k0(overlayView.a0()));
    }

    public final void h() {
        Matrix imageMatrix = this.f46259b.getImageMatrix();
        Intrinsics.f(imageMatrix);
        vq J0 = ig1.b.J0(imageMatrix, a());
        o1 o1Var = this.f46264g;
        if (o1Var != null) {
            ((f0) o1Var).L0(this.f46258a.X1(), imageMatrix, J0);
        }
    }

    public final boolean i(float f13, float f14) {
        RectF a13 = a();
        Matrix imageMatrix = this.f46259b.getImageMatrix();
        Intrinsics.checkNotNullExpressionValue(imageMatrix, "getImageMatrix(...)");
        return ig1.b.J0(imageMatrix, a13).b(f13, f14);
    }

    public final boolean j(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (!this.f46267j) {
            return false;
        }
        if (ev2.getPointerCount() == 1) {
            return i(ev2.getX(), ev2.getY());
        }
        if (ev2.getPointerCount() != 2) {
            return false;
        }
        PointF C0 = ph.a.C0(ev2);
        return i(ev2.getX(), ev2.getY()) || i(C0.x, C0.y);
    }
}
