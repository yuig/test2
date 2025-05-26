package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class oa extends sj0 {
    private static final oa DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9198c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9199d = 1;
    private int keySize_;
    private int version_;

    static {
        oa oaVar = new oa();
        DEFAULT_INSTANCE = oaVar;
        sj0.a(oa.class, oaVar);
    }

    public static a.t8 t() {
        return (a.t8) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
        }
        if (c13 == 3) {
            return new oa();
        }
        if (c13 == 4) {
            return new a.t8(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (oa.class) {
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

    public static oa a(il ilVar, jc0 jc0Var) {
        return (oa) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
