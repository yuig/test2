package zf;

import android.graphics.Paint;
import android.graphics.RectF;
import c0.s0;

/* loaded from: classes3.dex */
public abstract class a extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final sf.a f141818b;

    /* renamed from: c, reason: collision with root package name */
    public final ag.g f141819c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f141820d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f141821e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f141822f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f141823g;

    public a(ag.j jVar, ag.g gVar, sf.a aVar) {
        super(jVar);
        this.f141819c = gVar;
        this.f141818b = aVar;
        if (jVar != null) {
            this.f141821e = new Paint(1);
            Paint paint = new Paint();
            this.f141820d = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            this.f141822f = paint2;
            paint2.setColor(-16777216);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint(1);
            this.f141823g = paint3;
            paint3.setStyle(style);
        }
    }

    public void q(float f13, float f14) {
        ag.j jVar = (ag.j) this.f24333a;
        if (jVar != null && jVar.f15115b.width() > 10.0f && !((ag.j) this.f24333a).b()) {
            RectF rectF = ((ag.j) this.f24333a).f15115b;
            float f15 = rectF.left;
            float f16 = rectF.top;
            ag.g gVar = this.f141819c;
            ag.c b13 = gVar.b(f15, f16);
            RectF rectF2 = ((ag.j) this.f24333a).f15115b;
            ag.c b14 = gVar.b(rectF2.left, rectF2.bottom);
            float f17 = (float) b14.f15085c;
            float f18 = (float) b13.f15085c;
            ag.c.c(b13);
            ag.c.c(b14);
            f13 = f17;
            f14 = f18;
        }
        r(f13, f14);
    }

    public void r(float f13, float f14) {
        int i13;
        float f15 = f13;
        sf.a aVar = this.f141818b;
        int i14 = aVar.f112456n;
        double abs = Math.abs(f14 - f15);
        if (i14 == 0 || abs <= 0.0d || Double.isInfinite(abs)) {
            aVar.f112453k = new float[0];
            aVar.f112454l = 0;
            return;
        }
        double f16 = ag.i.f(abs / i14);
        double f17 = ag.i.f(Math.pow(10.0d, (int) Math.log10(f16)));
        if (((int) (f16 / f17)) > 5) {
            f16 = Math.floor(f17 * 10.0d);
        }
        if (aVar.f112457o) {
            f16 = ((float) abs) / (i14 - 1);
            aVar.f112454l = i14;
            if (aVar.f112453k.length < i14) {
                aVar.f112453k = new float[i14];
            }
            for (int i15 = 0; i15 < i14; i15++) {
                aVar.f112453k[i15] = f15;
                f15 = (float) (f15 + f16);
            }
        } else {
            double ceil = f16 == 0.0d ? 0.0d : Math.ceil(f15 / f16) * f16;
            double e13 = f16 == 0.0d ? 0.0d : ag.i.e(Math.floor(f14 / f16) * f16);
            if (f16 != 0.0d) {
                i13 = 0;
                for (double d2 = ceil; d2 <= e13; d2 += f16) {
                    i13++;
                }
            } else {
                i13 = 0;
            }
            aVar.f112454l = i13;
            if (aVar.f112453k.length < i13) {
                aVar.f112453k = new float[i13];
            }
            for (int i16 = 0; i16 < i13; i16++) {
                if (ceil == 0.0d) {
                    ceil = 0.0d;
                }
                aVar.f112453k[i16] = (float) ceil;
                ceil += f16;
            }
        }
        if (f16 < 1.0d) {
            aVar.f112455m = (int) Math.ceil(-Math.log10(f16));
        } else {
            aVar.f112455m = 0;
        }
    }
}
