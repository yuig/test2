package yb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import ec.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements zb.a, k, e {

    /* renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.v f138329e;

    /* renamed from: f, reason: collision with root package name */
    public final fc.c f138330f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f138332h;

    /* renamed from: i, reason: collision with root package name */
    public final xb.a f138333i;

    /* renamed from: j, reason: collision with root package name */
    public final zb.i f138334j;

    /* renamed from: k, reason: collision with root package name */
    public final zb.e f138335k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f138336l;

    /* renamed from: m, reason: collision with root package name */
    public final zb.i f138337m;

    /* renamed from: n, reason: collision with root package name */
    public zb.u f138338n;

    /* renamed from: o, reason: collision with root package name */
    public zb.e f138339o;

    /* renamed from: p, reason: collision with root package name */
    public float f138340p;

    /* renamed from: q, reason: collision with root package name */
    public final zb.h f138341q;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f138325a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f138326b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f138327c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f138328d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f138331g = new ArrayList();

    public b(com.airbnb.lottie.v vVar, fc.c cVar, Paint.Cap cap, Paint.Join join, float f13, dc.a aVar, dc.b bVar, List list, dc.b bVar2) {
        xb.a aVar2 = new xb.a(1);
        this.f138333i = aVar2;
        this.f138340p = 0.0f;
        this.f138329e = vVar;
        this.f138330f = cVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f13);
        this.f138335k = aVar.a();
        this.f138334j = (zb.i) bVar.a();
        if (bVar2 == null) {
            this.f138337m = null;
        } else {
            this.f138337m = (zb.i) bVar2.a();
        }
        this.f138336l = new ArrayList(list.size());
        this.f138332h = new float[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            this.f138336l.add(((dc.b) list.get(i13)).a());
        }
        cVar.e(this.f138335k);
        cVar.e(this.f138334j);
        for (int i14 = 0; i14 < this.f138336l.size(); i14++) {
            cVar.e((zb.e) this.f138336l.get(i14));
        }
        zb.i iVar = this.f138337m;
        if (iVar != null) {
            cVar.e(iVar);
        }
        this.f138335k.a(this);
        this.f138334j.a(this);
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((zb.e) this.f138336l.get(i15)).a(this);
        }
        zb.i iVar2 = this.f138337m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (cVar.l() != null) {
            zb.e a13 = ((dc.b) cVar.l().f66449b).a();
            this.f138339o = a13;
            a13.a(this);
            cVar.e(this.f138339o);
        }
        if (cVar.n() != null) {
            this.f138341q = new zb.h(this, cVar, cVar.n());
        }
    }

    @Override // zb.a
    public final void a() {
        this.f138329e.invalidateSelf();
    }

    @Override // yb.c
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        a aVar = null;
        w wVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList2.get(size);
            if (cVar instanceof w) {
                w wVar2 = (w) cVar;
                if (wVar2.e() == y.INDIVIDUALLY) {
                    wVar = wVar2;
                }
            }
        }
        if (wVar != null) {
            wVar.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f138331g;
            if (size2 < 0) {
                break;
            }
            c cVar2 = (c) list2.get(size2);
            if (cVar2 instanceof w) {
                w wVar3 = (w) cVar2;
                if (wVar3.e() == y.INDIVIDUALLY) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(wVar3);
                    wVar3.d(this);
                    aVar = aVar2;
                }
            }
            if (cVar2 instanceof n) {
                if (aVar == null) {
                    aVar = new a(wVar);
                }
                aVar.f138323a.add((n) cVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    @Override // yb.e
    public final void c(RectF rectF, Matrix matrix, boolean z13) {
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        Path path = this.f138326b;
        path.reset();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f138331g;
            if (i13 >= arrayList.size()) {
                RectF rectF2 = this.f138328d;
                path.computeBounds(rectF2, false);
                float m13 = this.f138334j.m() / 2.0f;
                rectF2.set(rectF2.left - m13, rectF2.top - m13, rectF2.right + m13, rectF2.bottom + m13);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                com.airbnb.lottie.a aVar2 = com.airbnb.lottie.b.f28381a;
                return;
            }
            a aVar3 = (a) arrayList.get(i13);
            for (int i14 = 0; i14 < aVar3.f138323a.size(); i14++) {
                path.addPath(((n) aVar3.f138323a.get(i14)).r(), matrix);
            }
            i13++;
        }
    }

    @Override // cc.g
    public void d(androidx.appcompat.app.d dVar, Object obj) {
        PointF pointF = com.airbnb.lottie.y.f28479a;
        if (obj == 4) {
            this.f138335k.l(dVar);
            return;
        }
        if (obj == com.airbnb.lottie.y.f28492n) {
            this.f138334j.l(dVar);
            return;
        }
        ColorFilter colorFilter = com.airbnb.lottie.y.F;
        fc.c cVar = this.f138330f;
        if (obj == colorFilter) {
            zb.u uVar = this.f138338n;
            if (uVar != null) {
                cVar.p(uVar);
            }
            if (dVar == null) {
                this.f138338n = null;
                return;
            }
            zb.u uVar2 = new zb.u(dVar, null);
            this.f138338n = uVar2;
            uVar2.a(this);
            cVar.e(this.f138338n);
            return;
        }
        if (obj == com.airbnb.lottie.y.f28483e) {
            zb.e eVar = this.f138339o;
            if (eVar != null) {
                eVar.l(dVar);
                return;
            }
            zb.u uVar3 = new zb.u(dVar, null);
            this.f138339o = uVar3;
            uVar3.a(this);
            cVar.e(this.f138339o);
            return;
        }
        zb.h hVar = this.f138341q;
        if (obj == 5 && hVar != null) {
            hVar.f141504b.l(dVar);
            return;
        }
        if (obj == com.airbnb.lottie.y.B && hVar != null) {
            hVar.c(dVar);
            return;
        }
        if (obj == com.airbnb.lottie.y.C && hVar != null) {
            hVar.f141506d.l(dVar);
            return;
        }
        if (obj == com.airbnb.lottie.y.D && hVar != null) {
            hVar.f141507e.l(dVar);
        } else {
            if (obj != com.airbnb.lottie.y.E || hVar == null) {
                return;
            }
            hVar.f141508f.l(dVar);
        }
    }

    public final void e(Matrix matrix) {
        float[] fArr;
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        ArrayList arrayList = this.f138336l;
        if (arrayList.isEmpty()) {
            return;
        }
        float d2 = jc.g.d(matrix);
        int i13 = 0;
        while (true) {
            int size = arrayList.size();
            fArr = this.f138332h;
            if (i13 >= size) {
                break;
            }
            float floatValue = ((Float) ((zb.e) arrayList.get(i13)).g()).floatValue();
            fArr[i13] = floatValue;
            if (i13 % 2 == 0) {
                if (floatValue < 1.0f) {
                    fArr[i13] = 1.0f;
                }
            } else if (floatValue < 0.1f) {
                fArr[i13] = 0.1f;
            }
            fArr[i13] = fArr[i13] * d2;
            i13++;
        }
        zb.i iVar = this.f138337m;
        this.f138333i.setPathEffect(new DashPathEffect(fArr, iVar == null ? 0.0f : d2 * ((Float) iVar.g()).floatValue()));
        com.airbnb.lottie.a aVar2 = com.airbnb.lottie.b.f28381a;
    }

    @Override // yb.e
    public void f(Canvas canvas, Matrix matrix, int i13) {
        w wVar;
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        float[] fArr = (float[]) jc.g.f75397d.get();
        int i14 = 0;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            return;
        }
        zb.k kVar = (zb.k) this.f138335k;
        PointF pointF = jc.f.f75393a;
        int max = Math.max(0, Math.min(255, (int) ((((i13 / 255.0f) * kVar.m(kVar.b(), kVar.d())) / 100.0f) * 255.0f)));
        xb.a aVar2 = this.f138333i;
        aVar2.setAlpha(max);
        aVar2.setStrokeWidth(jc.g.d(matrix) * this.f138334j.m());
        if (aVar2.getStrokeWidth() <= 0.0f) {
            return;
        }
        e(matrix);
        zb.u uVar = this.f138338n;
        if (uVar != null) {
            aVar2.setColorFilter((ColorFilter) uVar.g());
        }
        zb.e eVar = this.f138339o;
        if (eVar != null) {
            float floatValue = ((Float) eVar.g()).floatValue();
            if (floatValue == 0.0f) {
                aVar2.setMaskFilter(null);
            } else if (floatValue != this.f138340p) {
                aVar2.setMaskFilter(this.f138330f.m(floatValue));
            }
            this.f138340p = floatValue;
        }
        zb.h hVar = this.f138341q;
        if (hVar != null) {
            hVar.b(aVar2);
        }
        while (true) {
            ArrayList arrayList = this.f138331g;
            if (i14 >= arrayList.size()) {
                com.airbnb.lottie.a aVar3 = com.airbnb.lottie.b.f28381a;
                return;
            }
            a aVar4 = (a) arrayList.get(i14);
            wVar = aVar4.f138324b;
            if (wVar != null) {
                h(canvas, aVar4, matrix);
            } else {
                com.airbnb.lottie.a aVar5 = com.airbnb.lottie.b.f28381a;
                Path path = this.f138326b;
                path.reset();
                ArrayList arrayList2 = aVar4.f138323a;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    path.addPath(((n) arrayList2.get(size)).r(), matrix);
                }
                com.airbnb.lottie.a aVar6 = com.airbnb.lottie.b.f28381a;
                canvas.drawPath(path, aVar2);
            }
            i14++;
        }
    }

    @Override // cc.g
    public final void g(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2) {
        jc.f.f(fVar, i13, arrayList, fVar2, this);
    }

    public final void h(Canvas canvas, a aVar, Matrix matrix) {
        b bVar = this;
        com.airbnb.lottie.a aVar2 = com.airbnb.lottie.b.f28381a;
        w wVar = aVar.f138324b;
        if (wVar == null) {
            return;
        }
        Path path = bVar.f138326b;
        path.reset();
        ArrayList arrayList = aVar.f138323a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            path.addPath(((n) arrayList.get(size)).r(), matrix);
        }
        float floatValue = ((Float) wVar.f138468d.g()).floatValue() / 100.0f;
        float floatValue2 = ((Float) wVar.f138469e.g()).floatValue() / 100.0f;
        float floatValue3 = ((Float) wVar.f138470f.g()).floatValue() / 360.0f;
        xb.a aVar3 = bVar.f138333i;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(path, aVar3);
            com.airbnb.lottie.a aVar4 = com.airbnb.lottie.b.f28381a;
            return;
        }
        PathMeasure pathMeasure = bVar.f138325a;
        boolean z13 = false;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        while (pathMeasure.nextContour()) {
            length += pathMeasure.getLength();
        }
        float f13 = floatValue3 * length;
        float f14 = (floatValue * length) + f13;
        float min = Math.min((floatValue2 * length) + f13, (f14 + length) - 1.0f);
        int size2 = arrayList.size() - 1;
        float f15 = 0.0f;
        while (size2 >= 0) {
            Path path2 = bVar.f138327c;
            path2.set(((n) arrayList.get(size2)).r());
            path2.transform(matrix);
            pathMeasure.setPath(path2, z13);
            float length2 = pathMeasure.getLength();
            if (min > length) {
                float f16 = min - length;
                if (f16 < f15 + length2 && f15 < f16) {
                    jc.g.a(path2, f14 > length ? (f14 - length) / length2 : 0.0f, Math.min(f16 / length2, 1.0f), 0.0f);
                    canvas.drawPath(path2, aVar3);
                    f15 += length2;
                    size2--;
                    bVar = this;
                    z13 = false;
                }
            }
            float f17 = f15 + length2;
            if (f17 >= f14 && f15 <= min) {
                if (f17 > min || f14 >= f15) {
                    jc.g.a(path2, f14 < f15 ? 0.0f : (f14 - f15) / length2, min > f17 ? 1.0f : (min - f15) / length2, 0.0f);
                    canvas.drawPath(path2, aVar3);
                } else {
                    canvas.drawPath(path2, aVar3);
                }
            }
            f15 += length2;
            size2--;
            bVar = this;
            z13 = false;
        }
        com.airbnb.lottie.a aVar5 = com.airbnb.lottie.b.f28381a;
    }
}
