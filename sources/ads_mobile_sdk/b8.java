package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class b8 extends sj0 {
    private static final b8 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2768c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2769d = 2;
    private int bitField0_;
    private int keySize_;
    private g8 params_;

    static {
        b8 b8Var = new b8();
        DEFAULT_INSTANCE = b8Var;
        sj0.a(b8.class, b8Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "keySize_", "params_"});
        }
        if (c13 == 3) {
            return new b8();
        }
        if (c13 == 4) {
            return new a.j(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (b8.class) {
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

    public static a.j t() {
        return (a.j) DEFAULT_INSTANCE.f();
    }

    public final int r() {
        return this.keySize_;
    }

    public final g8 s() {
        g8 g8Var = this.params_;
        return g8Var == null ? g8.r() : g8Var;
    }

    public static b8 a(il ilVar, jc0 jc0Var) {
        return (b8) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
