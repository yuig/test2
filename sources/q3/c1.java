package q3;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class c1 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f102178a;

    /* renamed from: b, reason: collision with root package name */
    public int f102179b;

    /* renamed from: c, reason: collision with root package name */
    public long f102180c = lb.l0.d(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public long f102181d = e1.f102201a;

    /* renamed from: e, reason: collision with root package name */
    public long f102182e = 0;

    public final int e0() {
        return (int) (this.f102180c & 4294967295L);
    }

    public final int i0() {
        return (int) (this.f102180c >> 32);
    }

    public final void m0() {
        this.f102178a = ql2.s.g((int) (this.f102180c >> 32), n4.a.j(this.f102181d), n4.a.h(this.f102181d));
        int g13 = ql2.s.g((int) (this.f102180c & 4294967295L), n4.a.i(this.f102181d), n4.a.g(this.f102181d));
        this.f102179b = g13;
        int i13 = this.f102178a;
        long j13 = this.f102180c;
        this.f102182e = d7.b.a((i13 - ((int) (j13 >> 32))) / 2, (g13 - ((int) (j13 & 4294967295L))) / 2);
    }

    public abstract void u0(long j13, float f13, Function1 function1);

    public final void w0(long j13) {
        if (n4.j.a(this.f102180c, j13)) {
            return;
        }
        this.f102180c = j13;
        m0();
    }

    public final void x0(long j13) {
        if (n4.a.b(this.f102181d, j13)) {
            return;
        }
        this.f102181d = j13;
        m0();
    }
}
