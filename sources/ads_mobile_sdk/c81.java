package ads_mobile_sdk;

import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class c81 extends sj0 {
    private static final c81 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3813c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3814d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f3815e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f3816f = 4;
    private int bitField0_;
    private b91 matchNode_;
    private c81 notNode_;
    private h4 andNodes_ = sj0.i();
    private h4 orNodes_ = sj0.i();

    static {
        c81 c81Var = new c81();
        DEFAULT_INSTANCE = c81Var;
        sj0.a(c81.class, c81Var);
    }

    public static c81 s() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "andNodes_", c81.class, "orNodes_", c81.class, "notNode_", "matchNode_"});
        }
        if (c13 == 3) {
            return new c81();
        }
        if (c13 == 4) {
            return new a.k(4);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (c81.class) {
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

    public final h4 r() {
        return this.andNodes_;
    }

    public final b91 t() {
        b91 b91Var = this.matchNode_;
        return b91Var == null ? b91.t() : b91Var;
    }

    public final c81 u() {
        c81 c81Var = this.notNode_;
        return c81Var == null ? DEFAULT_INSTANCE : c81Var;
    }

    public final h4 v() {
        return this.orNodes_;
    }

    public final boolean w() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 1) != 0;
    }
}
