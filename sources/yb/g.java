package yb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements e, zb.a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f138361a;

    /* renamed from: b, reason: collision with root package name */
    public final xb.a f138362b;

    /* renamed from: c, reason: collision with root package name */
    public final fc.c f138363c;

    /* renamed from: d, reason: collision with root package name */
    public final String f138364d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f138365e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f138366f;

    /* renamed from: g, reason: collision with root package name */
    public final zb.e f138367g;

    /* renamed from: h, reason: collision with root package name */
    public final zb.e f138368h;

    /* renamed from: i, reason: collision with root package name */
    public zb.u f138369i;

    /* renamed from: j, reason: collision with root package name */
    public final com.airbnb.lottie.v f138370j;

    /* renamed from: k, reason: collision with root package name */
    public zb.e f138371k;

    /* renamed from: l, reason: collision with root package name */
    public float f138372l;

    /* renamed from: m, reason: collision with root package name */
    public final zb.h f138373m;

    public g(com.airbnb.lottie.v vVar, fc.c cVar, ec.r rVar) {
        dc.a aVar;
        PorterDuff.Mode mode;
        Path path = new Path();
        this.f138361a = path;
        xb.a aVar2 = new xb.a(1);
        this.f138362b = aVar2;
        this.f138366f = new ArrayList();
        this.f138363c = cVar;
        this.f138364d = rVar.f58339c;
        this.f138365e = rVar.f58342f;
        this.f138370j = vVar;
        if (cVar.l() != null) {
            zb.e a13 = ((dc.b) cVar.l().f66449b).a();
            this.f138371k = a13;
            a13.a(this);
            cVar.e(this.f138371k);
        }
        if (cVar.n() != null) {
            this.f138373m = new zb.h(this, cVar, cVar.n());
        }
        dc.a aVar3 = rVar.f58340d;
        if (aVar3 == null || (aVar = rVar.f58341e) == null) {
            this.f138367g = null;
            this.f138368h = null;
            return;
        }
        f5.a nativeBlendMode = cVar.f61636p.f61672y.toNativeBlendMode();
        int i13 = f5.f.f61085a;
        if (Build.VERSION.SDK_INT >= 29) {
            f5.d.d(aVar2, nativeBlendMode != null ? v0.a.d(nativeBlendMode) : null);
        } else if (nativeBlendMode != null) {
            switch (f5.b.f61078a[nativeBlendMode.ordinal()]) {
                case 1:
                    mode = PorterDuff.Mode.CLEAR;
                    break;
                case 2:
                    mode = PorterDuff.Mode.SRC;
                    break;
                case 3:
                    mode = PorterDuff.Mode.DST;
                    break;
                case 4:
                    mode = PorterDuff.Mode.SRC_OVER;
                    break;
                case 5:
                    mode = PorterDuff.Mode.DST_OVER;
                    break;
                case 6:
                    mode = PorterDuff.Mode.SRC_IN;
                    break;
                case 7:
                    mode = PorterDuff.Mode.DST_IN;
                    break;
                case 8:
                    mode = PorterDuff.Mode.SRC_OUT;
                    break;
                case 9:
                    mode = PorterDuff.Mode.DST_OUT;
                    break;
                case 10:
                    mode = PorterDuff.Mode.SRC_ATOP;
                    break;
                case 11:
                    mode = PorterDuff.Mode.DST_ATOP;
                    break;
                case 12:
                    mode = PorterDuff.Mode.XOR;
                    break;
                case 13:
                    mode = PorterDuff.Mode.ADD;
                    break;
                case 14:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.OVERLAY;
                    break;
                case 17:
                    mode = PorterDuff.Mode.DARKEN;
                    break;
                case 18:
                    mode = PorterDuff.Mode.LIGHTEN;
                    break;
                default:
                    mode = null;
                    break;
            }
            aVar2.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
        } else {
            aVar2.setXfermode(null);
        }
        path.setFillType(rVar.f58338b);
        zb.e a14 = aVar3.a();
        this.f138367g = a14;
        a14.a(this);
        cVar.e(a14);
        zb.e a15 = aVar.a();
        this.f138368h = a15;
        a15.a(this);
        cVar.e(a15);
    }

    @Override // zb.a
    public final void a() {
        this.f138370j.invalidateSelf();
    }

    @Override // yb.c
    public final void b(List list, List list2) {
        for (int i13 = 0; i13 < list2.size(); i13++) {
            c cVar = (c) list2.get(i13);
            if (cVar instanceof n) {
                this.f138366f.add((n) cVar);
            }
        }
    }

    @Override // yb.e
    public final void c(RectF rectF, Matrix matrix, boolean z13) {
        Path path = this.f138361a;
        path.reset();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f138366f;
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
        if (obj == 1) {
            this.f138367g.l(dVar);
            return;
        }
        if (obj == 4) {
            this.f138368h.l(dVar);
            return;
        }
        ColorFilter colorFilter = y.F;
        fc.c cVar = this.f138363c;
        if (obj == colorFilter) {
            zb.u uVar = this.f138369i;
            if (uVar != null) {
                cVar.p(uVar);
            }
            if (dVar == null) {
                this.f138369i = null;
                return;
            }
            zb.u uVar2 = new zb.u(dVar, null);
            this.f138369i = uVar2;
            uVar2.a(this);
            cVar.e(this.f138369i);
            return;
        }
        if (obj == y.f28483e) {
            zb.e eVar = this.f138371k;
            if (eVar != null) {
                eVar.l(dVar);
                return;
            }
            zb.u uVar3 = new zb.u(dVar, null);
            this.f138371k = uVar3;
            uVar3.a(this);
            cVar.e(this.f138371k);
            return;
        }
        zb.h hVar = this.f138373m;
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

    @Override // yb.e
    public final void f(Canvas canvas, Matrix matrix, int i13) {
        if (this.f138365e) {
            return;
        }
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        zb.f fVar = (zb.f) this.f138367g;
        int m13 = fVar.m(fVar.b(), fVar.d());
        PointF pointF = jc.f.f75393a;
        int i14 = 0;
        int max = (Math.max(0, Math.min(255, (int) ((((i13 / 255.0f) * ((Integer) this.f138368h.g()).intValue()) / 100.0f) * 255.0f))) << 24) | (m13 & 16777215);
        xb.a aVar2 = this.f138362b;
        aVar2.setColor(max);
        zb.u uVar = this.f138369i;
        if (uVar != null) {
            aVar2.setColorFilter((ColorFilter) uVar.g());
        }
        zb.e eVar = this.f138371k;
        if (eVar != null) {
            float floatValue = ((Float) eVar.g()).floatValue();
            if (floatValue == 0.0f) {
                aVar2.setMaskFilter(null);
            } else if (floatValue != this.f138372l) {
                aVar2.setMaskFilter(this.f138363c.m(floatValue));
            }
            this.f138372l = floatValue;
        }
        zb.h hVar = this.f138373m;
        if (hVar != null) {
            hVar.b(aVar2);
        }
        Path path = this.f138361a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f138366f;
            if (i14 >= arrayList.size()) {
                canvas.drawPath(path, aVar2);
                com.airbnb.lottie.a aVar3 = com.airbnb.lottie.b.f28381a;
                return;
            } else {
                path.addPath(((n) arrayList.get(i14)).r(), matrix);
                i14++;
            }
        }
    }

    @Override // cc.g
    public final void g(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2) {
        jc.f.f(fVar, i13, arrayList, fVar2, this);
    }

    @Override // yb.c
    public final String getName() {
        return this.f138364d;
    }
}
