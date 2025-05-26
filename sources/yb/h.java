package yb;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class h implements e, zb.a, k {

    /* renamed from: a, reason: collision with root package name */
    public final String f138374a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f138375b;

    /* renamed from: c, reason: collision with root package name */
    public final fc.c f138376c;

    /* renamed from: d, reason: collision with root package name */
    public final g1.p f138377d = new g1.p((Object) null);

    /* renamed from: e, reason: collision with root package name */
    public final g1.p f138378e = new g1.p((Object) null);

    /* renamed from: f, reason: collision with root package name */
    public final Path f138379f;

    /* renamed from: g, reason: collision with root package name */
    public final xb.a f138380g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f138381h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f138382i;

    /* renamed from: j, reason: collision with root package name */
    public final ec.f f138383j;

    /* renamed from: k, reason: collision with root package name */
    public final zb.l f138384k;

    /* renamed from: l, reason: collision with root package name */
    public final zb.e f138385l;

    /* renamed from: m, reason: collision with root package name */
    public final zb.e f138386m;

    /* renamed from: n, reason: collision with root package name */
    public final zb.e f138387n;

    /* renamed from: o, reason: collision with root package name */
    public zb.u f138388o;

    /* renamed from: p, reason: collision with root package name */
    public zb.u f138389p;

    /* renamed from: q, reason: collision with root package name */
    public final com.airbnb.lottie.v f138390q;

    /* renamed from: r, reason: collision with root package name */
    public final int f138391r;

    /* renamed from: s, reason: collision with root package name */
    public zb.e f138392s;

    /* renamed from: t, reason: collision with root package name */
    public float f138393t;

    /* renamed from: u, reason: collision with root package name */
    public final zb.h f138394u;

    public h(com.airbnb.lottie.v vVar, com.airbnb.lottie.h hVar, fc.c cVar, ec.d dVar) {
        Path path = new Path();
        this.f138379f = path;
        this.f138380g = new xb.a(1);
        this.f138381h = new RectF();
        this.f138382i = new ArrayList();
        this.f138393t = 0.0f;
        this.f138376c = cVar;
        this.f138374a = dVar.f58294g;
        this.f138375b = dVar.f58295h;
        this.f138390q = vVar;
        this.f138383j = dVar.f58288a;
        path.setFillType(dVar.f58289b);
        this.f138391r = (int) (hVar.b() / 32.0f);
        zb.e a13 = dVar.f58290c.a();
        this.f138384k = (zb.l) a13;
        a13.a(this);
        cVar.e(a13);
        zb.e a14 = dVar.f58291d.a();
        this.f138385l = a14;
        a14.a(this);
        cVar.e(a14);
        zb.e a15 = dVar.f58292e.a();
        this.f138386m = a15;
        a15.a(this);
        cVar.e(a15);
        zb.e a16 = dVar.f58293f.a();
        this.f138387n = a16;
        a16.a(this);
        cVar.e(a16);
        if (cVar.l() != null) {
            zb.e a17 = ((dc.b) cVar.l().f66449b).a();
            this.f138392s = a17;
            a17.a(this);
            cVar.e(this.f138392s);
        }
        if (cVar.n() != null) {
            this.f138394u = new zb.h(this, cVar, cVar.n());
        }
    }

    @Override // zb.a
    public final void a() {
        this.f138390q.invalidateSelf();
    }

    @Override // yb.c
    public final void b(List list, List list2) {
        for (int i13 = 0; i13 < list2.size(); i13++) {
            c cVar = (c) list2.get(i13);
            if (cVar instanceof n) {
                this.f138382i.add((n) cVar);
            }
        }
    }

    @Override // yb.e
    public final void c(RectF rectF, Matrix matrix, boolean z13) {
        Path path = this.f138379f;
        path.reset();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f138382i;
            if (i13 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i13)).r(), matrix);
                i13++;
            }
        }
    }

    @Override // cc.g
    public final void d(androidx.appcompat.app.d dVar, Object obj) {
        PointF pointF = y.f28479a;
        if (obj == 4) {
            this.f138385l.l(dVar);
            return;
        }
        ColorFilter colorFilter = y.F;
        fc.c cVar = this.f138376c;
        if (obj == colorFilter) {
            zb.u uVar = this.f138388o;
            if (uVar != null) {
                cVar.p(uVar);
            }
            if (dVar == null) {
                this.f138388o = null;
                return;
            }
            zb.u uVar2 = new zb.u(dVar, null);
            this.f138388o = uVar2;
            uVar2.a(this);
            cVar.e(this.f138388o);
            return;
        }
        if (obj == y.G) {
            zb.u uVar3 = this.f138389p;
            if (uVar3 != null) {
                cVar.p(uVar3);
            }
            if (dVar == null) {
                this.f138389p = null;
                return;
            }
            this.f138377d.a();
            this.f138378e.a();
            zb.u uVar4 = new zb.u(dVar, null);
            this.f138389p = uVar4;
            uVar4.a(this);
            cVar.e(this.f138389p);
            return;
        }
        if (obj == y.f28483e) {
            zb.e eVar = this.f138392s;
            if (eVar != null) {
                eVar.l(dVar);
                return;
            }
            zb.u uVar5 = new zb.u(dVar, null);
            this.f138392s = uVar5;
            uVar5.a(this);
            cVar.e(this.f138392s);
            return;
        }
        zb.h hVar = this.f138394u;
        if (obj == 5 && hVar != null) {
            hVar.f141504b.l(dVar);
            return;
        }
        if (obj == y.B && hVar != null) {
            hVar.c(dVar);
            return;
        }
        if (obj == y.C && hVar != null) {
            hVar.f141506d.l(dVar);
            return;
        }
        if (obj == y.D && hVar != null) {
            hVar.f141507e.l(dVar);
        } else {
            if (obj != y.E || hVar == null) {
                return;
            }
            hVar.f141508f.l(dVar);
        }
    }

    public final int[] e(int[] iArr) {
        zb.u uVar = this.f138389p;
        if (uVar != null) {
            Integer[] numArr = (Integer[]) uVar.g();
            int i13 = 0;
            if (iArr.length == numArr.length) {
                while (i13 < iArr.length) {
                    iArr[i13] = numArr[i13].intValue();
                    i13++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i13 < numArr.length) {
                    iArr[i13] = numArr[i13].intValue();
                    i13++;
                }
            }
        }
        return iArr;
    }

    @Override // yb.e
    public final void f(Canvas canvas, Matrix matrix, int i13) {
        Shader shader;
        if (this.f138375b) {
            return;
        }
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        Path path = this.f138379f;
        path.reset();
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f138382i;
            if (i14 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i14)).r(), matrix);
            i14++;
        }
        path.computeBounds(this.f138381h, false);
        ec.f fVar = ec.f.LINEAR;
        ec.f fVar2 = this.f138383j;
        zb.l lVar = this.f138384k;
        zb.e eVar = this.f138387n;
        zb.e eVar2 = this.f138386m;
        if (fVar2 == fVar) {
            long h10 = h();
            g1.p pVar = this.f138377d;
            shader = (LinearGradient) pVar.c(h10);
            if (shader == null) {
                PointF pointF = (PointF) eVar2.g();
                PointF pointF2 = (PointF) eVar.g();
                ec.c cVar = (ec.c) lVar.g();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(cVar.f58287b), cVar.f58286a, Shader.TileMode.CLAMP);
                pVar.j(h10, shader);
            }
        } else {
            long h13 = h();
            g1.p pVar2 = this.f138378e;
            shader = (RadialGradient) pVar2.c(h13);
            if (shader == null) {
                PointF pointF3 = (PointF) eVar2.g();
                PointF pointF4 = (PointF) eVar.g();
                ec.c cVar2 = (ec.c) lVar.g();
                int[] e13 = e(cVar2.f58287b);
                float f13 = pointF3.x;
                float f14 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f13, pointF4.y - f14);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                RadialGradient radialGradient = new RadialGradient(f13, f14, hypot, e13, cVar2.f58286a, Shader.TileMode.CLAMP);
                pVar2.j(h13, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        xb.a aVar2 = this.f138380g;
        aVar2.setShader(shader);
        zb.u uVar = this.f138388o;
        if (uVar != null) {
            aVar2.setColorFilter((ColorFilter) uVar.g());
        }
        zb.e eVar3 = this.f138392s;
        if (eVar3 != null) {
            float floatValue = ((Float) eVar3.g()).floatValue();
            if (floatValue == 0.0f) {
                aVar2.setMaskFilter(null);
            } else if (floatValue != this.f138393t) {
                aVar2.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f138393t = floatValue;
        }
        zb.h hVar = this.f138394u;
        if (hVar != null) {
            hVar.b(aVar2);
        }
        PointF pointF5 = jc.f.f75393a;
        aVar2.setAlpha(Math.max(0, Math.min(255, (int) ((((i13 / 255.0f) * ((Integer) this.f138385l.g()).intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(path, aVar2);
        com.airbnb.lottie.a aVar3 = com.airbnb.lottie.b.f28381a;
    }

    @Override // cc.g
    public final void g(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2) {
        jc.f.f(fVar, i13, arrayList, fVar2, this);
    }

    @Override // yb.c
    public final String getName() {
        return this.f138374a;
    }

    public final int h() {
        float f13 = this.f138386m.f141497d;
        float f14 = this.f138391r;
        int round = Math.round(f13 * f14);
        int round2 = Math.round(this.f138387n.f141497d * f14);
        int round3 = Math.round(this.f138384k.f141497d * f14);
        int i13 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i13 = i13 * 31 * round2;
        }
        return round3 != 0 ? i13 * 31 * round3 : i13;
    }
}
