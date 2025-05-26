package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class nm extends sj0 {
    private static final nm DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8863c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8864d = 2;
    private il keyValue_ = il.f6431b;
    private int version_;

    static {
        nm nmVar = new nm();
        DEFAULT_INSTANCE = nmVar;
        sj0.a(nm.class, nmVar);
    }

    public static a.e8 t() {
        return (a.e8) DEFAULT_INSTANCE.f();
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
            return new f62(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
        }
        if (c13 == 3) {
            return new nm();
        }
        if (c13 == 4) {
            return new a.e8(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (nm.class) {
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

    public static nm a(il ilVar, jc0 jc0Var) {
        return (nm) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
