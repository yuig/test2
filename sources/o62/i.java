package o62;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.ScaleGestureDetector;
import com.pinterest.shuffles.cutout.editor.ui.refine.EditMaskImageView;
import kotlin.jvm.internal.Intrinsics;
import ql2.s;

/* loaded from: classes4.dex */
public final class i extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92990a = 1;

    /* renamed from: b, reason: collision with root package name */
    public PointF f92991b = new PointF();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f92992c;

    public i(EditMaskImageView editMaskImageView) {
        this.f92992c = editMaskImageView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        ke2.d dVar;
        int i13 = this.f92990a;
        Object obj = this.f92992c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(detector, "detector");
                k kVar = (k) obj;
                if (kVar.f93009p == d.DEFAULT && (dVar = kVar.f93004k) != null && !oe.f.W0(dVar)) {
                    PointF pointF = new PointF(detector.getFocusX(), detector.getFocusY());
                    kVar.f93006m = detector.getScaleFactor() * kVar.f93006m;
                    boolean z13 = kVar.f92998e;
                    if (!z13 && !kVar.f92999f) {
                        PointF pointF2 = kVar.f93005l;
                        PointF pointF3 = this.f92991b;
                        PointF pointF4 = new PointF(pointF.x, pointF.y);
                        pointF4.offset(-pointF3.x, -pointF3.y);
                        PointF pointF5 = new PointF(pointF2.x, pointF2.y);
                        pointF5.offset(pointF4.x, pointF4.y);
                        kVar.f93005l = pointF5;
                    } else if (!z13) {
                        PointF pointF6 = kVar.f93005l;
                        float f13 = pointF6.y;
                        PointF pointF7 = this.f92991b;
                        PointF pointF8 = new PointF(pointF.x, pointF.y);
                        pointF8.offset(-pointF7.x, -pointF7.y);
                        pointF6.y = f13 + pointF8.y;
                    } else if (!kVar.f92999f) {
                        PointF pointF9 = kVar.f93005l;
                        float f14 = pointF9.x;
                        PointF pointF10 = this.f92991b;
                        PointF pointF11 = new PointF(pointF.x, pointF.y);
                        pointF11.offset(-pointF10.x, -pointF10.y);
                        pointF9.x = f14 + pointF11.x;
                    }
                    this.f92991b = pointF;
                    break;
                } else {
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(detector, "detector");
                PointF pointF12 = new PointF(detector.getFocusX(), detector.getFocusY());
                EditMaskImageView editMaskImageView = (EditMaskImageView) obj;
                float scaleFactor = detector.getScaleFactor() * editMaskImageView.f51953g;
                ql2.g gVar = EditMaskImageView.f51946q;
                float scaleFactor2 = gVar.a(Float.valueOf(scaleFactor)) ? detector.getScaleFactor() : 1.0f;
                editMaskImageView.f51953g = ((Number) s.k(Float.valueOf(scaleFactor), gVar)).floatValue();
                Matrix matrix = new Matrix(editMaskImageView.getImageMatrix());
                matrix.postScale(scaleFactor2, scaleFactor2, pointF12.x, pointF12.y);
                float f15 = pointF12.x;
                PointF pointF13 = this.f92991b;
                matrix.postTranslate(f15 - pointF13.x, pointF12.y - pointF13.y);
                editMaskImageView.setImageMatrix(matrix);
                this.f92991b = pointF12;
                break;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        int i13 = this.f92990a;
        Object obj = this.f92992c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(detector, "detector");
                k kVar = (k) obj;
                if (kVar.f93009p == d.DEFAULT) {
                    PointF pointF = new PointF(detector.getFocusX(), detector.getFocusY());
                    ke2.d dVar = kVar.f93004k;
                    if (dVar == null && ((dVar = k.a(kVar, new Point((int) pointF.x, (int) pointF.y))) == null || !(!oe.f.W0(dVar)))) {
                        dVar = null;
                    }
                    kVar.f93004k = dVar;
                    if (dVar != null && !oe.f.W0(dVar)) {
                        kVar.f93006m = dVar.f79319a.a();
                        kVar.f93005l = dVar.f79320b.f79304a;
                        this.f92991b = pointF;
                        return true;
                    }
                }
                return false;
            default:
                Intrinsics.checkNotNullParameter(detector, "detector");
                this.f92991b = new PointF(detector.getFocusX(), detector.getFocusY());
                return !Intrinsics.d(((EditMaskImageView) obj).f51961o.f128130b, Boolean.TRUE);
        }
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        switch (this.f92990a) {
            case 0:
                Intrinsics.checkNotNullParameter(detector, "detector");
                break;
            default:
                Intrinsics.checkNotNullParameter(detector, "detector");
                this.f92991b = new PointF();
                EditMaskImageView editMaskImageView = (EditMaskImageView) this.f92992c;
                x62.k kVar = editMaskImageView.f51954h;
                if (kVar != null) {
                    kVar.f133981a = editMaskImageView.i2();
                    break;
                }
                break;
        }
    }

    public i(k kVar) {
        this.f92992c = kVar;
    }
}
