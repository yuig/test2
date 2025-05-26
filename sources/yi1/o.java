package yi1;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class o extends lb.l0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lb.l0 f139121c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f139122d;

    public o(com.pinterest.feature.pincarouselads.view.k kVar, p pVar) {
        this.f139121c = kVar;
        this.f139122d = pVar;
    }

    @Override // lb.l0
    public final void O0() {
        this.f139121c.O0();
    }

    @Override // lb.l0
    public final void P0(Bitmap bitmap, hs1.x xVar) {
        p pVar = this.f139122d;
        pVar.getClass();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        pVar.f139136x = new BitmapShader(bitmap, tileMode, tileMode);
        pVar.f139137y = bitmap;
        boolean d2 = qb0.b.d(bitmap);
        Paint paint = pVar.f139138z;
        if (d2) {
            paint.setColorFilter(pVar.A);
        } else {
            paint.setColorFilter(null);
        }
        this.f139121c.P0(bitmap, xVar);
        pVar.f139124l.invalidate();
    }
}
