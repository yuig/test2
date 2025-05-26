package ads_mobile_sdk;

import a.h4;
import a.ta;
import java.util.List;

/* loaded from: classes2.dex */
public final class n5 extends sj0 {
    private static final n5 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8675c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8676d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8677e = 3;
    private int bitField0_;
    private h4 includingRegexes_ = sj0.i();
    private h4 excludingRegexes_ = sj0.i();
    private String effectiveAdUnitId_ = "";

    static {
        n5 n5Var = new n5();
        DEFAULT_INSTANCE = n5Var;
        sj0.a(n5.class, n5Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ț\u0002Ț\u0003ለ\u0000", new Object[]{"bitField0_", "includingRegexes_", "excludingRegexes_", "effectiveAdUnitId_"});
        }
        if (c13 == 3) {
            return new n5();
        }
        if (c13 == 4) {
            return new a.y7(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (n5.class) {
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

    public static a.y7 u() {
        return (a.y7) DEFAULT_INSTANCE.f();
    }

    public final String r() {
        return this.effectiveAdUnitId_;
    }

    public final List s() {
        return this.excludingRegexes_;
    }

    public final List t() {
        return this.includingRegexes_;
    }
}
