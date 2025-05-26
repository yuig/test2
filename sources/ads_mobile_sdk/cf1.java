package ads_mobile_sdk;

import a.p6;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class cf1 {

    /* renamed from: b, reason: collision with root package name */
    public static final cf1 f3890b = (cf1) ir2.a(new a.e(4));

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f3891a = new AtomicReference(new qe2().a());

    public final a.i7 a(i22 i22Var) {
        me2 me2Var = me2.f8193a;
        te2 te2Var = (te2) this.f3891a.get();
        te2Var.getClass();
        re2 re2Var = new re2(i22Var.f6185b, i22.class);
        if (te2Var.f11518b.containsKey(re2Var)) {
            return ((r41) ((t41) te2Var.f11518b.get(re2Var))).f10501c.i(i22Var, me2Var);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + re2Var + " available");
    }

    public final p6 a(j22 j22Var) {
        te2 te2Var = (te2) this.f3891a.get();
        te2Var.getClass();
        re2 re2Var = new re2(j22Var.f6609a, j22.class);
        if (te2Var.f11520d.containsKey(re2Var)) {
            return ((kv1) ((mv1) te2Var.f11520d.get(re2Var))).f7548c.a(j22Var);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + re2Var + " available");
    }

    public final a.ea a(a.i7 i7Var) {
        me2 me2Var = me2.f8193a;
        te2 te2Var = (te2) this.f3891a.get();
        te2Var.getClass();
        se2 se2Var = new se2(i7Var.getClass(), i22.class);
        if (te2Var.f11517a.containsKey(se2Var)) {
            return ((u41) ((w41) te2Var.f11517a.get(se2Var))).f11831c.m(i7Var, me2Var);
        }
        throw new GeneralSecurityException("No Key serializer for " + se2Var + " available");
    }

    public static cf1 a() {
        cf1 cf1Var = new cf1();
        cf1Var.a(new u41(new a.e(5), w61.class));
        return cf1Var;
    }

    public final synchronized void a(u41 u41Var) {
        try {
            qe2 qe2Var = new qe2((te2) this.f3891a.get());
            se2 se2Var = new se2(u41Var.f12864a, u41Var.f12865b);
            if (qe2Var.f10057a.containsKey(se2Var)) {
                w41 w41Var = (w41) qe2Var.f10057a.get(se2Var);
                if (!w41Var.equals(u41Var) || !u41Var.equals(w41Var)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + se2Var);
                }
            } else {
                qe2Var.f10057a.put(se2Var, u41Var);
            }
            this.f3891a.set(new te2(qe2Var));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void a(r41 r41Var) {
        try {
            qe2 qe2Var = new qe2((te2) this.f3891a.get());
            re2 re2Var = new re2(r41Var.f11401a, r41Var.f11402b);
            if (qe2Var.f10058b.containsKey(re2Var)) {
                t41 t41Var = (t41) qe2Var.f10058b.get(re2Var);
                if (!t41Var.equals(r41Var) || !r41Var.equals(t41Var)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + re2Var);
                }
            } else {
                qe2Var.f10058b.put(re2Var, r41Var);
            }
            this.f3891a.set(new te2(qe2Var));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void a(nv1 nv1Var) {
        try {
            qe2 qe2Var = new qe2((te2) this.f3891a.get());
            se2 se2Var = new se2(nv1Var.f9832a, nv1Var.f9833b);
            if (qe2Var.f10059c.containsKey(se2Var)) {
                pv1 pv1Var = (pv1) qe2Var.f10059c.get(se2Var);
                if (!pv1Var.equals(nv1Var) || !nv1Var.equals(pv1Var)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + se2Var);
                }
            } else {
                qe2Var.f10059c.put(se2Var, nv1Var);
            }
            this.f3891a.set(new te2(qe2Var));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void a(kv1 kv1Var) {
        try {
            qe2 qe2Var = new qe2((te2) this.f3891a.get());
            re2 re2Var = new re2(kv1Var.f8400a, kv1Var.f8401b);
            if (qe2Var.f10060d.containsKey(re2Var)) {
                mv1 mv1Var = (mv1) qe2Var.f10060d.get(re2Var);
                if (!mv1Var.equals(kv1Var) || !kv1Var.equals(mv1Var)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + re2Var);
                }
            } else {
                qe2Var.f10060d.put(re2Var, kv1Var);
            }
            this.f3891a.set(new te2(qe2Var));
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
