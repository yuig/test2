package l7;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final sp2.i f81768a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f81769b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f81770c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f81771d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public int f81772e;

    public d0(sp2.i iVar, i0 i0Var, z0 z0Var) {
        this.f81768a = iVar;
        this.f81769b = i0Var;
        this.f81770c = z0Var;
    }

    @Override // l7.g0
    public final synchronized void D() {
        Pair pair = (Pair) this.f81771d.poll();
        if (pair == null) {
            this.f81772e++;
            return;
        }
        this.f81770c.e(new d(3, this, pair), true);
        Pair pair2 = (Pair) this.f81771d.peek();
        if (pair2 != null && ((Long) pair2.second).longValue() == Long.MIN_VALUE) {
            z0 z0Var = this.f81770c;
            i0 i0Var = this.f81769b;
            Objects.requireNonNull(i0Var);
            z0Var.e(new e(i0Var, 2), true);
            this.f81771d.remove();
        }
    }

    public final synchronized void a(final a7.t tVar, final long j13) {
        try {
            if (this.f81772e > 0) {
                this.f81770c.e(new y0(this) { // from class: l7.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Object f81783c;

                    {
                        this.f81783c = this;
                    }

                    @Override // l7.y0
                    public final void run() {
                        d0 d0Var = (d0) this.f81783c;
                        d0Var.f81769b.b(d0Var.f81768a, tVar, j13);
                    }
                }, true);
                this.f81772e--;
            } else {
                this.f81771d.add(Pair.create(tVar, Long.valueOf(j13)));
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f81771d.isEmpty()) {
                z0 z0Var = this.f81770c;
                i0 i0Var = this.f81769b;
                Objects.requireNonNull(i0Var);
                z0Var.e(new e(i0Var, 1), true);
            } else {
                this.f81771d.add(Pair.create(a7.t.f1201e, Long.MIN_VALUE));
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // l7.g0
    public final synchronized void n() {
        this.f81772e = 0;
        this.f81771d.clear();
    }
}
