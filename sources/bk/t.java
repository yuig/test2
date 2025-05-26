package bk;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class t extends y {

    /* renamed from: c, reason: collision with root package name */
    public final v f23124c;

    public t(v vVar) {
        this.f23124c = vVar;
    }

    @Override // bk.y
    public final void a(Matrix matrix, ak.a aVar, int i13, Canvas canvas) {
        v vVar = this.f23124c;
        float f13 = vVar.f23133f;
        float f14 = vVar.f23134g;
        RectF rectF = new RectF(vVar.f23129b, vVar.f23130c, vVar.f23131d, vVar.f23132e);
        aVar.getClass();
        boolean z13 = f14 < 0.0f;
        Path path = aVar.f15456g;
        int[] iArr = ak.a.f15448k;
        if (z13) {
            iArr[0] = 0;
            iArr[1] = aVar.f15455f;
            iArr[2] = aVar.f15454e;
            iArr[3] = aVar.f15453d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f13, f14);
            path.close();
            float f15 = -i13;
            rectF.inset(f15, f15);
            iArr[0] = 0;
            iArr[1] = aVar.f15453d;
            iArr[2] = aVar.f15454e;
            iArr[3] = aVar.f15455f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f16 = 1.0f - (i13 / width);
        float[] fArr = ak.a.f15449l;
        fArr[1] = f16;
        fArr[2] = ((1.0f - f16) / 2.0f) + f16;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f15451b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z13) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f15457h);
        }
        canvas.drawArc(rectF, f13, f14, true, paint);
        canvas.restore();
    }
}
