package bk;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class u extends y {

    /* renamed from: c, reason: collision with root package name */
    public final w f23125c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23126d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23127e;

    public u(w wVar, float f13, float f14) {
        this.f23125c = wVar;
        this.f23126d = f13;
        this.f23127e = f14;
    }

    @Override // bk.y
    public final void a(Matrix matrix, ak.a aVar, int i13, Canvas canvas) {
        w wVar = this.f23125c;
        float f13 = wVar.f23136c;
        float f14 = this.f23127e;
        float f15 = wVar.f23135b;
        float f16 = this.f23126d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f13 - f14, f15 - f16), 0.0f);
        Matrix matrix2 = this.f23139a;
        matrix2.set(matrix);
        matrix2.preTranslate(f16, f14);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i13;
        rectF.offset(0.0f, -i13);
        int[] iArr = ak.a.f15446i;
        iArr[0] = aVar.f15455f;
        iArr[1] = aVar.f15454e;
        iArr[2] = aVar.f15453d;
        Paint paint = aVar.f15452c;
        float f17 = rectF.left;
        paint.setShader(new LinearGradient(f17, rectF.top, f17, rectF.bottom, iArr, ak.a.f15447j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        w wVar = this.f23125c;
        return (float) Math.toDegrees(Math.atan((wVar.f23136c - this.f23127e) / (wVar.f23135b - this.f23126d)));
    }
}
