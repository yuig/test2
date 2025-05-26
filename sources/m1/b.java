package m1;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final k2.e f85290a = new k2.e(new i[16]);

    public final void a(CancellationException cancellationException) {
        k2.e eVar = this.f85290a;
        int i13 = eVar.f78184c;
        ao2.m[] mVarArr = new ao2.m[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            mVarArr[i14] = ((i) eVar.f78182a[i14]).f85371b;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            mVarArr[i15].cancel(cancellationException);
        }
        if (!eVar.l()) {
            throw new IllegalStateException("uncancelled requests present".toString());
        }
    }

    public final void b() {
        k2.e eVar = this.f85290a;
        int i13 = 0;
        int i14 = new IntRange(0, eVar.f78184c - 1, 1).f80454b;
        if (i14 >= 0) {
            while (true) {
                ao2.m mVar = ((i) eVar.f78182a[i13]).f85371b;
                Unit unit = Unit.f80348a;
                xk2.q qVar = xk2.s.f135225b;
                mVar.resumeWith(unit);
                if (i13 == i14) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        eVar.h();
    }
}
