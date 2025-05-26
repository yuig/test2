package ads_mobile_sdk;

import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class qc extends sj0 {
    private static final qc DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10022c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10023d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10024e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f10025f = 4;
    private int bitField0_;
    private h4 encryptedBlobs_ = sj0.i();
    private il hash_ = il.f6431b;
    private int protoName_ = 1;
    private int encryptionMethod_ = 1;

    static {
        qc qcVar = new qc();
        DEFAULT_INSTANCE = qcVar;
        sj0.a(qc.class, qcVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"bitField0_", "encryptedBlobs_", "hash_", "protoName_", jc.f6742a, "encryptionMethod_", dc.f4226a});
        }
        if (c13 == 3) {
            return new qc();
        }
        if (c13 == 4) {
            return new a.da(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (qc.class) {
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

    public static a.da r() {
        return (a.da) DEFAULT_INSTANCE.f();
    }
}
