package yb;

import android.graphics.Path;
import android.graphics.PointF;
import ec.y;
import i2.a2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements n, zb.a, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f138354b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.v f138355c;

    /* renamed from: d, reason: collision with root package name */
    public final zb.e f138356d;

    /* renamed from: e, reason: collision with root package name */
    public final zb.e f138357e;

    /* renamed from: f, reason: collision with root package name */
    public final ec.a f138358f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f138360h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f138353a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final a2 f138359g = new a2(1);

    public f(com.airbnb.lottie.v vVar, fc.c cVar, ec.a aVar) {
        this.f138354b = aVar.f58281a;
        this.f138355c = vVar;
        zb.e a13 = aVar.f58283c.a();
        this.f138356d = a13;
        zb.e a14 = aVar.f58282b.a();
        this.f138357e = a14;
        this.f138358f = aVar;
        cVar.e(a13);
        cVar.e(a14);
        a13.a(this);
        a14.a(this);
    }

    @Override // zb.a
    public final void a() {
        this.f138360h = false;
        this.f138355c.invalidateSelf();
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
                if (wVar.e() == y.SIMULTANEOUSLY) {
                    this.f138359g.f71073a.add(wVar);
                    wVar.d(this);
                }
            }
            i13++;
        }
    }

    @Override // cc.g
    public final void d(androidx.appcompat.app.d dVar, Object obj) {
        if (obj == com.airbnb.lottie.y.f28484f) {
            this.f138356d.l(dVar);
        } else if (obj == com.airbnb.lottie.y.f28487i) {
            this.f138357e.l(dVar);
        }
    }

    @Override // cc.g
    public final void g(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2) {
        jc.f.f(fVar, i13, arrayList, fVar2, this);
    }

    @Override // yb.c
    public final String getName() {
        return this.f138354b;
    }

    @Override // yb.n
    public final Path r() {
        boolean z13 = this.f138360h;
        Path path = this.f138353a;
        if (z13) {
            return path;
        }
        path.reset();
        ec.a aVar = this.f138358f;
        if (aVar.f58285e) {
            this.f138360h = true;
            return path;
        }
        PointF pointF = (PointF) this.f138356d.g();
        float f13 = pointF.x / 2.0f;
        float f14 = pointF.y / 2.0f;
        float f15 = f13 * 0.55228f;
        float f16 = f14 * 0.55228f;
        path.reset();
        if (aVar.f58284d) {
            float f17 = -f14;
            path.moveTo(0.0f, f17);
            float f18 = 0.0f - f15;
            float f19 = -f13;
            float f23 = 0.0f - f16;
            path.cubicTo(f18, f17, f19, f23, f19, 0.0f);
            float f24 = f16 + 0.0f;
            path.cubicTo(f19, f24, f18, f14, 0.0f, f14);
            float f25 = f15 + 0.0f;
            path.cubicTo(f25, f14, f13, f24, f13, 0.0f);
            path.cubicTo(f13, f23, f25, f17, 0.0f, f17);
        } else {
            float f26 = -f14;
            path.moveTo(0.0f, f26);
            float f27 = f15 + 0.0f;
            float f28 = 0.0f - f16;
            path.cubicTo(f27, f26, f13, f28, f13, 0.0f);
            float f29 = f16 + 0.0f;
            path.cubicTo(f13, f29, f27, f14, 0.0f, f14);
            float f33 = 0.0f - f15;
            float f34 = -f13;
            path.cubicTo(f33, f14, f34, f29, f34, 0.0f);
            path.cubicTo(f34, f28, f33, f26, 0.0f, f26);
        }
        PointF pointF2 = (PointF) this.f138357e.g();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f138359g.e(path);
        this.f138360h = true;
        return path;
    }
}
