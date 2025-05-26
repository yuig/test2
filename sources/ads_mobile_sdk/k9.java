package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class k9 extends sj0 {
    private static final k9 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7170c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7171d = 2;
    private int bitField0_;
    private int keySize_;
    private q9 params_;

    static {
        k9 k9Var = new k9();
        DEFAULT_INSTANCE = k9Var;
        sj0.a(k9.class, k9Var);
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
            return new k9();
        }
        if (c13 == 4) {
            return new a.e6(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (k9.class) {
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

    public static a.e6 t() {
        return (a.e6) DEFAULT_INSTANCE.f();
    }

    public final int r() {
        return this.keySize_;
    }

    public final q9 s() {
        q9 q9Var = this.params_;
        return q9Var == null ? q9.r() : q9Var;
    }

    public static k9 a(il ilVar, jc0 jc0Var) {
        return (k9) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
