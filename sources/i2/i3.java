package i2;

import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class i3 extends s2.a0 implements s2.q {

    /* renamed from: b, reason: collision with root package name */
    public final j3 f71130b;

    /* renamed from: c, reason: collision with root package name */
    public h3 f71131c;

    public i3(Object obj, j3 j3Var) {
        this.f71130b = j3Var;
        h3 h3Var = new h3(obj);
        if (s2.p.f110666a.a() != null) {
            h3 h3Var2 = new h3(obj);
            h3Var2.f110604a = 1;
            h3Var.f110605b = h3Var2;
        }
        this.f71131c = h3Var;
    }

    @Override // s2.q
    public final j3 a() {
        return this.f71130b;
    }

    @Override // s2.z
    public final s2.b0 b(s2.b0 b0Var, s2.b0 b0Var2, s2.b0 b0Var3) {
        if (this.f71130b.a(((h3) b0Var2).f71124c, ((h3) b0Var3).f71124c)) {
            return b0Var2;
        }
        return null;
    }

    @Override // s2.z
    public final s2.b0 d() {
        return this.f71131c;
    }

    @Override // s2.z
    public final void e(s2.b0 b0Var) {
        this.f71131c = (h3) b0Var;
    }

    @Override // i2.v3
    public final Object getValue() {
        return ((h3) s2.p.t(this.f71131c, this)).f71124c;
    }

    @Override // i2.q1
    public final void setValue(Object obj) {
        s2.i k13;
        h3 h3Var = (h3) s2.p.i(this.f71131c);
        if (this.f71130b.a(h3Var.f71124c, obj)) {
            return;
        }
        h3 h3Var2 = this.f71131c;
        synchronized (s2.p.f110667b) {
            k13 = s2.p.k();
            ((h3) s2.p.o(h3Var2, this, k13, h3Var)).f71124c = obj;
            Unit unit = Unit.f80348a;
        }
        s2.p.n(k13, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((h3) s2.p.i(this.f71131c)).f71124c + ")@" + hashCode();
    }
}
