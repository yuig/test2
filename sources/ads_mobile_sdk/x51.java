package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class x51 extends sj0 {
    private static final x51 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13493c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13494d = 2;
    private int bitField0_;
    private z51 params_;
    private int version_;

    static {
        x51 x51Var = new x51();
        DEFAULT_INSTANCE = x51Var;
        sj0.a(x51.class, x51Var);
    }

    public static ta u() {
        return DEFAULT_INSTANCE.k();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (c13 == 3) {
            return new x51();
        }
        if (c13 == 4) {
            return new a.ue(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (x51.class) {
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

    public static a.ue t() {
        return (a.ue) DEFAULT_INSTANCE.f();
    }

    public final z51 r() {
        z51 z51Var = this.params_;
        return z51Var == null ? z51.r() : z51Var;
    }

    public final int s() {
        return this.version_;
    }

    public static x51 a(il ilVar, jc0 jc0Var) {
        return (x51) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
