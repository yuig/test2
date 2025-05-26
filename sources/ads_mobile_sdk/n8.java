package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class n8 extends sj0 {
    private static final n8 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8696c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8697d = 2;
    private z8 aesCtrKeyFormat_;
    private int bitField0_;
    private jp0 hmacKeyFormat_;

    static {
        n8 n8Var = new n8();
        DEFAULT_INSTANCE = n8Var;
        sj0.a(n8.class, n8Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "aesCtrKeyFormat_", "hmacKeyFormat_"});
        }
        if (c13 == 3) {
            return new n8();
        }
        if (c13 == 4) {
            return new a.b8(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (n8.class) {
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

    public static a.b8 t() {
        return (a.b8) DEFAULT_INSTANCE.f();
    }

    public final z8 r() {
        z8 z8Var = this.aesCtrKeyFormat_;
        return z8Var == null ? z8.r() : z8Var;
    }

    public final jp0 s() {
        jp0 jp0Var = this.hmacKeyFormat_;
        return jp0Var == null ? jp0.r() : jp0Var;
    }

    public static n8 a(il ilVar, jc0 jc0Var) {
        return (n8) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
