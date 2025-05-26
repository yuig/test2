package s2;

import i2.r3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a */
    public n f110642a;

    /* renamed from: b */
    public int f110643b;

    /* renamed from: c */
    public boolean f110644c;

    /* renamed from: d */
    public int f110645d;

    public i(int i13, n nVar) {
        int i14;
        int numberOfTrailingZeros;
        this.f110642a = nVar;
        this.f110643b = i13;
        if (i13 != 0) {
            n e13 = e();
            r3 r3Var = p.f110666a;
            int[] iArr = e13.f110662d;
            if (iArr != null) {
                i13 = iArr[0];
            } else {
                long j13 = e13.f110660b;
                int i15 = e13.f110661c;
                if (j13 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j13);
                } else {
                    long j14 = e13.f110659a;
                    if (j14 != 0) {
                        i15 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j14);
                    }
                }
                i13 = numberOfTrailingZeros + i15;
            }
            synchronized (p.f110667b) {
                i14 = p.f110670e.a(i13);
            }
        } else {
            i14 = -1;
        }
        this.f110645d = i14;
    }

    public static void p(i iVar) {
        p.f110666a.b(iVar);
    }

    public final void a() {
        synchronized (p.f110667b) {
            b();
            o();
            Unit unit = Unit.f80348a;
        }
    }

    public void b() {
        p.f110668c = p.f110668c.i(d());
    }

    public void c() {
        this.f110644c = true;
        synchronized (p.f110667b) {
            int i13 = this.f110645d;
            if (i13 >= 0) {
                p.u(i13);
                this.f110645d = -1;
            }
            Unit unit = Unit.f80348a;
        }
    }

    public int d() {
        return this.f110643b;
    }

    public n e() {
        return this.f110642a;
    }

    public abstract Function1 f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract Function1 i();

    public final i j() {
        r3 r3Var = p.f110666a;
        i iVar = (i) r3Var.a();
        r3Var.b(this);
        return iVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(z zVar);

    public void o() {
        int i13 = this.f110645d;
        if (i13 >= 0) {
            p.u(i13);
            this.f110645d = -1;
        }
    }

    public void q(int i13) {
        this.f110643b = i13;
    }

    public void r(n nVar) {
        this.f110642a = nVar;
    }

    public void s(int i13) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public abstract i t(Function1 function1);
}
