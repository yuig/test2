package k1;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w2 extends u2.p implements s3.c0 {

    /* renamed from: n, reason: collision with root package name */
    public t2 f78072n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f78073o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f78074p;

    @Override // s3.c0
    public final int a(q3.s sVar, q3.r rVar, int i13) {
        return this.f78074p ? rVar.N(Integer.MAX_VALUE) : rVar.N(i13);
    }

    @Override // s3.c0
    public final int d(q3.s sVar, q3.r rVar, int i13) {
        return this.f78074p ? rVar.d(i13) : rVar.d(Integer.MAX_VALUE);
    }

    @Override // s3.c0
    public final int e(q3.s sVar, q3.r rVar, int i13) {
        return this.f78074p ? rVar.D(i13) : rVar.D(Integer.MAX_VALUE);
    }

    @Override // s3.c0
    public final int h(q3.s sVar, q3.r rVar, int i13) {
        return this.f78074p ? rVar.P(Integer.MAX_VALUE) : rVar.P(i13);
    }

    @Override // s3.c0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        tb.f.B(j13, this.f78074p ? m1.f1.Vertical : m1.f1.Horizontal);
        q3.c1 Q = o0Var.Q(n4.a.a(j13, 0, this.f78074p ? n4.a.h(j13) : Integer.MAX_VALUE, 0, this.f78074p ? Integer.MAX_VALUE : n4.a.g(j13), 5));
        int i13 = Q.f102178a;
        int h10 = n4.a.h(j13);
        if (i13 > h10) {
            i13 = h10;
        }
        int i14 = Q.f102179b;
        int g13 = n4.a.g(j13);
        if (i14 > g13) {
            i14 = g13;
        }
        int i15 = Q.f102179b - i14;
        int i16 = Q.f102178a - i13;
        if (!this.f78074p) {
            i15 = i16;
        }
        t2 t2Var = this.f78072n;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = t2Var.f78030d;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = t2Var.f78027a;
        parcelableSnapshotMutableIntState.i(i15);
        s2.i P = bk.f.P();
        Function1 f13 = P != null ? P.f() : null;
        s2.i X = bk.f.X(P);
        try {
            if (parcelableSnapshotMutableIntState2.h() > i15) {
                parcelableSnapshotMutableIntState2.i(i15);
            }
            Unit unit = Unit.f80348a;
            bk.f.c0(P, X, f13);
            this.f78072n.f78028b.i(this.f78074p ? i14 : i13);
            s03 = r0Var.s0(i13, i14, kotlin.collections.z0.d(), new v2(this, i15, Q, 0));
            return s03;
        } catch (Throwable th3) {
            bk.f.c0(P, X, f13);
            throw th3;
        }
    }
}
