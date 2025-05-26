package zf;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class u extends t {

    /* renamed from: m, reason: collision with root package name */
    public Path f141885m;

    @Override // zf.t
    public final void A() {
        ArrayList arrayList = this.f141880h.f112461s;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.f141884l;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        this.f141885m.reset();
        if (arrayList.size() <= 0) {
            return;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(0));
        throw null;
    }

    @Override // zf.t, zf.a
    public final void q(float f13, float f14) {
        if (((ag.j) this.f24333a).f15115b.width() > 10.0f && !((ag.j) this.f24333a).b()) {
            RectF rectF = ((ag.j) this.f24333a).f15115b;
            float f15 = rectF.left;
            float f16 = rectF.bottom;
            ag.g gVar = this.f141819c;
            ag.c b13 = gVar.b(f15, f16);
            RectF rectF2 = ((ag.j) this.f24333a).f15115b;
            ag.c b14 = gVar.b(rectF2.left, rectF2.top);
            float f17 = (float) b13.f15085c;
            float f18 = (float) b14.f15085c;
            ag.c.c(b13);
            ag.c.c(b14);
            f13 = f17;
            f14 = f18;
        }
        r(f13, f14);
    }

    @Override // zf.t
    public final void s() {
        Paint paint = this.f141821e;
        sf.m mVar = this.f141880h;
        mVar.getClass();
        paint.setTypeface(null);
        paint.setTextSize(mVar.f112472d);
        ag.a b13 = ag.i.b(paint, mVar.e());
        float f13 = b13.f15081b;
        float f14 = (int) ((mVar.f112470b * 3.5f) + f13);
        float f15 = b13.f15082c;
        ag.a d2 = ag.i.d(f13, f15);
        Math.round(f14);
        Math.round(f15);
        mVar.B = (int) ((mVar.f112470b * 3.5f) + d2.f15081b);
        mVar.C = Math.round(d2.f15082c);
        ag.a.f15080d.c(d2);
    }

    @Override // zf.t
    public final void t(Canvas canvas, float f13, float f14, Path path) {
        path.moveTo(((ag.j) this.f24333a).f15115b.right, f14);
        path.lineTo(((ag.j) this.f24333a).f15115b.left, f14);
        canvas.drawPath(path, this.f141820d);
        path.reset();
    }

    @Override // zf.t
    public final void v(Canvas canvas, float f13, ag.d dVar) {
        sf.m mVar = this.f141880h;
        mVar.getClass();
        int i13 = mVar.f112454l * 2;
        float[] fArr = new float[i13];
        for (int i14 = 0; i14 < i13; i14 += 2) {
            fArr[i14 + 1] = mVar.f112453k[i14 / 2];
        }
        this.f141819c.e(fArr);
        for (int i15 = 0; i15 < i13; i15 += 2) {
            float f14 = fArr[i15 + 1];
            if (((ag.j) this.f24333a).e(f14)) {
                u(canvas, mVar.f().E(mVar.f112453k[i15 / 2]), f13, f14, dVar);
            }
        }
    }

    @Override // zf.t
    public final RectF w() {
        RectF rectF = this.f141883k;
        rectF.set(((ag.j) this.f24333a).f15115b);
        rectF.inset(0.0f, -this.f141818b.f112450h);
        return rectF;
    }

    @Override // zf.t
    public final void x(Canvas canvas) {
        sf.m mVar = this.f141880h;
        if (mVar.f112469a && mVar.f112460r) {
            float f13 = mVar.f112470b;
            Paint paint = this.f141821e;
            paint.setTypeface(null);
            paint.setTextSize(mVar.f112472d);
            paint.setColor(mVar.f112473e);
            ag.d b13 = ag.d.b(0.0f, 0.0f);
            sf.l lVar = mVar.D;
            if (lVar == sf.l.TOP) {
                b13.f15087b = 0.0f;
                b13.f15088c = 0.5f;
                v(canvas, ((ag.j) this.f24333a).f15115b.right + f13, b13);
            } else if (lVar == sf.l.TOP_INSIDE) {
                b13.f15087b = 1.0f;
                b13.f15088c = 0.5f;
                v(canvas, ((ag.j) this.f24333a).f15115b.right - f13, b13);
            } else if (lVar == sf.l.BOTTOM) {
                b13.f15087b = 1.0f;
                b13.f15088c = 0.5f;
                v(canvas, ((ag.j) this.f24333a).f15115b.left - f13, b13);
            } else if (lVar == sf.l.BOTTOM_INSIDE) {
                b13.f15087b = 1.0f;
                b13.f15088c = 0.5f;
                v(canvas, ((ag.j) this.f24333a).f15115b.left + f13, b13);
            } else {
                b13.f15087b = 0.0f;
                b13.f15088c = 0.5f;
                v(canvas, ((ag.j) this.f24333a).f15115b.right + f13, b13);
                b13.f15087b = 1.0f;
                b13.f15088c = 0.5f;
                v(canvas, ((ag.j) this.f24333a).f15115b.left - f13, b13);
            }
            ag.d.c(b13);
        }
    }

    @Override // zf.t
    public final void y(Canvas canvas) {
        sf.m mVar = this.f141880h;
        if (mVar.f112459q && mVar.f112469a) {
            Paint paint = this.f141822f;
            paint.setColor(mVar.f112451i);
            paint.setStrokeWidth(mVar.f112452j);
            sf.l lVar = mVar.D;
            if (lVar == sf.l.TOP || lVar == sf.l.TOP_INSIDE || lVar == sf.l.BOTH_SIDED) {
                Object obj = this.f24333a;
                canvas.drawLine(((ag.j) obj).f15115b.right, ((ag.j) obj).f15115b.top, ((ag.j) obj).f15115b.right, ((ag.j) obj).f15115b.bottom, paint);
            }
            sf.l lVar2 = mVar.D;
            if (lVar2 == sf.l.BOTTOM || lVar2 == sf.l.BOTTOM_INSIDE || lVar2 == sf.l.BOTH_SIDED) {
                Object obj2 = this.f24333a;
                canvas.drawLine(((ag.j) obj2).f15115b.left, ((ag.j) obj2).f15115b.top, ((ag.j) obj2).f15115b.left, ((ag.j) obj2).f15115b.bottom, paint);
            }
        }
    }
}
