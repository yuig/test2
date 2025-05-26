package zk;

import el.a0;
import el.c0;
import el.f0;
import el.g0;
import el.h0;
import el.k;
import el.l0;
import el.n0;
import il.q5;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class g {
    static {
        int i13 = q5.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e13) {
            throw new ExceptionInInitializerError(e13);
        }
    }

    public static void a() {
        g0 g0Var = g0.f59489b;
        g0Var.d(i.f142079a);
        g0Var.c(i.f142080b);
        if (yk.e.f139223b.get()) {
            return;
        }
        n0 n0Var = d.f142066a;
        if (!yk.d.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        l0 l0Var = al.a.f15467a;
        h0 h0Var = h0.f59491b;
        h0Var.f(al.a.f15467a);
        h0Var.e(al.a.f15468b);
        h0Var.d(al.a.f15469c);
        h0Var.c(al.a.f15470d);
        g0Var.c(d.f142066a);
        f0 f0Var = f0.f59486b;
        HashMap hashMap = new HashMap();
        hashMap.put("AES256_SIV", j.f142081a);
        bh.b bVar = new bh.b();
        bVar.w(64);
        bVar.f22799c = e.f142072d;
        hashMap.put("AES256_SIV_RAW", bVar.d());
        f0Var.b(Collections.unmodifiableMap(hashMap));
        c0.f59461b.a(d.f142068c, f.class);
        a0.f59451b.a(d.f142069d, f.class);
        k.f59500d.c(d.f142067b, true);
    }
}
