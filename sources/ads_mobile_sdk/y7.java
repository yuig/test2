package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class y7 extends sj0 {
    private static final y7 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14114c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14115d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14116e = 3;
    private int bitField0_;
    private il keyValue_ = il.f6431b;
    private g8 params_;
    private int version_;

    static {
        y7 y7Var = new y7();
        DEFAULT_INSTANCE = y7Var;
        sj0.a(y7.class, y7Var);
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
            return new f62(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "params_"});
        }
        if (c13 == 3) {
            return new y7();
        }
        if (c13 == 4) {
            return new a.ve(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (y7.class) {
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

    public static a.ve u() {
        return (a.ve) DEFAULT_INSTANCE.f();
    }

    public final il r() {
        return this.keyValue_;
    }

    public final g8 s() {
        g8 g8Var = this.params_;
        return g8Var == null ? g8.r() : g8Var;
    }

    public final int t() {
        return this.version_;
    }

    public static y7 a(il ilVar, jc0 jc0Var) {
        return (y7) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
