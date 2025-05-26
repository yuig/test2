package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class bw extends sj0 {
    private static final bw DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3620c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3621d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f3622e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f3623f = 4;
    private int bitField0_;
    private aw digests_;
    private long length_;
    private String url_ = "";
    private String fileBasename_ = "";

    static {
        bw bwVar = new bw();
        DEFAULT_INSTANCE = bwVar;
        sj0.a(bw.class, bwVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "url_", "digests_", "length_", "fileBasename_"});
        }
        if (c13 == 3) {
            return new bw();
        }
        if (c13 == 4) {
            return new a.i9(16);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (bw.class) {
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
}
