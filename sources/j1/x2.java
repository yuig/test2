package j1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f74312a;

    /* renamed from: b, reason: collision with root package name */
    public t f74313b;

    /* renamed from: c, reason: collision with root package name */
    public t f74314c;

    /* renamed from: d, reason: collision with root package name */
    public t f74315d;

    public x2(j0 j0Var) {
        this.f74312a = j0Var;
        j0Var.getClass();
    }

    public final t a(t tVar, t tVar2) {
        if (this.f74315d == null) {
            this.f74315d = tVar.c();
        }
        t tVar3 = this.f74315d;
        if (tVar3 == null) {
            Intrinsics.r("targetVector");
            throw null;
        }
        int b13 = tVar3.b();
        for (int i13 = 0; i13 < b13; i13++) {
            t tVar4 = this.f74315d;
            if (tVar4 == null) {
                Intrinsics.r("targetVector");
                throw null;
            }
            float a13 = tVar.a(i13);
            float a14 = tVar2.a(i13);
            i1.r1 r1Var = ((i1.x1) this.f74312a).f70936a;
            r1Var.getClass();
            float[] fArr = i1.b.f70719a;
            double a15 = i1.b.a(a14, r1Var.f70888a * r1Var.f70889b);
            double d2 = i1.s1.f70898a;
            tVar4.e(i13, (Math.signum(a14) * ((float) (Math.exp((d2 / (d2 - 1.0d)) * a15) * r11 * r10))) + a13);
        }
        t tVar5 = this.f74315d;
        if (tVar5 != null) {
            return tVar5;
        }
        Intrinsics.r("targetVector");
        throw null;
    }

    public final t b(long j13, t tVar, t tVar2) {
        if (this.f74314c == null) {
            this.f74314c = tVar.c();
        }
        t tVar3 = this.f74314c;
        if (tVar3 == null) {
            Intrinsics.r("velocityVector");
            throw null;
        }
        int b13 = tVar3.b();
        for (int i13 = 0; i13 < b13; i13++) {
            t tVar4 = this.f74314c;
            if (tVar4 == null) {
                Intrinsics.r("velocityVector");
                throw null;
            }
            tVar.getClass();
            tVar4.e(i13, ((i1.x1) this.f74312a).f70936a.a(tVar2.a(i13)).b(j13 / 1000000));
        }
        t tVar5 = this.f74314c;
        if (tVar5 != null) {
            return tVar5;
        }
        Intrinsics.r("velocityVector");
        throw null;
    }
}
