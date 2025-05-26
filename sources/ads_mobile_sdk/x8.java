package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class x8 extends sj0 {
    private static final x8 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13539c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13540d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13541e = 3;
    private int bitField0_;
    private il keyValue_ = il.f6431b;
    private b9 params_;
    private int version_;

    static {
        x8 x8Var = new x8();
        DEFAULT_INSTANCE = x8Var;
        sj0.a(x8.class, x8Var);
    }

    public static a.we v() {
        return (a.we) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
        }
        if (c13 == 3) {
            return new x8();
        }
        if (c13 == 4) {
            return new a.we(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (x8.class) {
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

    public static x8 r() {
        return DEFAULT_INSTANCE;
    }

    public final il s() {
        return this.keyValue_;
    }

    public final b9 t() {
        b9 b9Var = this.params_;
        return b9Var == null ? b9.r() : b9Var;
    }

    public final int u() {
        return this.version_;
    }
}
