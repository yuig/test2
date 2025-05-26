package x4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.utils.widget.MotionLabel;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kh2.c3;
import kh2.k3;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public final View f131777b;

    /* renamed from: c, reason: collision with root package name */
    public final int f131778c;

    /* renamed from: j, reason: collision with root package name */
    public c3[] f131785j;

    /* renamed from: k, reason: collision with root package name */
    public t4.b f131786k;

    /* renamed from: o, reason: collision with root package name */
    public int[] f131790o;

    /* renamed from: p, reason: collision with root package name */
    public double[] f131791p;

    /* renamed from: q, reason: collision with root package name */
    public double[] f131792q;

    /* renamed from: r, reason: collision with root package name */
    public String[] f131793r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f131794s;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f131799x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f131800y;

    /* renamed from: z, reason: collision with root package name */
    public HashMap f131801z;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f131776a = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public boolean f131779d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f131780e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final w f131781f = new w();

    /* renamed from: g, reason: collision with root package name */
    public final w f131782g = new w();

    /* renamed from: h, reason: collision with root package name */
    public final k f131783h = new k();

    /* renamed from: i, reason: collision with root package name */
    public final k f131784i = new k();

    /* renamed from: l, reason: collision with root package name */
    public float f131787l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f131788m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f131789n = 1.0f;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f131795t = new float[4];

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f131796u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final float[] f131797v = new float[1];

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f131798w = new ArrayList();
    public int A = -1;
    public int B = -1;
    public View C = null;
    public int D = -1;
    public float E = Float.NaN;
    public Interpolator F = null;
    public boolean G = false;

    public m(View view) {
        this.f131777b = view;
        this.f131778c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).getClass();
        }
    }

    public static void g(int i13, int i14, int i15, Rect rect, Rect rect2) {
        if (i13 == 1) {
            int i16 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i15 - ((rect.height() + i16) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i13 == 2) {
            int i17 = rect.left + rect.right;
            rect2.left = i14 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i17 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i13 == 3) {
            int i18 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i18 / 2);
            rect2.top = i15 - ((rect.height() + i18) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i13 != 4) {
            return;
        }
        int i19 = rect.left + rect.right;
        rect2.left = i14 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i19 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final void a(b bVar) {
        this.f131798w.add(bVar);
    }

    public final float b(float f13, float[] fArr) {
        float f14 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f15 = this.f131789n;
            if (f15 != 1.0d) {
                float f16 = this.f131788m;
                if (f13 < f16) {
                    f13 = 0.0f;
                }
                if (f13 > f16 && f13 < 1.0d) {
                    f13 = Math.min((f13 - f16) * f15, 1.0f);
                }
            }
        }
        t4.e eVar = this.f131781f.f131836a;
        Iterator it = this.f131796u.iterator();
        float f17 = Float.NaN;
        while (it.hasNext()) {
            w wVar = (w) it.next();
            t4.e eVar2 = wVar.f131836a;
            if (eVar2 != null) {
                float f18 = wVar.f131838c;
                if (f18 < f13) {
                    eVar = eVar2;
                    f14 = f18;
                } else if (Float.isNaN(f17)) {
                    f17 = wVar.f131838c;
                }
            }
        }
        if (eVar != null) {
            float f19 = (Float.isNaN(f17) ? 1.0f : f17) - f14;
            double d2 = (f13 - f14) / f19;
            f13 = (((float) eVar.a(d2)) * f19) + f14;
            if (fArr != null) {
                fArr[0] = (float) eVar.b(d2);
            }
        }
        return f13;
    }

    public final void c(double d2, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f131785j[0].G(d2, dArr);
        this.f131785j[0].J(d2, dArr2);
        float f13 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f131790o;
        w wVar = this.f131781f;
        float f14 = wVar.f131840e;
        float f15 = wVar.f131841f;
        float f16 = wVar.f131842g;
        float f17 = wVar.f131843h;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f23 = 0.0f;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            float f24 = (float) dArr[i13];
            float f25 = (float) dArr2[i13];
            int i14 = iArr[i13];
            if (i14 == 1) {
                f14 = f24;
                f13 = f25;
            } else if (i14 == 2) {
                f15 = f24;
                f23 = f25;
            } else if (i14 == 3) {
                f16 = f24;
                f18 = f25;
            } else if (i14 == 4) {
                f17 = f24;
                f19 = f25;
            }
        }
        float f26 = 2.0f;
        float f27 = (f18 / 2.0f) + f13;
        float f28 = (f19 / 2.0f) + f23;
        m mVar = wVar.f131848m;
        if (mVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            mVar.c(d2, fArr3, fArr4);
            float f29 = fArr3[0];
            float f33 = fArr3[1];
            float f34 = fArr4[0];
            float f35 = fArr4[1];
            double d13 = f14;
            double d14 = f15;
            float sin = (float) (((Math.sin(d14) * d13) + f29) - (f16 / 2.0f));
            float cos = (float) ((f33 - (Math.cos(d14) * d13)) - (f17 / 2.0f));
            double d15 = f34;
            double d16 = f13;
            double d17 = f23;
            float cos2 = (float) ((Math.cos(d14) * d17) + (Math.sin(d14) * d16) + d15);
            f28 = (float) ((Math.sin(d14) * d17) + (f35 - (Math.cos(d14) * d16)));
            f14 = sin;
            f15 = cos;
            f27 = cos2;
            f26 = 2.0f;
        }
        fArr[0] = (f16 / f26) + f14 + 0.0f;
        fArr[1] = (f17 / f26) + f15 + 0.0f;
        fArr2[0] = f27;
        fArr2[1] = f28;
    }

    public final void d(float[] fArr, float f13, float f14, float f15) {
        double[] dArr;
        float[] fArr2 = this.f131797v;
        float b13 = b(f13, fArr2);
        c3[] c3VarArr = this.f131785j;
        int i13 = 0;
        if (c3VarArr == null) {
            w wVar = this.f131782g;
            float f16 = wVar.f131840e;
            w wVar2 = this.f131781f;
            float f17 = f16 - wVar2.f131840e;
            float f18 = wVar.f131841f - wVar2.f131841f;
            float f19 = wVar.f131842g - wVar2.f131842g;
            float f23 = (wVar.f131843h - wVar2.f131843h) + f18;
            fArr[0] = ((f19 + f17) * f14) + ((1.0f - f14) * f17);
            fArr[1] = (f23 * f15) + ((1.0f - f15) * f18);
            return;
        }
        double d2 = b13;
        c3VarArr[0].J(d2, this.f131792q);
        this.f131785j[0].G(d2, this.f131791p);
        float f24 = fArr2[0];
        while (true) {
            dArr = this.f131792q;
            if (i13 >= dArr.length) {
                break;
            }
            dArr[i13] = dArr[i13] * f24;
            i13++;
        }
        t4.b bVar = this.f131786k;
        if (bVar == null) {
            int[] iArr = this.f131790o;
            double[] dArr2 = this.f131791p;
            this.f131781f.getClass();
            w.g(f14, f15, fArr, iArr, dArr, dArr2);
            return;
        }
        double[] dArr3 = this.f131791p;
        if (dArr3.length > 0) {
            bVar.G(d2, dArr3);
            this.f131786k.J(d2, this.f131792q);
            int[] iArr2 = this.f131790o;
            double[] dArr4 = this.f131792q;
            double[] dArr5 = this.f131791p;
            this.f131781f.getClass();
            w.g(f14, f15, fArr, iArr2, dArr4, dArr5);
        }
    }

    public final boolean e(float f13, long j13, View view, t4.f fVar) {
        w4.o oVar;
        boolean z13;
        float f14;
        int i13;
        boolean z14;
        double d2;
        float f15;
        w wVar;
        w4.o oVar2;
        boolean z15;
        double d13;
        float f16;
        float f17;
        boolean z16;
        float f18;
        double d14;
        float f19;
        m mVar = this;
        View view2 = view;
        float b13 = mVar.b(f13, null);
        int i14 = mVar.D;
        if (i14 != -1) {
            float f23 = 1.0f / i14;
            float floor = ((float) Math.floor(b13 / f23)) * f23;
            float f24 = (b13 % f23) / f23;
            if (!Float.isNaN(mVar.E)) {
                f24 = (f24 + mVar.E) % 1.0f;
            }
            Interpolator interpolator = mVar.F;
            b13 = ((interpolator != null ? interpolator.getInterpolation(f24) : ((double) f24) > 0.5d ? 1.0f : 0.0f) * f23) + floor;
        }
        float f25 = b13;
        HashMap hashMap = mVar.f131800y;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((w4.l) it.next()).c(view2, f25);
            }
        }
        HashMap hashMap2 = mVar.f131799x;
        if (hashMap2 != null) {
            oVar = null;
            z13 = false;
            for (w4.q qVar : hashMap2.values()) {
                if (qVar instanceof w4.o) {
                    oVar = (w4.o) qVar;
                } else {
                    z13 |= qVar.c(f25, j13, view, fVar);
                }
            }
        } else {
            oVar = null;
            z13 = false;
        }
        c3[] c3VarArr = mVar.f131785j;
        w wVar2 = mVar.f131781f;
        if (c3VarArr != null) {
            double d15 = f25;
            c3VarArr[0].G(d15, mVar.f131791p);
            mVar.f131785j[0].J(d15, mVar.f131792q);
            t4.b bVar = mVar.f131786k;
            if (bVar != null) {
                double[] dArr = mVar.f131791p;
                if (dArr.length > 0) {
                    bVar.G(d15, dArr);
                    mVar.f131786k.J(d15, mVar.f131792q);
                }
            }
            if (mVar.G) {
                d2 = d15;
                f15 = f25;
                wVar = wVar2;
                oVar2 = oVar;
                z15 = z13;
            } else {
                int[] iArr = mVar.f131790o;
                double[] dArr2 = mVar.f131791p;
                double[] dArr3 = mVar.f131792q;
                boolean z17 = mVar.f131779d;
                float f26 = wVar2.f131840e;
                float f27 = wVar2.f131841f;
                float f28 = wVar2.f131842g;
                float f29 = wVar2.f131843h;
                if (iArr.length != 0) {
                    f17 = f26;
                    if (wVar2.f131851p.length <= iArr[iArr.length - 1]) {
                        int i15 = iArr[iArr.length - 1] + 1;
                        wVar2.f131851p = new double[i15];
                        wVar2.f131852q = new double[i15];
                    }
                } else {
                    f17 = f26;
                }
                Arrays.fill(wVar2.f131851p, Double.NaN);
                for (int i16 = 0; i16 < iArr.length; i16++) {
                    double[] dArr4 = wVar2.f131851p;
                    int i17 = iArr[i16];
                    dArr4[i17] = dArr2[i16];
                    wVar2.f131852q[i17] = dArr3[i16];
                }
                float f33 = Float.NaN;
                f15 = f25;
                oVar2 = oVar;
                float f34 = f29;
                float f35 = f17;
                float f36 = f27;
                float f37 = 0.0f;
                int i18 = 0;
                float f38 = 0.0f;
                float f39 = 0.0f;
                z15 = z13;
                float f41 = 0.0f;
                while (true) {
                    double[] dArr5 = wVar2.f131851p;
                    z16 = z17;
                    if (i18 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i18])) {
                        d14 = d15;
                        f19 = f33;
                    } else {
                        d14 = d15;
                        float f43 = (float) (Double.isNaN(wVar2.f131851p[i18]) ? 0.0d : wVar2.f131851p[i18] + 0.0d);
                        f19 = f33;
                        float f44 = (float) wVar2.f131852q[i18];
                        if (i18 == 1) {
                            f37 = f44;
                            f35 = f43;
                        } else if (i18 == 2) {
                            f41 = f44;
                            f36 = f43;
                        } else if (i18 == 3) {
                            f38 = f44;
                            f28 = f43;
                        } else if (i18 == 4) {
                            f39 = f44;
                            f34 = f43;
                        } else if (i18 == 5) {
                            f33 = f43;
                            i18++;
                            z17 = z16;
                            d15 = d14;
                        }
                    }
                    f33 = f19;
                    i18++;
                    z17 = z16;
                    d15 = d14;
                }
                d2 = d15;
                float f45 = f33;
                m mVar2 = wVar2.f131848m;
                if (mVar2 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    mVar2.c(d2, fArr, fArr2);
                    float f46 = fArr[0];
                    float f47 = fArr[1];
                    wVar = wVar2;
                    float f48 = fArr2[0];
                    float f49 = fArr2[1];
                    double d16 = f35;
                    double d17 = f36;
                    float sin = (float) (((Math.sin(d17) * d16) + f46) - (f28 / 2.0f));
                    f36 = (float) ((f47 - (Math.cos(d17) * d16)) - (f34 / 2.0f));
                    double d18 = f37;
                    double d19 = f41;
                    float cos = (float) ((Math.cos(d17) * d16 * d19) + (Math.sin(d17) * d18) + f48);
                    f18 = f28;
                    float sin2 = (float) ((Math.sin(d17) * d16 * d19) + (f49 - (Math.cos(d17) * d18)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = cos;
                        dArr3[1] = sin2;
                    }
                    if (Float.isNaN(f45)) {
                        view2 = view;
                    } else {
                        view2 = view;
                        view2.setRotation((float) (Math.toDegrees(Math.atan2(sin2, cos)) + f45));
                    }
                    f35 = sin;
                } else {
                    float f53 = f37;
                    f18 = f28;
                    wVar = wVar2;
                    if (!Float.isNaN(f45)) {
                        view2.setRotation((float) (Math.toDegrees(Math.atan2((f39 / 2.0f) + f41, (f38 / 2.0f) + f53)) + f45 + 0.0f));
                    }
                }
                if (view2 instanceof a) {
                    ((MotionLabel) ((a) view2)).f(f35, f36, f35 + f18, f34 + f36);
                } else {
                    float f54 = f35 + 0.5f;
                    int i19 = (int) f54;
                    float f55 = f36 + 0.5f;
                    int i23 = (int) f55;
                    int i24 = (int) (f54 + f18);
                    int i25 = (int) (f55 + f34);
                    int i26 = i24 - i19;
                    int i27 = i25 - i23;
                    if (i26 != view.getMeasuredWidth() || i27 != view.getMeasuredHeight() || z16) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i26, 1073741824), View.MeasureSpec.makeMeasureSpec(i27, 1073741824));
                    }
                    view2.layout(i19, i23, i24, i25);
                }
                mVar = this;
                mVar.f131779d = false;
            }
            if (mVar.B != -1) {
                if (mVar.C == null) {
                    mVar.C = ((View) view.getParent()).findViewById(mVar.B);
                }
                if (mVar.C != null) {
                    float bottom = (mVar.C.getBottom() + r1.getTop()) / 2.0f;
                    float right = (mVar.C.getRight() + mVar.C.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view2.setPivotX(right - view.getLeft());
                        view2.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap hashMap3 = mVar.f131800y;
            if (hashMap3 != null) {
                for (w4.l lVar : hashMap3.values()) {
                    if (lVar instanceof w4.j) {
                        double[] dArr6 = mVar.f131792q;
                        if (dArr6.length > 1) {
                            f16 = f15;
                            view2.setRotation(((w4.j) lVar).a(f16) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                            f15 = f16;
                        }
                    }
                    f16 = f15;
                    f15 = f16;
                }
            }
            f14 = f15;
            if (oVar2 != null) {
                double[] dArr7 = mVar.f131792q;
                d13 = d2;
                i13 = 1;
                view2.setRotation(oVar2.b(f14, j13, view, fVar) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                z14 = z15 | oVar2.f116403d;
            } else {
                d13 = d2;
                i13 = 1;
                z14 = z15;
            }
            int i28 = i13;
            while (true) {
                c3[] c3VarArr2 = mVar.f131785j;
                if (i28 >= c3VarArr2.length) {
                    break;
                }
                c3 c3Var = c3VarArr2[i28];
                float[] fArr3 = mVar.f131795t;
                c3Var.H(d13, fArr3);
                k3.P1((androidx.constraintlayout.widget.c) wVar.f131849n.get(mVar.f131793r[i28 - 1]), view2, fArr3);
                i28++;
            }
            k kVar = mVar.f131783h;
            if (kVar.f131758b == 0) {
                if (f14 <= 0.0f) {
                    view2.setVisibility(kVar.f131759c);
                } else {
                    k kVar2 = mVar.f131784i;
                    if (f14 >= 1.0f) {
                        view2.setVisibility(kVar2.f131759c);
                    } else if (kVar2.f131759c != kVar.f131759c) {
                        view2.setVisibility(0);
                    }
                }
            }
        } else {
            f14 = f25;
            boolean z18 = z13;
            i13 = 1;
            float f56 = wVar2.f131840e;
            w wVar3 = mVar.f131782g;
            float a13 = ep.b.a(wVar3.f131840e, f56, f14, f56);
            float f57 = wVar2.f131841f;
            float a14 = ep.b.a(wVar3.f131841f, f57, f14, f57);
            float f58 = wVar2.f131842g;
            float f59 = wVar3.f131842g;
            float a15 = ep.b.a(f59, f58, f14, f58);
            float f63 = wVar2.f131843h;
            float f64 = wVar3.f131843h;
            float f65 = a13 + 0.5f;
            int i29 = (int) f65;
            float f66 = a14 + 0.5f;
            int i33 = (int) f66;
            int i34 = (int) (f65 + a15);
            int a16 = (int) (f66 + ep.b.a(f64, f63, f14, f63));
            int i35 = i34 - i29;
            int i36 = a16 - i33;
            if (f59 != f58 || f64 != f63 || mVar.f131779d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i35, 1073741824), View.MeasureSpec.makeMeasureSpec(i36, 1073741824));
                mVar.f131779d = false;
            }
            view2.layout(i29, i33, i34, a16);
            z14 = z18;
        }
        HashMap hashMap4 = mVar.f131801z;
        if (hashMap4 != null) {
            for (w4.g gVar : hashMap4.values()) {
                if (gVar instanceof w4.e) {
                    double[] dArr8 = mVar.f131792q;
                    view2.setRotation(((w4.e) gVar).a(f14) + ((float) Math.toDegrees(Math.atan2(dArr8[i13], dArr8[0]))));
                } else {
                    gVar.d(view2, f14);
                }
            }
        }
        return z14;
    }

    public final void f(w wVar) {
        wVar.f((int) this.f131777b.getX(), (int) this.f131777b.getY(), this.f131777b.getWidth(), this.f131777b.getHeight());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:379:0x086b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:334:0x08e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x08e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04e2  */
    /* JADX WARN: Type inference failed for: r7v19, types: [w4.p, w4.q] */
    /* JADX WARN: Type inference failed for: r7v25, types: [w4.q] */
    /* JADX WARN: Type inference failed for: r7v47, types: [w4.n, w4.q] */
    /* JADX WARN: Type inference failed for: r8v113, types: [w4.i, w4.l] */
    /* JADX WARN: Type inference failed for: r8v84, types: [w4.k, w4.l] */
    /* JADX WARN: Type inference failed for: r8v92, types: [w4.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r30, int r31, long r32) {
        /*
            Method dump skipped, instructions count: 3232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.m.h(int, int, long):void");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(" start: x: ");
        w wVar = this.f131781f;
        sb3.append(wVar.f131840e);
        sb3.append(" y: ");
        sb3.append(wVar.f131841f);
        sb3.append(" end: x: ");
        w wVar2 = this.f131782g;
        sb3.append(wVar2.f131840e);
        sb3.append(" y: ");
        sb3.append(wVar2.f131841f);
        return sb3.toString();
    }
}
