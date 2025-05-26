package yb;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import ec.y;
import i2.a2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class q implements zb.a, k, n {

    /* renamed from: c, reason: collision with root package name */
    public final String f138431c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f138432d;

    /* renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.v f138433e;

    /* renamed from: f, reason: collision with root package name */
    public final zb.e f138434f;

    /* renamed from: g, reason: collision with root package name */
    public final zb.e f138435g;

    /* renamed from: h, reason: collision with root package name */
    public final zb.i f138436h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f138439k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f138429a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f138430b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final a2 f138437i = new a2(1);

    /* renamed from: j, reason: collision with root package name */
    public zb.e f138438j = null;

    public q(com.airbnb.lottie.v vVar, fc.c cVar, ec.o oVar) {
        int i13 = oVar.f58327a;
        this.f138431c = oVar.f58328b;
        this.f138432d = oVar.f58330d;
        this.f138433e = vVar;
        zb.e a13 = oVar.f58331e.a();
        this.f138434f = a13;
        zb.e a14 = ((dc.f) oVar.f58332f).a();
        this.f138435g = a14;
        zb.e a15 = oVar.f58329c.a();
        this.f138436h = (zb.i) a15;
        cVar.e(a13);
        cVar.e(a14);
        cVar.e(a15);
        a13.a(this);
        a14.a(this);
        a15.a(this);
    }

    @Override // zb.a
    public final void a() {
        this.f138439k = false;
        this.f138433e.invalidateSelf();
    }

    @Override // yb.c
    public final void b(List list, List list2) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i13 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i13);
            if (cVar instanceof w) {
                w wVar = (w) cVar;
                if (wVar.f138467c == y.SIMULTANEOUSLY) {
                    this.f138437i.f71073a.add(wVar);
                    wVar.d(this);
                    i13++;
                }
            }
            if (cVar instanceof s) {
                this.f138438j = ((s) cVar).f138451b;
            }
            i13++;
        }
    }

    @Override // cc.g
    public final void d(androidx.appcompat.app.d dVar, Object obj) {
        if (obj == com.airbnb.lottie.y.f28485g) {
            this.f138435g.l(dVar);
        } else if (obj == com.airbnb.lottie.y.f28487i) {
            this.f138434f.l(dVar);
        } else if (obj == com.airbnb.lottie.y.f28486h) {
            this.f138436h.l(dVar);
        }
    }

    @Override // cc.g
    public final void g(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2) {
        jc.f.f(fVar, i13, arrayList, fVar2, this);
    }

    @Override // yb.c
    public final String getName() {
        return this.f138431c;
    }

    @Override // yb.n
    public final Path r() {
        zb.e eVar;
        boolean z13 = this.f138439k;
        Path path = this.f138429a;
        if (z13) {
            return path;
        }
        path.reset();
        if (this.f138432d) {
            this.f138439k = true;
            return path;
        }
        PointF pointF = (PointF) this.f138435g.g();
        float f13 = pointF.x / 2.0f;
        float f14 = pointF.y / 2.0f;
        zb.i iVar = this.f138436h;
        float m13 = iVar == null ? 0.0f : iVar.m();
        if (m13 == 0.0f && (eVar = this.f138438j) != null) {
            m13 = Math.min(((Float) eVar.g()).floatValue(), Math.min(f13, f14));
        }
        float min = Math.min(f13, f14);
        if (m13 > min) {
            m13 = min;
        }
        PointF pointF2 = (PointF) this.f138434f.g();
        path.moveTo(pointF2.x + f13, (pointF2.y - f14) + m13);
        path.lineTo(pointF2.x + f13, (pointF2.y + f14) - m13);
        RectF rectF = this.f138430b;
        if (m13 > 0.0f) {
            float f15 = pointF2.x + f13;
            float f16 = m13 * 2.0f;
            float f17 = pointF2.y + f14;
            rectF.set(f15 - f16, f17 - f16, f15, f17);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x - f13) + m13, pointF2.y + f14);
        if (m13 > 0.0f) {
            float f18 = pointF2.x - f13;
            float f19 = pointF2.y + f14;
            float f23 = m13 * 2.0f;
            rectF.set(f18, f19 - f23, f23 + f18, f19);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f13, (pointF2.y - f14) + m13);
        if (m13 > 0.0f) {
            float f24 = pointF2.x - f13;
            float f25 = pointF2.y - f14;
            float f26 = m13 * 2.0f;
            rectF.set(f24, f25, f24 + f26, f26 + f25);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f13) - m13, pointF2.y - f14);
        if (m13 > 0.0f) {
            float f27 = pointF2.x + f13;
            float f28 = m13 * 2.0f;
            float f29 = pointF2.y - f14;
            rectF.set(f27 - f28, f29, f27, f28 + f29);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f138437i.e(path);
        this.f138439k = true;
        return path;
    }
}
