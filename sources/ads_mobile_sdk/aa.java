package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class aa extends sj0 {
    private static final aa DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2319c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2320d = 3;
    private int keySize_;
    private int version_;

    static {
        aa aaVar = new aa();
        DEFAULT_INSTANCE = aaVar;
        sj0.a(aa.class, aaVar);
    }

    public static a.xg t() {
        return (a.xg) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
        }
        if (c13 == 3) {
            return new aa();
        }
        if (c13 == 4) {
            return new a.xg(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (aa.class) {
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

    public final int r() {
        return this.keySize_;
    }

    public static aa a(il ilVar, jc0 jc0Var) {
        return (aa) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
