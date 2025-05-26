package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class k8 extends sj0 {
    private static final k8 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7156c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7157d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7158e = 3;
    private x8 aesCtrKey_;
    private int bitField0_;
    private gp0 hmacKey_;
    private int version_;

    static {
        k8 k8Var = new k8();
        DEFAULT_INSTANCE = k8Var;
        sj0.a(k8.class, k8Var);
    }

    public static ta v() {
        return DEFAULT_INSTANCE.k();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
        }
        if (c13 == 3) {
            return new k8();
        }
        if (c13 == 4) {
            return new a.p5(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (k8.class) {
                try {
                    taVar = PARSER;
                    if (taVar == null) {
                        taVar = new rj0(DEFAULT_INSTANCE);
                        PARSER = taVar;
                    }
                } finally {
                }
            }
        }
        return taVar;
    }

    public static a.p5 u() {
        return (a.p5) DEFAULT_INSTANCE.f();
    }

    public final x8 r() {
        x8 x8Var = this.aesCtrKey_;
        return x8Var == null ? x8.r() : x8Var;
    }

    public final gp0 s() {
        gp0 gp0Var = this.hmacKey_;
        return gp0Var == null ? gp0.r() : gp0Var;
    }

    public final int t() {
        return this.version_;
    }

    public static k8 a(il ilVar, jc0 jc0Var) {
        return (k8) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
