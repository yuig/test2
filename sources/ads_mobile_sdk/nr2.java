package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class nr2 extends sj0 {
    private static final nr2 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8956c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8957d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8958e = 3;
    private long modelVersion_;
    private long taxonomyVersion_;
    private int topicId_;

    static {
        nr2 nr2Var = new nr2();
        DEFAULT_INSTANCE = nr2Var;
        sj0.a(nr2.class, nr2Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"topicId_", "modelVersion_", "taxonomyVersion_"});
        }
        if (c13 == 3) {
            return new nr2();
        }
        if (c13 == 4) {
            return new a.h8(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (nr2.class) {
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

    public static a.h8 r() {
        return (a.h8) DEFAULT_INSTANCE.f();
    }
}
