package ads_mobile_sdk;

import a.f8;
import a.ta;

/* loaded from: classes2.dex */
public final class nn extends sj0 {
    private static final nn DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c */
    public static final int f8872c = 1;

    /* renamed from: d */
    public static final int f8873d = 2;
    private int binaryName_;
    private String versionNumber_ = "";

    static {
        nn nnVar = new nn();
        DEFAULT_INSTANCE = nnVar;
        sj0.a(nn.class, nnVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"binaryName_", "versionNumber_"});
        }
        if (c13 == 3) {
            return new nn();
        }
        if (c13 == 4) {
            return new f8(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (nn.class) {
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

    public static f8 r() {
        return (f8) DEFAULT_INSTANCE.f();
    }
}
