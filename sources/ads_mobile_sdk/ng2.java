package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class ng2 extends sj0 {
    private static final ng2 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8794c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8795d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8796e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8797f = 4;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ng2 ng2Var = new ng2();
        DEFAULT_INSTANCE = ng2Var;
        sj0.a(ng2.class, ng2Var);
    }

    public static ng2 s() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000\u00035\u0000\u00043\u0000", new Object[]{"value_", "valueCase_"});
        }
        if (c13 == 3) {
            return new ng2();
        }
        if (c13 == 4) {
            return new a.k(25);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (ng2.class) {
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

    public final boolean r() {
        if (this.valueCase_ == 2) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double t() {
        if (this.valueCase_ == 4) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final long u() {
        if (this.valueCase_ == 3) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String v() {
        return this.valueCase_ == 1 ? (String) this.value_ : "";
    }

    public final boolean w() {
        return this.valueCase_ == 2;
    }

    public final boolean x() {
        return this.valueCase_ == 4;
    }

    public final boolean y() {
        return this.valueCase_ == 3;
    }

    public final boolean z() {
        return this.valueCase_ == 1;
    }
}
