package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class mc extends sj0 {
    private static final mc DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8160c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8161d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8162e = 4;
    private int bitField0_;
    private long timestampMs_;
    private String keyIdentifier_ = "";
    private il encryptedAdAttestationStatemement_ = il.f6431b;

    static {
        mc mcVar = new mc();
        DEFAULT_INSTANCE = mcVar;
        sj0.a(mc.class, mcVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"bitField0_", "timestampMs_", "keyIdentifier_", "encryptedAdAttestationStatemement_"});
        }
        if (c13 == 3) {
            return new mc();
        }
        if (c13 == 4) {
            return new a.k(22);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (mc.class) {
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
