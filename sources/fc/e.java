package fc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.v;
import com.airbnb.lottie.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zb.u;

/* loaded from: classes.dex */
public final class e extends c {
    public zb.e C;
    public final ArrayList D;
    public final RectF E;
    public final RectF F;
    public final Paint G;
    public float H;
    public boolean I;

    public e(v vVar, i iVar, List list, com.airbnb.lottie.h hVar) {
        super(vVar, iVar);
        c cVar;
        c kVar;
        this.D = new ArrayList();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Paint();
        this.I = true;
        dc.b bVar = iVar.f61666s;
        if (bVar != null) {
            zb.e a13 = bVar.a();
            this.C = a13;
            e(a13);
            this.C.a(this);
        } else {
            this.C = null;
        }
        g1.p pVar = new g1.p(hVar.f28405j.size());
        int size = list.size() - 1;
        c cVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i13 = 0; i13 < pVar.m(); i13++) {
                    c cVar3 = (c) pVar.c(pVar.i(i13));
                    if (cVar3 != null && (cVar = (c) pVar.c(cVar3.f61636p.f61653f)) != null) {
                        cVar3.t(cVar);
                    }
                }
                return;
            }
            i iVar2 = (i) list.get(size);
            switch (b.f61619a[iVar2.f61652e.ordinal()]) {
                case 1:
                    kVar = new k(hVar, vVar, this, iVar2);
                    break;
                case 2:
                    kVar = new e(vVar, iVar2, (List) hVar.f28398c.get(iVar2.f61654g), hVar);
                    break;
                case 3:
                    kVar = new l(vVar, iVar2);
                    break;
                case 4:
                    kVar = new f(vVar, iVar2);
                    break;
                case 5:
                    kVar = new j(vVar, iVar2);
                    break;
                case 6:
                    kVar = new p(vVar, iVar2);
                    break;
                default:
                    jc.b.c("Unknown layer type " + iVar2.f61652e);
                    kVar = null;
                    break;
            }
            if (kVar != null) {
                pVar.j(kVar.f61636p.f61651d, kVar);
                if (cVar2 != null) {
                    cVar2.f61639s = kVar;
                    cVar2 = null;
                } else {
                    this.D.add(0, kVar);
                    int i14 = d.f61647a[iVar2.f61668u.ordinal()];
                    if (i14 == 1 || i14 == 2) {
                        cVar2 = kVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // fc.c, yb.e
    public final void c(RectF rectF, Matrix matrix, boolean z13) {
        super.c(rectF, matrix, z13);
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.E;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((c) arrayList.get(size)).c(rectF2, this.f61634n, true);
            rectF.union(rectF2);
        }
    }

    @Override // fc.c, cc.g
    public final void d(androidx.appcompat.app.d dVar, Object obj) {
        super.d(dVar, obj);
        if (obj == y.f28504z) {
            if (dVar == null) {
                zb.e eVar = this.C;
                if (eVar != null) {
                    eVar.l(null);
                    return;
                }
                return;
            }
            u uVar = new u(dVar, null);
            this.C = uVar;
            uVar.a(this);
            e(this.C);
        }
    }

    @Override // fc.c
    public final void k(Canvas canvas, Matrix matrix, int i13) {
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        RectF rectF = this.F;
        i iVar = this.f61636p;
        rectF.set(0.0f, 0.0f, iVar.f61662o, iVar.f61663p);
        matrix.mapRect(rectF);
        boolean z13 = this.f61635o.f28464s;
        ArrayList arrayList = this.D;
        boolean z14 = z13 && arrayList.size() > 1 && i13 != 255;
        if (z14) {
            Paint paint = this.G;
            paint.setAlpha(i13);
            jc.g.f(canvas, rectF, paint);
        } else {
            canvas.save();
        }
        if (z14) {
            i13 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if ((!this.I && "__container".equals(iVar.f61650c)) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((c) arrayList.get(size)).f(canvas, matrix, i13);
            }
        }
        canvas.restore();
        com.airbnb.lottie.a aVar2 = com.airbnb.lottie.b.f28381a;
    }

    @Override // fc.c
    public final void q(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2) {
        int i14 = 0;
        while (true) {
            ArrayList arrayList2 = this.D;
            if (i14 >= arrayList2.size()) {
                return;
            }
            ((c) arrayList2.get(i14)).g(fVar, i13, arrayList, fVar2);
            i14++;
        }
    }

    @Override // fc.c
    public final void s(boolean z13) {
        super.s(z13);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((c) it.next()).s(z13);
        }
    }

    @Override // fc.c
    public final void u(float f13) {
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        this.H = f13;
        super.u(f13);
        zb.e eVar = this.C;
        i iVar = this.f61636p;
        if (eVar != null) {
            com.airbnb.lottie.h hVar = this.f61635o.f28446a;
            f13 = ((((Float) this.C.g()).floatValue() * iVar.a().f28409n) - iVar.a().f28407l) / ((hVar.f28408m - hVar.f28407l) + 0.01f);
        }
        if (this.C == null) {
            com.airbnb.lottie.h hVar2 = iVar.f61649b;
            f13 -= iVar.f61661n / (hVar2.f28408m - hVar2.f28407l);
        }
        if (iVar.f61660m != 0.0f && !"__container".equals(iVar.f61650c)) {
            f13 /= iVar.f61660m;
        }
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((c) arrayList.get(size)).u(f13);
        }
        com.airbnb.lottie.a aVar2 = com.airbnb.lottie.b.f28381a;
    }

    public final float v() {
        return this.H;
    }
}
