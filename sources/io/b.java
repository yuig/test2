package io;

import e2.u;
import java.util.Collections;
import jo.j;
import jo.n;

/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f72907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(u uVar, int i13) {
        super(uVar);
        this.f72907c = i13;
    }

    @Override // io.e
    public final double a(n nVar) {
        double d2;
        switch (this.f72907c) {
            case 0:
                double pow = Math.pow(10.0d, nVar.a());
                if (Double.isInfinite(pow)) {
                    pow = Double.MAX_VALUE;
                }
                return Math.max(pow, nVar.a() == 1 ? 11.0d : 51.0d);
            case 1:
                double max = Math.max(Math.abs(nVar.f77192t - e.f72914a), 20) * 365.0d;
                String str = nVar.f77191s;
                return (str == null || str.isEmpty()) ? max : max * 4.0d;
            case 2:
                return nVar.f77193u.doubleValue() * nVar.f77187o;
            default:
                j jVar = (j) Collections.unmodifiableMap(this.f72906b.f56907b).get(nVar.f77188p);
                int i13 = jVar.f77148d;
                int a13 = nVar.a();
                double d13 = 0.0d;
                for (int i14 = 2; i14 <= a13; i14++) {
                    int min = Math.min(nVar.f77189q, i14 - 1);
                    int i15 = 1;
                    while (i15 <= min) {
                        d13 += Math.pow(jVar.f77149e, i15) * a.b(r9, i15 - 1) * i13;
                        i15++;
                        i13 = i13;
                    }
                }
                int intValue = nVar.f77190r.intValue();
                if (intValue == 0) {
                    d2 = 1.0d;
                } else {
                    int a14 = nVar.a() - intValue;
                    if (a14 == 0) {
                        d2 = 2.0d;
                    } else {
                        int min2 = Math.min(intValue, a14);
                        int i16 = 0;
                        for (int i17 = 1; i17 <= min2; i17++) {
                            i16 += a.b(intValue + a14, i17);
                        }
                        d2 = i16;
                    }
                }
                return d13 * d2;
        }
    }
}
