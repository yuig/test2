package j1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w2 implements v2 {

    /* renamed from: a */
    public final u f74299a;

    /* renamed from: b */
    public t f74300b;

    /* renamed from: c */
    public t f74301c;

    /* renamed from: d */
    public t f74302d;

    public w2(u uVar) {
        this.f74299a = uVar;
    }

    @Override // j1.r2
    public final t G(t tVar, t tVar2, t tVar3) {
        if (this.f74302d == null) {
            this.f74302d = tVar3.c();
        }
        t tVar4 = this.f74302d;
        if (tVar4 == null) {
            Intrinsics.r("endVelocityVector");
            throw null;
        }
        int b13 = tVar4.b();
        for (int i13 = 0; i13 < b13; i13++) {
            t tVar5 = this.f74302d;
            if (tVar5 == null) {
                Intrinsics.r("endVelocityVector");
                throw null;
            }
            tVar5.e(i13, this.f74299a.get(i13).b(tVar.a(i13), tVar2.a(i13), tVar3.a(i13)));
        }
        t tVar6 = this.f74302d;
        if (tVar6 != null) {
            return tVar6;
        }
        Intrinsics.r("endVelocityVector");
        throw null;
    }

    @Override // j1.r2
    public final long b(t tVar, t tVar2, t tVar3) {
        ql2.k it = ql2.s.q(0, tVar.b()).iterator();
        long j13 = 0;
        while (it.f104109c) {
            int b13 = it.b();
            j13 = Math.max(j13, this.f74299a.get(b13).e(tVar.a(b13), tVar2.a(b13), tVar3.a(b13)));
        }
        return j13;
    }

    @Override // j1.r2
    public final t g(long j13, t tVar, t tVar2, t tVar3) {
        if (this.f74301c == null) {
            this.f74301c = tVar3.c();
        }
        t tVar4 = this.f74301c;
        if (tVar4 == null) {
            Intrinsics.r("velocityVector");
            throw null;
        }
        int b13 = tVar4.b();
        for (int i13 = 0; i13 < b13; i13++) {
            t tVar5 = this.f74301c;
            if (tVar5 == null) {
                Intrinsics.r("velocityVector");
                throw null;
            }
            tVar5.e(i13, this.f74299a.get(i13).d(j13, tVar.a(i13), tVar2.a(i13), tVar3.a(i13)));
        }
        t tVar6 = this.f74301c;
        if (tVar6 != null) {
            return tVar6;
        }
        Intrinsics.r("velocityVector");
        throw null;
    }

    @Override // j1.r2
    public final t o(long j13, t tVar, t tVar2, t tVar3) {
        if (this.f74300b == null) {
            this.f74300b = tVar.c();
        }
        t tVar4 = this.f74300b;
        if (tVar4 == null) {
            Intrinsics.r("valueVector");
            throw null;
        }
        int b13 = tVar4.b();
        for (int i13 = 0; i13 < b13; i13++) {
            t tVar5 = this.f74300b;
            if (tVar5 == null) {
                Intrinsics.r("valueVector");
                throw null;
            }
            tVar5.e(i13, this.f74299a.get(i13).c(j13, tVar.a(i13), tVar2.a(i13), tVar3.a(i13)));
        }
        t tVar6 = this.f74300b;
        if (tVar6 != null) {
            return tVar6;
        }
        Intrinsics.r("valueVector");
        throw null;
    }

    public w2(i0 i0Var) {
        this(new t2(i0Var));
    }
}
