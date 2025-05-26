package z2;

import g1.k0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final g1.c0 f140601a;

    /* renamed from: b, reason: collision with root package name */
    public final k2.e f140602b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f140603c;

    public a0() {
        long[] jArr = k0.f63281a;
        this.f140601a = new g1.c0();
        this.f140602b = new k2.e(new Function0[16]);
    }

    public static final void a(a0 a0Var) {
        a0Var.f140601a.a();
        int i13 = 0;
        a0Var.f140603c = false;
        k2.e eVar = a0Var.f140602b;
        int i14 = eVar.f78184c;
        if (i14 > 0) {
            Object[] objArr = eVar.f78182a;
            do {
                ((Function0) objArr[i13]).invoke();
                i13++;
            } while (i13 < i14);
        }
        eVar.h();
    }

    public static final void b(a0 a0Var) {
        g1.c0 c0Var = a0Var.f140601a;
        Object[] objArr = c0Var.f63239b;
        long[] jArr = c0Var.f63238a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128) {
                            z zVar = (z) objArr[(i13 << 3) + i15];
                            zVar.getClass();
                            x xVar = (x) nl.b.i(zVar).f140601a.g(zVar);
                            if (xVar == null) {
                                jk.r.z("committing a node that was not updated in the current transaction");
                                throw null;
                            }
                            zVar.f140656p = xVar;
                        }
                        j13 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        c0Var.a();
        a0Var.f140603c = false;
        a0Var.f140602b.h();
    }
}
