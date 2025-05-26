package ads_mobile_sdk;

import a.ta;
import kp.n;

/* loaded from: classes2.dex */
public final class cq extends sj0 {
    private static final cq DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;
    private static final a.u1 allowedApis_converter_ = new n(16);

    /* renamed from: c, reason: collision with root package name */
    public static final int f3998c = 1;
    private int allowedApisMemoizedSerializedSize;
    private a.g1 allowedApis_ = sj0.g();

    static {
        cq cqVar = new cq();
        DEFAULT_INSTANCE = cqVar;
        sj0.a(cq.class, cqVar);
    }

    public static cq u() {
        return DEFAULT_INSTANCE;
    }

    public static a.n0 v() {
        return (a.n0) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"allowedApis_"});
        }
        if (c13 == 3) {
            return new cq();
        }
        if (c13 == 4) {
            return new a.n0(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (cq.class) {
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

    public final a.g1 t() {
        return this.allowedApis_;
    }

    public final int r() {
        return ((zv0) this.allowedApis_).size();
    }

    public final ew0 s() {
        return new ew0(this.allowedApis_, allowedApis_converter_);
    }

    public static cq a(byte[] bArr) {
        return (cq) sj0.a(sj0.a(DEFAULT_INSTANCE, bArr, bArr.length, jc0.a()));
    }
}
