package io;

import ho.j;
import java.util.HashMap;
import jo.n;

/* loaded from: classes3.dex */
public final class f extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f73309c;

    static {
        HashMap hashMap = new HashMap();
        f73309c = hashMap;
        hashMap.put("alpha_lower", 26);
        hashMap.put("alpha_upper", 26);
        d7.g.v(hashMap, "alpha", 52, 62, "alphanumeric");
        a.c.o(10, hashMap, "digits", 33, "symbols");
    }

    @Override // io.e
    public final double a(n nVar) {
        int i13;
        HashMap hashMap = f73309c;
        String str = nVar.f77184l;
        if (hashMap.containsKey(str)) {
            return Math.pow(((Integer) hashMap.get(str)).intValue(), nVar.a());
        }
        if (!"recent_year".equals(str)) {
            return 0.0d;
        }
        try {
            i13 = j.c(nVar.f77176d);
        } catch (NumberFormatException unused) {
            i13 = 0;
        }
        return Math.max(Math.abs(i13 - e.f72914a), 20.0d);
    }
}
