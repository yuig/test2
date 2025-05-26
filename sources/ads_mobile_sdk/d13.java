package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class d13 extends sj0 {
    private static final d13 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4095c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4096d = 3;
    private int bitField0_;
    private i13 params_;
    private int version_;

    static {
        d13 d13Var = new d13();
        DEFAULT_INSTANCE = d13Var;
        sj0.a(d13.class, d13Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (c13 == 3) {
            return new d13();
        }
        if (c13 == 4) {
            return new a.t0(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (d13.class) {
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

    public static a.t0 t() {
        return (a.t0) DEFAULT_INSTANCE.f();
    }

    public final i13 r() {
        i13 i13Var = this.params_;
        return i13Var == null ? i13.r() : i13Var;
    }

    public final int s() {
        return this.version_;
    }

    public static d13 a(il ilVar, jc0 jc0Var) {
        return (d13) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
