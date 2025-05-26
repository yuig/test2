package fc;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.v;
import com.airbnb.lottie.y;
import zb.u;

/* loaded from: classes3.dex */
public final class l extends c {
    public final RectF C;
    public final xb.a D;
    public final float[] E;
    public final Path F;
    public final i G;
    public u H;
    public u I;

    public l(v vVar, i iVar) {
        super(vVar, iVar);
        this.C = new RectF();
        xb.a aVar = new xb.a();
        this.D = aVar;
        this.E = new float[8];
        this.F = new Path();
        this.G = iVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(iVar.f61659l);
    }

    @Override // fc.c, yb.e
    public final void c(RectF rectF, Matrix matrix, boolean z13) {
        super.c(rectF, matrix, z13);
        RectF rectF2 = this.C;
        i iVar = this.G;
        rectF2.set(0.0f, 0.0f, iVar.f61657j, iVar.f61658k);
        this.f61634n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // fc.c, cc.g
    public final void d(androidx.appcompat.app.d dVar, Object obj) {
        super.d(dVar, obj);
        if (obj == y.F) {
            if (dVar == null) {
                this.H = null;
                return;
            } else {
                this.H = new u(dVar, null);
                return;
            }
        }
        if (obj == 1) {
            if (dVar != null) {
                this.I = new u(dVar, null);
                return;
            }
            this.I = null;
            this.D.setColor(this.G.f61659l);
        }
    }

    @Override // fc.c
    public final void k(Canvas canvas, Matrix matrix, int i13) {
        i iVar = this.G;
        int alpha = Color.alpha(iVar.f61659l);
        if (alpha == 0) {
            return;
        }
        u uVar = this.I;
        Integer num = uVar == null ? null : (Integer) uVar.g();
        xb.a aVar = this.D;
        if (num != null) {
            aVar.setColor(num.intValue());
        } else {
            aVar.setColor(iVar.f61659l);
        }
        int intValue = (int) ((((alpha / 255.0f) * (this.f61643w.f141543j == null ? 100 : ((Integer) r2.g()).intValue())) / 100.0f) * (i13 / 255.0f) * 255.0f);
        aVar.setAlpha(intValue);
        u uVar2 = this.H;
        if (uVar2 != null) {
            aVar.setColorFilter((ColorFilter) uVar2.g());
        }
        if (intValue > 0) {
            float[] fArr = this.E;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f13 = iVar.f61657j;
            fArr[2] = f13;
            fArr[3] = 0.0f;
            fArr[4] = f13;
            float f14 = iVar.f61658k;
            fArr[5] = f14;
            fArr[6] = 0.0f;
            fArr[7] = f14;
            matrix.mapPoints(fArr);
            Path path = this.F;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar);
        }
    }
}
