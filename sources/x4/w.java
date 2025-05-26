package x4;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class w implements Comparable {

    /* renamed from: r, reason: collision with root package name */
    public static final String[] f131835r = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: a, reason: collision with root package name */
    public t4.e f131836a;

    /* renamed from: c, reason: collision with root package name */
    public float f131838c;

    /* renamed from: d, reason: collision with root package name */
    public float f131839d;

    /* renamed from: e, reason: collision with root package name */
    public float f131840e;

    /* renamed from: f, reason: collision with root package name */
    public float f131841f;

    /* renamed from: g, reason: collision with root package name */
    public float f131842g;

    /* renamed from: h, reason: collision with root package name */
    public float f131843h;

    /* renamed from: b, reason: collision with root package name */
    public int f131837b = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f131844i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public int f131845j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f131846k = -1;

    /* renamed from: l, reason: collision with root package name */
    public float f131847l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public m f131848m = null;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashMap f131849n = new LinkedHashMap();

    /* renamed from: o, reason: collision with root package name */
    public int f131850o = 0;

    /* renamed from: p, reason: collision with root package name */
    public double[] f131851p = new double[18];

    /* renamed from: q, reason: collision with root package name */
    public double[] f131852q = new double[18];

    public static boolean b(float f13, float f14) {
        return (Float.isNaN(f13) || Float.isNaN(f14)) ? Float.isNaN(f13) != Float.isNaN(f14) : Math.abs(f13 - f14) > 1.0E-6f;
    }

    public static void g(float f13, float f14, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            float f19 = (float) dArr[i13];
            double d2 = dArr2[i13];
            int i14 = iArr[i13];
            if (i14 == 1) {
                f15 = f19;
            } else if (i14 == 2) {
                f17 = f19;
            } else if (i14 == 3) {
                f16 = f19;
            } else if (i14 == 4) {
                f18 = f19;
            }
        }
        float f23 = f15 - ((0.0f * f16) / 2.0f);
        float f24 = f17 - ((0.0f * f18) / 2.0f);
        fArr[0] = (((f16 * 1.0f) + f23) * f13) + ((1.0f - f13) * f23) + 0.0f;
        fArr[1] = (((f18 * 1.0f) + f24) * f14) + ((1.0f - f14) * f24) + 0.0f;
    }

    public final void a(androidx.constraintlayout.widget.k kVar) {
        int i13;
        this.f131836a = t4.e.c(kVar.f17766d.f17819d);
        androidx.constraintlayout.widget.m mVar = kVar.f17766d;
        this.f131845j = mVar.f17820e;
        this.f131846k = mVar.f17817b;
        this.f131844i = mVar.f17823h;
        this.f131837b = mVar.f17821f;
        float f13 = kVar.f17765c.f17833e;
        this.f131847l = kVar.f17767e.C;
        for (String str : kVar.f17769g.keySet()) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) kVar.f17769g.get(str);
            if (cVar != null && (i13 = androidx.constraintlayout.widget.a.f17717a[cVar.f17720c.ordinal()]) != 1 && i13 != 2 && i13 != 3) {
                this.f131849n.put(str, cVar);
            }
        }
    }

    public final void c(double[] dArr, int[] iArr) {
        float[] fArr = {this.f131839d, this.f131840e, this.f131841f, this.f131842g, this.f131843h, this.f131844i};
        int i13 = 0;
        for (int i14 : iArr) {
            if (i14 < 6) {
                dArr[i13] = fArr[r2];
                i13++;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f131839d, ((w) obj).f131839d);
    }

    public final void d(double d2, int[] iArr, double[] dArr, float[] fArr, int i13) {
        float f13 = this.f131840e;
        float f14 = this.f131841f;
        float f15 = this.f131842g;
        float f16 = this.f131843h;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            float f17 = (float) dArr[i14];
            int i15 = iArr[i14];
            if (i15 == 1) {
                f13 = f17;
            } else if (i15 == 2) {
                f14 = f17;
            } else if (i15 == 3) {
                f15 = f17;
            } else if (i15 == 4) {
                f16 = f17;
            }
        }
        m mVar = this.f131848m;
        if (mVar != null) {
            float[] fArr2 = new float[2];
            mVar.c(d2, fArr2, new float[2]);
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d13 = f18;
            double d14 = f13;
            double d15 = f14;
            f13 = (float) (((Math.sin(d15) * d14) + d13) - (f15 / 2.0f));
            f14 = (float) ((f19 - (Math.cos(d15) * d14)) - (f16 / 2.0f));
        }
        fArr[i13] = (f15 / 2.0f) + f13 + 0.0f;
        fArr[i13 + 1] = (f16 / 2.0f) + f14 + 0.0f;
    }

    public final void e(String str, double[] dArr) {
        androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) this.f131849n.get(str);
        if (cVar == null) {
            return;
        }
        int i13 = 0;
        if (cVar.d() == 1) {
            dArr[0] = cVar.b();
            return;
        }
        int d2 = cVar.d();
        cVar.c(new float[d2]);
        int i14 = 0;
        while (i13 < d2) {
            dArr[i14] = r1[i13];
            i13++;
            i14++;
        }
    }

    public final void f(float f13, float f14, float f15, float f16) {
        this.f131840e = f13;
        this.f131841f = f14;
        this.f131842g = f15;
        this.f131843h = f16;
    }

    public final void h(m mVar, w wVar) {
        double d2 = (((this.f131842g / 2.0f) + this.f131840e) - wVar.f131840e) - (wVar.f131842g / 2.0f);
        double d13 = (((this.f131843h / 2.0f) + this.f131841f) - wVar.f131841f) - (wVar.f131843h / 2.0f);
        this.f131848m = mVar;
        this.f131840e = (float) Math.hypot(d13, d2);
        if (Float.isNaN(this.f131847l)) {
            this.f131841f = (float) (Math.atan2(d13, d2) + 1.5707963267948966d);
        } else {
            this.f131841f = (float) Math.toRadians(this.f131847l);
        }
    }
}
