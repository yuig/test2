package js1;

import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import com.pinterest.kit.view.ImageCropperLayout;

/* loaded from: classes4.dex */
public final class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageCropperLayout f77574a;

    public b(ImageCropperLayout imageCropperLayout) {
        this.f77574a = imageCropperLayout;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        float currentSpanX = scaleGestureDetector.getPreviousSpanX() > 0.0f ? scaleGestureDetector.getCurrentSpanX() / scaleGestureDetector.getPreviousSpanX() : 1.0f;
        float currentSpanY = scaleGestureDetector.getPreviousSpanY() > 0.0f ? scaleGestureDetector.getCurrentSpanY() / scaleGestureDetector.getPreviousSpanY() : 1.0f;
        ImageCropperLayout imageCropperLayout = this.f77574a;
        float width = imageCropperLayout.f49867l.width() * currentSpanX;
        float height = imageCropperLayout.f49867l.height() * currentSpanY;
        if (imageCropperLayout.f49861f) {
            if (Math.abs(currentSpanX - 1.0f) > Math.abs(currentSpanY - 1.0f)) {
                height = ImageCropperLayout.c(width);
            } else {
                width = (height / 9.0f) * 16.0f;
            }
        }
        float f13 = height / 2.0f;
        imageCropperLayout.f49869n.top = Math.max(imageCropperLayout.f49868m.top, focusY - f13);
        float f14 = width / 2.0f;
        imageCropperLayout.f49869n.left = Math.max(imageCropperLayout.f49868m.left, focusX - f14);
        imageCropperLayout.f49869n.right = Math.min(imageCropperLayout.f49868m.right, focusX + f14);
        imageCropperLayout.f49869n.bottom = Math.min(imageCropperLayout.f49868m.bottom, focusY + f13);
        if (imageCropperLayout.i(imageCropperLayout.f49869n) || imageCropperLayout.f(imageCropperLayout.f49869n)) {
            return true;
        }
        RectF rectF = imageCropperLayout.f49869n;
        if (rectF.left >= rectF.right || rectF.top >= rectF.bottom) {
            return true;
        }
        imageCropperLayout.f49867l.set(rectF);
        imageCropperLayout.invalidate();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }
}
