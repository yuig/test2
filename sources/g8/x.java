package g8;

import java.util.Objects;

/* loaded from: classes.dex */
public final class x extends t {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f64469e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f64470c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f64471d;

    public x(a7.b1 b1Var, Object obj, Object obj2) {
        super(b1Var);
        this.f64470c = obj;
        this.f64471d = obj2;
    }

    @Override // g8.t, a7.b1
    public final int b(Object obj) {
        Object obj2;
        if (f64469e.equals(obj) && (obj2 = this.f64471d) != null) {
            obj = obj2;
        }
        return this.f64402b.b(obj);
    }

    @Override // g8.t, a7.b1
    public final a7.z0 g(int i13, a7.z0 z0Var, boolean z13) {
        this.f64402b.g(i13, z0Var, z13);
        if (Objects.equals(z0Var.f1252b, this.f64471d) && z13) {
            z0Var.f1252b = f64469e;
        }
        return z0Var;
    }

    @Override // g8.t, a7.b1
    public final Object m(int i13) {
        Object m13 = this.f64402b.m(i13);
        return Objects.equals(m13, this.f64471d) ? f64469e : m13;
    }

    @Override // g8.t, a7.b1
    public final a7.a1 n(int i13, a7.a1 a1Var, long j13) {
        this.f64402b.n(i13, a1Var, j13);
        if (Objects.equals(a1Var.f929a, this.f64470c)) {
            a1Var.f929a = a7.a1.f927q;
        }
        return a1Var;
    }
}
