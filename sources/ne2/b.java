package ne2;

import ak2.f;
import ck2.i;
import e82.l;
import gk2.c2;
import gk2.g0;
import gk2.h3;
import kotlin.jvm.internal.Intrinsics;
import m7.z;
import r42.k;
import tk2.e;
import uj2.a0;
import uj2.h;

/* loaded from: classes2.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f90472a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90473b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90474c;

    /* renamed from: d, reason: collision with root package name */
    public final float f90475d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f90476e;

    public b(int i13, String str, int i14) {
        i13 = (i14 & 2) != 0 ? 1 : i13;
        str = (i14 & 4) != 0 ? null : str;
        a0 scheduler = e.f118017c;
        Intrinsics.checkNotNullExpressionValue(scheduler, "io(...)");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.f90472a = 5000L;
        this.f90473b = i13;
        this.f90474c = str;
        this.f90475d = 1.0f;
        this.f90476e = scheduler;
    }

    @Override // ak2.f
    public final Object apply(Object obj) {
        xp2.a c2Var;
        h errors = (h) obj;
        Intrinsics.checkNotNullParameter(errors, "errors");
        int i13 = this.f90473b;
        int i14 = i13 + 1;
        int i15 = h.f122339a;
        if (i14 < 0) {
            throw new IllegalArgumentException(a.a.d("count >= 0 required but it was ", i14));
        }
        if (i14 == 0) {
            c2Var = g0.f65416b;
        } else if (i14 == 1) {
            c2Var = h.h(1);
        } else {
            if (1 + i13 > 2147483647L) {
                throw new IllegalArgumentException("Integer overflow");
            }
            c2Var = new c2(i14);
        }
        z zVar = new z(this.f90474c, i13, 2);
        errors.getClass();
        ck2.a aVar = new ck2.a(zVar, 0);
        xp2.a[] aVarArr = {errors, c2Var};
        int i16 = h.f122339a;
        i.c(i16, "bufferSize");
        h g13 = new h3(aVarArr, aVar, i16).g(new k(13, new l(this, 10)));
        Intrinsics.checkNotNullExpressionValue(g13, "flatMap(...)");
        return g13;
    }
}
