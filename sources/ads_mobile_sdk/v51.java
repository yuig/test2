package ads_mobile_sdk;

import a.h4;
import a.mb;
import a.ta;

/* loaded from: classes2.dex */
public final class v51 extends sj0 {
    private static final v51 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12355c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12356d = 2;
    private h4 keyInfo_ = sj0.i();
    private int primaryKeyId_;

    static {
        v51 v51Var = new v51();
        DEFAULT_INSTANCE = v51Var;
        sj0.a(v51.class, v51Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", u51.class});
        }
        if (c13 == 3) {
            return new v51();
        }
        if (c13 == 4) {
            return new mb(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (v51.class) {
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

    public static mb r() {
        return (mb) DEFAULT_INSTANCE.f();
    }
}
