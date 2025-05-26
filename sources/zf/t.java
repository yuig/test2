package zf;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class t extends a {

    /* renamed from: h, reason: collision with root package name */
    public final sf.m f141880h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f141881i;

    /* renamed from: j, reason: collision with root package name */
    public float[] f141882j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f141883k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f141884l;

    public t(ag.j jVar, sf.m mVar, ag.g gVar) {
        super(jVar, gVar, mVar);
        this.f141881i = new Path();
        this.f141882j = new float[2];
        this.f141883k = new RectF();
        this.f141884l = new float[2];
        new RectF();
        new Path();
        this.f141880h = mVar;
        this.f141821e.setColor(-16777216);
        this.f141821e.setTextAlign(Paint.Align.CENTER);
        this.f141821e.setTextSize(ag.i.c(10.0f));
    }

    public void A() {
        ArrayList arrayList = this.f141880h.f112461s;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.f141884l;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        if (arrayList.size() <= 0) {
            return;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(0));
        throw null;
    }

    @Override // zf.a
    public void q(float f13, float f14) {
        if (((ag.j) this.f24333a).f15115b.width() > 10.0f && !((ag.j) this.f24333a).a()) {
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

    @Override // zf.a
    public final void r(float f13, float f14) {
        super.r(f13, f14);
        s();
    }

    public void s() {
        sf.m mVar = this.f141880h;
        String e13 = mVar.e();
        Paint paint = this.f141821e;
        paint.setTypeface(null);
        paint.setTextSize(mVar.f112472d);
        ag.a b13 = ag.i.b(paint, e13);
        float f13 = b13.f15081b;
        float a13 = ag.i.a(paint, "Q");
        ag.a d2 = ag.i.d(f13, a13);
        Math.round(f13);
        Math.round(a13);
        mVar.B = Math.round(d2.f15081b);
        mVar.C = Math.round(d2.f15082c);
        ag.a.f15080d.c(d2);
        ag.a.f15080d.c(b13);
    }

    public void t(Canvas canvas, float f13, float f14, Path path) {
        path.moveTo(f13, ((ag.j) this.f24333a).f15115b.bottom);
        path.lineTo(f13, ((ag.j) this.f24333a).f15115b.top);
        canvas.drawPath(path, this.f141820d);
        path.reset();
    }

    public final void u(Canvas canvas, String str, float f13, float f14, ag.d dVar) {
        Paint paint = this.f141821e;
        Paint.FontMetrics fontMetrics = ag.i.f15113j;
        float fontMetrics2 = paint.getFontMetrics(fontMetrics);
        paint.getTextBounds(str, 0, str.length(), ag.i.f15112i);
        float f15 = 0.0f - r4.left;
        float f16 = (-fontMetrics.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (dVar.f15087b != 0.0f || dVar.f15088c != 0.0f) {
            f15 -= r4.width() * dVar.f15087b;
            f16 -= fontMetrics2 * dVar.f15088c;
        }
        canvas.drawText(str, f15 + f13, f16 + f14, paint);
        paint.setTextAlign(textAlign);
    }

    public void v(Canvas canvas, float f13, ag.d dVar) {
        sf.m mVar = this.f141880h;
        mVar.getClass();
        int i13 = mVar.f112454l * 2;
        float[] fArr = new float[i13];
        for (int i14 = 0; i14 < i13; i14 += 2) {
            fArr[i14] = mVar.f112453k[i14 / 2];
        }
        this.f141819c.e(fArr);
        for (int i15 = 0; i15 < i13; i15 += 2) {
            float f14 = fArr[i15];
            ag.j jVar = (ag.j) this.f24333a;
            if (jVar.c(f14) && jVar.d(f14)) {
                u(canvas, mVar.f().E(mVar.f112453k[i15 / 2]), f14, f13, dVar);
            }
        }
    }

    public RectF w() {
        RectF rectF = this.f141883k;
        rectF.set(((ag.j) this.f24333a).f15115b);
        rectF.inset(-this.f141818b.f112450h, 0.0f);
        return rectF;
    }

    public void x(Canvas canvas) {
        sf.m mVar = this.f141880h;
        if (mVar.f112469a && mVar.f112460r) {
            float f13 = mVar.f112471c;
            Paint paint = this.f141821e;
            paint.setTypeface(null);
            paint.setTextSize(mVar.f112472d);
            paint.setColor(mVar.f112473e);
            ag.d b13 = ag.d.b(0.0f, 0.0f);
            sf.l lVar = mVar.D;
            if (lVar == sf.l.TOP) {
                b13.f15087b = 0.5f;
                b13.f15088c = 1.0f;
                v(canvas, ((ag.j) this.f24333a).f15115b.top - f13, b13);
            } else if (lVar == sf.l.TOP_INSIDE) {
                b13.f15087b = 0.5f;
                b13.f15088c = 1.0f;
                v(canvas, ((ag.j) this.f24333a).f15115b.top + f13 + mVar.C, b13);
            } else if (lVar == sf.l.BOTTOM) {
                b13.f15087b = 0.5f;
                b13.f15088c = 0.0f;
                v(canvas, ((ag.j) this.f24333a).f15115b.bottom + f13, b13);
            } else if (lVar == sf.l.BOTTOM_INSIDE) {
                b13.f15087b = 0.5f;
                b13.f15088c = 0.0f;
                v(canvas, (((ag.j) this.f24333a).f15115b.bottom - f13) - mVar.C, b13);
            } else {
                b13.f15087b = 0.5f;
                b13.f15088c = 1.0f;
                v(canvas, ((ag.j) this.f24333a).f15115b.top - f13, b13);
                b13.f15087b = 0.5f;
                b13.f15088c = 0.0f;
                v(canvas, ((ag.j) this.f24333a).f15115b.bottom + f13, b13);
            }
            ag.d.c(b13);
        }
    }

    public void y(Canvas canvas) {
        sf.m mVar = this.f141880h;
        if (mVar.f112459q && mVar.f112469a) {
            Paint paint = this.f141822f;
            paint.setColor(mVar.f112451i);
            paint.setStrokeWidth(mVar.f112452j);
            mVar.getClass();
            paint.setPathEffect(null);
            sf.l lVar = mVar.D;
            if (lVar == sf.l.TOP || lVar == sf.l.TOP_INSIDE || lVar == sf.l.BOTH_SIDED) {
                Object obj = this.f24333a;
                canvas.drawLine(((ag.j) obj).f15115b.left, ((ag.j) obj).f15115b.top, ((ag.j) obj).f15115b.right, ((ag.j) obj).f15115b.top, paint);
            }
            sf.l lVar2 = mVar.D;
            if (lVar2 == sf.l.BOTTOM || lVar2 == sf.l.BOTTOM_INSIDE || lVar2 == sf.l.BOTH_SIDED) {
                Object obj2 = this.f24333a;
                canvas.drawLine(((ag.j) obj2).f15115b.left, ((ag.j) obj2).f15115b.bottom, ((ag.j) obj2).f15115b.right, ((ag.j) obj2).f15115b.bottom, paint);
            }
        }
    }

    public final void z(Canvas canvas) {
        sf.m mVar = this.f141880h;
        if (mVar.f112458p && mVar.f112469a) {
            int save = canvas.save();
            canvas.clipRect(w());
            if (this.f141882j.length != this.f141818b.f112454l * 2) {
                this.f141882j = new float[mVar.f112454l * 2];
            }
            float[] fArr = this.f141882j;
            for (int i13 = 0; i13 < fArr.length; i13 += 2) {
                float[] fArr2 = mVar.f112453k;
                int i14 = i13 / 2;
                fArr[i13] = fArr2[i14];
                fArr[i13 + 1] = fArr2[i14];
            }
            this.f141819c.e(fArr);
            Paint paint = this.f141820d;
            paint.setColor(mVar.f112449g);
            paint.setStrokeWidth(mVar.f112450h);
            paint.setPathEffect(null);
            Path path = this.f141881i;
            path.reset();
            for (int i15 = 0; i15 < fArr.length; i15 += 2) {
                t(canvas, fArr[i15], fArr[i15 + 1], path);
            }
            canvas.restoreToCount(save);
        }
    }
}
