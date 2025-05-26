package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class u51 extends sj0 {
    private static final u51 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11840c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11841d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11842e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11843f = 4;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        u51 u51Var = new u51();
        DEFAULT_INSTANCE = u51Var;
        sj0.a(u51.class, u51Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
        }
        if (c13 == 3) {
            return new u51();
        }
        if (c13 == 4) {
            return new a.jc(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (u51.class) {
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

    public static a.jc r() {
        return (a.jc) DEFAULT_INSTANCE.f();
    }
}
