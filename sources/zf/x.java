package zf;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class x extends w {

    /* renamed from: n, reason: collision with root package name */
    public final Path f141893n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f141894o;

    public x(ag.j jVar, sf.p pVar, ag.g gVar) {
        super(jVar, pVar, gVar);
        new Path();
        this.f141893n = new Path();
        this.f141894o = new float[4];
        this.f141823g.setTextAlign(Paint.Align.LEFT);
    }

    @Override // zf.a
    public final void q(float f13, float f14) {
        if (((ag.j) this.f24333a).f15115b.height() > 10.0f && !((ag.j) this.f24333a).a()) {
            RectF rectF = ((ag.j) this.f24333a).f15115b;
            float f15 = rectF.left;
            float f16 = rectF.top;
            ag.g gVar = this.f141819c;
            ag.c b13 = gVar.b(f15, f16);
            RectF rectF2 = ((ag.j) this.f24333a).f15115b;
            ag.c b14 = gVar.b(rectF2.right, rectF2.top);
            float f17 = (float) b13.f15084b;
            float f18 = (float) b14.f15084b;
            ag.c.c(b13);
            ag.c.c(b14);
            f13 = f17;
            f14 = f18;
        }
        r(f13, f14);
    }

    @Override // zf.w
    public final void s(Canvas canvas, float f13, float[] fArr, float f14) {
        Paint paint = this.f141821e;
        sf.p pVar = this.f141887h;
        pVar.getClass();
        paint.setTypeface(null);
        paint.setTextSize(pVar.f112472d);
        paint.setColor(pVar.f112473e);
        int i13 = pVar.C ? pVar.f112454l : pVar.f112454l - 1;
        for (int i14 = !pVar.B ? 1 : 0; i14 < i13; i14++) {
            canvas.drawText(pVar.d(i14), fArr[i14 * 2], f13 - f14, paint);
        }
    }

    @Override // zf.w
    public final RectF t() {
        RectF rectF = this.f141889j;
        rectF.set(((ag.j) this.f24333a).f15115b);
        rectF.inset(-this.f141818b.f112450h, 0.0f);
        return rectF;
    }

    @Override // zf.w
    public final float[] u() {
        int length = this.f141890k.length;
        sf.p pVar = this.f141887h;
        int i13 = pVar.f112454l;
        if (length != i13 * 2) {
            this.f141890k = new float[i13 * 2];
        }
        float[] fArr = this.f141890k;
        for (int i14 = 0; i14 < fArr.length; i14 += 2) {
            fArr[i14] = pVar.f112453k[i14 / 2];
        }
        this.f141819c.e(fArr);
        return fArr;
    }

    @Override // zf.w
    public final Path v(Path path, int i13, float[] fArr) {
        path.moveTo(fArr[i13], ((ag.j) this.f24333a).f15115b.top);
        path.lineTo(fArr[i13], ((ag.j) this.f24333a).f15115b.bottom);
        return path;
    }

    @Override // zf.w
    public final void w(Canvas canvas) {
        float f13;
        sf.p pVar = this.f141887h;
        if (pVar.f112469a && pVar.f112460r) {
            float[] u13 = u();
            Paint paint = this.f141821e;
            paint.setTypeface(null);
            paint.setTextSize(pVar.f112472d);
            paint.setColor(pVar.f112473e);
            paint.setTextAlign(Paint.Align.CENTER);
            float c13 = ag.i.c(2.5f);
            float a13 = ag.i.a(paint, "Q");
            sf.n nVar = pVar.G;
            sf.o oVar = pVar.F;
            if (nVar == sf.n.LEFT) {
                f13 = (oVar == sf.o.OUTSIDE_CHART ? ((ag.j) this.f24333a).f15115b.top : ((ag.j) this.f24333a).f15115b.top) - c13;
            } else {
                f13 = (oVar == sf.o.OUTSIDE_CHART ? ((ag.j) this.f24333a).f15115b.bottom : ((ag.j) this.f24333a).f15115b.bottom) + a13 + c13;
            }
            s(canvas, f13, u13, pVar.f112471c);
        }
    }

    @Override // zf.w
    public final void x(Canvas canvas) {
        sf.p pVar = this.f141887h;
        if (pVar.f112469a && pVar.f112459q) {
            Paint paint = this.f141822f;
            paint.setColor(pVar.f112451i);
            paint.setStrokeWidth(pVar.f112452j);
            if (pVar.G == sf.n.LEFT) {
                Object obj = this.f24333a;
                canvas.drawLine(((ag.j) obj).f15115b.left, ((ag.j) obj).f15115b.top, ((ag.j) obj).f15115b.right, ((ag.j) obj).f15115b.top, paint);
            } else {
                Object obj2 = this.f24333a;
                canvas.drawLine(((ag.j) obj2).f15115b.left, ((ag.j) obj2).f15115b.bottom, ((ag.j) obj2).f15115b.right, ((ag.j) obj2).f15115b.bottom, paint);
            }
        }
    }

    @Override // zf.w
    public final void z() {
        ArrayList arrayList = this.f141887h.f112461s;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.f141894o;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        this.f141893n.reset();
        if (arrayList.size() <= 0) {
            return;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(0));
        throw null;
    }
}
