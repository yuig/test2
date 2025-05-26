package g8;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f64276a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f64277b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f64278c;

    public h0(CopyOnWriteArrayList copyOnWriteArrayList, int i13, e0 e0Var) {
        this.f64278c = copyOnWriteArrayList;
        this.f64276a = i13;
        this.f64277b = e0Var;
    }

    public final void a(d7.i iVar) {
        Iterator it = this.f64278c.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            d7.n0.c0(g0Var.f64267a, new e5.k(12, iVar, g0Var.f64268b));
        }
    }

    public final void b(int i13, androidx.media3.common.b bVar, int i14, Object obj, long j13) {
        a(new androidx.fragment.app.c(7, this, new a0(1, i13, bVar, i14, obj, d7.n0.o0(j13), -9223372036854775807L)));
    }

    public final void c(v vVar, int i13, int i14, androidx.media3.common.b bVar, int i15, Object obj, long j13, long j14) {
        a(new l0.d(this, vVar, new a0(i13, i14, bVar, i15, obj, d7.n0.o0(j13), d7.n0.o0(j14)), 7));
    }

    public final void d(v vVar, int i13) {
        e(vVar, i13, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(v vVar, int i13, int i14, androidx.media3.common.b bVar, int i15, Object obj, long j13, long j14) {
        a(new n7.o(this, vVar, new a0(i13, i14, bVar, i15, obj, d7.n0.o0(j13), d7.n0.o0(j14)), 2));
    }

    public final void f(v vVar, int i13, int i14, androidx.media3.common.b bVar, int i15, Object obj, long j13, long j14, IOException iOException, boolean z13) {
        a(new n7.l(this, vVar, new a0(i13, i14, bVar, i15, obj, d7.n0.o0(j13), d7.n0.o0(j14)), iOException, z13));
    }

    public final void g(v vVar, int i13, IOException iOException, boolean z13) {
        f(vVar, i13, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z13);
    }

    public final void h(v vVar, int i13, int i14, androidx.media3.common.b bVar, int i15, Object obj, long j13, long j14, int i16) {
        a(new n7.e(this, vVar, new a0(i13, i14, bVar, i15, obj, d7.n0.o0(j13), d7.n0.o0(j14)), i16, 2));
    }

    public final void i(int i13, long j13, long j14) {
        a0 a0Var = new a0(1, i13, null, 3, null, d7.n0.o0(j13), d7.n0.o0(j14));
        e0 e0Var = this.f64277b;
        e0Var.getClass();
        a(new l0.d(this, e0Var, a0Var, 8));
    }
}
