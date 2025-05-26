package e81;

import a.cb;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.pinterest.feature.search.visual.collage.view.CollageInteractiveImageView;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class g extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CollageInteractiveImageView f57780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z71.g f57781b;

    public g(CollageInteractiveImageView collageInteractiveImageView, z71.g gVar) {
        this.f57780a = collageInteractiveImageView;
        this.f57781b = gVar;
    }

    @Override // hs1.c
    public final void a(boolean z13) {
        Unit unit;
        CollageInteractiveImageView collageInteractiveImageView = this.f57780a;
        Bitmap bitmap = collageInteractiveImageView.C;
        if (bitmap != null) {
            collageInteractiveImageView.P = bitmap.getWidth();
            collageInteractiveImageView.Q = bitmap.getHeight();
            float width = collageInteractiveImageView.N.width();
            float height = collageInteractiveImageView.N.height();
            float width2 = collageInteractiveImageView.N.width() * 0.33f;
            collageInteractiveImageView.O = Math.max(width2 / width, width2 / height);
            Matrix matrix = this.f57781b.getConfig().getMatrix();
            if (matrix != null) {
                collageInteractiveImageView.setImageMatrix(matrix);
                unit = Unit.f80348a;
            } else {
                unit = null;
            }
            if (unit == null) {
                Matrix matrix2 = new Matrix();
                int i13 = collageInteractiveImageView.P;
                int i14 = collageInteractiveImageView.Q;
                if (i13 >= i14) {
                    matrix2.setRectToRect(new RectF(0.0f, 0.0f, collageInteractiveImageView.P, collageInteractiveImageView.Q), new RectF(0.0f, 0.0f, width, height), Matrix.ScaleToFit.CENTER);
                } else {
                    float max = Math.max(width / i13, height / i14);
                    matrix2.postScale(max, max);
                    matrix2.postTranslate(cb.a(collageInteractiveImageView.P, max, width, 2.0f), cb.a(collageInteractiveImageView.Q, max, height, 2.0f));
                }
                collageInteractiveImageView.setImageMatrix(matrix2);
                collageInteractiveImageView.D2();
            }
        }
    }
}
