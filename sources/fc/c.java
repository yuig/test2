package fc;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zb.t;

/* loaded from: classes.dex */
public abstract class c implements yb.e, zb.a, cc.g {
    public float A;
    public BlurMaskFilter B;

    /* renamed from: a, reason: collision with root package name */
    public final Path f61621a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f61622b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f61623c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final xb.a f61624d = new xb.a(1);

    /* renamed from: e, reason: collision with root package name */
    public final xb.a f61625e;

    /* renamed from: f, reason: collision with root package name */
    public final xb.a f61626f;

    /* renamed from: g, reason: collision with root package name */
    public final xb.a f61627g;

    /* renamed from: h, reason: collision with root package name */
    public final xb.a f61628h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f61629i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f61630j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f61631k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f61632l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f61633m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f61634n;

    /* renamed from: o, reason: collision with root package name */
    public final v f61635o;

    /* renamed from: p, reason: collision with root package name */
    public final i f61636p;

    /* renamed from: q, reason: collision with root package name */
    public final q7.v f61637q;

    /* renamed from: r, reason: collision with root package name */
    public final zb.i f61638r;

    /* renamed from: s, reason: collision with root package name */
    public c f61639s;

    /* renamed from: t, reason: collision with root package name */
    public c f61640t;

    /* renamed from: u, reason: collision with root package name */
    public List f61641u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f61642v;

    /* renamed from: w, reason: collision with root package name */
    public final t f61643w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f61644x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f61645y;

    /* renamed from: z, reason: collision with root package name */
    public xb.a f61646z;

