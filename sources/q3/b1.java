package q3;

import kotlin.jvm.functions.Function1;
import s3.a2;

/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f102170a;

    public static final n4.k a(b1 b1Var) {
        m0 m0Var = (m0) b1Var;
        int i13 = m0Var.f102250b;
        Object obj = m0Var.f102251c;
        switch (i13) {
            case 0:
                return ((s3.z0) obj).getLayoutDirection();
            default:
                return (n4.k) ((t3.c0) ((a2) obj)).f115884h0.getValue();
        }
    }

    public static final int b(b1 b1Var) {
        m0 m0Var = (m0) b1Var;
        int i13 = m0Var.f102250b;
        Object obj = m0Var.f102251c;
        switch (i13) {
            case 0:
                return ((s3.z0) obj).i0();
            default:
                return ((t3.c0) ((a2) obj)).f115887j.f110838z.f110984r.f102178a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(b1 b1Var, c1 c1Var) {
        b1Var.getClass();
        if (c1Var instanceof s3.f1) {
            ((s3.f1) c1Var).b0(b1Var.f102170a);
        }
    }

    public static void d(b1 b1Var, c1 c1Var, int i13, int i14) {
        b1Var.getClass();
        long a13 = d7.b.a(i13, i14);
        c(b1Var, c1Var);
        c1Var.u0(n4.h.c(a13, c1Var.f102182e), 0.0f, null);
    }

    public static void e(b1 b1Var, c1 c1Var, long j13) {
        b1Var.getClass();
        c(b1Var, c1Var);
        c1Var.u0(n4.h.c(j13, c1Var.f102182e), 0.0f, null);
    }

    public static void f(b1 b1Var, c1 c1Var, int i13, int i14) {
        b1Var.getClass();
        long a13 = d7.b.a(i13, i14);
        if (a(b1Var) == n4.k.Ltr || b(b1Var) == 0) {
            c(b1Var, c1Var);
            c1Var.u0(n4.h.c(a13, c1Var.f102182e), 0.0f, null);
        } else {
            long a14 = d7.b.a((b(b1Var) - c1Var.f102178a) - ((int) (a13 >> 32)), (int) (a13 & 4294967295L));
            c(b1Var, c1Var);
            c1Var.u0(n4.h.c(a14, c1Var.f102182e), 0.0f, null);
        }
    }

    public static void g(b1 b1Var, c1 c1Var, int i13, int i14) {
        int i15 = e1.f102202b;
        d1 d1Var = d1.f102187i;
        b1Var.getClass();
        long a13 = d7.b.a(i13, i14);
        if (a(b1Var) == n4.k.Ltr || b(b1Var) == 0) {
            c(b1Var, c1Var);
            c1Var.u0(n4.h.c(a13, c1Var.f102182e), 0.0f, d1Var);
        } else {
            long a14 = d7.b.a((b(b1Var) - c1Var.f102178a) - ((int) (a13 >> 32)), (int) (a13 & 4294967295L));
            c(b1Var, c1Var);
            c1Var.u0(n4.h.c(a14, c1Var.f102182e), 0.0f, d1Var);
        }
    }

    public static void h(b1 b1Var, c1 c1Var, long j13) {
        int i13 = e1.f102202b;
        d1 d1Var = d1.f102187i;
        b1Var.getClass();
        if (a(b1Var) == n4.k.Ltr || b(b1Var) == 0) {
            c(b1Var, c1Var);
            c1Var.u0(n4.h.c(j13, c1Var.f102182e), 0.0f, d1Var);
        } else {
            long a13 = d7.b.a((b(b1Var) - c1Var.f102178a) - ((int) (j13 >> 32)), (int) (j13 & 4294967295L));
            c(b1Var, c1Var);
            c1Var.u0(n4.h.c(a13, c1Var.f102182e), 0.0f, d1Var);
        }
    }

    public static void i(b1 b1Var, c1 c1Var, int i13, int i14, Function1 function1, int i15) {
        if ((i15 & 8) != 0) {
            int i16 = e1.f102202b;
            function1 = d1.f102187i;
        }
        b1Var.getClass();
        long a13 = d7.b.a(i13, i14);
        c(b1Var, c1Var);
        c1Var.u0(n4.h.c(a13, c1Var.f102182e), 0.0f, function1);
    }

    public static void j(b1 b1Var, c1 c1Var, long j13) {
        int i13 = e1.f102202b;
        d1 d1Var = d1.f102187i;
        b1Var.getClass();
        c(b1Var, c1Var);
        c1Var.u0(n4.h.c(j13, c1Var.f102182e), 0.0f, d1Var);
    }
}
