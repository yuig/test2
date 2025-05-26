package c2;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i2.w3 f25271a = new i2.w3(t0.f25225j);

    public static final long a(s0 s0Var, long j13) {
        boolean c13 = b3.w.c(j13, s0Var.d());
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = s0Var.f25176h;
        if (!c13 && !b3.w.c(j13, ((b3.w) s0Var.f25170b.getValue()).f21392a)) {
            boolean c14 = b3.w.c(j13, ((b3.w) s0Var.f25171c.getValue()).f21392a);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = s0Var.f25177i;
            if (!c14 && !b3.w.c(j13, ((b3.w) s0Var.f25172d.getValue()).f21392a)) {
                return b3.w.c(j13, s0Var.a()) ? ((b3.w) s0Var.f25178j.getValue()).f21392a : b3.w.c(j13, s0Var.e()) ? s0Var.c() : b3.w.c(j13, s0Var.b()) ? ((b3.w) s0Var.f25180l.getValue()).f21392a : b3.w.f21390n;
            }
            return ((b3.w) parcelableSnapshotMutableState2.getValue()).f21392a;
        }
        return ((b3.w) parcelableSnapshotMutableState.getValue()).f21392a;
    }

    public static final long b(long j13, i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(-702395103);
        long a13 = a((s0) sVar.m(f25271a), j13);
        if (a13 == 16) {
            a13 = ((b3.w) sVar.m(c1.f24577a)).f21392a;
        }
        sVar.r(false);
        return a13;
    }

    public static final long c(s0 s0Var) {
        return s0Var.f() ? s0Var.d() : s0Var.e();
    }

    public static s0 d(long j13, long j14, long j15, int i13) {
        long d2 = androidx.compose.ui.graphics.a.d(4284612846L);
        long d13 = androidx.compose.ui.graphics.a.d(4281794739L);
        long d14 = androidx.compose.ui.graphics.a.d(4278442694L);
        long d15 = androidx.compose.ui.graphics.a.d(4278290310L);
        long j16 = (i13 & 16) != 0 ? b3.w.f21382f : j13;
        long j17 = (i13 & 32) != 0 ? b3.w.f21382f : j14;
        long d16 = androidx.compose.ui.graphics.a.d(4289724448L);
        long j18 = b3.w.f21382f;
        long j19 = b3.w.f21378b;
        return new s0(d2, d13, d14, d15, j16, j17, d16, j18, j19, j19, (i13 & 1024) != 0 ? j19 : j15, j18, true);
    }
}
