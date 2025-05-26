package e81;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.ImageView;
import com.pinterest.api.model.vq;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final i f57783a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f57784b;

    /* renamed from: c, reason: collision with root package name */
    public final j f57785c;

    /* renamed from: d, reason: collision with root package name */
    public final t71.b f57786d;

    /* renamed from: e, reason: collision with root package name */
    public final t71.d f57787e;

    /* renamed from: f, reason: collision with root package name */
    public final m f57788f;

    /* renamed from: g, reason: collision with root package name */
    public final t71.c f57789g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f57790h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f57791i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f57792j;

    /* renamed from: k, reason: collision with root package name */
    public float f57793k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f57794l;

    /* renamed from: m, reason: collision with root package name */
    public float f57795m;

    /* renamed from: n, reason: collision with root package name */
    public PointF f57796n;

    /* renamed from: o, reason: collision with root package name */
    public final Matrix f57797o;

    public l(n view, ImageView overlayImageView, n constraintProvider, t71.b bVar, t71.d dVar, m mVar, t71.c cVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(overlayImageView, "overlayImageView");
        Intrinsics.checkNotNullParameter(constraintProvider, "constraintProvider");
        this.f57783a = view;
        this.f57784b = overlayImageView;
        this.f57785c = constraintProvider;
        this.f57786d = bVar;
        this.f57787e = dVar;
        this.f57788f = mVar;
        this.f57789g = cVar;
        this.f57790h = true;
        this.f57794l = new PointF();
        this.f57796n = new PointF();
        this.f57797o = new Matrix();
    }

    public final RectF a(Matrix matrix) {
        RectF rectF = new RectF(this.f57784b.getDrawable().getBounds());
        matrix.mapRect(rectF);
        return rectF;
    }

    public final void b() {
        ImageView imageView = this.f57784b;
        Matrix viewMatrix = imageView.getImageMatrix();
        Intrinsics.f(viewMatrix);
        RectF a13 = a(viewMatrix);
        vq J0 = ig1.b.J0(viewMatrix, new RectF(imageView.getDrawable().getBounds()));
        m mVar = this.f57788f;
        if (mVar != null) {
            String viewId = ((n) this.f57783a).f57808m;
            Intrinsics.checkNotNullParameter(viewId, "viewId");
            Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
            t71.i iVar = ((d) mVar).H0;
            if (iVar != null) {
                ((a81.g) iVar).x3(viewId, viewMatrix, a13, J0);
            }
        }
    }

    public final boolean c(float f13, float f14) {
        ImageView imageView = this.f57784b;
        Matrix imageMatrix = imageView.getImageMatrix();
        Intrinsics.checkNotNullExpressionValue(imageMatrix, "getImageMatrix(...)");
        return ig1.b.J0(imageMatrix, new RectF(imageView.getDrawable().getBounds())).b(f13, f14);
    }
}
