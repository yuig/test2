package q3;

import s3.s1;
import s3.t1;

/* loaded from: classes2.dex */
public final class t0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102264a;

    /* renamed from: b, reason: collision with root package name */
    public final r f102265b;

    /* renamed from: c, reason: collision with root package name */
    public final Enum f102266c;

    /* renamed from: d, reason: collision with root package name */
    public final Enum f102267d;

    public /* synthetic */ t0(r rVar, Enum r23, Enum r33, int i13) {
        this.f102264a = i13;
        this.f102265b = rVar;
        this.f102266c = r23;
        this.f102267d = r33;
    }

    @Override // q3.r
    public final int D(int i13) {
        int i14 = this.f102264a;
        r rVar = this.f102265b;
        switch (i14) {
        }
        return rVar.D(i13);
    }

    @Override // q3.r
    public final int N(int i13) {
        int i14 = this.f102264a;
        r rVar = this.f102265b;
        switch (i14) {
        }
        return rVar.N(i13);
    }

    @Override // q3.r
    public final int P(int i13) {
        int i14 = this.f102264a;
        r rVar = this.f102265b;
        switch (i14) {
        }
        return rVar.P(i13);
    }

    @Override // q3.o0
    public final c1 Q(long j13) {
        int i13 = this.f102264a;
        r rVar = this.f102265b;
        Enum r23 = this.f102266c;
        Enum r43 = this.f102267d;
        switch (i13) {
            case 0:
                if (((v0) r43) == v0.Width) {
                    return new p(((u0) r23) == u0.Max ? rVar.P(n4.a.g(j13)) : rVar.N(n4.a.g(j13)), n4.a.c(j13) ? n4.a.g(j13) : 32767, 1);
                }
                return new p(n4.a.d(j13) ? n4.a.h(j13) : 32767, ((u0) r23) == u0.Max ? rVar.d(n4.a.h(j13)) : rVar.D(n4.a.h(j13)), 1);
            default:
                if (((t1) r43) == t1.Width) {
                    return new p(((s1) r23) == s1.Max ? rVar.P(n4.a.g(j13)) : rVar.N(n4.a.g(j13)), n4.a.c(j13) ? n4.a.g(j13) : 32767, 2);
                }
                return new p(n4.a.d(j13) ? n4.a.h(j13) : 32767, ((s1) r23) == s1.Max ? rVar.d(n4.a.h(j13)) : rVar.D(n4.a.h(j13)), 2);
        }
    }

    @Override // q3.r
    public final Object a() {
        int i13 = this.f102264a;
        r rVar = this.f102265b;
        switch (i13) {
        }
        return rVar.a();
    }

    @Override // q3.r
    public final int d(int i13) {
        int i14 = this.f102264a;
        r rVar = this.f102265b;
        switch (i14) {
        }
        return rVar.d(i13);
    }
}
