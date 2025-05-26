package ads_mobile_sdk;

import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class b91 extends sj0 {
    private static final b91 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2783c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2784d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f2785e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2786f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f2787g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2788h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f2789i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f2790j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final int f2791k = 9;
    private int bitField0_;
    private Object comparisonOperator_;
    private boolean equalsTo_;
    private Object matchValue_;
    private int matchValueCase_ = 0;
    private int comparisonOperatorCase_ = 0;
    private h4 path_ = sj0.i();

    static {
        b91 b91Var = new b91();
        DEFAULT_INSTANCE = b91Var;
        sj0.a(b91.class, b91Var);
    }

    public static b91 t() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return this.matchValueCase_ == 3;
    }

    public final boolean B() {
        return this.comparisonOperatorCase_ == 6;
    }

    public final boolean C() {
        return this.comparisonOperatorCase_ == 7;
    }

    public final boolean D() {
        return this.matchValueCase_ == 5;
    }

    public final boolean E() {
        return this.matchValueCase_ == 2;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\t\u0002\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ț\u0002Ȼ\u0000\u0003:\u0000\u0004<\u0000\u00053\u0000\u0006:\u0001\u0007:\u0001\b:\u0001\tဇ\u0000", new Object[]{"matchValue_", "matchValueCase_", "comparisonOperator_", "comparisonOperatorCase_", "bitField0_", "path_", b91.class, "equalsTo_"});
        }
        if (c13 == 3) {
            return new b91();
        }
        if (c13 == 4) {
            return new a.k(0);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (b91.class) {
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

    public final b91 r() {
        return this.matchValueCase_ == 4 ? (b91) this.matchValue_ : DEFAULT_INSTANCE;
    }

    public final boolean s() {
        if (this.matchValueCase_ == 3) {
            return ((Boolean) this.matchValue_).booleanValue();
        }
        return false;
    }

    public final boolean u() {
        return this.equalsTo_;
    }

    public final double v() {
        if (this.matchValueCase_ == 5) {
            return ((Double) this.matchValue_).doubleValue();
        }
        return 0.0d;
    }

    public final h4 w() {
        return this.path_;
    }

    public final String x() {
        return this.matchValueCase_ == 2 ? (String) this.matchValue_ : "";
    }

    public final boolean y() {
        return this.matchValueCase_ == 4;
    }

    public final boolean z() {
        return this.comparisonOperatorCase_ == 8;
    }
}
