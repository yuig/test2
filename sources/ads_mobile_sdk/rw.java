package ads_mobile_sdk;

import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class rw extends sj0 {
    private static final rw DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10820c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10821d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10822e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f10823f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f10824g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f10825h = 6;
    private int bitField0_;
    private il body_;
    private il bodydigest_;
    private int bodylength_;
    private qw firstline_;
    private il remoteIp_;
    private byte memoizedIsInitialized = 2;
    private h4 headers_ = sj0.i();

    static {
        rw rwVar = new rw();
        DEFAULT_INSTANCE = rwVar;
        sj0.a(rw.class, rwVar);
    }

    public rw() {
        gl glVar = il.f6431b;
        this.body_ = glVar;
        this.bodydigest_ = glVar;
        this.remoteIp_ = glVar;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        switch (a.bb.c(i13)) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (sj0Var == null ? 0 : 1);
                return null;
            case 2:
                return new f62(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"bitField0_", "firstline_", "headers_", jw.class, "body_", "bodydigest_", "bodylength_", "remoteIp_"});
            case 3:
                return new rw();
            case 4:
                return new a.i9(1);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ta taVar = PARSER;
                if (taVar == null) {
                    synchronized (rw.class) {
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
            default:
                throw null;
        }
    }
}
