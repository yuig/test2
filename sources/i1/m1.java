package i1;

import j1.g2;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class m1 extends u2.p implements s3.c0 {

    /* renamed from: n, reason: collision with root package name */
    public g2 f70832n;

    /* renamed from: o, reason: collision with root package name */
    public j1.y1 f70833o;

    /* renamed from: p, reason: collision with root package name */
    public j1.y1 f70834p;

    /* renamed from: q, reason: collision with root package name */
    public j1.y1 f70835q;

    /* renamed from: r, reason: collision with root package name */
    public n1 f70836r;

    /* renamed from: s, reason: collision with root package name */
    public o1 f70837s;

    /* renamed from: t, reason: collision with root package name */
    public Function0 f70838t;

    /* renamed from: u, reason: collision with root package name */
    public x0 f70839u;

    /* renamed from: v, reason: collision with root package name */
    public long f70840v = o0.f70857a;

    /* renamed from: w, reason: collision with root package name */
    public u2.e f70841w;

    /* renamed from: x, reason: collision with root package name */
    public final l1 f70842x;

    /* renamed from: y, reason: collision with root package name */
    public final l1 f70843y;

    public m1(g2 g2Var, j1.y1 y1Var, j1.y1 y1Var2, j1.y1 y1Var3, n1 n1Var, o1 o1Var, Function0 function0, x0 x0Var) {
        this.f70832n = g2Var;
        this.f70833o = y1Var;
        this.f70834p = y1Var2;
        this.f70835q = y1Var3;
        this.f70836r = n1Var;
        this.f70837s = o1Var;
        this.f70838t = function0;
        this.f70839u = x0Var;
        bs1.c.b(0, 0, 15);
        this.f70842x = new l1(this, 0);
        this.f70843y = new l1(this, 1);
    }

    @Override // u2.p
    public final void D0() {
        this.f70840v = o0.f70857a;
    }

    public final u2.e M0() {
        u2.e a13;
        if (this.f70832n.f().b(w0.PreEnter, w0.Visible)) {
            p0 p0Var = this.f70836r.f70855a.f70948c;
            if (p0Var == null || (a13 = p0Var.a()) == null) {
                p0 p0Var2 = this.f70837s.f70860a.f70948c;
                if (p0Var2 != null) {
                    return p0Var2.a();
                }
                return null;
            }
        } else {
            p0 p0Var3 = this.f70837s.f70860a.f70948c;
            if (p0Var3 == null || (a13 = p0Var3.a()) == null) {
                p0 p0Var4 = this.f70836r.f70855a.f70948c;
                if (p0Var4 != null) {
                    return p0Var4.a();
                }
                return null;
            }
        }
        return a13;
    }

    @Override // s3.c0
    public final int a(q3.s sVar, q3.r rVar, int i13) {
        return rVar.N(i13);
    }

    @Override // s3.c0
    public final int d(q3.s sVar, q3.r rVar, int i13) {
        return rVar.d(i13);
    }

    @Override // s3.c0
    public final int e(q3.s sVar, q3.r rVar, int i13) {
        return rVar.D(i13);
    }

    @Override // s3.c0
    public final int h(q3.s sVar, q3.r rVar, int i13) {
        return rVar.P(i13);
    }

    @Override // s3.c0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        b3.b1 b1Var;
        q3.q0 s04;
        q3.q0 s05;
        if (this.f70832n.c() == this.f70832n.f74078d.getValue()) {
            this.f70841w = null;
        } else if (this.f70841w == null) {
            u2.e M0 = M0();
            if (M0 == null) {
                M0 = u2.b.f120013a;
            }
            this.f70841w = M0;
        }
        int i13 = 1;
        if (r0Var.K()) {
            q3.c1 Q = o0Var.Q(j13);
            long d2 = lb.l0.d(Q.f102178a, Q.f102179b);
            this.f70840v = d2;
            s05 = r0Var.s0((int) (d2 >> 32), (int) (d2 & 4294967295L), kotlin.collections.z0.d(), new a0(Q, i13));
            return s05;
        }
        int i14 = 2;
        if (!((Boolean) this.f70838t.invoke()).booleanValue()) {
            q3.c1 Q2 = o0Var.Q(j13);
            s03 = r0Var.s0(Q2.f102178a, Q2.f102179b, kotlin.collections.z0.d(), new a0(Q2, i14));
            return s03;
        }
        x0 x0Var = this.f70839u;
        j1.y1 y1Var = x0Var.f70930a;
        int i15 = 0;
        n1 n1Var = x0Var.f70933d;
        o1 o1Var = x0Var.f70934e;
        j1.x1 a13 = y1Var != null ? y1Var.a(new y0(n1Var, o1Var, i15), new y0(n1Var, o1Var, i13)) : null;
        j1.y1 y1Var2 = x0Var.f70931b;
        j1.x1 a14 = y1Var2 != null ? y1Var2.a(new y0(n1Var, o1Var, i14), new y0(n1Var, o1Var, 3)) : null;
        if (x0Var.f70932c.c() == w0.PreEnter) {
            t1 t1Var = n1Var.f70855a.f70949d;
            if (t1Var != null) {
                b1Var = new b3.b1(t1Var.f70902b);
            } else {
                t1 t1Var2 = o1Var.f70860a.f70949d;
                if (t1Var2 != null) {
                    b1Var = new b3.b1(t1Var2.f70902b);
                }
                b1Var = null;
            }
        } else {
            t1 t1Var3 = o1Var.f70860a.f70949d;
            if (t1Var3 != null) {
                b1Var = new b3.b1(t1Var3.f70902b);
            } else {
                t1 t1Var4 = n1Var.f70855a.f70949d;
                if (t1Var4 != null) {
                    b1Var = new b3.b1(t1Var4.f70902b);
                }
                b1Var = null;
            }
        }
        j1.y1 y1Var3 = x0Var.f70935f;
        a1 a1Var = new a1(a13, a14, y1Var3 != null ? y1Var3.a(f0.f70761n, new a1(b1Var, n1Var, o1Var, 1)) : null, 0);
        q3.c1 Q3 = o0Var.Q(j13);
        long d13 = lb.l0.d(Q3.f102178a, Q3.f102179b);
        long j14 = n4.j.a(this.f70840v, o0.f70857a) ^ true ? this.f70840v : d13;
        j1.y1 y1Var4 = this.f70833o;
        j1.x1 a15 = y1Var4 != null ? y1Var4.a(this.f70842x, new j1(this, j14, 0)) : null;
        if (a15 != null) {
            d13 = ((n4.j) a15.getValue()).f89186a;
        }
        long G = bs1.c.G(j13, d13);
        j1.y1 y1Var5 = this.f70834p;
        long j15 = y1Var5 != null ? ((n4.h) y1Var5.a(q0.f70879p, new j1(this, j14, 1)).getValue()).f89180a : 0L;
        j1.y1 y1Var6 = this.f70835q;
        long j16 = y1Var6 != null ? ((n4.h) y1Var6.a(this.f70843y, new k1(this, j14)).getValue()).f89180a : 0L;
        u2.e eVar = this.f70841w;
        s04 = r0Var.s0((int) (G >> 32), (int) (G & 4294967295L), kotlin.collections.z0.d(), new i1(Q3, n4.h.c(eVar != null ? eVar.a(j14, G, n4.k.Ltr) : 0L, j16), j15, a1Var));
        return s04;
    }
}
