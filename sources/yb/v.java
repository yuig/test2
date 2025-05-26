package yb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.y;
import ec.x;

/* loaded from: classes.dex */
public final class v extends b {

    /* renamed from: r, reason: collision with root package name */
    public final fc.c f138460r;

    /* renamed from: s, reason: collision with root package name */
    public final String f138461s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f138462t;

    /* renamed from: u, reason: collision with root package name */
    public final zb.e f138463u;

    /* renamed from: v, reason: collision with root package name */
    public zb.u f138464v;

    public v(com.airbnb.lottie.v vVar, fc.c cVar, x xVar) {
        super(vVar, cVar, xVar.f58358g.toPaintCap(), xVar.f58359h.toPaintJoin(), xVar.f58360i, xVar.f58356e, xVar.f58357f, xVar.f58354c, xVar.f58353b);
        this.f138460r = cVar;
        this.f138461s = xVar.f58352a;
        this.f138462t = xVar.f58361j;
        zb.e a13 = xVar.f58355d.a();
        this.f138463u = a13;
        a13.a(this);
        cVar.e(a13);
    }

    @Override // yb.b, cc.g
    public final void d(androidx.appcompat.app.d dVar, Object obj) {
        super.d(dVar, obj);
        PointF pointF = y.f28479a;
        zb.e eVar = this.f138463u;
        if (obj == 2) {
            eVar.l(dVar);
            return;
        }
        if (obj == y.F) {
            zb.u uVar = this.f138464v;
            fc.c cVar = this.f138460r;
            if (uVar != null) {
                cVar.p(uVar);
            }
            if (dVar == null) {
                this.f138464v = null;
                return;
            }
            zb.u uVar2 = new zb.u(dVar, null);
            this.f138464v = uVar2;
            uVar2.a(this);
            cVar.e(eVar);
        }
    }

    @Override // yb.b, yb.e
    public final void f(Canvas canvas, Matrix matrix, int i13) {
        if (this.f138462t) {
            return;
        }
        zb.f fVar = (zb.f) this.f138463u;
        int m13 = fVar.m(fVar.b(), fVar.d());
        xb.a aVar = this.f138333i;
        aVar.setColor(m13);
        zb.u uVar = this.f138464v;
        if (uVar != null) {
            aVar.setColorFilter((ColorFilter) uVar.g());
        }
        super.f(canvas, matrix, i13);
    }

    @Override // yb.c
    public final String getName() {
        return this.f138461s;
    }
}
