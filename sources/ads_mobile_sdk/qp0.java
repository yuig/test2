package ads_mobile_sdk;

import a.ga;
import a.ta;

/* loaded from: classes2.dex */
public final class qp0 extends sj0 {
    private static final qp0 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10215c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10216d = 2;
    private int hash_;
    private int tagSize_;

    static {
        qp0 qp0Var = new qp0();
        DEFAULT_INSTANCE = qp0Var;
        sj0.a(qp0.class, qp0Var);
    }

    public static ga u() {
        return (ga) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
        }
        if (c13 == 3) {
            return new qp0();
        }
        if (c13 == 4) {
            return new ga(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (qp0.class) {
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

    public final int t() {
        return this.tagSize_;
    }

    public static qp0 r() {
        return DEFAULT_INSTANCE;
    }

    public final wo0 s() {
        int i13 = this.hash_;
        wo0 wo0Var = i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? null : wo0.SHA224 : wo0.SHA512 : wo0.SHA256 : wo0.SHA384 : wo0.SHA1 : wo0.UNKNOWN_HASH;
        return wo0Var == null ? wo0.UNRECOGNIZED : wo0Var;
    }
}
