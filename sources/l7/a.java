package l7;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import pk.w1;

/* loaded from: classes3.dex */
public abstract class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f81702a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f81703b = new g4.u();

    /* renamed from: c, reason: collision with root package name */
    public h0 f81704c = new t5.e(this, 5);

    /* renamed from: d, reason: collision with root package name */
    public f0 f81705d = new a.e(9);

    /* renamed from: e, reason: collision with root package name */
    public Executor f81706e = com.google.common.util.concurrent.r.INSTANCE;

    /* renamed from: f, reason: collision with root package name */
    public int f81707f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f81708g = -1;

    public a(boolean z13) {
        this.f81702a = new v0(z13, 1);
    }

    @Override // l7.i0
    public final void b(sp2.i iVar, a7.t tVar, long j13) {
        try {
            int i13 = this.f81707f;
            int i14 = tVar.f1204c;
            v0 v0Var = this.f81702a;
            int i15 = tVar.f1205d;
            if (i13 == i14) {
                if (this.f81708g == i15) {
                    if (!((w1) pk.o0.b(v0Var.f81888a, v0Var.f81889b).iterator()).hasNext()) {
                    }
                    a7.t c13 = v0Var.c();
                    d7.n.n(c13.f1203b, c13.f1204c, c13.f1205d);
                    d7.n.f();
                    h(tVar.f1202a, j13);
                    this.f81703b.z(tVar);
                    this.f81704c.j(c13, j13);
                }
            }
            int i16 = tVar.f1204c;
            this.f81707f = i16;
            this.f81708g = i15;
            d7.f0 c14 = n0.c(i16, i15, ((m) this).f81821i);
            int i17 = c14.f53821a;
            int i18 = c14.f53822b;
            ArrayDeque arrayDeque = v0Var.f81888a;
            ArrayDeque arrayDeque2 = v0Var.f81889b;
            if (((w1) pk.o0.b(arrayDeque, arrayDeque2).iterator()).hasNext()) {
                a7.t tVar2 = (a7.t) ((w1) pk.o0.b(arrayDeque, arrayDeque2).iterator()).next();
                if (tVar2.f1204c != i17 || tVar2.f1205d != i18) {
                    v0Var.b();
                    v0Var.a(iVar, i17, i18);
                }
            } else {
                v0Var.a(iVar, i17, i18);
            }
            a7.t c132 = v0Var.c();
            d7.n.n(c132.f1203b, c132.f1204c, c132.f1205d);
            d7.n.f();
            h(tVar.f1202a, j13);
            this.f81703b.z(tVar);
            this.f81704c.j(c132, j13);
        } catch (VideoFrameProcessingException e13) {
            e = e13;
            this.f81706e.execute(new w2.c(7, this, e));
        } catch (GlUtil$GlException e14) {
            e = e14;
            this.f81706e.execute(new w2.c(7, this, e));
        }
    }

    @Override // l7.i0
    public final void c() {
        this.f81704c.m();
    }

    @Override // l7.i0
    public final void d(Executor executor, n nVar) {
        this.f81706e = executor;
        this.f81705d = nVar;
    }

    @Override // l7.i0
    public final void e(g0 g0Var) {
        this.f81703b = g0Var;
        int i13 = 0;
        while (true) {
            v0 v0Var = this.f81702a;
            ArrayDeque arrayDeque = v0Var.f81888a;
            if (i13 >= (!((w1) pk.o0.b(arrayDeque, v0Var.f81889b).iterator()).hasNext() ? v0Var.f81890c : arrayDeque.size())) {
                return;
            }
            g0Var.D();
            i13++;
        }
    }

    @Override // l7.i0
    public final void f(a7.t tVar) {
        v0 v0Var = this.f81702a;
        if (v0Var.f81889b.contains(tVar)) {
            ArrayDeque arrayDeque = v0Var.f81889b;
            bf.b.t(arrayDeque.contains(tVar));
            arrayDeque.remove(tVar);
            v0Var.f81888a.add(tVar);
            this.f81703b.D();
        }
    }

    @Override // l7.i0
    public final void flush() {
        v0 v0Var = this.f81702a;
        ArrayDeque arrayDeque = v0Var.f81888a;
        ArrayDeque arrayDeque2 = v0Var.f81889b;
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        this.f81703b.n();
        for (int i13 = 0; i13 < v0Var.f81890c; i13++) {
            this.f81703b.D();
        }
    }

    @Override // l7.i0
    public final void g(f fVar) {
        this.f81704c = fVar;
    }

    public abstract void h(int i13, long j13);
}
