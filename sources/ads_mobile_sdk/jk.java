package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class jk extends sj0 {
    private static final jk DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6848c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6849d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6850e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6851f = 7;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6852g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6853h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f6854i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f6855j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f6856k = 9;

    /* renamed from: l, reason: collision with root package name */
    public static final int f6857l = 11;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6858m = 10;
    private int backoffStep_;
    private int bitField0_;
    private long cacheTimestamp_;
    private ik error_;
    private float executionCredit_;
    private int failedExecutions_;
    private boolean isFromPrebid_;
    private boolean isPublisherCreated_;
    private long lastExecutionTimestamp_;
    private int skippedExecutions_;
    private String javascriptLibraryName_ = "";
    private String buyerGeneratedRequestData_ = "";

    static {
        jk jkVar = new jk();
        DEFAULT_INSTANCE = jkVar;
        sj0.a(jk.class, jkVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004င\u0005\u0005င\u0006\u0006င\u0007\u0007ဂ\u0003\bခ\u0004\tဇ\b\nဉ\n\u000bဇ\t", new Object[]{"bitField0_", "javascriptLibraryName_", "buyerGeneratedRequestData_", "cacheTimestamp_", "failedExecutions_", "skippedExecutions_", "backoffStep_", "lastExecutionTimestamp_", "executionCredit_", "isPublisherCreated_", "error_", "isFromPrebid_"});
        }
        if (c13 == 3) {
            return new jk();
        }
        if (c13 == 4) {
            return new a.k(10);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (jk.class) {
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
