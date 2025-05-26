package yb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class r implements e, n, j, zb.a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f138440a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f138441b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.v f138442c;

    /* renamed from: d, reason: collision with root package name */
    public final fc.c f138443d;

    /* renamed from: e, reason: collision with root package name */
    public final String f138444e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f138445f;

    /* renamed from: g, reason: collision with root package name */
    public final zb.i f138446g;

    /* renamed from: h, reason: collision with root package name */
    public final zb.i f138447h;

    /* renamed from: i, reason: collision with root package name */
    public final zb.t f138448i;

    /* renamed from: j, reason: collision with root package name */
    public d f138449j;

    public r(com.airbnb.lottie.v vVar, fc.c cVar, ec.o oVar) {
        this.f138442c = vVar;
        this.f138443d = cVar;
        int i13 = oVar.f58327a;
        this.f138444e = oVar.f58328b;
        this.f138445f = oVar.f58330d;
        zb.e a13 = oVar.f58329c.a();
        this.f138446g = (zb.i) a13;
        cVar.e(a13);
        a13.a(this);
        zb.e a14 = ((dc.b) oVar.f58331e).a();
        this.f138447h = (zb.i) a14;
        cVar.e(a14);
        a14.a(this);
        dc.e eVar = (dc.e) oVar.f58332f;
        eVar.getClass();
        zb.t tVar = new zb.t(eVar);
        this.f138448i = tVar;
        tVar.a(cVar);
        tVar.b(this);
    }

    @Override // zb.a
    public final void a() {
        this.f138442c.invalidateSelf();
    }

    @Override // yb.c
    public final void b(List list, List list2) {
        this.f138449j.b(list, list2);
    }

    @Override // yb.e
    public final void c(RectF rectF, Matrix matrix, boolean z13) {
        this.f138449j.c(rectF, matrix, z13);
    }

    @Override // cc.g
    public final void d(androidx.appcompat.app.d dVar, Object obj) {
        if (this.f138448i.c(dVar, obj)) {
            return;
        }
        if (obj == y.f28494p) {
            this.f138446g.l(dVar);
        } else if (obj == y.f28495q) {
            this.f138447h.l(dVar);
        }
    }

    @Override // yb.j
    public final void e(ListIterator listIterator) {
        if (this.f138449j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f138449j = new d(this.f138442c, this.f138443d, "Repeater", this.f138445f, arrayList, null);
    }

    @Override // yb.e
    public final void f(Canvas canvas, Matrix matrix, int i13) {
        float floatValue = ((Float) this.f138446g.g()).floatValue();
        float floatValue2 = ((Float) this.f138447h.g()).floatValue();
        zb.t tVar = this.f138448i;
        float floatValue3 = ((Float) tVar.f141546m.g()).floatValue() / 100.0f;
        float floatValue4 = ((Float) tVar.f141547n.g()).floatValue() / 100.0f;
        for (int i14 = ((int) floatValue) - 1; i14 >= 0; i14--) {
            Matrix matrix2 = this.f138440a;
            matrix2.set(matrix);
            float f13 = i14;
            matrix2.preConcat(tVar.f(f13 + floatValue2));
            this.f138449j.f(canvas, matrix2, (int) (jc.f.e(floatValue3, floatValue4, f13 / floatValue) * i13));
        }
    }

    @Override // cc.g
    public final void g(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2) {
        jc.f.f(fVar, i13, arrayList, fVar2, this);
        for (int i14 = 0; i14 < this.f138449j.f138349h.size(); i14++) {
            c cVar = (c) this.f138449j.f138349h.get(i14);
            if (cVar instanceof k) {
                jc.f.f(fVar, i13, arrayList, fVar2, (k) cVar);
            }
        }
    }

    @Override // yb.c
    public final String getName() {
        return this.f138444e;
    }

    @Override // yb.n
    public final Path r() {
        Path r13 = this.f138449j.r();
        Path path = this.f138441b;
        path.reset();
        float floatValue = ((Float) this.f138446g.g()).floatValue();
        float floatValue2 = ((Float) this.f138447h.g()).floatValue();
        for (int i13 = ((int) floatValue) - 1; i13 >= 0; i13--) {
            Matrix matrix = this.f138440a;
            matrix.set(this.f138448i.f(i13 + floatValue2));
            path.addPath(r13, matrix);
        }
        return path;
    }
}
