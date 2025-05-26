package y1;

import android.graphics.Rect;
import ao2.k2;
import ao2.l0;
import b4.m0;
import b4.p0;
import do2.f2;
import do2.g2;
import do2.x1;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public k2 f136556b;

    /* renamed from: c, reason: collision with root package name */
    public g0 f136557c;

    /* renamed from: d, reason: collision with root package name */
    public f2 f136558d;

    @Override // h4.a0
    public final void a() {
        k(null);
    }

    @Override // h4.a0
    public final void b() {
        k2 k2Var = this.f136556b;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        this.f136556b = null;
        x1 j13 = j();
        if (j13 != null) {
            ((f2) j13).l();
        }
    }

    @Override // h4.a0
    public final void c(h4.f0 f0Var, h4.f0 f0Var2) {
        g0 g0Var = this.f136557c;
        if (g0Var != null) {
            boolean z13 = (p0.a(g0Var.f136566h.f67560b, f0Var2.f67560b) && Intrinsics.d(g0Var.f136566h.f67561c, f0Var2.f67561c)) ? false : true;
            g0Var.f136566h = f0Var2;
            int size = g0Var.f136568j.size();
            for (int i13 = 0; i13 < size; i13++) {
                i0 i0Var = (i0) ((WeakReference) g0Var.f136568j.get(i13)).get();
                if (i0Var != null) {
                    i0Var.f136581g = f0Var2;
                }
            }
            a0 a0Var = g0Var.f136571m;
            synchronized (a0Var.f136520c) {
                a0Var.f136527j = null;
                a0Var.f136529l = null;
                a0Var.f136528k = null;
                a0Var.f136530m = null;
                a0Var.f136531n = null;
                Unit unit = Unit.f80348a;
            }
            if (Intrinsics.d(f0Var, f0Var2)) {
                if (z13) {
                    w wVar = g0Var.f136560b;
                    int e13 = p0.e(f0Var2.f67560b);
                    int d2 = p0.d(f0Var2.f67560b);
                    p0 p0Var = g0Var.f136566h.f67561c;
                    int e14 = p0Var != null ? p0.e(p0Var.f21641a) : -1;
                    p0 p0Var2 = g0Var.f136566h.f67561c;
                    x xVar = (x) wVar;
                    xVar.a().updateSelection(xVar.f136605a, e13, d2, e14, p0Var2 != null ? p0.d(p0Var2.f21641a) : -1);
                    return;
                }
                return;
            }
            if (f0Var != null && (!Intrinsics.d(f0Var.f67559a.f21571a, f0Var2.f67559a.f21571a) || (p0.a(f0Var.f67560b, f0Var2.f67560b) && !Intrinsics.d(f0Var.f67561c, f0Var2.f67561c)))) {
                x xVar2 = (x) g0Var.f136560b;
                xVar2.a().restartInput(xVar2.f136605a);
                return;
            }
            int size2 = g0Var.f136568j.size();
            for (int i14 = 0; i14 < size2; i14++) {
                i0 i0Var2 = (i0) ((WeakReference) g0Var.f136568j.get(i14)).get();
                if (i0Var2 != null) {
                    h4.f0 f0Var3 = g0Var.f136566h;
                    w wVar2 = g0Var.f136560b;
                    if (i0Var2.f136585k) {
                        i0Var2.f136581g = f0Var3;
                        if (i0Var2.f136583i) {
                            x xVar3 = (x) wVar2;
                            xVar3.a().updateExtractedText(xVar3.f136605a, i0Var2.f136582h, androidx.compose.foundation.text.input.internal.a.c(f0Var3));
                        }
                        p0 p0Var3 = f0Var3.f67561c;
                        int e15 = p0Var3 != null ? p0.e(p0Var3.f21641a) : -1;
                        p0 p0Var4 = f0Var3.f67561c;
                        int d13 = p0Var4 != null ? p0.d(p0Var4.f21641a) : -1;
                        long j13 = f0Var3.f67560b;
                        x xVar4 = (x) wVar2;
                        xVar4.a().updateSelection(xVar4.f136605a, p0.e(j13), p0.d(j13), e15, d13);
                    }
                }
            }
        }
    }

    @Override // h4.a0
    public final void e(h4.f0 f0Var, h4.o oVar, e.f fVar, w1.e0 e0Var) {
        k(new e.c(f0Var, this, oVar, fVar, e0Var, 2));
    }

    @Override // h4.a0
    public final void f(a3.d dVar) {
        Rect rect;
        g0 g0Var = this.f136557c;
        if (g0Var != null) {
            g0Var.f136570l = new Rect(ml2.c.c(dVar.f484a), ml2.c.c(dVar.f485b), ml2.c.c(dVar.f486c), ml2.c.c(dVar.f487d));
            if (!g0Var.f136568j.isEmpty() || (rect = g0Var.f136570l) == null) {
                return;
            }
            g0Var.f136559a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // h4.a0
    public final void h(h4.f0 f0Var, h4.y yVar, m0 m0Var, q0.e eVar, a3.d dVar, a3.d dVar2) {
        g0 g0Var = this.f136557c;
        if (g0Var != null) {
            a0 a0Var = g0Var.f136571m;
            synchronized (a0Var.f136520c) {
                try {
                    a0Var.f136527j = f0Var;
                    a0Var.f136529l = yVar;
                    a0Var.f136528k = m0Var;
                    a0Var.f136530m = dVar;
                    a0Var.f136531n = dVar2;
                    if (!a0Var.f136522e) {
                        if (a0Var.f136521d) {
                        }
                        Unit unit = Unit.f80348a;
                    }
                    a0Var.a();
                    Unit unit2 = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final x1 j() {
        f2 f2Var = this.f136558d;
        if (f2Var != null) {
            return f2Var;
        }
        if (!x1.e.f131562a) {
            return null;
        }
        f2 b13 = g2.b(1, 0, co2.a.DROP_LATEST, 2);
        this.f136558d = b13;
        return b13;
    }

    public final void k(e.c cVar) {
        b0 b0Var = this.f136540a;
        if (b0Var == null) {
            return;
        }
        f fVar = new f(cVar, this, b0Var, null);
        z zVar = (z) b0Var;
        this.f136556b = zVar.f120054m ? kotlin.jvm.internal.j.z(zVar.z0(), null, l0.UNDISPATCHED, new y(zVar, fVar, null), 1) : null;
    }
}
