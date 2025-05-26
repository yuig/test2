package zb;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.y;
import i2.a2;
import java.util.Collections;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f141534a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f141535b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f141536c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f141537d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f141538e;

    /* renamed from: f, reason: collision with root package name */
    public e f141539f;

    /* renamed from: g, reason: collision with root package name */
    public e f141540g;

    /* renamed from: h, reason: collision with root package name */
    public e f141541h;

    /* renamed from: i, reason: collision with root package name */
    public e f141542i;

    /* renamed from: j, reason: collision with root package name */
    public e f141543j;

    /* renamed from: k, reason: collision with root package name */
    public i f141544k;

    /* renamed from: l, reason: collision with root package name */
    public i f141545l;

    /* renamed from: m, reason: collision with root package name */
    public e f141546m;

    /* renamed from: n, reason: collision with root package name */
    public e f141547n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f141548o;

    public t(dc.e eVar) {
        a2 a2Var = eVar.f54307a;
        this.f141539f = a2Var == null ? null : a2Var.a();
        dc.f fVar = eVar.f54308b;
        this.f141540g = fVar == null ? null : fVar.a();
        dc.a aVar = eVar.f54309c;
        this.f141541h = aVar == null ? null : aVar.a();
        dc.b bVar = eVar.f54310d;
        this.f141542i = bVar == null ? null : bVar.a();
        dc.b bVar2 = eVar.f54312f;
        i iVar = bVar2 == null ? null : (i) bVar2.a();
        this.f141544k = iVar;
        this.f141548o = eVar.f54316j;
        if (iVar != null) {
            this.f141535b = new Matrix();
            this.f141536c = new Matrix();
            this.f141537d = new Matrix();
            this.f141538e = new float[9];
        } else {
            this.f141535b = null;
            this.f141536c = null;
            this.f141537d = null;
            this.f141538e = null;
        }
        dc.b bVar3 = eVar.f54313g;
        this.f141545l = bVar3 == null ? null : (i) bVar3.a();
        dc.a aVar2 = eVar.f54311e;
        if (aVar2 != null) {
            this.f141543j = aVar2.a();
        }
        dc.b bVar4 = eVar.f54314h;
        if (bVar4 != null) {
            this.f141546m = bVar4.a();
        } else {
            this.f141546m = null;
        }
        dc.b bVar5 = eVar.f54315i;
        if (bVar5 != null) {
            this.f141547n = bVar5.a();
        } else {
            this.f141547n = null;
        }
    }

    public final void a(fc.c cVar) {
        cVar.e(this.f141543j);
        cVar.e(this.f141546m);
        cVar.e(this.f141547n);
        cVar.e(this.f141539f);
        cVar.e(this.f141540g);
        cVar.e(this.f141541h);
        cVar.e(this.f141542i);
        cVar.e(this.f141544k);
        cVar.e(this.f141545l);
    }

    public final void b(a aVar) {
        e eVar = this.f141543j;
        if (eVar != null) {
            eVar.a(aVar);
        }
        e eVar2 = this.f141546m;
        if (eVar2 != null) {
            eVar2.a(aVar);
        }
        e eVar3 = this.f141547n;
        if (eVar3 != null) {
            eVar3.a(aVar);
        }
        e eVar4 = this.f141539f;
        if (eVar4 != null) {
            eVar4.a(aVar);
        }
        e eVar5 = this.f141540g;
        if (eVar5 != null) {
            eVar5.a(aVar);
        }
        e eVar6 = this.f141541h;
        if (eVar6 != null) {
            eVar6.a(aVar);
        }
        e eVar7 = this.f141542i;
        if (eVar7 != null) {
            eVar7.a(aVar);
        }
        i iVar = this.f141544k;
        if (iVar != null) {
            iVar.a(aVar);
        }
        i iVar2 = this.f141545l;
        if (iVar2 != null) {
            iVar2.a(aVar);
        }
    }

    public final boolean c(androidx.appcompat.app.d dVar, Object obj) {
        if (obj == y.f28479a) {
            e eVar = this.f141539f;
            if (eVar == null) {
                this.f141539f = new u(dVar, new PointF());
                return true;
            }
            eVar.l(dVar);
            return true;
        }
        if (obj == y.f28480b) {
            e eVar2 = this.f141540g;
            if (eVar2 == null) {
                this.f141540g = new u(dVar, new PointF());
                return true;
            }
            eVar2.l(dVar);
            return true;
        }
        if (obj == y.f28481c) {
            e eVar3 = this.f141540g;
            if (eVar3 instanceof q) {
                q qVar = (q) eVar3;
                androidx.appcompat.app.d dVar2 = qVar.f141529m;
                if (dVar2 != null) {
                    dVar2.f15967c = null;
                }
                qVar.f141529m = dVar;
                if (dVar == null) {
                    return true;
                }
                dVar.f15967c = qVar;
                return true;
            }
        }
        if (obj == y.f28482d) {
            e eVar4 = this.f141540g;
            if (eVar4 instanceof q) {
                q qVar2 = (q) eVar4;
                androidx.appcompat.app.d dVar3 = qVar2.f141530n;
                if (dVar3 != null) {
                    dVar3.f15967c = null;
                }
                qVar2.f141530n = dVar;
                if (dVar == null) {
                    return true;
                }
                dVar.f15967c = qVar2;
                return true;
            }
        }
        if (obj == y.f28488j) {
            e eVar5 = this.f141541h;
            if (eVar5 == null) {
                this.f141541h = new u(dVar, new kc.c());
                return true;
            }
            eVar5.l(dVar);
            return true;
        }
        if (obj == y.f28489k) {
            e eVar6 = this.f141542i;
            if (eVar6 == null) {
                this.f141542i = new u(dVar, Float.valueOf(0.0f));
                return true;
            }
            eVar6.l(dVar);
            return true;
        }
        if (obj == 3) {
            e eVar7 = this.f141543j;
            if (eVar7 == null) {
                this.f141543j = new u(dVar, 100);
                return true;
            }
            eVar7.l(dVar);
            return true;
        }
        if (obj == y.f28502x) {
            e eVar8 = this.f141546m;
            if (eVar8 == null) {
                this.f141546m = new u(dVar, Float.valueOf(100.0f));
                return true;
            }
            eVar8.l(dVar);
            return true;
        }
        if (obj == y.f28503y) {
            e eVar9 = this.f141547n;
            if (eVar9 == null) {
                this.f141547n = new u(dVar, Float.valueOf(100.0f));
                return true;
            }
            eVar9.l(dVar);
            return true;
        }
        if (obj == y.f28490l) {
            if (this.f141544k == null) {
                this.f141544k = new i(Collections.singletonList(new kc.a(Float.valueOf(0.0f))));
            }
            this.f141544k.l(dVar);
            return true;
        }
        if (obj != y.f28491m) {
            return false;
        }
        if (this.f141545l == null) {
            this.f141545l = new i(Collections.singletonList(new kc.a(Float.valueOf(0.0f))));
        }
        this.f141545l.l(dVar);
        return true;
    }

    public final void d() {
        for (int i13 = 0; i13 < 9; i13++) {
            this.f141538e[i13] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointF;
        kc.c cVar;
        PointF pointF2;
        Matrix matrix = this.f141534a;
        matrix.reset();
        e eVar = this.f141540g;
        if (eVar != null && (pointF2 = (PointF) eVar.g()) != null) {
            float f13 = pointF2.x;
            if (f13 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f13, pointF2.y);
            }
        }
        if (!this.f141548o) {
            e eVar2 = this.f141542i;
            if (eVar2 != null) {
                float floatValue = eVar2 instanceof u ? ((Float) eVar2.g()).floatValue() : ((i) eVar2).m();
                if (floatValue != 0.0f) {
                    matrix.preRotate(floatValue);
                }
            }
        } else if (eVar != null) {
            float f14 = eVar.f();
            PointF pointF3 = (PointF) eVar.g();
            float f15 = pointF3.x;
            float f16 = pointF3.y;
            eVar.k(1.0E-4f + f14);
            PointF pointF4 = (PointF) eVar.g();
            eVar.k(f14);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f16, pointF4.x - f15)));
        }
        if (this.f141544k != null) {
            float cos = this.f141545l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.m()) + 90.0f));
            float sin = this.f141545l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.m()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r1.m()));
            d();
            float[] fArr = this.f141538e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f17 = -sin;
            fArr[3] = f17;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f141535b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f141536c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = cos;
            fArr[1] = f17;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f141537d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        e eVar3 = this.f141541h;
        if (eVar3 != null && (cVar = (kc.c) eVar3.g()) != null) {
            float f18 = cVar.f79126a;
            if (f18 != 1.0f || cVar.f79127b != 1.0f) {
                matrix.preScale(f18, cVar.f79127b);
            }
        }
        e eVar4 = this.f141539f;
        if (eVar4 != null && (pointF = (PointF) eVar4.g()) != null) {
            float f19 = pointF.x;
            if (f19 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f19, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f13) {
        e eVar = this.f141540g;
        PointF pointF = eVar == null ? null : (PointF) eVar.g();
        e eVar2 = this.f141541h;
        kc.c cVar = eVar2 == null ? null : (kc.c) eVar2.g();
        Matrix matrix = this.f141534a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f13, pointF.y * f13);
        }
        if (cVar != null) {
            double d2 = f13;
            matrix.preScale((float) Math.pow(cVar.f79126a, d2), (float) Math.pow(cVar.f79127b, d2));
        }
        e eVar3 = this.f141542i;
        if (eVar3 != null) {
            float floatValue = ((Float) eVar3.g()).floatValue();
            e eVar4 = this.f141539f;
            PointF pointF2 = eVar4 != null ? (PointF) eVar4.g() : null;
            matrix.preRotate(floatValue * f13, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