    public c(v vVar, i iVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f61625e = new xb.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f61626f = new xb.a(mode2);
        xb.a aVar = new xb.a(1);
        this.f61627g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        xb.a aVar2 = new xb.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f61628h = aVar2;
        this.f61629i = new RectF();
        this.f61630j = new RectF();
        this.f61631k = new RectF();
        this.f61632l = new RectF();
        this.f61633m = new RectF();
        this.f61634n = new Matrix();
        this.f61642v = new ArrayList();
        this.f61644x = true;
        this.A = 0.0f;
        this.f61635o = vVar;
        this.f61636p = iVar;
        if (iVar.f61668u == h.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        dc.e eVar = iVar.f61656i;
        eVar.getClass();
        t tVar = new t(eVar);
        this.f61643w = tVar;
        tVar.b(this);
        List list = iVar.f61655h;
        if (list != null && !list.isEmpty()) {
            q7.v vVar2 = new q7.v();
            vVar2.f102689c = list;
            vVar2.f102687a = new ArrayList(list.size());
            vVar2.f102688b = new ArrayList(list.size());
            for (int i13 = 0; i13 < list.size(); i13++) {
                vVar2.f102687a.add(new zb.p((List) ((ec.j) list.get(i13)).f58311b.f92902b));
                vVar2.f102688b.add(((ec.j) list.get(i13)).f58312c.a());
            }
            this.f61637q = vVar2;
            Iterator it = vVar2.f102687a.iterator();
            while (it.hasNext()) {
                ((zb.e) it.next()).a(this);
            }
            for (zb.e eVar2 : this.f61637q.f102688b) {
                e(eVar2);
                eVar2.a(this);
            }
        }
        i iVar2 = this.f61636p;
        if (iVar2.f61667t.isEmpty()) {
            if (true != this.f61644x) {
                this.f61644x = true;
                this.f61635o.invalidateSelf();
                return;
            }
            return;
        }
        zb.i iVar3 = new zb.i(iVar2.f61667t);
        this.f61638r = iVar3;
        iVar3.f141495b = true;
        iVar3.a(new zb.a() { // from class: fc.a
            @Override // zb.a
            public final void a() {
                c cVar = c.this;
                boolean z13 = cVar.f61638r.m() == 1.0f;
                if (z13 != cVar.f61644x) {
                    cVar.f61644x = z13;
                    cVar.f61635o.invalidateSelf();
                }
            }
        });
        boolean z13 = ((Float) this.f61638r.g()).floatValue() == 1.0f;
        if (z13 != this.f61644x) {
            this.f61644x = z13;
            this.f61635o.invalidateSelf();
        }
        e(this.f61638r);
    }

    @Override // zb.a
    public final void a() {
        this.f61635o.invalidateSelf();
    }

    @Override // yb.c
    public final void b(List list, List list2) {
    }

    @Override // yb.e
    public void c(RectF rectF, Matrix matrix, boolean z13) {
        this.f61629i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f61634n;
        matrix2.set(matrix);
        if (z13) {
            List list = this.f61641u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((c) this.f61641u.get(size)).f61643w.e());
                }
            } else {
                c cVar = this.f61640t;
                if (cVar != null) {
                    matrix2.preConcat(cVar.f61643w.e());
                }
            }
        }
        matrix2.preConcat(this.f61643w.e());
    }

    @Override // cc.g
    public void d(androidx.appcompat.app.d dVar, Object obj) {
        this.f61643w.c(dVar, obj);
    }

    public final void e(zb.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f61642v.add(eVar);
    }

    @Override // yb.e
    public final void f(Canvas canvas, Matrix matrix, int i13) {
        xb.a aVar;
        q7.v vVar;
        Integer num;
        com.airbnb.lottie.a aVar2 = com.airbnb.lottie.b.f28381a;
        if (this.f61644x) {
            i iVar = this.f61636p;
            if (iVar.f61669v) {
                return;
            }
            i();
            Matrix matrix2 = this.f61622b;
            matrix2.reset();
            matrix2.set(matrix);
            int i14 = 1;
            for (int size = this.f61641u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((c) this.f61641u.get(size)).f61643w.e());
            }
            com.airbnb.lottie.a aVar3 = com.airbnb.lottie.b.f28381a;
            t tVar = this.f61643w;
            zb.e eVar = tVar.f141543j;
            int intValue = (int) ((((i13 / 255.0f) * ((eVar == null || (num = (Integer) eVar.g()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (!(this.f61639s != null) && ((vVar = this.f61637q) == null || vVar.f102687a.isEmpty())) {
                matrix2.preConcat(tVar.e());
                k(canvas, matrix2, intValue);
                o();
                return;
            }
            RectF rectF = this.f61629i;
            c(rectF, matrix2, false);
            if (this.f61639s != null) {
                if (iVar.f61668u != h.INVERT) {
                    RectF rectF2 = this.f61632l;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    this.f61639s.c(rectF2, matrix, true);
                    if (!rectF.intersect(rectF2)) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
            }
            matrix2.preConcat(tVar.e());
            RectF rectF3 = this.f61631k;
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            q7.v vVar2 = this.f61637q;
            if (vVar2 != null && !vVar2.f102687a.isEmpty()) {
                q7.v vVar3 = this.f61637q;
                int size2 = vVar3.f102689c.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size2) {
                        ec.j jVar = (ec.j) vVar3.f102689c.get(i15);
                        Path path = (Path) ((zb.e) vVar3.f102687a.get(i15)).g();
                        if (path != null) {
                            Path path2 = this.f61621a;
                            path2.set(path);
                            path2.transform(matrix2);
                            int i16 = b.f61620b[jVar.f58310a.ordinal()];
                            if (i16 == i14 || i16 == 2 || ((i16 == 3 || i16 == 4) && jVar.f58313d)) {
                                break;
                            }
                            RectF rectF4 = this.f61633m;
                            path2.computeBounds(rectF4, false);
                            if (i15 == 0) {
                                rectF3.set(rectF4);
                            } else {
                                rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                            }
                        }
                        i15++;
                        i14 = 1;
                    } else if (!rectF.intersect(rectF3)) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
            }
            RectF rectF5 = this.f61630j;
            rectF5.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            Matrix matrix3 = this.f61623c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF.intersect(rectF5)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.airbnb.lottie.a aVar4 = com.airbnb.lottie.b.f28381a;
            if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                xb.a aVar5 = this.f61624d;
                aVar5.setAlpha(255);
                jc.g.f(canvas, rectF, aVar5);
                j(canvas);
                k(canvas, matrix2, intValue);
                q7.v vVar4 = this.f61637q;
                if (vVar4 != null && !vVar4.f102687a.isEmpty()) {
                    h(canvas, matrix2);
                }
                if (this.f61639s != null) {
                    jc.g.f(canvas, rectF, this.f61627g);
                    j(canvas);
                    this.f61639s.f(canvas, matrix, intValue);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.f61645y && (aVar = this.f61646z) != null) {
                aVar.setStyle(Paint.Style.STROKE);
                this.f61646z.setColor(-251901);
                this.f61646z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF, this.f61646z);
                this.f61646z.setStyle(Paint.Style.FILL);
                this.f61646z.setColor(1357638635);
                canvas.drawRect(rectF, this.f61646z);
            }
            o();
        }
    }

    @Override // cc.g
    public final void g(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2) {
        c cVar = this.f61639s;
        i iVar = this.f61636p;
        if (cVar != null) {
            cc.f a13 = fVar2.a(cVar.f61636p.f61650c);
            if (fVar.b(i13, this.f61639s.f61636p.f61650c)) {
                arrayList.add(a13.f(this.f61639s));
            }
            if (fVar.e(i13, iVar.f61650c)) {
                this.f61639s.q(fVar, fVar.c(i13, this.f61639s.f61636p.f61650c) + i13, arrayList, a13);
            }
        }
        if (fVar.d(i13, iVar.f61650c)) {
            String str = iVar.f61650c;
            if (!"__container".equals(str)) {
                fVar2 = fVar2.a(str);
                if (fVar.b(i13, str)) {
                    arrayList.add(fVar2.f(this));
                }
            }
            if (fVar.e(i13, str)) {
                q(fVar, fVar.c(i13, str) + i13, arrayList, fVar2);
            }
        }
    }

    @Override // yb.c
    public final String getName() {
        return this.f61636p.f61650c;
    }

    public final void h(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        RectF rectF = this.f61629i;
        xb.a aVar2 = this.f61625e;
        jc.g.f(canvas, rectF, aVar2);
        if (Build.VERSION.SDK_INT < 28) {
            j(canvas);
        }
        int i13 = 0;
        while (true) {
            q7.v vVar = this.f61637q;
            if (i13 >= vVar.d().size()) {
                com.airbnb.lottie.a aVar3 = com.airbnb.lottie.b.f28381a;
                canvas.restore();
                return;
            }
            ec.j jVar = (ec.j) vVar.d().get(i13);
            zb.e eVar = (zb.e) vVar.c().get(i13);
            zb.e eVar2 = (zb.e) vVar.e().get(i13);
            int i14 = b.f61620b[jVar.a().ordinal()];
            xb.a aVar4 = this.f61624d;
            if (i14 == 1) {
                if (!vVar.c().isEmpty()) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= vVar.d().size()) {
                            aVar4.setAlpha(255);
                            canvas.drawRect(rectF, aVar4);
                            break;
                        } else if (((ec.j) vVar.d().get(i15)).a() != ec.i.MASK_MODE_NONE) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            } else {
                Path path = this.f61621a;
                xb.a aVar5 = this.f61626f;
                if (i14 == 2) {
                    if (i13 == 0) {
                        aVar4.setColor(-16777216);
                        aVar4.setAlpha(255);
                        canvas.drawRect(rectF, aVar4);
                    }
                    if (jVar.b()) {
                        jc.g.f(canvas, rectF, aVar5);
                        canvas.drawRect(rectF, aVar4);
                        aVar5.setAlpha((int) (((Integer) eVar2.g()).intValue() * 2.55f));
                        path.set((Path) eVar.g());
                        path.transform(matrix);
                        canvas.drawPath(path, aVar5);
                        canvas.restore();
                    } else {
                        path.set((Path) eVar.g());
                        path.transform(matrix);
                        canvas.drawPath(path, aVar5);
                    }
                } else if (i14 != 3) {
                    if (i14 == 4) {
                        if (jVar.b()) {
                            jc.g.f(canvas, rectF, aVar4);
                            canvas.drawRect(rectF, aVar4);
                            path.set((Path) eVar.g());
                            path.transform(matrix);
                            aVar4.setAlpha((int) (((Integer) eVar2.g()).intValue() * 2.55f));
                            canvas.drawPath(path, aVar5);
                            canvas.restore();
                        } else {
                            path.set((Path) eVar.g());
                            path.transform(matrix);
                            aVar4.setAlpha((int) (((Integer) eVar2.g()).intValue() * 2.55f));
                            canvas.drawPath(path, aVar4);
                        }
                    }
                } else if (jVar.b()) {
                    jc.g.f(canvas, rectF, aVar2);
                    canvas.drawRect(rectF, aVar4);
                    aVar5.setAlpha((int) (((Integer) eVar2.g()).intValue() * 2.55f));
                    path.set((Path) eVar.g());
                    path.transform(matrix);
                    canvas.drawPath(path, aVar5);
                    canvas.restore();
                } else {
                    jc.g.f(canvas, rectF, aVar2);
                    path.set((Path) eVar.g());
                    path.transform(matrix);
                    aVar4.setAlpha((int) (((Integer) eVar2.g()).intValue() * 2.55f));
                    canvas.drawPath(path, aVar4);
                    canvas.restore();
                }
            }
            i13++;
        }
    }

    public final void i() {
        if (this.f61641u != null) {
            return;
        }
        if (this.f61640t == null) {
            this.f61641u = Collections.emptyList();
            return;
        }
        this.f61641u = new ArrayList();
        for (c cVar = this.f61640t; cVar != null; cVar = cVar.f61640t) {
            this.f61641u.add(cVar);
        }
    }

    public final void j(Canvas canvas) {
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        RectF rectF = this.f61629i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f61628h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i13);

    public h1.b l() {
        return this.f61636p.f61670w;
    }

    public final BlurMaskFilter m(float f13) {
        if (this.A == f13) {
            return this.B;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f13 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.B = blurMaskFilter;
        this.A = f13;
        return blurMaskFilter;
    }

    public androidx.camera.core.impl.j n() {
        return this.f61636p.f61671x;
    }

    public final void o() {
        m7.c cVar = this.f61635o.f28446a.f28396a;
        String str = this.f61636p.f61650c;
        if (cVar.f86115b) {
            jc.e eVar = (jc.e) ((Map) cVar.f86117d).get(str);
            if (eVar == null) {
                eVar = new jc.e();
                ((Map) cVar.f86117d).put(str, eVar);
            }
            int i13 = eVar.f75392a + 1;
            eVar.f75392a = i13;
            if (i13 == Integer.MAX_VALUE) {
                eVar.f75392a = i13 / 2;
            }
            if (str.equals("__container")) {
                Iterator it = ((Set) cVar.f86116c).iterator();
                if (it.hasNext()) {
                    ep.b.A(it.next());
                    throw null;
                }
            }
        }
    }

    public final void p(zb.e eVar) {
        this.f61642v.remove(eVar);
    }

    public void q(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2) {
    }

    public void s(boolean z13) {
        if (z13 && this.f61646z == null) {
            this.f61646z = new xb.a();
        }
        this.f61645y = z13;
    }

    public final void t(c cVar) {
        this.f61640t = cVar;
    }

    public void u(float f13) {
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        t tVar = this.f61643w;
        zb.e eVar = tVar.f141543j;
        if (eVar != null) {
            eVar.k(f13);
        }
        zb.e eVar2 = tVar.f141546m;
        if (eVar2 != null) {
            eVar2.k(f13);
        }
        zb.e eVar3 = tVar.f141547n;
        if (eVar3 != null) {
            eVar3.k(f13);
        }
        zb.e eVar4 = tVar.f141539f;
        if (eVar4 != null) {
            eVar4.k(f13);
        }
        zb.e eVar5 = tVar.f141540g;
        if (eVar5 != null) {
            eVar5.k(f13);
        }
        zb.e eVar6 = tVar.f141541h;
        if (eVar6 != null) {
            eVar6.k(f13);
        }
        zb.e eVar7 = tVar.f141542i;
        if (eVar7 != null) {
            eVar7.k(f13);
        }
        zb.i iVar = tVar.f141544k;
        if (iVar != null) {
            iVar.k(f13);
        }
        zb.i iVar2 = tVar.f141545l;
        if (iVar2 != null) {
            iVar2.k(f13);
        }
        q7.v vVar = this.f61637q;
        if (vVar != null) {
            for (int i13 = 0; i13 < vVar.f102687a.size(); i13++) {
                ((zb.e) vVar.f102687a.get(i13)).k(f13);
            }
            com.airbnb.lottie.a aVar2 = com.airbnb.lottie.b.f28381a;
        }
        zb.i iVar3 = this.f61638r;
        if (iVar3 != null) {
            iVar3.k(f13);
        }
        c cVar = this.f61639s;
        if (cVar != null) {
            cVar.u(f13);
        }
        ArrayList arrayList = this.f61642v;
        arrayList.size();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((zb.e) arrayList.get(i14)).k(f13);
        }
        arrayList.size();
        com.airbnb.lottie.a aVar3 = com.airbnb.lottie.b.f28381a;
    }
}
