package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class d61 extends sj0 {
    private static final d61 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4180c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4181d = 2;
    private int bitField0_;
    private f61 params_;
    private int version_;

    static {
        d61 d61Var = new d61();
        DEFAULT_INSTANCE = d61Var;
        sj0.a(d61.class, d61Var);
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
            return new d61();
        }
        if (c13 == 4) {
            return new a.u0(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (d61.class) {
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

    public static a.u0 t() {
        return (a.u0) DEFAULT_INSTANCE.f();
    }

    public final f61 r() {
        f61 f61Var = this.params_;
        return f61Var == null ? f61.r() : f61Var;
    }

    public final int s() {
        return this.version_;
    }

    public static d61 a(il ilVar, jc0 jc0Var) {
        return (d61) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
