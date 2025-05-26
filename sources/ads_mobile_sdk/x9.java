package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class x9 extends sj0 {
    private static final x9 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13543c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13544d = 3;
    private il keyValue_ = il.f6431b;
    private int version_;

    static {
        x9 x9Var = new x9();
        DEFAULT_INSTANCE = x9Var;
        sj0.a(x9.class, x9Var);
    }

    public static a.ge t() {
        return (a.ge) DEFAULT_INSTANCE.f();
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
            return new f62(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
        }
        if (c13 == 3) {
            return new x9();
        }
        if (c13 == 4) {
            return new a.ge(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (x9.class) {
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

    public final int s() {
        return this.version_;
    }

    public final il r() {
        return this.keyValue_;
    }

    public static x9 a(il ilVar, jc0 jc0Var) {
        return (x9) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
