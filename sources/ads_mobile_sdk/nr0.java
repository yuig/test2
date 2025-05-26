package ads_mobile_sdk;

import a.h4;
import a.ta;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public final class nr0 extends sj0 {
    private static final nr0 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8937c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8938d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8939e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8940f = 13;

    /* renamed from: g, reason: collision with root package name */
    public static final int f8941g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f8942h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f8943i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static final int f8944j = 12;

    /* renamed from: k, reason: collision with root package name */
    public static final int f8945k = 15;

    /* renamed from: l, reason: collision with root package name */
    public static final int f8946l = 7;

    /* renamed from: m, reason: collision with root package name */
    public static final int f8947m = 8;

    /* renamed from: n, reason: collision with root package name */
    public static final int f8948n = 14;

    /* renamed from: o, reason: collision with root package name */
    public static final int f8949o = 9;

    /* renamed from: p, reason: collision with root package name */
    public static final int f8950p = 10;

    /* renamed from: q, reason: collision with root package name */
    public static final int f8951q = 11;
    private int bitField0_;
    private int bucketSize_;
    private int elementMaxLength_;
    private boolean excludeFalse_;
    private boolean excludeTrue_;
    private int maxLength_;
    private int maxSize_;
    private double multiplyingFactor_;
    private int round_;
    private int type_;
    private h4 path_ = sj0.i();
    private String urlKey_ = "";
    private String arraySeparator_ = ",";
    private String keyValueSeparator_ = "=";
    private String itemSeparator_ = "&";
    private String captureGroup_ = "";

    static {
        nr0 nr0Var = new nr0();
        DEFAULT_INSTANCE = nr0Var;
        sj0.a(nr0.class, nr0Var);
    }

    public final int A() {
        return this.maxSize_;
    }

    public final double B() {
        return this.multiplyingFactor_;
    }

    public final h4 C() {
        return this.path_;
    }

    public final int D() {
        return this.round_;
    }

    public final zk2 E() {
        int i13 = this.type_;
        zk2 zk2Var = i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? null : zk2.NUMBER : zk2.BOOLEAN : zk2.STRING : zk2.SIGNAL_TYPE_UNKNOWN;
        return zk2Var == null ? zk2.UNRECOGNIZED : zk2Var;
    }

    public final String F() {
        return this.urlKey_;
    }

    public final boolean G() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 8192) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean J() {
        return (this.bitField0_ & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001Ț\u0002ለ\u0000\u0003ဌ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\b\bለ\t\tለ\u000b\nለ\f\u000bለ\r\fဋ\u0006\rဋ\u0002\u000eဋ\n\u000fက\u0007", new Object[]{"bitField0_", "path_", "urlKey_", "type_", "excludeTrue_", "excludeFalse_", "round_", "maxSize_", "arraySeparator_", "keyValueSeparator_", "itemSeparator_", "captureGroup_", "bucketSize_", "maxLength_", "elementMaxLength_", "multiplyingFactor_"});
        }
        if (c13 == 3) {
            return new nr0();
        }
        if (c13 == 4) {
            return new a.k(26);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (nr0.class) {
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

    public final String r() {
        return this.arraySeparator_;
    }

    public final int s() {
        return this.bucketSize_;
    }

    public final String t() {
        return this.captureGroup_;
    }

    public final int u() {
        return this.elementMaxLength_;
    }

    public final boolean v() {
        return this.excludeFalse_;
    }

    public final boolean w() {
        return this.excludeTrue_;
    }

    public final String x() {
        return this.itemSeparator_;
    }

    public final String y() {
        return this.keyValueSeparator_;
    }

    public final int z() {
        return this.maxLength_;
    }
}
