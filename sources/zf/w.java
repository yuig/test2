package zf;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class w extends a {

    /* renamed from: h, reason: collision with root package name */
    public final sf.p f141887h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f141888i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f141889j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f141890k;

    /* renamed from: l, reason: collision with root package name */
    public final Path f141891l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f141892m;

    public w(ag.j jVar, sf.p pVar, ag.g gVar) {
        super(jVar, gVar, pVar);
        this.f141888i = new Path();
        this.f141889j = new RectF();
        this.f141890k = new float[2];
        new Path();
        new RectF();
        this.f141891l = new Path();
        this.f141892m = new float[2];
        new RectF();
        this.f141887h = pVar;
        if (((ag.j) this.f24333a) != null) {
            this.f141821e.setColor(-16777216);
            this.f141821e.setTextSize(ag.i.c(10.0f));
            Paint paint = new Paint(1);
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public void s(Canvas canvas, float f13, float[] fArr, float f14) {
        sf.p pVar = this.f141887h;
        int i13 = pVar.C ? pVar.f112454l : pVar.f112454l - 1;
        for (int i14 = !pVar.B ? 1 : 0; i14 < i13; i14++) {
            canvas.drawText(pVar.d(i14), f13, fArr[(i14 * 2) + 1] + f14, this.f141821e);
        }
    }

    public RectF t() {
        RectF rectF = this.f141889j;
        rectF.set(((ag.j) this.f24333a).f15115b);
        rectF.inset(0.0f, -this.f141818b.f112450h);
        return rectF;
    }

    public float[] u() {
        int length = this.f141890k.length;
        sf.p pVar = this.f141887h;
        int i13 = pVar.f112454l;
        if (length != i13 * 2) {
            this.f141890k = new float[i13 * 2];
        }
        float[] fArr = this.f141890k;
        for (int i14 = 0; i14 < fArr.length; i14 += 2) {
            fArr[i14 + 1] = pVar.f112453k[i14 / 2];
        }
        this.f141819c.e(fArr);
        return fArr;
    }

    public Path v(Path path, int i13, float[] fArr) {
        int i14 = i13 + 1;
        path.moveTo(((ag.j) this.f24333a).f15115b.left, fArr[i14]);
        path.lineTo(((ag.j) this.f24333a).f15115b.right, fArr[i14]);
        return path;
    }

    public void w(Canvas canvas) {
        float f13;
        float f14;
        float f15;
        sf.p pVar = this.f141887h;
        if (pVar.f112469a && pVar.f112460r) {
            float[] u13 = u();
            Paint paint = this.f141821e;
            paint.setTypeface(null);
            paint.setTextSize(pVar.f112472d);
            paint.setColor(pVar.f112473e);
            float f16 = pVar.f112470b;
            float a13 = (ag.i.a(paint, "A") / 2.5f) + pVar.f112471c;
            sf.n nVar = pVar.G;
            sf.o oVar = pVar.F;
            if (nVar == sf.n.LEFT) {
                if (oVar == sf.o.OUTSIDE_CHART) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    f13 = ((ag.j) this.f24333a).f15115b.left;
                    f15 = f13 - f16;
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    f14 = ((ag.j) this.f24333a).f15115b.left;
                    f15 = f14 + f16;
                }
            } else if (oVar == sf.o.OUTSIDE_CHART) {
                paint.setTextAlign(Paint.Align.LEFT);
                f14 = ((ag.j) this.f24333a).f15115b.right;
                f15 = f14 + f16;
            } else {
                paint.setTextAlign(Paint.Align.RIGHT);
                f13 = ((ag.j) this.f24333a).f15115b.right;
                f15 = f13 - f16;
            }
            s(canvas, f15, u13, a13);
        }
    }

    public void x(Canvas canvas) {
        sf.p pVar = this.f141887h;
        if (pVar.f112469a && pVar.f112459q) {
            Paint paint = this.f141822f;
            paint.setColor(pVar.f112451i);
            paint.setStrokeWidth(pVar.f112452j);
            if (pVar.G == sf.n.LEFT) {
                Object obj = this.f24333a;
                canvas.drawLine(((ag.j) obj).f15115b.left, ((ag.j) obj).f15115b.top, ((ag.j) obj).f15115b.left, ((ag.j) obj).f15115b.bottom, paint);
            } else {
                Object obj2 = this.f24333a;
                canvas.drawLine(((ag.j) obj2).f15115b.right, ((ag.j) obj2).f15115b.top, ((ag.j) obj2).f15115b.right, ((ag.j) obj2).f15115b.bottom, paint);
            }
        }
    }

    public final void y(Canvas canvas) {
        sf.p pVar = this.f141887h;
        if (pVar.f112469a && pVar.f112458p) {
            int save = canvas.save();
            canvas.clipRect(t());
            float[] u13 = u();
            Paint paint = this.f141820d;
            paint.setColor(pVar.f112449g);
            paint.setStrokeWidth(pVar.f112450h);
            paint.setPathEffect(null);
            Path path = this.f141888i;
            path.reset();
            for (int i13 = 0; i13 < u13.length; i13 += 2) {
                canvas.drawPath(v(path, i13, u13), paint);
                path.reset();
            }
            canvas.restoreToCount(save);
        }
    }

    public void z() {
        ArrayList arrayList = this.f141887h.f112461s;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.f141892m;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        this.f141891l.reset();
        if (arrayList.size() <= 0) {
            return;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(0));
        throw null;
    }
}
