package b2;

import java.util.List;
import w1.r2;

/* loaded from: classes2.dex */
public final class p0 extends h {

    /* renamed from: h, reason: collision with root package name */
    public final h4.f0 f21197h;

    /* renamed from: i, reason: collision with root package name */
    public final r2 f21198i;

    public p0(h4.f0 f0Var, h4.y yVar, r2 r2Var, z0 z0Var) {
        super(f0Var.f67559a, f0Var.f67560b, r2Var != null ? r2Var.f127471a : null, yVar, z0Var);
        this.f21197h = f0Var;
        this.f21198i = r2Var;
    }

    public final List n(w1.t tVar) {
        if (!b4.p0.b(this.f21158f)) {
            return kotlin.collections.f0.j(new h4.a("", 0), new h4.e0(b4.p0.e(this.f21158f), b4.p0.e(this.f21158f)));
        }
        h4.j jVar = (h4.j) tVar.invoke(this);
        if (jVar != null) {
            return kotlin.collections.e0.b(jVar);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(w1.r2 r6, int r7) {
        /*
            r5 = this;
            q3.x r0 = r6.f127472b
            if (r0 == 0) goto L11
            q3.x r1 = r6.f127473c
            if (r1 == 0) goto Le
            r2 = 1
            a3.d r0 = r1.J(r0, r2)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L13
        L11:
            a3.d r0 = a3.d.f483e
        L13:
            h4.f0 r1 = r5.f21197h
            long r1 = r1.f67560b
            int r3 = b4.p0.f21640c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            h4.y r2 = r5.f21156d
            int r1 = r2.b(r1)
            b4.m0 r6 = r6.f127471a
            a3.d r1 = r6.c(r1)
            float r3 = r0.d()
            float r0 = r0.c()
            long r3 = bs1.c.c(r3, r0)
            float r0 = a3.f.b(r3)
            float r7 = (float) r7
            float r0 = r0 * r7
            float r7 = r1.f485b
            float r0 = r0 + r7
            float r7 = r1.f484a
            long r0 = com.bumptech.glide.c.d(r7, r0)
            b4.o r6 = r6.f21616b
            int r6 = r6.e(r0)
            int r6 = r2.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.p0.o(w1.r2, int):int");
    }
}
