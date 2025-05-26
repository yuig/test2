package ao2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class c1 implements Runnable, Comparable, x0 {
    private volatile Object _heap;

    /* renamed from: a */
    public long f20129a;

    /* renamed from: b */
    public int f20130b = -1;

    public c1(long j13) {
        this.f20129a = j13;
    }

    public final ho2.z b() {
        Object obj = this._heap;
        if (obj instanceof ho2.z) {
            return (ho2.z) obj;
        }
        return null;
    }

    public final int c(long j13, d1 d1Var, e1 e1Var) {
        synchronized (this) {
            if (this._heap == g1.f20155a) {
                return 2;
            }
            synchronized (d1Var) {
                try {
                    c1[] c1VarArr = d1Var.f69797a;
                    c1 c1Var = c1VarArr != null ? c1VarArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e1.f20137g;
                    e1Var.getClass();
                    if (e1.f20139i.get(e1Var) != 0) {
                        return 1;
                    }
                    if (c1Var == null) {
                        d1Var.f20133c = j13;
                    } else {
                        long j14 = c1Var.f20129a;
                        if (j14 - j13 < 0) {
                            j13 = j14;
                        }
                        if (j13 - d1Var.f20133c > 0) {
                            d1Var.f20133c = j13;
                        }
                    }
                    long j15 = this.f20129a;
                    long j16 = d1Var.f20133c;
                    if (j15 - j16 < 0) {
                        this.f20129a = j16;
                    }
                    d1Var.a(this);
                    return 0;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j13 = this.f20129a - ((c1) obj).f20129a;
        if (j13 > 0) {
            return 1;
        }
        return j13 < 0 ? -1 : 0;
    }

    public final void d(d1 d1Var) {
        if (this._heap == g1.f20155a) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this._heap = d1Var;
    }

    @Override // ao2.x0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                fi.b bVar = g1.f20155a;
                if (obj == bVar) {
                    return;
                }
                d1 d1Var = obj instanceof d1 ? (d1) obj : null;
                if (d1Var != null) {
                    synchronized (d1Var) {
                        if (b() != null) {
                            d1Var.b(this.f20130b);
                        }
                    }
                }
                this._heap = bVar;
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f20129a + ']';
    }
}
