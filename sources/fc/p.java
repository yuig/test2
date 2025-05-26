package fc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.v;
import com.airbnb.lottie.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import zb.r;
import zb.s;
import zb.u;

/* loaded from: classes3.dex */
public final class p extends c {
    public final StringBuilder C;
    public final RectF D;
    public final Matrix E;
    public final m F;
    public final m G;
    public final HashMap H;
    public final g1.p I;

    /* renamed from: J, reason: collision with root package name */
    public final ArrayList f61676J;
    public final s K;
    public final v L;
    public final com.airbnb.lottie.h M;
    public final zb.e N;
    public u O;
    public final zb.e P;
    public u Q;
    public final zb.i R;
    public u S;
    public final zb.i T;
    public u U;
    public u V;
    public u W;

    public p(v vVar, i iVar) {
        super(vVar, iVar);
        dc.b bVar;
        dc.b bVar2;
        dc.a aVar;
        dc.a aVar2;
        this.C = new StringBuilder(2);
        this.D = new RectF();
        this.E = new Matrix();
        this.F = new m(0);
        this.G = new m(1);
        this.H = new HashMap();
        this.I = new g1.p((Object) null);
        this.f61676J = new ArrayList();
        this.L = vVar;
        this.M = iVar.f61649b;
        s sVar = new s((List) iVar.f61664q.f92902b);
        this.K = sVar;
        sVar.a(this);
        e(sVar);
        m.h hVar = iVar.f61665r;
        if (hVar != null && (aVar2 = (dc.a) hVar.f85197b) != null) {
            zb.e a13 = aVar2.a();
            this.N = a13;
            a13.a(this);
            e(a13);
        }
        if (hVar != null && (aVar = (dc.a) hVar.f85198c) != null) {
            zb.e a14 = aVar.a();
            this.P = a14;
            a14.a(this);
            e(a14);
        }
        if (hVar != null && (bVar2 = (dc.b) hVar.f85199d) != null) {
            zb.e a15 = bVar2.a();
            this.R = (zb.i) a15;
            a15.a(this);
            e(a15);
        }
        if (hVar == null || (bVar = (dc.b) hVar.f85200e) == null) {
            return;
        }
        zb.e a16 = bVar.a();
        this.T = (zb.i) a16;
        a16.a(this);
        e(a16);
    }

    public static void v(String str, m mVar, Canvas canvas) {
        if (mVar.getColor() == 0) {
            return;
        }
        if (mVar.getStyle() == Paint.Style.STROKE && mVar.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, (Paint) mVar);
    }

    public static void w(Canvas canvas, m mVar, Path path) {
        if (mVar.getColor() == 0) {
            return;
        }
        if (mVar.getStyle() == Paint.Style.STROKE && mVar.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, mVar);
    }

    @Override // fc.c, yb.e
    public final void c(RectF rectF, Matrix matrix, boolean z13) {
        super.c(rectF, matrix, z13);
        com.airbnb.lottie.h hVar = this.M;
        rectF.set(0.0f, 0.0f, hVar.f28406k.width(), hVar.f28406k.height());
    }

