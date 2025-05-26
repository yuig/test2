package ads_mobile_sdk;

import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class rx extends sj0 {
    private static final rx DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10834c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10835d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10836e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f10837f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f10838g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f10839h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f10840i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f10841j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final int f10842k = 9;
    private int adResourceType_;
    private int bitField0_;
    private int id_;
    private int parentId_;
    private nw request_;
    private rw response_;
    private byte memoizedIsInitialized = 2;
    private String url_ = "";
    private a.g1 childIds_ = sj0.g();
    private String tagName_ = "";
    private h4 matchedBlacklist_ = sj0.i();

    static {
        rx rxVar = new rx();
        DEFAULT_INSTANCE = rxVar;
        sj0.a(rx.class, rxVar);
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
                return new f62(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"bitField0_", "id_", "url_", "request_", "response_", "parentId_", "childIds_", "tagName_", "adResourceType_", ox.f9472a, "matchedBlacklist_"});
            case 3:
                return new rx();
            case 4:
                return new a.va(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ta taVar = PARSER;
                if (taVar == null) {
                    synchronized (rx.class) {
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

    public static a.va r() {
        return (a.va) DEFAULT_INSTANCE.f();
    }
}
