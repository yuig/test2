package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class z8 extends sj0 {
    private static final z8 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14674c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14675d = 2;
    private int bitField0_;
    private int keySize_;
    private b9 params_;

    static {
        z8 z8Var = new z8();
        DEFAULT_INSTANCE = z8Var;
        sj0.a(z8.class, z8Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
        }
        if (c13 == 3) {
            return new z8();
        }
        if (c13 == 4) {
            return new a.yf(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (z8.class) {
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

    public static z8 r() {
        return DEFAULT_INSTANCE;
    }

    public static a.yf u() {
        return (a.yf) DEFAULT_INSTANCE.f();
    }

    public final int s() {
        return this.keySize_;
    }

    public final b9 t() {
        b9 b9Var = this.params_;
        return b9Var == null ? b9.r() : b9Var;
    }
}