    @Override // fc.c, cc.g
    public final void d(androidx.appcompat.app.d dVar, Object obj) {
        super.d(dVar, obj);
        PointF pointF = y.f28479a;
        if (obj == 1) {
            u uVar = this.O;
            if (uVar != null) {
                p(uVar);
            }
            if (dVar == null) {
                this.O = null;
                return;
            }
            u uVar2 = new u(dVar, null);
            this.O = uVar2;
            uVar2.a(this);
            e(this.O);
            return;
        }
        if (obj == 2) {
            u uVar3 = this.Q;
            if (uVar3 != null) {
                p(uVar3);
            }
            if (dVar == null) {
                this.Q = null;
                return;
            }
            u uVar4 = new u(dVar, null);
            this.Q = uVar4;
            uVar4.a(this);
            e(this.Q);
            return;
        }
        if (obj == y.f28492n) {
            u uVar5 = this.S;
            if (uVar5 != null) {
                p(uVar5);
            }
            if (dVar == null) {
                this.S = null;
                return;
            }
            u uVar6 = new u(dVar, null);
            this.S = uVar6;
            uVar6.a(this);
            e(this.S);
            return;
        }
        if (obj == y.f28493o) {
            u uVar7 = this.U;
            if (uVar7 != null) {
                p(uVar7);
            }
            if (dVar == null) {
                this.U = null;
                return;
            }
            u uVar8 = new u(dVar, null);
            this.U = uVar8;
            uVar8.a(this);
            e(this.U);
            return;
        }
        if (obj == y.A) {
            u uVar9 = this.V;
            if (uVar9 != null) {
                p(uVar9);
            }
            if (dVar == null) {
                this.V = null;
                return;
            }
            u uVar10 = new u(dVar, null);
            this.V = uVar10;
            uVar10.a(this);
            e(this.V);
            return;
        }
        if (obj != y.H) {
            if (obj == y.f28478J) {
                s sVar = this.K;
                sVar.getClass();
                sVar.l(new r(new kc.b(), dVar, new cc.c()));
                return;
            }
            return;
        }
        u uVar11 = this.W;
        if (uVar11 != null) {
            p(uVar11);
        }
        if (dVar == null) {
            this.W = null;
            return;
        }
        u uVar12 = new u(dVar, null);
        this.W = uVar12;
        uVar12.a(this);
        e(this.W);
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0377  */
    @Override // fc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r28, android.graphics.Matrix r29, int r30) {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.p.k(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final o x(int i13) {
        ArrayList arrayList = this.f61676J;
        for (int size = arrayList.size(); size < i13; size++) {
            o oVar = new o();
            oVar.f61674a = "";
            oVar.f61675b = 0.0f;
            arrayList.add(oVar);
        }
        return (o) arrayList.get(i13 - 1);
    }

    public final boolean y(Canvas canvas, cc.c cVar, int i13, float f13) {
        PointF pointF = cVar.f27422l;
        PointF pointF2 = cVar.f27423m;
        float c13 = jc.g.c();
        float f14 = (i13 * cVar.f27416f * c13) + (pointF == null ? 0.0f : (cVar.f27416f * c13) + pointF.y);
        if (this.L.f28465t && pointF2 != null && pointF != null && f14 >= pointF.y + pointF2.y + cVar.f27413c) {
            return false;
        }
        float f15 = pointF == null ? 0.0f : pointF.x;
        float f16 = pointF2 != null ? pointF2.x : 0.0f;
        int i14 = n.f61673a[cVar.f27414d.ordinal()];
        if (i14 == 1) {
            canvas.translate(f15, f14);
        } else if (i14 == 2) {
            canvas.translate((f15 + f16) - f13, f14);
        } else if (i14 == 3) {
            canvas.translate(((f16 / 2.0f) + f15) - (f13 / 2.0f), f14);
        }
        return true;
    }

    public final List z(String str, float f13, cc.d dVar, float f14, float f15, boolean z13) {
        float measureText;
        int i13 = 0;
        int i14 = 0;
        boolean z14 = false;
        int i15 = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i16 = 0; i16 < str.length(); i16++) {
            char charAt = str.charAt(i16);
            if (z13) {
                cc.e eVar = (cc.e) this.M.f28403h.g(cc.e.a(charAt, dVar.f27424a, dVar.f27426c));
                if (eVar != null) {
                    measureText = (jc.g.c() * ((float) eVar.f27430c) * f14) + f15;
                }
            } else {
                measureText = this.F.measureText(str.substring(i16, i16 + 1)) + f15;
            }
            if (charAt == ' ') {
                z14 = true;
                f18 = measureText;
            } else if (z14) {
                z14 = false;
                i15 = i16;
                f17 = measureText;
            } else {
                f17 += measureText;
            }
            f16 += measureText;
            if (f13 > 0.0f && f16 >= f13 && charAt != ' ') {
                i13++;
                o x13 = x(i13);
                if (i15 == i14) {
                    x13.f61674a = str.substring(i14, i16).trim();
                    x13.f61675b = (f16 - measureText) - ((r10.length() - r8.length()) * f18);
                    i14 = i16;
                    i15 = i14;
                    f16 = measureText;
                    f17 = f16;
                } else {
                    x13.f61674a = str.substring(i14, i15 - 1).trim();
                    x13.f61675b = ((f16 - f17) - ((r8.length() - r14.length()) * f18)) - f18;
                    f16 = f17;
                    i14 = i15;
                }
            }
        }
        if (f16 > 0.0f) {
            i13++;
            o x14 = x(i13);
            x14.f61674a = str.substring(i14);
            x14.f61675b = f16;
        }
        return this.f61676J.subList(0, i13);
    }
}
