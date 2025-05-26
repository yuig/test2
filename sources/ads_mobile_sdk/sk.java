package ads_mobile_sdk;

import a.ta;
import a.y8;
import kp.n;

/* loaded from: classes2.dex */
public final class sk extends sj0 {
    private static final sk DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11121c = 5;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11122d = 4;
    private static final a.u1 dEPRECATEDAdapterBehavior_converter_ = new n(8);

    /* renamed from: e, reason: collision with root package name */
    public static final int f11123e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11124f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11125g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11126h = 7;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11127i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f11128j = 9;

    /* renamed from: k, reason: collision with root package name */
    public static final int f11129k = 10;
    private int adapterBehaviorBitmap_;
    private rk adapterVersion_;
    private int bitField0_;
    private int dEPRECATEDAdapterBehaviorMemoizedSerializedSize;
    private pk error_;
    private boolean isPublisherCreated_;
    private long latencyMs_;
    private rk sdkVersion_;
    private String adapterClassName_ = "";
    private String buyerGeneratedRequestData_ = "";
    private a.g1 dEPRECATEDAdapterBehavior_ = sj0.g();

    static {
        sk skVar = new sk();
        DEFAULT_INSTANCE = skVar;
        sj0.a(sk.class, skVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0002\n\t\u0000\u0001\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဈ\u0001\u0005ဈ\u0000\u0006ဇ\u0004\u0007ဉ\u0005\bဂ\u0006\tࠬ\nဋ\u0007", new Object[]{"bitField0_", "sdkVersion_", "adapterVersion_", "buyerGeneratedRequestData_", "adapterClassName_", "isPublisherCreated_", "error_", "latencyMs_", "dEPRECATEDAdapterBehavior_", lk.f7863a, "adapterBehaviorBitmap_"});
        }
        if (c13 == 3) {
            return new sk();
        }
        if (c13 == 4) {
            return new y8(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (sk.class) {
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

    public static y8 r() {
        return (y8) DEFAULT_INSTANCE.f();
    }
}
