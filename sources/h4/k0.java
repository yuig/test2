package h4;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f67572a;

    /* renamed from: b, reason: collision with root package name */
    public final p f67573b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f67574c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f67575d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f67576e;

    /* renamed from: f, reason: collision with root package name */
    public Function1 f67577f;

    /* renamed from: g, reason: collision with root package name */
    public f0 f67578g;

    /* renamed from: h, reason: collision with root package name */
    public o f67579h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f67580i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.k f67581j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f67582k;

    /* renamed from: l, reason: collision with root package name */
    public final f f67583l;

    /* renamed from: m, reason: collision with root package name */
    public final k2.e f67584m;

    /* renamed from: n, reason: collision with root package name */
    public u0.n f67585n;

    public k0(View view, n3.d0 d0Var) {
        q qVar = new q(view);
        d7.w wVar = new d7.w(Choreographer.getInstance(), 2);
        this.f67572a = view;
        this.f67573b = qVar;
        this.f67574c = wVar;
        this.f67576e = e.f67536k;
        this.f67577f = e.f67537l;
        this.f67578g = new f0("", b4.p0.f21639b, 4);
        this.f67579h = o.f67597g;
        this.f67580i = new ArrayList();
        this.f67581j = xk2.m.a(xk2.n.NONE, new androidx.activity.a0(this, 18));
        this.f67583l = new f(d0Var, qVar);
        this.f67584m = new k2.e(new h0[16]);
    }

    @Override // h4.a0
    public final void a() {
        i(h0.StartInput);
    }

    @Override // h4.a0
    public final void b() {
        this.f67575d = false;
        this.f67576e = d.f67530k;
        this.f67577f = d.f67531l;
        this.f67582k = null;
        i(h0.StopInput);
    }

    @Override // h4.a0
    public final void c(f0 f0Var, f0 f0Var2) {
        boolean z13 = (b4.p0.a(this.f67578g.f67560b, f0Var2.f67560b) && Intrinsics.d(this.f67578g.f67561c, f0Var2.f67561c)) ? false : true;
        this.f67578g = f0Var2;
        int size = this.f67580i.size();
        for (int i13 = 0; i13 < size; i13++) {
            b0 b0Var = (b0) ((WeakReference) this.f67580i.get(i13)).get();
            if (b0Var != null) {
                b0Var.d(f0Var2);
            }
        }
        f fVar = this.f67583l;
        synchronized (fVar.f67543c) {
            fVar.f67550j = null;
            fVar.f67552l = null;
            fVar.f67551k = null;
            fVar.f67553m = d.f67529j;
            fVar.f67554n = null;
            fVar.f67555o = null;
            Unit unit = Unit.f80348a;
        }
        if (Intrinsics.d(f0Var, f0Var2)) {
            if (z13) {
                p pVar = this.f67573b;
                int e13 = b4.p0.e(f0Var2.f67560b);
                int d2 = b4.p0.d(f0Var2.f67560b);
                b4.p0 p0Var = this.f67578g.f67561c;
                int e14 = p0Var != null ? b4.p0.e(p0Var.f21641a) : -1;
                b4.p0 p0Var2 = this.f67578g.f67561c;
                q qVar = (q) pVar;
                ((InputMethodManager) qVar.f67606b.getValue()).updateSelection(qVar.f67605a, e13, d2, e14, p0Var2 != null ? b4.p0.d(p0Var2.f21641a) : -1);
                return;
            }
            return;
        }
        if (f0Var != null && (!Intrinsics.d(f0Var.f67559a.f21571a, f0Var2.f67559a.f21571a) || (b4.p0.a(f0Var.f67560b, f0Var2.f67560b) && !Intrinsics.d(f0Var.f67561c, f0Var2.f67561c)))) {
            q qVar2 = (q) this.f67573b;
            ((InputMethodManager) qVar2.f67606b.getValue()).restartInput(qVar2.f67605a);
            return;
        }
        int size2 = this.f67580i.size();
        for (int i14 = 0; i14 < size2; i14++) {
            b0 b0Var2 = (b0) ((WeakReference) this.f67580i.get(i14)).get();
            if (b0Var2 != null) {
                b0Var2.e(this.f67578g, this.f67573b);
            }
        }
    }

    @Override // h4.a0
    public final void d() {
        i(h0.HideKeyboard);
    }

    @Override // h4.a0
    public final void e(f0 f0Var, o oVar, e.f fVar, w1.e0 e0Var) {
        this.f67575d = true;
        this.f67578g = f0Var;
        this.f67579h = oVar;
        this.f67576e = fVar;
        this.f67577f = e0Var;
        i(h0.StartInput);
    }

    @Override // h4.a0
    public final void f(a3.d dVar) {
        Rect rect;
        this.f67582k = new Rect(ml2.c.c(dVar.f484a), ml2.c.c(dVar.f485b), ml2.c.c(dVar.f486c), ml2.c.c(dVar.f487d));
        if (!this.f67580i.isEmpty() || (rect = this.f67582k) == null) {
            return;
        }
        this.f67572a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // h4.a0
    public final void g() {
        i(h0.ShowKeyboard);
    }

    @Override // h4.a0
    public final void h(f0 f0Var, y yVar, b4.m0 m0Var, q0.e eVar, a3.d dVar, a3.d dVar2) {
        f fVar = this.f67583l;
        synchronized (fVar.f67543c) {
            try {
                fVar.f67550j = f0Var;
                fVar.f67552l = yVar;
                fVar.f67551k = m0Var;
                fVar.f67553m = eVar;
                fVar.f67554n = dVar;
                fVar.f67555o = dVar2;
                if (!fVar.f67545e) {
                    if (fVar.f67544d) {
                    }
                    Unit unit = Unit.f80348a;
                }
                fVar.a();
                Unit unit2 = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void i(h0 h0Var) {
        this.f67584m.b(h0Var);
        if (this.f67585n == null) {
            u0.n nVar = new u0.n(this, 3);
            this.f67574c.execute(nVar);
            this.f67585n = nVar;
        }
    }
}
