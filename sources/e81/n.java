package e81;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.pinterest.feature.search.visual.collage.view.DotsIndicatorView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.imageview.WebImageViewContainer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import ql2.s;
import w01.e0;
import xk2.v;

/* loaded from: classes5.dex */
public final class n extends WebImageViewContainer implements h, i, j {

    /* renamed from: c, reason: collision with root package name */
    public final float f57798c;

    /* renamed from: d, reason: collision with root package name */
    public final float f57799d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f57800e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f57801f;

    /* renamed from: g, reason: collision with root package name */
    public final t71.b f57802g;

    /* renamed from: h, reason: collision with root package name */
    public final t71.d f57803h;

    /* renamed from: i, reason: collision with root package name */
    public final m f57804i;

    /* renamed from: j, reason: collision with root package name */
    public final t71.c f57805j;

    /* renamed from: k, reason: collision with root package name */
    public final float f57806k;

    /* renamed from: l, reason: collision with root package name */
    public final v f57807l;

    /* renamed from: m, reason: collision with root package name */
    public final String f57808m;

    /* renamed from: n, reason: collision with root package name */
    public final z71.b f57809n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, z71.h overlayItem, float f13, float f14, Function0 function0, Function0 function02, d dVar, d dVar2, d dVar3, d dVar4) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overlayItem, "overlayItem");
        this.f57798c = f13;
        this.f57799d = f14;
        this.f57800e = function0;
        this.f57801f = function02;
        this.f57802g = dVar;
        this.f57803h = dVar2;
        this.f57804i = dVar3;
        this.f57805j = dVar4;
        this.f57806k = ((180.0f * hf0.b.f69001a) * f13) / hf0.b.f69002b;
        this.f57807l = xk2.m.b(new e0(this, 29));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setTag(uc2.d.collage_tag_id, overlayItem.getConfig().getId());
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        b().setScaleType(scaleType);
        z71.f config = overlayItem.getConfig();
        z71.d collageItem = overlayItem.getCollageItem();
        Y(new oq.h(4, config, this));
        b().setImageBitmap(collageItem.getBitmap());
        this.f57808m = overlayItem.getConfig().getId();
        this.f57809n = z71.b.CUTOUT;
    }

    @Override // e81.h
    public final boolean G0() {
        return true;
    }

    @Override // e81.h
    public final void X() {
        int i13;
        l g13 = g();
        g13.f57790h = true;
        t71.d dVar = g13.f57787e;
        if (dVar != null) {
            d dVar2 = (d) dVar;
            i view = g13.f57783a;
            Intrinsics.checkNotNullParameter(view, "view");
            DotsIndicatorView dotsIndicatorView = dVar2.f57768o0;
            if (dotsIndicatorView == null) {
                Intrinsics.r("dotsIndicatorView");
                throw null;
            }
            t71.i iVar = dVar2.H0;
            if (iVar != null) {
                i13 = ((a81.g) iVar).p3(((n) view).f57808m);
            } else {
                i13 = 0;
            }
            dotsIndicatorView.b(i13);
            LinearLayoutCompat linearLayoutCompat = dVar2.f57767n0;
            if (linearLayoutCompat == null) {
                Intrinsics.r("dotsContainer");
                throw null;
            }
            bs1.c.U1(linearLayoutCompat);
            GestaltButton gestaltButton = dVar2.f57770q0;
            if (gestaltButton == null) {
                Intrinsics.r("saveCanvasButton");
                throw null;
            }
            a0.l0(gestaltButton);
            GestaltIconButton gestaltIconButton = dVar2.f57771r0;
            if (gestaltIconButton == null) {
                Intrinsics.r("navigationButton");
                throw null;
            }
            com.bumptech.glide.c.d0(gestaltIconButton);
            dVar2.b8(true);
        }
        g13.f57784b.performHapticFeedback(1, 2);
    }

    @Override // e81.h
    public final void e(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        l g13 = g();
        g13.getClass();
        Intrinsics.checkNotNullParameter(ev2, "ev");
        g13.f57790h = false;
        g13.f57792j = true;
        g13.f57796n = new PointF(ev2.getX(), ev2.getY());
        g13.f57797o.set(g13.f57784b.getImageMatrix());
    }

    public final l g() {
        return (l) this.f57807l.getValue();
    }

    @Override // e81.h
    public final void i(MotionEvent ev2) {
        boolean z13;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        l g13 = g();
        g13.getClass();
        Intrinsics.checkNotNullParameter(ev2, "ev");
        boolean z14 = g13.f57790h;
        i view = g13.f57783a;
        if (z14) {
            float f13 = 80;
            float f14 = g13.f57796n.y + f13;
            float y13 = ev2.getY();
            t71.c cVar = g13.f57789g;
            if (f14 < y13) {
                g13.f57796n.y = ev2.getY();
                if (cVar != null) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    t71.i iVar = ((d) cVar).H0;
                    if (iVar != null) {
                        ((a81.g) iVar).v3(t71.h.DOWN, ((n) view).f57808m);
                    }
                }
            }
            if (g13.f57796n.y - f13 > ev2.getY()) {
                g13.f57796n.y = ev2.getY();
                if (cVar != null) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    t71.i iVar2 = ((d) cVar).H0;
                    if (iVar2 != null) {
                        ((a81.g) iVar2).v3(t71.h.UP, ((n) view).f57808m);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z15 = g13.f57792j;
        Matrix matrix = g13.f57797o;
        ImageView imageView = g13.f57784b;
        m mVar = g13.f57788f;
        j jVar = g13.f57785c;
        if (!z15) {
            if (ev2.getPointerCount() == 2) {
                float f15 = ph.a.C0(ev2).x - g13.f57794l.x;
                float f16 = ph.a.C0(ev2).y - g13.f57794l.y;
                float y14 = ph.a.y(ev2) / g13.f57793k;
                Matrix viewMatrix = new Matrix(matrix);
                n nVar = (n) jVar;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
                float b03 = ig1.b.b0(viewMatrix);
                float f17 = s.f(y14 * b03, 0.33f, 6.0f) / b03;
                PointF pointF = g13.f57794l;
                viewMatrix.postScale(f17, f17, pointF.x, pointF.y);
                PointF j13 = nVar.j(f15, f16, viewMatrix);
                viewMatrix.postTranslate(j13.x, j13.y);
                float U = ph.a.U(ph.a.k(ev2) - g13.f57795m);
                PointF pointF2 = g13.f57794l;
                viewMatrix.postRotate(U, pointF2.x, pointF2.y);
                PointF e83 = mVar != null ? ((d) mVar).e8(view, g13.a(viewMatrix), viewMatrix) : null;
                if (e83 != null) {
                    viewMatrix.postTranslate(e83.x, e83.y);
                }
                imageView.setImageMatrix(viewMatrix);
                return;
            }
            return;
        }
        float x13 = ev2.getX() - g13.f57796n.x;
        float y15 = ev2.getY() - g13.f57796n.y;
        t71.b bVar = g13.f57786d;
        if (bVar != null) {
            d dVar = (d) bVar;
            Intrinsics.checkNotNullParameter(ev2, "ev");
            xk2.k kVar = dVar.J0;
            z13 = true;
            if (((RectF) kVar.getValue()).contains(ev2.getX(), ev2.getY())) {
                if (!g13.f57791i) {
                    ImageView imageView2 = dVar.f57769p0;
                    if (imageView2 == null) {
                        Intrinsics.r("deleteButton");
                        throw null;
                    }
                    imageView2.performHapticFeedback(1, 2);
                }
                g13.f57791i = true;
                ImageView imageView3 = dVar.f57769p0;
                if (imageView3 == null) {
                    Intrinsics.r("deleteButton");
                    throw null;
                }
                imageView3.setScaleX(1.2f);
                imageView3.setScaleY(1.2f);
                RectF rectF = new RectF(imageView.getDrawable().getBounds());
                RectF rectF2 = (RectF) kVar.getValue();
                Matrix matrix2 = new Matrix();
                matrix2.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                imageView.setImageMatrix(matrix2);
                return;
            }
        } else {
            z13 = true;
        }
        if (g13.f57791i) {
            g13.f57791i = false;
            if (bVar != null) {
                ImageView imageView4 = ((d) bVar).f57769p0;
                if (imageView4 == null) {
                    Intrinsics.r("deleteButton");
                    throw null;
                }
                imageView4.setScaleX(1.0f);
                imageView4.setScaleY(1.0f);
            }
        }
        boolean z16 = System.currentTimeMillis() - ev2.getDownTime() > 120 ? z13 : false;
        if (!(x13 == 0.0f && y15 == 0.0f) && z16) {
            if (bVar != null) {
                ImageView imageView5 = ((d) bVar).f57769p0;
                if (imageView5 == null) {
                    Intrinsics.r("deleteButton");
                    throw null;
                }
                bs1.c.U1(imageView5);
            }
            Matrix matrix3 = new Matrix(matrix);
            PointF j14 = ((n) jVar).j(x13, y15, matrix3);
            matrix3.postTranslate(j14.x, j14.y);
            PointF e84 = mVar != null ? ((d) mVar).e8(view, g13.a(matrix3), matrix3) : null;
            if (e84 != null) {
                matrix3.postTranslate(e84.x, e84.y);
            }
            imageView.setImageMatrix(matrix3);
        }
    }

    public final PointF j(float f13, float f14, Matrix viewMatrix) {
        float f15;
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        Matrix matrix = new Matrix(viewMatrix);
        matrix.postTranslate(f13, f14);
        RectF rectF = new RectF(getDrawable().getBounds());
        matrix.mapRect(rectF);
        float W = bs1.c.W(this, eo1.c.space_400);
        float f16 = this.f57798c - W;
        float f17 = rectF.left;
        float f18 = 0.0f;
        if (f17 > f16) {
            f15 = f16 - f17;
        } else {
            float f19 = rectF.right;
            f15 = f19 < W ? W - f19 : 0.0f;
        }
        float f23 = rectF.top;
        float f24 = 0;
        if (f23 < f24) {
            f18 = f24 - f23;
        } else {
            float f25 = rectF.bottom;
            float f26 = this.f57799d;
            if (f25 > f26) {
                f18 = f26 - f25;
            }
        }
        return new PointF(f13 + f15, f14 + f18);
    }

    @Override // e81.h
    public final void l(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        l g13 = g();
        g13.getClass();
        Intrinsics.checkNotNullParameter(ev2, "ev");
        g13.f57792j = false;
        g13.f57793k = ph.a.y(ev2);
        g13.f57794l = ph.a.C0(ev2);
        g13.f57795m = ph.a.k(ev2);
        g13.f57797o.set(g13.f57784b.getImageMatrix());
        t71.b bVar = g13.f57786d;
        if (bVar != null) {
            ImageView imageView = ((d) bVar).f57769p0;
            if (imageView != null) {
                bs1.c.X0(imageView);
            } else {
                Intrinsics.r("deleteButton");
                throw null;
            }
        }
    }

    @Override // e81.h
    public final boolean n(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (getVisibility() == 0) {
            l g13 = g();
            g13.getClass();
            Intrinsics.checkNotNullParameter(ev2, "ev");
            if (ev2.getPointerCount() == 1) {
                if (g13.c(ev2.getX(), ev2.getY())) {
                    return true;
                }
            } else if (ev2.getPointerCount() == 2) {
                PointF C0 = ph.a.C0(ev2);
                if (g13.c(ev2.getX(), ev2.getY()) || g13.c(C0.x, C0.y)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // e81.h
    public final void o(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        l g13 = g();
        g13.getClass();
        Intrinsics.checkNotNullParameter(ev2, "ev");
        t71.d dVar = g13.f57787e;
        if (dVar != null) {
            ((d) dVar).b8(true);
        }
    }

    @Override // e81.h
    public final void q(MotionEvent ev2) {
        t71.b bVar;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        l g13 = g();
        g13.getClass();
        Intrinsics.checkNotNullParameter(ev2, "ev");
        boolean z13 = g13.f57790h;
        t71.d dVar = g13.f57787e;
        if (z13) {
            g13.f57790h = false;
            if (dVar != null) {
                d dVar2 = (d) dVar;
                LinearLayoutCompat linearLayoutCompat = dVar2.f57767n0;
                if (linearLayoutCompat == null) {
                    Intrinsics.r("dotsContainer");
                    throw null;
                }
                bs1.c.X0(linearLayoutCompat);
                GestaltButton gestaltButton = dVar2.f57770q0;
                if (gestaltButton == null) {
                    Intrinsics.r("saveCanvasButton");
                    throw null;
                }
                a0.v1(gestaltButton);
                GestaltIconButton gestaltIconButton = dVar2.f57771r0;
                if (gestaltIconButton == null) {
                    Intrinsics.r("navigationButton");
                    throw null;
                }
                com.bumptech.glide.c.u1(gestaltIconButton);
            }
            g13.b();
        } else {
            if (g13.f57792j && (bVar = g13.f57786d) != null) {
                Intrinsics.checkNotNullParameter(ev2, "ev");
                if (((RectF) ((d) bVar).J0.getValue()).contains(ev2.getX(), ev2.getY())) {
                    m mVar = g13.f57788f;
                    if (mVar != null) {
                        k onCancel = k.f57782i;
                        i overlayView = g13.f57783a;
                        Intrinsics.checkNotNullParameter(overlayView, "overlayView");
                        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                        t71.i iVar = ((d) mVar).H0;
                        if (iVar != null) {
                            n nVar = (n) overlayView;
                            ((a81.g) iVar).u3(nVar.f57808m, nVar.f57809n);
                        }
                    }
                }
            }
            g13.b();
        }
        if (dVar != null) {
            ((d) dVar).b8(true);
        }
        g13.f57791i = false;
        g13.f57792j = false;
        g13.f57793k = 0.0f;
        g13.f57794l = new PointF();
        g13.f57797o.reset();
        g13.f57795m = 0.0f;
    }

    @Override // e81.h
    public final boolean t() {
        return true;
    }
}
