package i2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0 extends s2.b0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f71166h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f71167c;

    /* renamed from: d, reason: collision with root package name */
    public int f71168d;

    /* renamed from: e, reason: collision with root package name */
    public g1.z f71169e;

    /* renamed from: f, reason: collision with root package name */
    public Object f71170f;

    /* renamed from: g, reason: collision with root package name */
    public int f71171g;

    public m0() {
        g1.z zVar = g1.h0.f63270a;
        Intrinsics.g(zVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f71169e = zVar;
        this.f71170f = f71166h;
    }

    @Override // s2.b0
    public final void a(s2.b0 b0Var) {
        Intrinsics.g(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        m0 m0Var = (m0) b0Var;
        this.f71169e = m0Var.f71169e;
        this.f71170f = m0Var.f71170f;
        this.f71171g = m0Var.f71171g;
    }

    @Override // s2.b0
    public final s2.b0 b() {
        return new m0();
    }

    public final boolean c(p0 p0Var, s2.i iVar) {
        boolean z13;
        boolean z14;
        Object obj = s2.p.f110667b;
        synchronized (obj) {
            z13 = true;
            if (this.f71167c == iVar.d()) {
                if (this.f71168d == iVar.h()) {
                    z14 = false;
                }
            }
            z14 = true;
        }
        if (this.f71170f == f71166h || (z14 && this.f71171g != d(p0Var, iVar))) {
            z13 = false;
        }
        if (z13 && z14) {
            synchronized (obj) {
                this.f71167c = iVar.d();
                this.f71168d = iVar.h();
                Unit unit = Unit.f80348a;
            }
        }
        return z13;
    }

    public final int d(p0 p0Var, s2.i iVar) {
        g1.z zVar;
        int i13;
        int i14;
        synchronized (s2.p.f110667b) {
            zVar = this.f71169e;
        }
        char c13 = 7;
        if (zVar.f63357e == 0) {
            return 7;
        }
        k2.e Q = bs1.c.Q();
        int i15 = Q.f78184c;
        if (i15 > 0) {
            Object[] objArr = Q.f78182a;
            int i16 = 0;
            do {
                ((r) ((q0) objArr[i16])).b();
                i16++;
            } while (i16 < i15);
        }
        try {
            Object[] objArr2 = zVar.f63354b;
            int[] iArr = zVar.f63355c;
            long[] jArr = zVar.f63353a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i17 = 7;
                int i18 = 0;
                while (true) {
                    long j13 = jArr[i18];
                    if ((((~j13) << c13) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i19 = 8;
                        int i23 = 8 - ((~(i18 - length)) >>> 31);
                        int i24 = 0;
                        while (i24 < i23) {
                            if ((j13 & 255) < 128) {
                                int i25 = (i18 << 3) + i24;
                                s2.z zVar2 = (s2.z) objArr2[i25];
                                if (iArr[i25] == 1) {
                                    s2.b0 h10 = zVar2 instanceof o0 ? ((o0) zVar2).h(iVar) : s2.p.j(zVar2.d(), iVar);
                                    i17 = (((i17 * 31) + System.identityHashCode(h10)) * 31) + h10.f110604a;
                                }
                                i14 = 8;
                            } else {
                                i14 = i19;
                            }
                            j13 >>= i14;
                            i24++;
                            i19 = i14;
                        }
                        if (i23 != i19) {
                            break;
                        }
                    }
                    if (i18 == length) {
                        break;
                    }
                    i18++;
                    c13 = 7;
                }
                i13 = i17;
            } else {
                i13 = 7;
            }
            Unit unit = Unit.f80348a;
            int i26 = Q.f78184c;
            if (i26 <= 0) {
                return i13;
            }
            Object[] objArr3 = Q.f78182a;
            int i27 = 0;
            do {
                ((r) ((q0) objArr3[i27])).a();
                i27++;
            } while (i27 < i26);
            return i13;
        } catch (Throwable th3) {
            int i28 = Q.f78184c;
            if (i28 > 0) {
                Object[] objArr4 = Q.f78182a;
                int i29 = 0;
                do {
                    ((r) ((q0) objArr4[i29])).a();
                    i29++;
                } while (i29 < i28);
            }
            throw th3;
        }
    }
}
